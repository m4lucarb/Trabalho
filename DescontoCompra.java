import java.util.Scanner;

public class DescontoCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita  o valor cheio da compra
       
        System.out.print("Digite o valor cheio da compra: ");
        double valorCheio = scanner.nextDouble();

        // Solicita o percentual de desconto
        
        System.out.print("Digite o percentual de desconto (em %): ");
        double percentualDesconto = scanner.nextDouble();

        // Calcula o valor do desconto
        
        double valorDesconto = (percentualDesconto / 100) * valorCheio;

        // Calcula o novo valor
        
        double novoValor = valorCheio - valorDesconto;

        // Exib3 os resultados
       
        System.out.printf("O valor cheio é: R$ %.2f%n", valorCheio);
        System.out.printf("O valor do desconto é: R$ %.2f%n", valorDesconto);
        System.out.printf("O novo valor é: R$ %.2f%n", novoValor);

        scanner.close();
    }
}

/* EXERCÍCIO 4 TURMA: TCTG241CNTDEV      

PROFESSOR: Wagner Pinto

DISCIPLINA: Desenvolvimento de Aplicações 

Maria Luíza Oliveira Ribeiro */