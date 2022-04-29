package ejercicios;

import java.util.ArrayList;

public class LogicaMat {
    
    public void SumaDatos(int[] numeros, int valor){
        int resultado = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (i < numeros.length-1) {
                resultado = numeros[i]+numeros[i+1];
                System.out.println(resultado);
                if (resultado == valor) {
                    System.out.println("indice: "+i+" indice: "+(i+1));
                }
            }
        }
    }

    public boolean Palindromo(int numero){
        int num = numero, invertido = 0,resto;
        while( numero > 0 ) {
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
        }

        if (invertido == num) {
            return true;
        }

        return false;
    }


    //SIGUIENTE dada dos listas ordenar sus datos numericos en una sola lista
    public int[] OrdenarListas(int[]lista1 ,int[] lsita2){
        return lista1;    
    }

}
