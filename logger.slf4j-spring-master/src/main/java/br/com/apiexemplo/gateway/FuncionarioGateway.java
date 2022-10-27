package br.com.apiexemplo.gateway;

import br.com.apiexemplo.models.Funcionario;

import java.util.List;
import java.util.Optional;

public interface FuncionarioGateway {

    Funcionario create(Funcionario funcionario);
    Optional<Funcionario> getById(int id);
    List<Funcionario> get();
}
