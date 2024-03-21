public class Exercicio15 {
    public static void executar(){
        int ponto1x = Prompt.lerInteiro("Digite o x do primeiro ponto: ");
        int ponto1y = Prompt.lerInteiro("Digite o y do primeiro ponto: ");
        int ponto2x = Prompt.lerInteiro("Digite o x do segundo ponto: ");
        int ponto2y = Prompt.lerInteiro("Digite o y do segundo ponto: ");

        double distancia = Math.sqrt(Math.pow((ponto2x - ponto1x),2) + Math.pow ((ponto2y - ponto1y), 2));
        Prompt.imprimir("Distancia: " + distancia);

    }
}
