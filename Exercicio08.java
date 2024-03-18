public class Exercicio08 {
    public static void executar(){
        double numero = Prompt.lerDecimal("Digite unm número:");
        if(numero>=50){
            Prompt.imprimir("Número maior ou igual a 50!");
        }
        else{
            Prompt.imprimir("Número menor que 50!");
        }
    }
}
