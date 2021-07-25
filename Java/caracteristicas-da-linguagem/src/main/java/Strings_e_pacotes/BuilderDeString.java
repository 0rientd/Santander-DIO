package Strings_e_pacotes;

public class BuilderDeString {
    public static void main(String[] args) {
        var nome = "Carlos";
        var sobreNome = "Henrique";
        final var nomeCompleto = nome + sobreNome;

        System.out.println(nome);
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Nome completo do Cliente : " + nomeCompleto);

        var string = new String(" Minha String ");

        System.out.println("Posição do caracter na posicao 5 = " + string.charAt(4));
        System.out.println("Quantidade de letras = " + string.length());
        System.out.println("Sem trim = [" + string + "]");
        System.out.println("Com trim = [" + string.trim() + "]");
        System.out.println("Tudo maiusculo = " + string.toUpperCase());
        System.out.println("Tudo minusculo = " + string.toLowerCase());
        System.out.println("Contem? (True) = " + string.contains("M"));
        System.out.println("Contem? (False) = " + string.contains("X"));
        System.out.println("Replace com $ = " + string.replace("n", "$"));
        System.out.println("Eh igual? (True) = " + string.equals(" Minha String "));
        System.out.println("Eh igual ignorando o case sensitive? (True) = " + string.equalsIgnoreCase(" mInHa string "));

    }
}
