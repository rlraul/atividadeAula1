package br.edu.utfpr.pb.atividadeAula1.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
@Table
public class Livro {

    private Long id;

    private String nome;

    private Editora editora;

    private Genero genero;

    private Autor autor;

    private Integer ano;

    private String isbn;

    private Cidade cidade;

    private Double valor;
}
