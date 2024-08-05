import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        
        // Solicita a primeira nota
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        // Solicita a segunda nota
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        // Calcula a média aritmética
        double media = (nota1 + nota2) / 2;
        
        // Exibe a média
        System.out.printf("A média aritmética das notas é: %.2f%n", nome,media);
        
        // Fecha o scanner
        scanner.close();
    }
}
