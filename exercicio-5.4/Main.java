@FunctionalInterface
interface OperacaoMatematica {
    double executar(double a, double b);
}

public class Main {
    public static void main(String[] args) {

        OperacaoMatematica soma = (a, b) -> a + b;
        OperacaoMatematica subtracao = (a, b) -> a - b;
        OperacaoMatematica multiplicacao = (a, b) -> a * b;
        OperacaoMatematica divisao = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Divisão por zero não é permitida.");
            }
            return a / b;
        };
        
        double num1 = 20.0;
        double num2 = 4.0;

        System.out.println("--- Testando Operações Matemáticas ---");
        System.out.println("Soma: " + soma.executar(num1, num2));
        System.out.println("Subtração: " + subtracao.executar(num1, num2));
        System.out.println("Multiplicação: " + multiplicacao.executar(num1, num2));
        System.out.println("Divisão: " + divisao.executar(num1, num2));
    }
}