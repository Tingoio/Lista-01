public class Exercicio18 {
    public static void executar(){
        double nota1 = Prompt.lerDecimal("Digite a nota 1: ");
        double nota2 = Prompt.lerDecimal("Digite a nota 2: ");
        double nota3 = Prompt.lerDecimal("Digite a nota 3: ");

        double mediaHarm = (((nota1/1)+(nota2/1)+(nota3/1))/3);
        Prompt.imprimir("A média harmônica é: " + mediaHarm);
    }
}
