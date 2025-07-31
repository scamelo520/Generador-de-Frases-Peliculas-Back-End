package com.aluracursosdesafio.frasespeliculas.service;

import com.aluracursosdesafio.frasespeliculas.DTO.FraseDTO;
import com.aluracursosdesafio.frasespeliculas.model.Frase;
import com.aluracursosdesafio.frasespeliculas.repository.IFraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private IFraseRepository repository;

    public FraseDTO obtenerFraseAleatoria(){
        Frase frase = repository.obtenerFraseAleatoria();
        return new FraseDTO(frase.getId(), frase.getTituloDeSerie(), frase.getFrase(), frase.getAutorFrase(), frase.getPoster());
    }

}
