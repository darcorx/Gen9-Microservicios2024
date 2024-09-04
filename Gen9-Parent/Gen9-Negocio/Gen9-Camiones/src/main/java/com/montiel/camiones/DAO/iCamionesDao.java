package com.montiel.camiones.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.montiel.camiones.models.Camion;



public interface iCamionesDao  extends JpaRepository<Camion,Long>{

}
