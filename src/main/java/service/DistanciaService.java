package service;

import model.AgenciaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AgenciaRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class DistanciaService {
    @Autowired
    private AgenciaRepository agenciaRepository;

    public DistanciaService (AgenciaRepository agenciaRepository){
        this.agenciaRepository = agenciaRepository;
    }

    public List<AgenciaModel> getAgencias (Integer posX, Integer posY){
        List<AgenciaModel> listAgencia = agenciaRepository.findAll();
        listAgencia.stream().forEach(agencia1 ->
                agencia1.setLocalizacao(Math.sqrt((
                        agencia1.getDistanciaX()-posX)*
                        (agencia1.getDistanciaX()-posX)+(agencia1.getDistanciaY()-posY)*
                        (agencia1.getDistanciaY()-posY))));
        Collections.sort(listAgencia, Comparator.comparing(AgenciaModel::getLocalizacao));
    return listAgencia;
    }

}
