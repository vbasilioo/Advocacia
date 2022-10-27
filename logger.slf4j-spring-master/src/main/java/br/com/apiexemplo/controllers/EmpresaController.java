package br.com.apiexemplo.controllers;

import br.com.apiexemplo.DTO.CreateEmpresaPostRequest;
import br.com.apiexemplo.DTO.CreateEmpresaPostResponse;
import br.com.apiexemplo.mappers.MapperCreateEmpresaPostRequest;
import br.com.apiexemplo.mappers.MapperCreateEmpresaPostResponse;
import br.com.apiexemplo.models.Empresa;
import br.com.apiexemplo.services.EmpresaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Api(value="API REST Cadastro Empresas")
@RestController
@RequestMapping(value = "/empresas")
public class EmpresaController {

    @Autowired
    private EmpresaService service;

    @ApiOperation(value = "Cria cadastro empresa")
    @PostMapping
    public ResponseEntity<CreateEmpresaPostResponse> salvar(@RequestBody @Validated CreateEmpresaPostRequest empresaPostRequest)  {

        Empresa empresa = MapperCreateEmpresaPostRequest.converteParaEmpresa(empresaPostRequest);
        Empresa empresaObj = service.create(empresa);

        CreateEmpresaPostResponse createEmpresaPostResponse =
                MapperCreateEmpresaPostResponse.converteParaCreateEmpresaPostResponse(empresaObj);

        return ResponseEntity.status(201).body(createEmpresaPostResponse);
    }

    @ApiOperation(value = "Obtem empresas")
    @GetMapping
    public Iterable<Empresa> get() {
        return service.get();
    }

    @ApiOperation(value = "Obtem empresa por id")
    @GetMapping(value = "/{id}")
    public Empresa getById(@PathVariable int id) {
        return service.getById(id);
    }
}
