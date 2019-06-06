package com.utn.parcial.repository;

import com.utn.parcial.models.Publicaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface IPublicacionesRepository extends JpaRepository<Publicaciones,Integer> {



}
