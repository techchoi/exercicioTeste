package controller;


import model.AgenciaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.DistanciaService;

import java.util.List;

@RestController
@RequestMapping ("/desafio/distancia")
public class UsuarioController {

    @Autowired
    private DistanciaService distanciaService;

    @GetMapping
    public List<AgenciaModel> agenciaModel (@RequestParam(value= "posx") Integer posX, @RequestParam(value= "posY") Integer posY)
    {
        return distanciaService.getAgencias(posX, posY);
    }
}
