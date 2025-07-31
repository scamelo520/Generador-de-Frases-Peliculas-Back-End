package com.aluracursosdesafio.frasespeliculas.controller;

import com.aluracursosdesafio.frasespeliculas.DTO.FraseDTO;
import com.aluracursosdesafio.frasespeliculas.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    private FraseService servicio;

    @GetMapping("/series/frases")
    public FraseDTO obtenerFraseAleatoria(){
        return servicio.obtenerFraseAleatoria();
    }
}
