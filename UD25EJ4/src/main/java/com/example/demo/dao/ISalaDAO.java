package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Sala;

@Repository
public interface ISalaDAO extends JpaRepository<Sala, Long>{

}
