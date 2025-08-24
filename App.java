
import java.util.Scanner;
import main.CalculoCPF;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os 9 primeiros dígitos do CPF (sem pontos ou traços): ");
        String cpfInput = scanner.nextLine();

        /*
         * 
         */
        while (cpfInput.length() != 9) {
            System.out.print("Entrada inválida. Por favor, digite exatamente 9 dígitos numéricos: ");
            cpfInput = scanner.nextLine();
        }

        CalculoCPF calculoCPF = new CalculoCPF(cpfInput);
        calculoCPF.calcularPrimeiroDigito();
        calculoCPF.calcularSegundoDigito();

        System.out.println("CPF completo: " + calculoCPF.getCPFCompleto());

    }
}