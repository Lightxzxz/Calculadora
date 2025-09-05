public class Divisao {
    public double dividir(double numerador, double denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("Erro: Divisão por zero não é permitida.");
        }
        return numerador / denominador;
    }
}