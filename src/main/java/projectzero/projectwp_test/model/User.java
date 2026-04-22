package projectzero.projectwp_test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Usando o lombok para fazer os getters e setters, toString, equals e hashCode.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String nome;
    private String senha;
}
