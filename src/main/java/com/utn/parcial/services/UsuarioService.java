package com.utn.parcial.services;

import com.utn.parcial.models.Usuario;
import com.utn.parcial.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsuarioService {


    @Autowired
    private IUsuarioRepository iUsuarioRepository;


    public List<Usuario> getAll()
    {
        return iUsuarioRepository.findAll();
    }
    public void remove(Integer id)
    {
        iUsuarioRepository.deleteById(id);
    }

    public Usuario getUser(Integer id)
    {
        return iUsuarioRepository.findById(id).orElse(null);
    }

    public void save(Usuario u)
    {
        iUsuarioRepository.save(u);
    }

    public void update(Usuario u)
    {
        iUsuarioRepository.save(u);
    }
}
