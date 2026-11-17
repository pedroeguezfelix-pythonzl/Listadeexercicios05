package org.example;

import java.util.Scanner;

public class Exercicio06 {
    public static int contarVogais(String texto) {
        String minusculo = texto.toLowerCase();
        int contador = 0;
        for (int i = 0; i < minusculo.length(); i++) {
            char letra = minusculo.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        return contador;
    }
    public static void exibirContagem(String[] frases) {
        int maior = -1;
        String fraseMaior = "";
        for (int i = 0; i < frases.length; i++) {
            int vogais = contarVogais(frases[i]);
            System.out.println("Frase " + (i + 1) + ": " + frases[i] + " (" + vogais + " vogais)");
            if (vogais > maior) {
                maior = vogais;
                fraseMaior = frases[i];
            }
        }
        System.out.println("Frase com mais vogais: " + fraseMaior + " (" + maior + " vogais)");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] frases = new String[3];
        for (int i = 0; i < frases.length; i++) {
            System.out.print("Digite a frase " + (i + 1) + ": ");
            frases[i] = sc.nextLine();
        }

        exibirContagem(frases);
    }
}