package Projeto.view;


import Projeto.controller.VeiculoController;
import Projeto.model.*;
import Projeto.util.ConsoleUIHelper;

import java.util.List;

public class VeiculoView {

    private static VeiculoController controller;

    public VeiculoView() {
        if (controller == null) {
            controller = new VeiculoController();
        }
    }

    public void cadastrarVeiculo() {

        Veiculo veiculo = null;
        String categoria;

        int tipoVeiculo = ConsoleUIHelper.askChooseOption("Escolha a categoria do veículo: "
                , "Moto", "Carro", "Caminhão");

        String fabricante = ConsoleUIHelper.askNoEmptyInput("Informe o fabricante: ", 2);
        String modelo = ConsoleUIHelper.askNoEmptyInput("Informe o modelo: ", 2);
        String placa = ConsoleUIHelper.askNoEmptyInput("Informe a placa: ", 2);
        Veiculo veiculoExistente = controller.veiculoExistente(placa);
        while (veiculoExistente != null){
                System.out.println("Veículo já cadastrado.");
                System.out.println("Informe uma nova placa.");
                placa = ConsoleUIHelper.askNoEmptyInput("Informe a placa: ", 2);
                veiculoExistente = controller.veiculoExistente(placa);
        }

        if (tipoVeiculo == 0) {
            categoria = "Moto";
            veiculo = new Moto(categoria, fabricante, modelo, placa);
        } else if (tipoVeiculo == 1) {
            categoria = "Carro";
            veiculo = new Carro(categoria, fabricante, modelo, placa);
        } else if (tipoVeiculo == 2) {
            categoria = "Caminhão";
            veiculo = new Caminhao(categoria, fabricante, modelo, placa);
        }
        controller.cadastrarVeiculo(veiculo);
    }

    public void listarVeiculos() {
        List<? extends Veiculo> veiculos = controller.listarVeiculos();

        for(int i = 0; i < veiculos.size(); i++) {
            System.out.println("[" + (i+1) + "] " + veiculos.get(i));
        }
    }

    public void alterarVeiculo() {

        listarVeiculos();

        List<? extends Veiculo> veiculos = controller.listarVeiculos();

        String escolha = ConsoleUIHelper.askNoEmptyInput("Selecione o veículo através do índice.", 2);

        for (int i = 0; i < veiculos.size(); i++) {
            if (Integer.valueOf(escolha) == (i+1)) {
                System.out.println("Veículo selecionado:");
                System.out.println("[" + (i+1) + "] " + veiculos.get(i));
                veiculos.remove(i);
                cadastrarVeiculo();
                System.out.println(veiculos.get(i));
                System.out.println("Veículo alterado com sucesso!");
            }
        }
    }
    public void pesquisarVeiculo(){
        String modelo = ConsoleUIHelper.askNoEmptyInput("Informe o modelo do veiculo: ", 2);
        List<Veiculo> veiculosEncontrados = controller.pesquisarVeiculo(modelo);
        for (Veiculo veiculo: veiculosEncontrados) {
            System.out.println(veiculo);
        }

    }

}


