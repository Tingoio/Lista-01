public class Exercicio14 {
    public static void executar(){
       double n = Prompt.lerDecimal("Digite o termo de ordem n:");
       double razao = Prompt.lerDecimal("Digite a razao: ");
       double a1 = Prompt.lerDecimal("Digite o primeiro termo da progressão aritmética: ");
       
       double an = a1 + (n - 1) * razao;
       Prompt.imprimir("O n-ésimo termo da progressão aritmética é: " + an);
    }
}
