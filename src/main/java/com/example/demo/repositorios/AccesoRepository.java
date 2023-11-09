package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entidades.Acceso;

public interface AccesoRepository extends JpaRepository<Acceso, Long> {
}