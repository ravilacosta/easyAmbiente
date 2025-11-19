package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.AmbienteDTO;
import com.example.demo.DTO.RecursoDTO;
import com.example.demo.DTO.ReservaDTO;
import com.example.demo.Entity.Recurso;
import com.example.demo.Service.AmbienteService;

@RestController
@RequestMapping("/ambientes")
public class AmbienteController extends BaseController<AmbienteDTO> {

    protected AmbienteController(AmbienteService service){
        super(service);
    }


    @RequestMapping("/recurso/{ambienteId}/{recursoId}")
    public RecursoDTO create(RecursoDTO dto) {
        // Verificar se o id existe
      Recurso = RecursoRepository.findById(dto.getRecurso().getId())
                .orElseThrow(() -> new IllegalStateException("O ID não existe."));

   
}
}