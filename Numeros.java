import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita que o usuário digite um número
       
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verifica se o número é par ou ímpar
       
        String parOuImpar = (numero % 2 == 0) ? "par" : "ímpar";
        System.out.println("O número é: " + parOuImpar);

        // Verifica se o número é positivo ou negativo
        
        String positivoOuNegativo = (numero >= 0) ? "positivo" : "negativo";
        System.out.println("O número é: " + positivoOuNegativo);

        // Verifica se o número é primo
       
        boolean ehPrimo = true;
        if (numero <= 1) {
            ehPrimo = false; // 0 e 1 não são primos
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }
        System.out.println("O número é primo: " + (ehPrimo ? "sim" : "não"));

        // Calculando a raiz quadrada
        
        double raizQuadrada = Math.sqrt(numero);
        System.out.printf("A raiz quadrada do número é: %.2f%n", raizQuadrada);

        // Calculando o número elevado a 3
        
        int elevadoACubo = (int) Math.pow(numero, 3);
        System.out.println("O número elevado a 3 é: " + elevadoACubo);
        
        scanner.close();
    }
}

/* TURMA: TCTG241CNTDEV      

PROFESSOR: Wagner Pinto

DISCIPLINA: Desenvolvimento de Aplicações 

Maria Luíza Oliveira Ribeiro */