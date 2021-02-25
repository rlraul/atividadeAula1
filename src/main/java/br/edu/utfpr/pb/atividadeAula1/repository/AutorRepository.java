package br.edu.utfpr.pb.atividadeAula1.repository;

import br.edu.utfpr.pb.atividadeAula1.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
