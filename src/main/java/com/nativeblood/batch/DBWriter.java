package com.nativeblood.batch;

import com.nativeblood.ReceitaService;
import com.nativeblood.model.Conta;
import com.nativeblood.repository.ContaRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<Conta> {

    private ContaRepository contaRepository;

    @Autowired
    public DBWriter(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    @Override
    public void write(List<? extends Conta> contas) throws Exception{
        System.out.println("Dados salvos para contas: " + contas);
        contaRepository.saveAll(contas);
        System.out.println(contaRepository.findAll());



        Conta conta = new Conta();
        for (int i = 0; i >= contas.size(); i++) {

            conta.setAgencia(contas.get(i).getAgencia());
            conta.setConta(contas.get(i).getConta());
            conta.setSaldo(contas.get(i).getSaldo());
            conta.setStatus(contas.get(i).getStatus());

        }







    }
}
