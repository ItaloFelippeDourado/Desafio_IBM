package com.nativeblood;

import com.nativeblood.batch.DBWriter;
import com.nativeblood.model.Conta;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

/**
 * Inicio do programa
 */
public class Desafio_IBM {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Desafio_IBM.class, args);
        Conta conta = new Conta();
        ReceitaService receitaService = new ReceitaService();
        receitaService.atualizarConta(conta.getAgencia(), conta.getConta(), conta.getSaldo(), conta.getStatus());
    }
}
