package Projeto.controller;

import Projeto.model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteController<T extends Cliente> {

    private List<T> clientes;

    public ClienteController() {
        if (clientes == null) {
            clientes = new ArrayList<>();
        }
    }

    public void adicionarCliente(T cliente) {
        clientes.add(cliente);
    }

    public List<T> listarClientes() {
        return clientes;
    }

}