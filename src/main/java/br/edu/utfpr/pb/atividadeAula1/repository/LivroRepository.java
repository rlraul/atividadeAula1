package br.edu.utfpr.pb.atividadeAula1.repository;

import br.edu.utfpr.pb.atividadeAula1.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivroRepository extends JpaRepository<Livro, Long> {

  List<Livro> findByAutorNomeContainsOrderByAno(String nome);

  List<Livro> findByAnoIs(int ano);

  List<Livro> findByGeneroNomeOrderByAno(String descricao);

  List<Livro> findByIsbnLikeOrNomeLikeOrderByAno(String isbn, String titulo);

  List<Livro> findByValorGreaterThan(Double valor);

  List<Livro> findByValorBetweenOrderByAno(Double valor1, Double valor2);
}
