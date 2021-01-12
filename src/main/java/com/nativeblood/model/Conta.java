package com.nativeblood.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Conta {

    @Id
    private String conta;
    private String agencia;
    private double saldo;
    private String status;

    public Conta(String agencia, String conta, double saldo, String status) {
        this.setAgencia(agencia);
        this.setConta(conta);
        this.setSaldo(saldo);
        this.setStatus(status);
    }

    public Conta() {

    }





    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Conta {");

        sb.append("agencia='").append(agencia).append('\'');
        sb.append(", conta='").append(conta).append('\'');
        sb.append(", saldo='").append(saldo).append('\'');
        sb.append(", status=").append(status).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
