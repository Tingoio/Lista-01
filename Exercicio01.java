public class Exercicio01 {
    public static void executar(){
        double numero = Prompt.lerDecimal("Digite um numero: ");
        if(numero>10){
            Prompt.imprimir("Número maior que 10!!!");
        }else{
            Prompt.imprimir("Número menor ou igual a 10!!!");
        }
    }
}
