package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.AmbienteDTO;
import com.example.demo.DTO.ReservaDTO;
import com.example.demo.Entity.Ambiente;
import com.example.demo.Entity.Recurso;
import com.example.demo.Repository.AmbienteRepository;
import com.example.demo.Repository.RecursoRepository;

@Service
public class AmbienteService extends BaseService<Ambiente, AmbienteDTO> {

    private AmbienteRepository repository;

    @Autowired
    private RecursoRepository recursoRepository;

    protected AmbienteService(AmbienteRepository repository) {
        super(repository);
        this.repository = repository;

    }

    public List<AmbienteDTO> listagemPorRecurso(Long recursoId) {
        List<Ambiente> ambientes = repository.findByRecursoId(recursoId);

        List<AmbienteDTO> dtos = new ArrayList<>();
        for (Ambiente e : ambientes) {
            dtos.add(toDto(e));
        }

        return dtos;

    }

    public void adicionarRecurso(Long ambienteId, Long recursoId) {
        Ambiente ambiente = repository.findById(ambienteId)
                .orElseThrow(() -> new IllegalArgumentException("Ambiente não encontrado com o ID: "));

        Recurso recurso = recursoRepository.findById(recursoId)
                .orElseThrow(() -> new IllegalArgumentException("Recurso não encontrado com o ID: "));

        ambiente.getRecursos().add(recurso);

        repository.save(ambiente);
    }

    public void delete(Long id) {
        boolean reservado = repository.temReservaFutura(id);

        if (reservado) {
            throw new IllegalStateException("Ambiente possui reservas futuras e não pode ser excluído.");
        }

        super.delete(id);
    }

}
