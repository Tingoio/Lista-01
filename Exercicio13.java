public class Exercicio13 {
    public static void executar(){
        double a = Prompt.lerDecimal("Digite um valor real para A: ");
        double b = Prompt.lerDecimal("Digite um valor real para B: ");
        char operador = Prompt.lerCaractere("Digite a operação desejada: \n(+) Soma | (-) Subtração | (*) Multiplicação | (/): Divisão");
        
        if(operador=='+'){
            Prompt.imprimir("Soma: " + (a+b));
        }
        else if(operador=='-'){
            Prompt.imprimir("Subtração: " + (a-b));
        }
        else if(operador=='*'){
            Prompt.imprimir("Multiplicação: " + (a*b));
        }
        else if(operador=='/'){
            if(b==0){
                Prompt.imprimir("O valor de B não pode ser 0!");
            }
            else{
                Prompt.imprimir("Divisão: " + (a/b));
            }
        }
        else{
            Prompt.imprimir("Operador não definido!");
        }
    }
}
