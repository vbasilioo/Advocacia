package br.com.apiexemplo.services;

import br.com.apiexemplo.ApiExemploApplication;
import br.com.apiexemplo.models.Empresa;
import br.com.apiexemplo.models.Funcionario;
import br.com.apiexemplo.repositories.LogRepository;
import br.com.apiexemplo.repositories.EmpresaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmpresaService {

    private static Logger logger = LoggerFactory.getLogger(ApiExemploApplication.class);

    @Autowired
    private EmpresaRepository repository;

    @Autowired
    private FuncionarioService funcionarioService;

    @Autowired
    private LogRepository logRepository;

//    private static final String METODO_POST = "[POST] ";
//    private static final String METODO_GET = "[GET] ";

    public Empresa create(Empresa empresa)  {

        List<Integer> funcId = new ArrayList<>();
        for (Funcionario funcionario : empresa.getFuncionarios()){
            int id = funcionario.getId();
            funcId.add(id);
        }

        List<Funcionario> funcionarios = funcionarioService.get();
        logger.info("Funcionários encontrados!");
        empresa.setFuncionarios(funcionarios);

        Empresa empresaObj = repository.save(empresa);
        logger.info("Empresa salva com sucesso!");

//        logarEmpresa(empresaObj, METODO_POST);

        return empresaObj;
    }

    public Empresa getById(int id){
        Optional<Empresa> empresaOptional = repository.findById(id);
        if (empresaOptional.isPresent()){
//            logarEmpresa(empresaOptional.get(), METODO_GET);
            logger.info("Empresa Id: " + id + " encontrado!");
            return empresaOptional.get();
        }
//        logarErro("Empresa não encontrada. Id = " + id, METODO_GET);
        logger.info("Empresa Id: " + id + " não encontrado!");
        throw new RuntimeException("Empresa não encontrada.");
    }

    public Iterable<Empresa> get(){
        logger.info("Retorno de empresa com sucesso!");
        return repository.findAll();
    }

//    public void logarEmpresa(Empresa empresa, String method) {
//        logRepository.log(Level.INFO, this.getClass(),
//                (method + "Nome: " + empresa.getNome()));
//    }
//
//    public void logarErro(String mensagem, String method) {
//        logRepository.log(Level.INFO, this.getClass(), method + mensagem);
//    }

}
