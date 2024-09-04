package com.montiel.choferes.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.montiel.choferes.models.Chofer;

public interface iChoferesDao extends JpaRepository<Chofer, Long> {

}
