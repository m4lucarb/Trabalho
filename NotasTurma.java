import java.util.Scanner;

public class NotasTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];

        // Solicita as notas dos alunos
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + " (0 a 10): ");
            double nota;
            while (true) {
                nota = scanner.nextDouble();
                if (nota >= 0 && nota <= 10) {
                    break;
                } else {
                    System.out.print("Nota inválida. Digite novamente (0 a 10): ");
                }
            }
            notas[i] = nota;
        }

        // Calcula a maior e a menor nota
        
        double maiorNota = notas[0];
        double menorNota = notas[0];
        double somaNotas = 0;

        for (double nota : notas) {
            if (nota > maiorNota) {
                maiorNota = nota;
            }
            if (nota < menorNota) {
                menorNota = nota;
            }
            somaNotas += nota;
        }

        // Calcula a média
        
        double media = somaNotas / notas.length;

        // Exibe os resultados
       
        System.out.printf("A maior nota é: %.2f%n", maiorNota);
        System.out.printf("A menor nota é: %.2f%n", menorNota);
        System.out.printf("A média da turma é: %.2f%n", media);

        scanner.close();
    }
}

/* TURMA: TCTG241CNTDEV      

PROFESSOR: Wagner Pinto

DISCIPLINA: Desenvolvimento de Aplicações 

Maria Luíza Oliveira Ribeiro */