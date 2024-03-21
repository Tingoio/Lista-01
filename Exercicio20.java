public class Exercicio20 {
    public static void executar(){
        double tempo = Prompt.lerDecimal("Digite o tempo gasto em horas da viagem: ");
        double velocidade = Prompt.lerDecimal("Digite a velocidade média da viagem: ");

        double litros = (tempo * velocidade) / 12;
        Prompt.imprimir("A quantidade de litros utilizados é: " + litros);

    }
}
