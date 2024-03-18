public class Exercicio07 {
    public static void executar(){
        double numero = Prompt.lerDecimal("Digite unm número:");
        if(numero>100&&numero<200){
            Prompt.imprimir("Número dentro do intervalo de 100 a 200!");
        }
        else{
            Prompt.imprimir("Número fora do intervalo de 100 a 200!");
        }
    }
}