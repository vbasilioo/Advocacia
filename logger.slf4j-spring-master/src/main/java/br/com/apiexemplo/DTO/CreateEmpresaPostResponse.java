package br.com.apiexemplo.DTO;

import br.com.apiexemplo.models.Funcionario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateEmpresaPostResponse {

    private int id;
    private String nome;
    private List<Funcionario> funcionarios;
}
