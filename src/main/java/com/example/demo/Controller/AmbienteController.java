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

    private AmbienteService service;

    protected AmbienteController(AmbienteService service){
        super(service);
        this.service = service;
    }


    @GetMapping("/recurso/{ambienteId}/{recursoId}")
    public void adicionarRecurso(@PathVariable Long ambienteId, @PathVariable Long recursoId){
        service.adicionarRecurso(ambienteId, recursoId);

    }     
   @GetMapping("/recursos/listagem/{recursoid}")
    public List<AmbienteDTO> listagemPorRecurso(
            @PathVariable Long recursoId) {
        return service.listagemPorRecurso(recursoId);
    }
}
