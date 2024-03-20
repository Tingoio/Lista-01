public class Exercicio11 {
    public static void executar(){
        int a = Prompt.lerInteiro("Digite o primeiro número: ");
        int b = Prompt.lerInteiro("Digite o segundo número: ");
        int c = Prompt.lerInteiro("Digite o terceiro número: ");
        int aux;

        if(a>b){
            aux = b;
            b = a;
            a = aux;
        }
        if(b>c){
            aux = c;
            c = b;
            b = aux;
        }
        if(a>b){
            aux = b;
            b = a;
            a = aux;
        }
        Prompt.imprimir("Os números em ordem crescente são: " + a + "," + b + "," + c);



    }
}
