package com.literalura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.literalura.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}
