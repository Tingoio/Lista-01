public class Exercicio06 {
    public static void executar(){
        double C = Prompt.lerDecimal("Digite a temperatura em Celsius(ºC): ");
        Prompt.imprimir("A temperatura em Fahrenheit é de: " + (9 * C + 160) / 5);
    }
}