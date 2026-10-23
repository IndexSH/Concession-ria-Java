package concessonaria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao nosso Sistema de Cadastro de Veiculos");
        

        //add cadastro de mais dois carros depois
        Veiculo carro = new Veiculo();
        Veiculo carro2 = new Veiculo();
        Veiculo carro3 = new Veiculo();

        System.out.println("Escolha a marca do carro 1: ");
        carro.marcaCarro = input.nextLine();

        System.out.println("Escolha a marca do carro 2: ");
        carro2.marcaCarro = input.nextLine();
        
        System.out.println("Escolha a marca do carro 3: ");
        carro3.marcaCarro = input.nextLine();
        
        System.out.println("Escolha o modelo do carro 1: ");
        carro.modeloCarro = input.nextLine();
        
        System.out.println("Escolha o modelo do carro 2: ");
        carro2.modeloCarro = input.nextLine();
        
        System.out.println("Escolha o modelo do carro 3: ");
        carro3.modeloCarro = input.nextLine();
        
        System.out.println("Escolha a cor do seu carro 1: ");
        carro.corCarro = input.nextLine();
        
        System.out.println("Escolha a cor do seu carro 2: ");
        carro2.corCarro = input.nextLine();
        
        System.out.println("Escolha a cor do seu carro 3: ");
        carro3.corCarro = input.nextLine();

        System.out.println("Informe a placa do carro 1: ");
        carro.placaCarro = input.nextLine();

        System.out.println("Informe a placa do carro 2: ");
        carro2.placaCarro = input.nextLine();

        System.out.println("Informe a placa do carro 3: ");
        carro3.placaCarro = input.nextLine();
        
        System.out.println("Informe o ano do carro 1: ");
        carro.anoFabricacao = input.nextInt();
        
        System.out.println("Informe o ano do carro 2: ");
        carro2.anoFabricacao = input.nextInt();
        
        System.out.println("Informe o ano do carro 3: ");
        carro3.anoFabricacao = input.nextInt();
        
        System.out.println("Informe o preço do carro 1: ");
        carro.precoCarro = input.nextDouble();
        
        System.out.println("Informe o preço do carro 2: ");
        carro2.precoCarro = input.nextDouble();
        
        System.out.println("Informe o preço do carro 3: ");
        carro3.precoCarro = input.nextDouble();
        

        /* System.out.println("-----------FICHA DA COMPRA DO CARRO-----------");
        System.out.println(" ");
        System.out.println("Marca do carro: "+carro.marcaDoCarro);
        System.out.println("Modelo do carro: "+carro.modeloDoCarro);
        System.out.println("Cor do carro: "+carro.corDoCarro);
        System.out.println("Placa do carro: "+carro.placaDoCarro);
        System.out.println("Ano do carro: "+carro.anoFabricacao);
        System.out.println("Preço do carro: "+carro.precoDoCarro); */

        carro.exibirDados();
        carro2.exibirDados();
        carro3.exibirDados();

        input.close();
    }
}