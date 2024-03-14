public class Exercicio03 {
    public static void executar(){
        int a = Prompt.lerInteiro("Digite um número inteiro: ");
        int b = Prompt.lerInteiro("Digite outro número inteiro: ");
        if(a==b){
            Prompt.imprimir("A sequência dos números é invalida.");
        }
        else{
            if(a>b){
                Prompt.imprimir(" "+ a + "é maior que: "+ b);
            }
            else{
                Prompt.imprimir(b + " é maior que "+ a +".");
            }
        }
    }
}
