package concessonaria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao nosso Sistema de Cadastro de Veiculos");
        

        //add cadastro de mais dois carros depois
        Veiculo carro = new Veiculo();

        System.out.println("Escolha a marca do carro: ");
        carro.marcaDoCarro = input.nextLine();
        
        System.out.println("Escolha o modelo do carro: ");
        carro.modeloDoCarro = input.nextLine();
        
        System.out.println("Escolha a cor do seu carro: ");
        carro.corDoCarro = input.nextLine();

        System.out.println("Informe a placa do carro: ");
        carro.placaDoCarro = input.nextLine();
        
        System.out.println("Informe o ano do carro: ");
        carro.anoFabricacao = input.nextInt();
        
        System.out.println("Informe o preço do carro: ");
        carro.precoDoCarro = input.nextDouble();

        System.out.println("-----------FICHA DA COMPRA DO CARRO-----------");
        System.out.println(" ");
        System.out.println("Marca do carro: "+carro.marcaDoCarro);
        System.out.println("Modelo do carro: "+carro.modeloDoCarro);
        System.out.println("Cor do carro: "+carro.corDoCarro);
        System.out.println("Placa do carro: "+carro.placaDoCarro);
        System.out.println("Ano do carro: "+carro.anoFabricacao);
        System.out.println("Preço do carro: "+carro.precoDoCarro);

        input.close();
    }
}