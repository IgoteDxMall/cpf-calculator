package main;
public class CalculoCPF {
    private String cpf;
    private int[] digitoCPF;
    private int primeiroDigito;
    private int segundoDigito;

    public CalculoCPF(String cpf) {
        this.cpf = cpf;
        this.digitoCPF = new int[11];
        this.primeiroDigito = 0;
        this.segundoDigito = 0;
    }

    public void calcularPrimeiroDigito() {
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            digitoCPF[i] = Integer.parseInt(String.valueOf(cpf.charAt(i)));
            soma += digitoCPF[i] * (10 - i);
        }
        int resto = soma % 11;
        primeiroDigito = (resto < 2) ? 0 : 11 - resto;
    }

    public void calcularSegundoDigito() {
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += digitoCPF[i] * (11 - i);
        }
        soma += primeiroDigito * 2;

        int resto = soma % 11;
        segundoDigito = (resto < 2) ? 0 : 11 - resto;
    }

    public int getPrimeiroDigito() {
        return primeiroDigito;
    }

    public int getSegundoDigito() {
        return segundoDigito;
    }

    public String getCPFCompleto() {
        return cpf + primeiroDigito + segundoDigito;
    }
}
