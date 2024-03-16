public class Exercicio05 {
    public static void executar(){
        double a = Prompt.lerDecimal("Digite o primeiro valor: ");
        double b = Prompt.lerDecimal("Digite o segundo valor: ");
        double x;

        Prompt.imprimir("Valores originais: " + a);
        Prompt.imprimir("Valores originais: " + b);
        x = a;
        a = b;
        b = x;
        Prompt.imprimir("----------------------\nValores trocados: " + a);
        Prompt.imprimir("Valores trocados: " + b);

    }
}
