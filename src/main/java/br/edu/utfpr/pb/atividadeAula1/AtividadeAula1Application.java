package br.edu.utfpr.pb.atividadeAula1;

import br.edu.utfpr.pb.atividadeAula1.repository.AutorRepository;
import br.edu.utfpr.pb.atividadeAula1.repository.GeneroRepository;
import br.edu.utfpr.pb.atividadeAula1.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtividadeAula1Application implements CommandLineRunner {

    @Autowired
    private LivroRepository livroRepository;

    public static void main(String[] args) {
        SpringApplication.run(AtividadeAula1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        this.retornaLivros();
        this.findByAutorNomeContainingOrderByAno("es");
        this.findByAnoIs(2010);
        this.findByGeneroNomeOrderByAno("genero1");
        this.findByIsbnLikeOrNomeLikeOrderByAno("isbn4", "ISBN4");
        this.findByValorGreaterThan(100.0);
        this.findByValorBetweenOOrderByAno(100.0, 200.0);
    }

    private void retornaLivros() {
        System.out.println("----------LIVROS----------");
        livroRepository.findAll().forEach(e -> System.out.println(e));
        System.out.println("-----------------------------------------------------------");
    }

    private void findByAutorNomeContainingOrderByAno(String nome) {
        System.out.println("----------LIVRO PELO NOME ORDENADO POR ANO----------");
        livroRepository.findByAutorNomeContainsOrderByAno(nome).forEach(c -> System.out.println(c));
        System.out.println("-----------------------------------------------------------");
    }

    private void findByAnoIs(int ano) {
        System.out.println("----------LIVROS PELO ANO----------");
        livroRepository.findByAnoIs(ano).forEach(e -> System.out.println(e));
        System.out.println("-----------------------------------------------------------");
    }

    private void findByGeneroNomeOrderByAno(String genero) {
        System.out.println("----------LIVROS PELO GENERO----------");
        livroRepository.findByGeneroNomeOrderByAno(genero).forEach(e -> System.out.println(e));
        System.out.println("-----------------------------------------------------------");
    }

    private void findByIsbnLikeOrNomeLikeOrderByAno(String isbn, String titulo) {
        System.out.println("----------LIVROS PELO ISBN OU PELO NOME----------");
        livroRepository.findByIsbnLikeOrNomeLikeOrderByAno(isbn, titulo).forEach(e -> System.out.println(e));
        System.out.println("-----------------------------------------------------------");
    }

    private void findByValorGreaterThan(Double valor) {
        System.out.println("----------LIVROS QUE O VALOR É MAIOR QUE----------");
        livroRepository.findByValorGreaterThan(valor).forEach(e -> System.out.println(e));
        System.out.println("-----------------------------------------------------------");
    }

    private void findByValorBetweenOOrderByAno(Double valor1, Double valor2) {
        System.out.println("----------LIVROS PELO ISBN OU PELO NOME----------");
        livroRepository.findByValorBetweenOrderByAno(valor1, valor2).forEach(e -> System.out.println(e));
        System.out.println("-----------------------------------------------------------");
    }
}
