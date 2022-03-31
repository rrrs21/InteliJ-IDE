package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
                         /*int a = 5;
        int b = 3;
                      System.out.println("Helo World"+ (a+b));*/
        Gato gato = new Gato("Mel", "Rosa", 5);
        System.out.println(gato);
    }
}
