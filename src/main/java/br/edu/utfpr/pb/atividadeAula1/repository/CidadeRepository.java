package br.edu.utfpr.pb.atividadeAula1.repository;

import br.edu.utfpr.pb.atividadeAula1.model.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
