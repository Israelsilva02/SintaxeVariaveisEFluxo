package teste;

public class TestaCaracteres {
    public static void main(String[]agrs){
        char letra = 'a';

        System.out.println(letra);
        char valor = 66;
        System.out.println(valor);

        valor = (char) (valor + 1);
        System.out.println(valor);

        String palavra = "estudando para o trabalho";

        System.out.println(palavra);

        palavra = palavra + 2020;
        System.out.println(palavra);

        String parcela1 = "10";
        String parcela2 = "20";

        System.out.println(parcela1 + parcela2);
    }
}
