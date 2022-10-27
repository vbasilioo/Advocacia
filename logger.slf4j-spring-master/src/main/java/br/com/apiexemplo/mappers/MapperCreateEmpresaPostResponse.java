package br.com.apiexemplo.mappers;


import br.com.apiexemplo.DTO.CreateEmpresaPostResponse;
import br.com.apiexemplo.models.Empresa;

public class MapperCreateEmpresaPostResponse {

    public static CreateEmpresaPostResponse converteParaCreateEmpresaPostResponse(Empresa empresa) {

        CreateEmpresaPostResponse createEmpresaPostResponse = new CreateEmpresaPostResponse();

        createEmpresaPostResponse.setId(empresa.getId());
        createEmpresaPostResponse.setNome(empresa.getNome());
        createEmpresaPostResponse.setFuncionarios(empresa.getFuncionarios());

        return createEmpresaPostResponse;
    }

}
