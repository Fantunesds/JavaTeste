package Desenvolvimentoemjava;

import java.util.function.Function;

public class Funcoes {
    public static <function> void main(String[] args) {

        function<String,String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();

        System.out.println(retornaNomeAoContrario.Apply(t:"fabio"));

    }
}
