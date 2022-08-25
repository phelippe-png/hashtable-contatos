package com.company;

import java.util.Hashtable;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opcao;
        int continuar;
        String nomeContato;
        Integer numeroInformado;
        int numeroContato;
        Hashtable<String, Integer> contatos = new Hashtable<String, Integer>();

        do {
            System.out.println("(1) - Adicionar contato.");
            System.out.println("(2) - Buscar contato.");
            System.out.println("(0) - Sair.");
            System.out.println("Selecione uma opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    try{
                        System.out.println("Informe o nome do contato: ");
                        nomeContato = scan.next();

                        System.out.println("Informe o número: ");
                        numeroInformado = scan.nextInt();

                        System.out.println("");

                        contatos.put(nomeContato, numeroInformado);

                        System.out.println("Contato cadastrado com sucesso!");
                    } catch (Exception ex) {
                        System.out.println("Erro ao cadastrar!!!");
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Informe o nome do contato: ");
                        nomeContato = scan.next();

                        numeroContato = contatos.get(nomeContato);
                        System.out.println("Número: " + numeroContato);
                    } catch (Exception ex) {
                        System.out.println("Número não encontrado!!!");
                    }
                    break;
            }

            System.out.println("");
            System.out.println("Deseja continuar com o programa? ");
            System.out.println("(1) - Sim.");
            System.out.println("(0) - Não.");
            continuar = scan.nextInt();
        } while (continuar != 0);

        System.out.println("");
        System.out.println("Saindo do programa...");
    }
}
