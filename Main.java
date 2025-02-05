public class Main {
    public static void main(String[] args) {

        Carro meuCarro = new Carro("Fusca", "Vermelho", 1975);

        
        meuCarro.exibirInformacoes();

        
        meuCarro.acelerar();
        meuCarro.acelerar();

      
        meuCarro.frear();

       
        meuCarro.alterarVelocidade();

        
        meuCarro.exibirInformacoes();
            }
        }
