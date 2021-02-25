package br.edu.utfpr.pb.atividadeAula1.repository;

import br.edu.utfpr.pb.atividadeAula1.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
