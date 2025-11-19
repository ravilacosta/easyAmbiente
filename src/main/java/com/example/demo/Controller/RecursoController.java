package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.RecursoDTO;
import com.example.demo.DTO.ReservaDTO;
import com.example.demo.Service.RecursoService;

@RestController
@ResquestMapping("/recursos")

public class RecursoController extends BaseController<RecursoDTO> {

    protected RecursoController(RecursoService service){
        super(service);
    }
   

}
