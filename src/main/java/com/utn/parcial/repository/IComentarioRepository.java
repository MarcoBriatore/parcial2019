package com.utn.parcial.repository;

import com.utn.parcial.models.Comentarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;

@Repository
public interface IComentarioRepository extends JpaRepository<Comentarios,Integer> {

    //ESE SPANENGLISH SI SE PUEDE VER!
    @Scheduled(cron = "88")
    @Query(nativeQuery = true, value = "DELETE FROM comentarios WHERE max(comentarios.fecha)")
    boolean deleteComentarioMasViejo();

}
