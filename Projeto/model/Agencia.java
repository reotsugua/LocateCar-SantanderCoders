package Projeto.model;

import java.util.List;

public class Agencia {
    private String nome;
    private String endereco;

    private List<Veiculo> inventario;

    public Agencia() {
    }

    public Agencia(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }


    @Override
    public String toString() {
        return "AGÊNCIA =" +
                " | NOME = " + nome.toUpperCase() +
                " | ENDEREÇO = " + endereco.toUpperCase();

    }
}
