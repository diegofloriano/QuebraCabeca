
package av1.poo;

import av1.poo.Borda.EstadoBorda;
import av1.poo.Borda.EstadoPeca;
import java.util.Scanner;

public class EncaixaPeca {
    
   public static void main(String[] args) {
       try (Scanner scanner = new Scanner(System.in)) {
            Tabuleiro tabuleiro = new Tabuleiro(EstadoPeca.VAZIA, EstadoBorda.VAZIA, EstadoBorda.VAZIA, EstadoBorda.VAZIA, EstadoBorda.VAZIA);
           
           System.out.println("Tabuleiro inicial:");
           tabuleiro.exibirTabuleiro();
           
           boolean continuar = true;
           while (continuar) {
               System.out.println("\nEscolha uma opção:");
               System.out.println("1. Alterar estado de uma peça");
               System.out.println("2. Exibir tabuleiro");
               System.out.println("3. Exibir bordas de uma peça");
               System.out.println("4. Sair");
               System.out.print("Opção: ");
               int opcao = scanner.nextInt();
               
               OUTER:
               switch (opcao) {
                   case 1 -> {
                       System.out.print("Digite a linha (0-2): ");
                       int linha = scanner.nextInt();
                       System.out.print("Digite a coluna (0-2): ");
                       int coluna = scanner.nextInt();
                       System.out.println("Escolha o novo estado da peça:");
                       System.out.println("1. Vazia");
                       System.out.println("2. Vazia Preenchida");
                       System.out.println("3. Preenchida Preenchida");
                       System.out.print("Opção: ");
                       int estadoEscolhido = scanner.nextInt();
                       EstadoPeca novoEstado = EstadoPeca.VAZIA;
                       switch (estadoEscolhido) {
                           case 1 -> novoEstado = EstadoPeca.VAZIA;
                           case 2 -> novoEstado = EstadoPeca.VAZIAPREENCHIDA;
                           case 3 -> novoEstado = EstadoPeca.PREENCHIDAPREENCHIDA;
                           default -> {
                               System.out.println("Opção inválida!");
                               break OUTER;
                           }
                       }
                       tabuleiro.alterarPeca(linha, coluna, novoEstado);
                       System.out.println("Estado alterado!");
                   }
                   case 2 -> tabuleiro.exibirTabuleiro();
                   case 3 -> {
                       System.out.print("Digite a linha (0-2) para exibir as bordas: ");
                       int linha = scanner.nextInt();
                       System.out.print("Digite a coluna (0-2) para exibir as bordas: ");
                       int coluna = scanner.nextInt();
                       tabuleiro.exibirBordasPeca(linha, coluna);
                   }
                   case 4 -> {
                       continuar = false;
                       System.out.println("Saindo...");
                   }
                   default -> System.out.println("Opção inválida!");
               }
           }
       }
    }
}