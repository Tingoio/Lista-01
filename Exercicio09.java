public class Exercicio09 {
    public static void executar(){
        double a = Prompt.lerDecimal("Digite o valor de A: ");
        double b = Prompt.lerDecimal("Digite o valor de B: ");
        if(a==b){
            Prompt.imprimir("Os valores são iguais!");
        }
        else{
            if(a>b){
                Prompt.imprimir("Os valores são diferentes, e A é maior que B.");
            }
            else{
                Prompt.imprimir("Os valores são diferentes, e B é maior que A.");
            }
        }
    }
}
