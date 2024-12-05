package av1.poo;

import av1.poo.Borda.EstadoBorda;
import av1.poo.Borda.EstadoPeca;

public class Peca {
    
        EstadoPeca estado;
        EstadoBorda bordaSuperior;
        EstadoBorda bordaInferior;
        EstadoBorda bordaEsquerda;
        EstadoBorda bordaDireita;

        public Peca(EstadoPeca estado, EstadoBorda bordaSuperior, EstadoBorda bordaInferior,
                    EstadoBorda bordaEsquerda, EstadoBorda bordaDireita) {
            this.estado = estado;
            this.bordaSuperior = bordaSuperior;
            this.bordaInferior = bordaInferior;
            this.bordaEsquerda = bordaEsquerda;
            this.bordaDireita = bordaDireita;
        }

        public EstadoPeca getEstado() {
            return estado;
        }

        public void setEstado(EstadoPeca estado) {
            this.estado = estado;
        }

        public void exibirBordas() {
            System.out.println("Borda Superior: " + bordaSuperior.getDescricao());
            System.out.println("Borda Inferior: " + bordaInferior.getDescricao());
            System.out.println("Borda Esquerda: " + bordaEsquerda.getDescricao());
            System.out.println("Borda Direita: " + bordaDireita.getDescricao());
        }

        @Override
        public String toString() {
            return estado.getDescricao();
        }
    }