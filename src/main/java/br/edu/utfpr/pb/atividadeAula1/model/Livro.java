package br.edu.utfpr.pb.atividadeAula1.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
@Table
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 65, nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "editora_id", referencedColumnName = "id")
    private Editora editora;

    @ManyToOne
    @JoinColumn(name = "genero_id", referencedColumnName = "id")
    private Genero genero;

    @ManyToOne
    @JoinColumn(name = "autor_id",referencedColumnName = "id")
    private Autor autor;

    @Column(name = "ano",nullable = false)
    private Integer ano;

    @Column(name = "isbn",nullable = false)
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "cidade_id", referencedColumnName = "id")
    private Cidade cidade;

    @Column(name = "valor",nullable = false)
    private Double valor;
}
