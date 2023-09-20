package br.com.poo.bdindividual;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



import br.com.poo.bdindividual.io.LeituraEscrita;
import br.com.poo.bdindividual.util.Util;
public class Menu {
    static final String PATH_BASICO = "./temp/";
    static final String EXTENSAO = ".txt"; 
    private static Scanner scanner = new Scanner(System.in);    
    public static final Logger customLogger = Util.setupLogger();

    public static void main(String[] args)throws IOException {
        LeituraEscrita.leitor("Banco");        
        exibirMenuPrincipal();
    }

    private static void exibirMenuPrincipal() {
        while (true) {
        	Util.customizer();
        	customLogger.log(Level.INFO, ()->"Menu Principal:");
        	customLogger.log(Level.INFO, ()->"1. Relatório na Tela");
        	customLogger.log(Level.INFO, ()->"2. Relatório Impresso");
        	customLogger.log(Level.INFO, ()->"3. Sair");
        	customLogger.log(Level.INFO, ()->"Escolha uma opção: ");

            // Verifica se há um próximo inteiro disponível
            if (scanner.hasNextInt()) {
                int opcao = scanner.nextInt();
                scanner.nextLine();  // Limpa a quebra de linha

                switch (opcao) {
                    case 1:
                        exibirMenuRelatorioTela();
                        break;
                    case 2:
                        exibirMenuRelatorioImpresso();
                        break;
                    case 3:
                    	customLogger.log(Level.INFO, ()->"Saindo do programa. Adeus!");
                        return;
                    default:
                    	customLogger.log(Level.INFO, ()->"Opção inválida. Tente novamente.");
                }
            } else {
            	customLogger.log(Level.INFO, ()->"Opção inválida. Tente novamente.");
                scanner.nextLine();  // Limpa a entrada inválida
            }
        }
    }


    private static void exibirMenuRelatorioTela() {
        while (true) {
        	customLogger.log(Level.INFO, ()->"Relatório na Tela:");
        	customLogger.log(Level.INFO, ()->"1. Relatório de Delegacias");
        	customLogger.log(Level.INFO, ()->"2. Relatório de Denúncias");
        	customLogger.log(Level.INFO, ()->"3. Voltar ao Menu Anterior");
        	customLogger.log(Level.INFO, ()->"Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  

            switch (opcao) {
                case 1:
                    exibirRelatorioDelegacias();
                    esperar();
                    break;
                case 2:
                    exibirRelatorioDenuncias();
                    esperar();
                    break;
                case 3:
                    return;
                default:
                	customLogger.log(Level.INFO, ()->"Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirRelatorioDelegacias() {
    	customLogger.log(Level.INFO, ()->"Relatório de Delegacias:");
        for (Delegacia delegacia : Delegacia.delegacias.values()) {
            System.out.println(delegacia);
        }
    }

    private static void exibirRelatorioDenuncias() {
    	customLogger.log(Level.INFO, ()->"Relatório de Denúncias:");
        for (Denuncia denuncia : Denuncia.denuncias.values()) {
            System.out.println(denuncia);
        }
    }

    private static void exibirMenuRelatorioImpresso() {
        while (true) {
        	customLogger.log(Level.INFO, ()->"Relatório Impresso:");
        	customLogger.log(Level.INFO, ()->"1. Relatório Impresso de Delegacias");
        	customLogger.log(Level.INFO, ()->"2. Relatório Impresso de Denúncias");
        	customLogger.log(Level.INFO, ()->"3. Voltar ao Menu Anterior");
        	customLogger.log(Level.INFO, ()->"Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    gerarRelatorioImpressoDelegacias();
                    break;
                case 2:
                    gerarRelatorioImpressoDenuncias();
                    break;
                case 3:
                    return;
                default:
                	customLogger.log(Level.INFO, ()->"Opção inválida. Tente novamente.");
            }
        }
    }

    private static void gerarRelatorioImpressoDelegacias() {
        String path = "temp/relatorio_impresso_delegacias.txt";
       
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write("Relatório Impresso - Delegacias:");
            bw.newLine();
            for (Delegacia delegacia : Delegacia.delegacias.values()) {
                bw.write(delegacia.getNome() + ";" + delegacia.getEndereco() + ";" + delegacia.getTelefone());
                bw.newLine();
            }
            customLogger.log(Level.INFO, ()->"Relatório Impresso de Delegacias gerado com sucesso!");
        } catch (IOException e) {
            customLogger.log(Level.INFO, ()->"Erro ao gerar o Relatório Impresso de Delegacias.");
            e.printStackTrace();
        }
    }




    private static void gerarRelatorioImpressoDenuncias() {
        String path = "temp/relatorio_impresso_denuncias.txt";
      
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write("Relatório Impresso - Denuncias:");
            bw.newLine();          
            for(Denuncia denuncia : Denuncia.denuncias.values()) {
            	bw.write(denuncia.getData() + ";" + denuncia.getDescricao() + ";" + denuncia.getLocal());
                bw.newLine();
            }

            customLogger.log(Level.INFO, ()->"Relatório Impresso de Denúncias gerado com sucesso!");
        } catch (IOException e) {
            customLogger.log(Level.INFO, ()->"Erro ao gerar o Relatório Impresso de Denúncias.");
            e.printStackTrace();
        }
    }


    public static void esperar() {
    	try {
    		Thread.sleep(1500);
    	} catch(InterruptedException e) {
    		Thread.currentThread().interrupt();
    	}
    }
}