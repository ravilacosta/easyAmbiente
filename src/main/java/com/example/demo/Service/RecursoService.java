package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.DTO.AmbienteDTO;
import com.example.demo.DTO.RecursoDTO;
import com.example.demo.DTO.ReservaDTO;
import com.example.demo.Entity.Ambiente;
import com.example.demo.Entity.Recurso;
import com.example.demo.Repository.RecursoRepository;

@Service
public class RecursoService extends BaseService <Recurso, RecursoDTO> {

    private RecursoRepository repository;

    protected RecursoService(RecursoRepository repository){
        super(repository);
        this.repository = repository;
    }

     @GetMapping("/recurso/listagem/{recursoid}")
    public List<AmbienteDTO> informarRecurso(
            @PathVariable("recursoId") Long recursoId) {
        return service.informarRecurso(recursoId);
    }
    
     

}
