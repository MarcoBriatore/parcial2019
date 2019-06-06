package com.utn.parcial.services;

import com.utn.parcial.models.Publicaciones;
import com.utn.parcial.repository.IPublicacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PublicacionService {


    @Autowired
    private IPublicacionesRepository iPublicacionesRepository;


    public List<Publicaciones> getALl()
    {
        return iPublicacionesRepository.findAll();
    }


    public void save(Publicaciones p) {
        iPublicacionesRepository.save(p);
    }

    public Publicaciones findByid(Integer id) {
        return iPublicacionesRepository.findById(id).orElse(null);
    }
}
