import java.util.Scanner;

public class Estacionamento {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        System.out.println("Estacionamento");
        System.out.println("Seja bem-vindo ao Plaza Park");

        do{
            System.out.println("Escolha uma opção");
            System.out.println("1 - Cadastrar Carro: ");
            System.out.println("2 - Listar Carro: ");
            System.out.println("3 - Remover Carro: ");
            System.out.println("4 - Cadastrar Moto: ");
            System.out.println("5 - Listar Moto: ");
            System.out.println("6 - Remover Moto: ");
            System.out.println("7 - Cadastrar Bicicleta: ");
            System.out.println("8 - Listar Bicicleta: ");
            System.out.println("9 - Remover Bicicleta: ");
            System.out.println("10 - Cadastrar Vaga: ");
            System.out.println("11 - Listar Vaga: ");
            System.out.println("12 - Remover Vaga: ");
            System.out.println("13 - Cadastrar Locação: ");
            System.out.println("14 - Listar Locação: ");
            System.out.println("15 - Remover Locação: ");

            try{
                opcao = scanner.nextInt();
            }catch (Exception e){
                opcao = 0;
            }

            switch (opcao) {
                case 1:
                    cadastrarCarro(scanner);
                    break;
            }
        }
    }
}
