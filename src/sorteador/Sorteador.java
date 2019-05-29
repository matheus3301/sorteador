/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorteador;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Sorteador {

    public static void SortearItem(ArrayList<String> lista) {
        
        if (!lista.isEmpty()) {
            int aleatorio = (int) Math.floor(Math.random() * lista.size());
            System.out.println("");
            System.out.println("O Item sorteado foi : " + lista.get(aleatorio));
            System.out.println("");
        }else{
            System.out.println("");
            System.out.println("Primeiro cadastre algum item na lista!");
            System.out.println("");
        }
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();

        boolean status = true;
        Scanner entrada = new Scanner(System.in);

        System.out.println("-- BEM VINDO AO SORTEADOR --");
        while (status) {
            System.out.println("DIGITE A OPÇÃO DESEJADA:");
            System.out.println("1 - Cadastrar Item");
            System.out.println("2 - Listar Itens");
            System.out.println("3 - Sortear");
            System.out.println("4 - Apagar Item");
            System.out.println("5 - Apagar Lista(Completa)");
            System.out.println("0 - Sair");

            int res = entrada.nextInt();

            switch (res) {
                case (1):
                    System.out.println("");
                    System.out.println("Digite o valor que você deseja cadastrar");
                    
                    String valorRec = entrada.next();
                    a.add(valorRec);
                    System.out.println("");
                    break;
                case (2):
                    System.out.println("");
                    System.out.println("Itens da lista: " + a);
                    System.out.println("");
                    break;
                case (3):
                    SortearItem(a);
                    break;
                case (4):
                    System.out.println("");
                    System.out.println("Insira o índice do item que deseja apagar");
                    System.out.println("");
                    a.remove(entrada.nextInt()-1);
                    
                    break;
                    
                case(5):
                    a.clear();
                    System.out.println("");
                    System.out.println("                                                                                                                              ");
                    System.out.println("");
                    
                    break;
                case (0):
                    System.exit(0);
            }
        }

    }

}
