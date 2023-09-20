package br.com.poo.bdindividual;


import java.util.HashMap;
import java.util.Map;

public class Denuncia {
	private static String denunciaID;	
	private String data;
    private String descricao;
    private String local;
    
    public static Map<String, Denuncia> denuncias = new HashMap<>();
    
    // Construtor
    public Denuncia(String denunciaID, String data, String descricao, String local) {
    	
    	this.data = data;
        this.descricao = descricao;
        this.local = local;
    }

    // Getters e Setters
    
    public String getDenunciaID() {
		return denunciaID;
	}

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Denuncia{" +
                "data=" + data +
                ", descricao='" + descricao + '\'' +
                ", local='" + local + '\'' +
                '}';
    }
}
