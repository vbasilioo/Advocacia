package br.com.apiexemplo.controllers;

import br.com.apiexemplo.models.Funcionario;
import br.com.apiexemplo.services.FuncionarioService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Api(value="API REST Cadastro Funcinario")
@RequestMapping(value = "/funcionarios")
@RestController
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;


    @ApiOperation(value = "Cria cadastro funcinario")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Funcionario salvar(@RequestBody @Validated Funcionario funcionario){
        return service.create(funcionario);
    }

    @ApiOperation(value = "Obtem funcinario")
    @GetMapping
    public List<Funcionario> get() {
        return service.get();
    }

    @ApiOperation(value = "Obtem funcinario por id")
    @GetMapping("/{id}")
    public Optional<Funcionario> getById(@PathVariable int id) {
        Optional<Funcionario> funcionario = service.getById(id);
        return funcionario;
    }
}
