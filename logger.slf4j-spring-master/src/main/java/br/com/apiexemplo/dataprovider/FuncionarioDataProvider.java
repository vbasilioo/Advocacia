package br.com.apiexemplo.dataprovider;

import br.com.apiexemplo.error.FuncionarioNotFound;
import br.com.apiexemplo.gateway.FuncionarioGateway;
import br.com.apiexemplo.models.Funcionario;
import br.com.apiexemplo.repositories.FuncionarioRepository;
import br.com.apiexemplo.services.FuncionarioService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class FuncionarioDataProvider implements FuncionarioGateway {

    private static Logger logger = LoggerFactory.getLogger(FuncionarioService.class);

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Override
    public Funcionario create(Funcionario funcionario) {
        logger.info("Funcionario " + funcionario.getNome() + " salvo com sucesso!");
        return funcionarioRepository.save(funcionario);
    }

    @Override
    public Optional<Funcionario> getById(int id) {
        Optional<Funcionario> funcinario = funcionarioRepository.findById(id);

        if (!funcinario.isPresent()){
            logger.info("Funcionário com id " + id + " não encontrado.");
            throw new FuncionarioNotFound();
        }

        logger.info("Funcionario com id " + id + " encontrado com sucesso!");
        return funcinario;
    }

    @Override
    public List<Funcionario> get() {
        List<Funcionario> funcionarios = funcionarioRepository.findAll();
        if(funcionarios.isEmpty()) {
            logger.info("Lista vazia!");
            throw new FuncionarioNotFound();
        }
        logger.info("Retorno funcionario com sucesso!");
        return funcionarios;
    }
}
