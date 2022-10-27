package br.com.apiexemplo.services;

import br.com.apiexemplo.gateway.FuncionarioGateway;
import br.com.apiexemplo.models.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioGateway funcionarioGateway;

    public Funcionario create(Funcionario funcionario){
        return funcionarioGateway.create(funcionario);
    }

    public Optional<Funcionario> getById(int id){
        Optional<Funcionario> funcionario = funcionarioGateway.getById(id);
        return funcionario;
    }

    public List<Funcionario> get(){
        return funcionarioGateway.get();
    }
}
