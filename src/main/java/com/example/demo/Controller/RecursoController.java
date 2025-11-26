package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.DTO.RecursoDTO;
import com.example.demo.Service.RecursoService;

@RestController
@RequestMapping("/recursos")
public class RecursoController extends BaseController<RecursoDTO> {

    protected RecursoController(RecursoService service){
        super(service);
    }
   

}
