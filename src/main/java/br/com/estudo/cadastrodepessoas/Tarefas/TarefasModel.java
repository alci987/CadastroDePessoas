package br.com.estudo.cadastrodepessoas.Tarefas;

import br.com.estudo.cadastrodepessoas.Pessoas.PessoaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_tarefas")
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
