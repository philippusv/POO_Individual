package br.com.poo.bdindividual.io;

import br.com.poo.bdindividual.Delegacia;
import br.com.poo.bdindividual.Denuncia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.io.*;


public class LeituraEscrita {
	// constantes
    static final String PATH_BASICO = "./temp/";
    static final String EXTENSAO = ".txt"; 

    public static void leitor(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(PATH_BASICO + path + EXTENSAO));
        String linha;
        while ((linha = br.readLine()) != null) {
            String[] partes = linha.split(";");
            if (partes[0].equalsIgnoreCase("delegacia")) {
                String delegaciaTipo = partes[0];
                String nome = partes[1];
                String endereco = partes[2];
                String telefone = partes[3];
                Delegacia delegacia = new Delegacia(delegaciaTipo, nome, endereco, telefone);
                Delegacia.delegacias.put(telefone, delegacia);
            } else if (Arrays.asList("1", "2", "3", "4", "5").contains(partes[0])) {
                String denunciaID = partes[0];
                String data = partes[1];
                String descricao = partes[2];
                String local = partes[3];
                Denuncia denuncia = new Denuncia(denunciaID, data, descricao, local);
                Denuncia.denuncias.put(denunciaID, denuncia);
            }
        }       
        br.close();
    }


    public static void escreverDelegacia(Delegacia delegacia) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PATH_BASICO + "arquivo_delegacia" + EXTENSAO, true))) {
            bw.write("Delegacia;" + delegacia.getNome() + ";" + delegacia.getEndereco() + ";" + delegacia.getTelefone());
            bw.newLine();
        }
    }
    
    public static void escreverDenuncia(Denuncia denuncia) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(PATH_BASICO + "arquivo_denuncia" + EXTENSAO, true))) {
            bw.write(denuncia.getDenunciaID() + ";" + denuncia.getData() + ";" + denuncia.getDescricao() + ";" + denuncia.getLocal());
            bw.newLine();
        }
    }
}