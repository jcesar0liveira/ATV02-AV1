public class Carro {
    private String modelo;
    private String cor;
    private int ano;
    private int velocidade;


        Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velocidade = 0;
    }


        void alterarVelocidade(int NovaVelocidade) {
        this.velocidade = NovaVelocidade;
        System.out.println("Velocidade alterada para: " + this.velocidade + " km/h");
    }


        void acelerar(int ampliacao) {
        this.velocidade += ampliacao;
        System.out.println("Acelerando--> Velocidade atual: " + this.velocidade + " km/h");
    }


        void frear(int reducao) {
            this.velocidade = reducao;
            if (this.velocidade < 0) {
            this.velocidade = 0;
        }
        System.out.println("Freando --> Velocidade atual: " + this.velocidade + " km/h");
    }


      void exibirInformacoes() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ano: " + this.ano);
        System.out.println("Velocidade: " + this.velocidade + " km/h");
    }
}
