package com.utn.parcial.controller;

import com.utn.parcial.models.Publicaciones;
import com.utn.parcial.services.PublicacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("publicaciones")
public class PublicacioController {


    @Autowired
    private PublicacionService publicacionService;

    @PostMapping("/")
    public void save(Publicaciones p)
    {
        publicacionService.save(p);
    }

    @GetMapping("/{id}")
    public Publicaciones getPublicacion(@PathVariable final Integer id)
    {
        return publicacionService.findByid(id);
    }

}
