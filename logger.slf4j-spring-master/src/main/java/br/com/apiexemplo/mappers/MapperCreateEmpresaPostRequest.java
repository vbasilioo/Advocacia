package br.com.apiexemplo.mappers;


import br.com.apiexemplo.DTO.CreateEmpresaPostRequest;
import br.com.apiexemplo.models.Empresa;

public class MapperCreateEmpresaPostRequest {

    public static Empresa converteParaEmpresa(CreateEmpresaPostRequest createEmpresaPostRequest){

        Empresa empresa = new Empresa();

        empresa.setNome(createEmpresaPostRequest.getNome());
        empresa.setFuncionarios(createEmpresaPostRequest.getFuncionarios());

        return empresa;
    }
}
