import java.util.Scanner;

public class ConceitoNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a nota (0 a 100): ");
        double nota = scanner.nextDouble();
        
        if (nota < 0 || nota > 100) {
            System.out.println("Nota inválida. Por favor, insira uma nota entre 0 e 100.");
        } else {
            String conceito;
            if (nota > 90) {
                conceito = "A";
            } else if (nota > 80) {
                conceito = "B";
            } else if (nota > 70) {
                conceito = "C";
            } else if (nota > 60) {
                conceito = "D";
            } else {
                conceito = "E";
            }
            
            System.out.println("O conceito para a nota " + nota + " é: " + conceito);
        }
        
        scanner.close();
    }
}

/* TURMA: TCTG241CNTDEV      

PROFESSOR: Wagner Pinto

DISCIPLINA: Desenvolvimento de Aplicações 

Maria Luíza Oliveira Ribeiro */