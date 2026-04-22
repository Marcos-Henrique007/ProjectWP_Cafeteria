package projectzero.projectwp_test.model;

import lombok.Getter;
import lombok.Setter;

//Usando o lombok para fazer os getters e setters
@Getter
@Setter
public class User {
    private int id;
    private String nome;
    private String senha;
}
