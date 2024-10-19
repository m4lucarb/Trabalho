import java.util.Scanner;

public class Palavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar que o usuário digite uma palavra
        
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        // Exibir a palavra digitada
       
        System.out.println("A palavra digitada foi: " + palavra);

        // Contar o número de dígitos
        
        int numeroDeDigitos = palavra.length();
        System.out.println("A palavra tem " + numeroDeDigitos + " dígitos");

        // Obter a primeira letra
        
        char primeiraLetra = palavra.charAt(0);
        System.out.println("A primeira letra é: " + primeiraLetra);

        // Obter a letra central
       
        char letraCentral;
        if (numeroDeDigitos % 2 == 0) {
            letraCentral = palavra.charAt(numeroDeDigitos / 2 - 1); // Para palavras de comprimento par
        } else {
            letraCentral = palavra.charAt(numeroDeDigitos / 2); // Para palavras de comprimento ímpar
        }
        System.out.println("A letra central da palavra é: " + letraCentral);

        // Obter a última letra
        
        char ultimaLetra = palavra.charAt(numeroDeDigitos - 1);
        System.out.println("A última letra é: " + ultimaLetra);

        // Escrever a palavra ao contrário
       
        String palavraAoContrario = new StringBuilder(palavra).reverse().toString();
        System.out.println("A palavra escrita ao contrário é: " + palavraAoContrario);

        // Converter a palavra para maiúsculo
        
        String palavraMaiusculo = palavra.toUpperCase();
        System.out.println("A palavra toda em maiúsculo: " + palavraMaiusculo);

        // Converter a palavra para minúsculo
        
        String palavraMinusculo = palavra.toLowerCase();
        System.out.println("A palavra toda em minúsculo: " + palavraMinusculo);

        // Fechar o scanner
        
        scanner.close();
    }
}

/* EXERCÍCIO 1 TURMA: TCTG241CNTDEV      

PROFESSOR: Wagner Pinto

DISCIPLINA: Desenvolvimento de Aplicações 

Maria Luíza Oliveira Ribeiro */