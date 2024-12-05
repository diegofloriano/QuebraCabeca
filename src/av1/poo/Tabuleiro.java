package av1.poo;

import av1.poo.Borda.EstadoBorda;
import av1.poo.Borda.EstadoPeca;

public final class Tabuleiro extends Peca {
    
    Peca[][] tabuleiro;
    
    public Tabuleiro(EstadoPeca estado, EstadoBorda bordaSuperior, EstadoBorda bordaInferior, EstadoBorda bordaEsquerda, EstadoBorda bordaDireita) {
        super(estado, bordaSuperior, bordaInferior, bordaEsquerda, bordaDireita);           
        tabuleiro = new Peca[3][3]; 
        inicializarTabuleiro();
    }
    
    public void inicializarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                EstadoPeca estadoInicial = EstadoPeca.VAZIA;
                EstadoBorda bordaSuperior = EstadoBorda.VAZIA;
                EstadoBorda bordaInferior = EstadoBorda.VAZIA;
                EstadoBorda bordaEsquerda = EstadoBorda.VAZIA;
                EstadoBorda bordaDireita = EstadoBorda.VAZIA;

                // Atribuindo bordas para as peças nas bordas do tabuleiro
                if (i == 0) bordaSuperior = EstadoBorda.PREENCHIDA;
                if (i == 2) bordaInferior = EstadoBorda.PREENCHIDA;
                if (j == 0) bordaEsquerda = EstadoBorda.PREENCHIDA;
                if (j == 2) bordaDireita = EstadoBorda.PREENCHIDA;

                tabuleiro[i][j] = new Peca(estadoInicial, bordaSuperior, bordaInferior,
                        bordaEsquerda, bordaDireita);
            }
        }
    }

    // Método para exibir o tabuleiro
    public void exibirTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Exibe o estado de cada peça (descrição do estado)
                System.out.print(tabuleiro[i][j].toString() + " ");
            }
            System.out.println();  // Nova linha após cada linha do tabuleiro
        }
    }

    public void alterarPeca(int linha, int coluna, EstadoPeca novoEstado) {
        if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3) {
            tabuleiro[linha][coluna].setEstado(novoEstado);
        } else {
            System.out.println("Posição inválida!");
        }
    }

    public void exibirBordasPeca(int linha, int coluna) {
        if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3) {
            tabuleiro[linha][coluna].exibirBordas();
        } else {
            System.out.println("Posição inválida!");
        }
    }
}
