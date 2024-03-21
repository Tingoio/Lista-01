public class Exercicio17 {
    public static void executar(){   
        double nota1 = Prompt.lerDecimal("Digite a nota 1: ");
        double peso1 = Prompt.lerDecimal("Digite o peso da nota 1: ");
        double nota2 = Prompt.lerDecimal("Digite a nota 2: ");
        double peso2 = Prompt.lerDecimal("Digite o peso da nota 2: ");
        double nota3 = Prompt.lerDecimal("Digite a nota 3: ");
        double peso3 = Prompt.lerDecimal("Digite o peso da nota 3: ");

        double media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
        Prompt.imprimir("A média ponderada é de: " + media);
    }
}
