public class Exercicio10 {
    public static void executar(){
        int numero = Prompt.lerInteiro("Digite um número de 1 a 5: ");
        switch(numero){
            case 1: Prompt.imprimir("Número um!");
            break;
            case 2: Prompt.imprimir("Número dois!");
            break;
            case 3: Prompt.imprimir("Número três!");
            break;
            case 4: Prompt.imprimir("Número quatro!");
            break;
            case 5: Prompt.imprimir("Número cinco!");
            break;
            default: Prompt.imprimir("Digite um número válido!!!");
            break;
        }
    }
}
