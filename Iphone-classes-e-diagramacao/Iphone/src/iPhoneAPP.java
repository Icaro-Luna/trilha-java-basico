public class iPhoneAPP {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.setModelo("iPhone X");
        iphone.setArmazenamento(64);
        iphone.tocar();
        iphone.ligar("123456789");
        iphone.exibirPagina("https://www.apple.com");
    }

    public static class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
        private String modelo;
        private Integer armazenamento;

        private void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public void setArmazenamento(Integer armazenamento) {
            this.armazenamento = armazenamento;
        }

        @Override
        public void tocar() {
            System.out.println("Reproduzindo música no iPhone");
        }

        @Override
        public void pausar() {
            System.out.println("Pausando música no iPhone");
        }

        @Override
        public void selecionarMusica(String musica) {
            System.out.println("Selecionando a música: " + musica);
        }

        @Override
        public void ligar(String numero) {
            System.out.println("Ligando para o número: " + numero);
        }

        @Override
        public void atender() {
            System.out.println("Atendendo chamada no iPhone");
        }

        @Override
        public void iniciarCorreioVoz() {
            System.out.println("Iniciando correio de voz no iPhone");
        }

        @Override
        public void exibirPagina(String url) {
            System.out.println("Exibindo página: " + url);
        }

        @Override
        public void adicionarNovaAba() {
            System.out.println("Adicionando nova aba no navegador do iPhone");
        }

        @Override
        public void atualizarPagina() {
            System.out.println("Atualizando página no navegador do iPhone");
        }
    }

    public interface ReprodutorMusical {
        void tocar();
        void pausar();
        void selecionarMusica(String musica);
    }

    public interface AparelhoTelefonico {
        void ligar(String numero);
        void atender();
        void iniciarCorreioVoz();
    }

    public interface NavegadorInternet {
        void exibirPagina(String url);
        void adicionarNovaAba();
        void atualizarPagina();
    }
}
