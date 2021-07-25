package condicionais;

public class iteracao_e_operacoes {
    public static void main(String[] args) {
        var numero = 10;

        numero = numero++;
        System.out.println(numero);

        numero += 10;
        System.out.println(numero);

        numero = numero++ + 2;
        System.out.println(numero);

        numero = numero % 2;
        System.out.println(numero); // Aqui ele fica com o valor 0

        numero *= 2;
        System.out.println(numero);

    }
}
