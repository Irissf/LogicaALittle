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
    public ArrayList<Integer> OrdenarListas(int[]lista1 ,int[] lista2){
        ArrayList<Integer> nuevaLista = new ArrayList<>();
        
        for (Integer num : lista1) {
            nuevaLista.add(num);
        }
       
        for (int i = 0; i < lista2.length; i++) {
            System.out.println(lista2[i]);
            for (int j = 0; j < nuevaLista.size(); j++) {
                if(lista2[i] <= nuevaLista.get(j) ){
                    System.out.println("menor o igual que "+nuevaLista.get(j));
                    nuevaLista.add(j,lista2[i]);
                    break;
                }   
            }
        }

        return nuevaLista;    
    }

}
