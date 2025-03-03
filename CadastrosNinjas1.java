package Desafio2;

import java.util.Scanner;

public class CadastrosNinjas1 {
    public static void main(String[] args) {

        //Scanners
        Scanner cadastro = new Scanner(System.in);
        Scanner CadastroNinjas = new Scanner(System.in);
        //Interface
        String menudousuario = "\n===== Menu Ninja =====\n1. Cadastrar Ninja \n2. Listar Ninjas \n3. Sair \nEscolha uma opção: ";
        System.out.println("Por favor digite 1 para inicar o sistema: ");
        int opcoes = cadastro.nextInt();
        //Array - memoria para salvar os nomes
        int Listalimi = 10;
        String[] Ninjas = new String[Listalimi];

        //contator
        int list = 0;

        //loop
        while (opcoes != 3) {
            System.out.println(menudousuario);
            int opcoesMenu = cadastro.nextInt();
            switch (opcoesMenu)
            {
                //Cadastro Ninja
                case 1:
                    if (list < 10) {
                        System.out.println("\n==== Cadastro Ninja =====");
                        System.out.println("Por favor digite o nome do ninja: ");
                        String nome = CadastroNinjas.nextLine();
                        System.out.println("Por favor coloque a idade do ninja: ");
                        String idade = CadastroNinjas.nextLine();
                        System.out.println("Por favor coloque a Patente do ninja: ");
                        String patente = CadastroNinjas.nextLine();
                        System.out.println("Por favor verifique se as informações estão corretas: " + nome + ", " + idade + ", " + patente);
                        System.out.println("\n===== Menu Ninja =====");
                        System.out.println("1. Confirmar dados\n2. Corrigir \n3. Sair");
                        String registro = nome + ", " + idade + ", " + patente;
                        Ninjas[list] = registro;
                        list++;
                        int cd = cadastro.nextInt();
                        if (cd == 2) {
                            System.out.println("\nRetornando ao início...");
                            System.out.println("\n==== Cadastro Ninja =====");
                            System.out.println("Por favor digite o nome do ninja: ");
                            String nome2 = CadastroNinjas.nextLine();
                            System.out.println("Por favor coloque a idade do ninja: ");
                            String idade2 = CadastroNinjas.nextLine();
                            System.out.println("Por favor coloque a Patente do ninja: ");
                            String patente2 = CadastroNinjas.nextLine();
                            System.out.println("Por favor verifique se as informações estão corretas: " + nome2 + ", " + idade2 + ", " + patente2);
                            System.out.println("\n===== Menu Ninja =====");
                            System.out.println("1. Corrigir\n2. Confirmar dados \n3. Sair");
                            int cd2 = cadastro.nextInt();
                            if (cd2 == 2) {
                                System.out.println("Dados salvos com sucesso! Voltando ao menu!");
                            }
                        } else if (cd == 1) {
                            System.out.println("Dados salvos com sucesso! Voltando ao menu!");
                        } if (cd == 3) {
                            System.out.println("Retornando ao menu");
                        }
                    }
                    break;

                //Lista ninja
                case 2:
                    System.out.println("\n===== Lista de Ninjas =====");
                    if (list == 0) {
                        System.out.println("Nenhum ninja cadastrado ainda.");
                    } else {
                        for (int i = 0; i < list; i++) {
                            System.out.println((i + 1) + ". " + Ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Resposta invalida, tente novamente!");
            }
        }
        cadastro.close();
        CadastroNinjas.close();
    }
}
