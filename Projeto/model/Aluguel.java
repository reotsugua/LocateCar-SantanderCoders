package Projeto.model;

import Projeto.view.Veiculo;

import java.time.LocalDateTime;

public class Aluguel{
    //Atributos
    private Agencia agencia;
    private Projeto.view.Veiculo veiculo;
    private Cliente cliente;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private double valor;

    //Construtores
    public Aluguel(Agencia agencia, Projeto.view.Veiculo veiculo, Cliente cliente, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim) {
        this.agencia = agencia;
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
    }

    //Métodos Especiais
    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Projeto.view.Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public LocalDateTime getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(LocalDateTime dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


}
