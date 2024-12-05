package av1.poo;

public class Borda {
    enum EstadoPeca {
        VAZIA("Vazia"),
        VAZIAPREENCHIDA("Vazia Preenchida"),
        PREENCHIDAPREENCHIDA("Preenchida Preenchida");

        private final String descricao;

        EstadoPeca(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }
    }


    enum EstadoBorda {
        VAZIA("Vazia"),
        PREENCHIDA("Preenchida");

        private final String descricao;

        EstadoBorda(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }
    }
}