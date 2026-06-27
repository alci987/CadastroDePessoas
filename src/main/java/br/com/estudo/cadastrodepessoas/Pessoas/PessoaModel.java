package br.com.estudo.cadastrodepessoas.Pessoas;

import br.com.estudo.cadastrodepessoas.Tarefas.TarefasModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// @Entity transforma uma classe em uma entidade do banco de dados
@Entity
@Table(name = "tb_pessoas")
@NoArgsConstructor // LOMBOK cria um construtor vazio
@AllArgsConstructor // LOMBOK cria um construtor com todos os parâmetros
@Data // LOMBOK cria os getters and setters
public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long   id;
    private String nome;
    private String email;
    int idade;
    // @ManyToOne: muitas pessoa tem apenas uma tarefa
    @ManyToOne
    @JoinColumn(name = "tarefas_id")  // chave estrangeira
    private TarefasModel tarefas;


}
