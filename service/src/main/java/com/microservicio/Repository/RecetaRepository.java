package com.microservice.juan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.microservice.Entity.Receta;

@Repository
public interface RecetaRepository extends JpaRepository<Receta, Long> {

}
