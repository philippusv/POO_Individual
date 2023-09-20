package br.com.poo.bdindividual;

import java.util.HashMap;
import java.util.Map;

public class Delegacia {
	private static String delegaciaTipo = "Delegacia";
    private String nome;
    private String endereco;
    private String telefone;
    
    public static Map<String, Delegacia> delegacias = new HashMap<>();
    

    // Construtor
    	public Delegacia(String delegaciaTipo, String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }
    
    public static String getDelegaciaTipo() {
    	return delegaciaTipo;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Método para obter a ID da delegacia (utilizando o telefone como ID)
    public String getId() {
        return this.telefone;
    }

    @Override
    public String toString() {
        return "Delegacia{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone=" + telefone +
                '}';
    }

}
