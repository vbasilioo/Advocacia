package br.com.apiexemplo.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

// Anotação que faz ponte do recursos do spring e jUnit
@RunWith(SpringRunner.class)
public class EmpresaService {

    @Autowired
    EmpresaService empresaService;

    @Test
    public void empresaTestService(){

    }
}
