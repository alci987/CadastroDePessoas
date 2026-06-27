package br.com.estudo.cadastrodepessoas.Tarefas;

import br.com.estudo.cadastrodepessoas.Pessoas.PessoaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_tarefas")
@NoArgsConstructor // LOMBOK cria um construtor vazio
@AllArgsConstructor // LOMBOK cria um construtor com todos os parâmetros
@Data // LOMBOK cria os getters and setters
public class TarefasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String status;

    // @OneToMany: uma tarefa terá várias pessoas
    // tarefelas é o nome do campo na classe PessoaModel
    @OneToMany(mappedBy = "tarefas")
    private List<PessoaModel> pessoa;
}
