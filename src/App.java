import java.util.ArrayList;

import ejercicios.LogicaMat;
import ejercicios.TablaHash;

public class App {
    public static void main(String[] args){
        System.out.println("Recordando viejos tiempo :D");

        //*********************** Hashtable ***********************
        TablaHash th = new TablaHash();
        th.printName(2);
        th.repeatWords("cosa casa madre casa");

        //******************* LogicaMat ***********************
        LogicaMat lm = new LogicaMat();
        int[] datos = new int[]{1,3,5,4,6,7,8,2,2};
        lm.SumaDatos(datos, 4);

        
        System.out.println();
        System.out.println(lm.Palindromo(1225));
        System.out.println(lm.Palindromo(1221));

        int[] listaOrdenadaUno = new int[]{1,2,4,6,7,9};
        int[] listaOrdenadaDos = new int[]{2,3,4,5,8,10};
        for (int i : listaOrdenadaUno) {
            System.out.print(i+",");
        }
        System.out.println();
        for (int i : listaOrdenadaDos) {
            System.out.print(i+",");
        }
        System.out.println("\n"+lm.OrdenarListas(listaOrdenadaUno, listaOrdenadaDos));
        

    }

}
