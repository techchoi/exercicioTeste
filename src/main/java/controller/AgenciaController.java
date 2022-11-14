package controller;


import model.AgenciaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.AgenciaRepository;

import java.util.List;

@RestController
@RequestMapping ("/desafio/cadastrar")
public class AgenciaController {

    @Autowired
    private AgenciaRepository agenciaRepository;

    @GetMapping
    public List<AgenciaModel> getAll(){
        List<AgenciaModel> agenciaModels = agenciaRepository.findAll();
        return agenciaModels;
    }

    @PostMapping
    public AgenciaModel post (@RequestBody AgenciaModel agenciaModel){
        AgenciaModel agenciaModels = agenciaRepository.save(agenciaModel);
        return agenciaModels;
    }




}
