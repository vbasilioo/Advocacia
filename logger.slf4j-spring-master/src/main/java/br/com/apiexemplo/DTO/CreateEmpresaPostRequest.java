package br.com.apiexemplo.DTO;

import br.com.apiexemplo.models.Funcionario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateEmpresaPostRequest {

    private String nome;
    private List<Funcionario> funcionarios;
}
