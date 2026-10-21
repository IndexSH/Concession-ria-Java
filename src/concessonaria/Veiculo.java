package concessonaria;

public class Veiculo {

    String modeloCarro;
    String marcaCarro;
    String corCarro;
    String placaCarro;
    int anoFabricacao;
    double precoCarro;

    public void exibirDados() {
        System.out.println("-----------FICHA DA COMPRA DO CARRO-----------");
        System.out.println(" ");
        System.out.println("Marca do carro: " + marcaCarro);
        System.out.println("Modelo do carro: " +modeloCarro);
        System.out.println("Cor do carro: " + corCarro);
        System.out.println("Placa do carro: " + placaCarro);
        System.out.println("Ano do carro: " + anoFabricacao);
        System.out.println("Preço do carro: " + precoCarro);

    }
}