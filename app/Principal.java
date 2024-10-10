package app;
import utilidades.FuncoesUteis;


    public class Principal {
    
        public static void main(String[] args) {
            //Instância da classe FuncoesUteis
        FuncoesUteis funcoes = new FuncoesUteis();

        //Método de soma
        int resultadoSoma = funcoes.soma(5, 7);
        System.out.println("Resultado da soma: " + resultadoSoma);

        //Método do triangulo
        System.out.println("Triângulo de altura 5:");
        funcoes.triangulo(5);

        //Método ao qual da o printArquivo
        System.out.println("Conteúdo do arquivo:");
        funcoes.printArquivo("caminho/para/seu/arquivo.txt");
    }
}


