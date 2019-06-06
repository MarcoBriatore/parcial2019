package com.utn.parcial.controller;


import com.utn.parcial.models.Comentarios;
import com.utn.parcial.services.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("comentarios")
public class ComentarioController
{


    @Autowired
    private ComentarioService comentarioService;

    public void save(Comentarios c)
    {
        comentarioService.save(c);
    }



}
