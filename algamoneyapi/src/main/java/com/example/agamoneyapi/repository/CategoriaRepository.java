package com.example.agamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.agamoneyapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
