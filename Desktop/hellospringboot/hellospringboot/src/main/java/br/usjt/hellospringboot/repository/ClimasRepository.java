package br.usjt.hellospringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.hellospringboot.model.Clima;

public interface ClimasRepository extends JpaRepository<Clima, Long>{

}
