package br.com.violencia.treinaweb.ediaristas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.violencia.treinaweb.ediaristas.models.Diarista;

public interface DiaristaRepository extends JpaRepository<Diarista, Long> {}
