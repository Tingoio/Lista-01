public class Exercicio02 {
    public static void executar(){
        
        double num1 = Prompt.lerDecimal("Digite o primeiro número: ");
        double num2 = Prompt.lerDecimal("Digite o segundo número: ");

        Prompt.imprimir("Soma: "+ (num1+num2));
    }
}
