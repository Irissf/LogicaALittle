package ejercicios;

import java.util.ArrayList;

public class UseStreamAndLambda {

    public void UseStreamArray(){
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Vigo");
        cities.add("Pontevedra");

        //como haciamos
        for (String city : cities) {
            System.out.println(city);
        }

        //con stream, referencia con lambda
        cities.stream().forEach(city -> System.out.println("lambda "+city));
        /* ¿Qué pasa aqui? 
         * city -> System.out.println(city) |==> aqui tenemos una expresión lambda como una función de flecha
         * si solo tenemos una variable no necesitamos especificar el tipo de dato del parámetro
         * 
         */

        //referencia de método, en vez de usar una lambda, llamamos a un método
        cities.stream().forEach(this::useWithStream);

        /*si tenemos una acción que puede tardar mucho tiempo, podemos usar parallel, que si el 
         * microprocesador tiene varios nucleos,va a ejecutarlo en varios hilos, esto no se ejecutará
         * de forma secuencial, por lo que Pontevedra igual sale antes que Vigo
         */
        cities.stream().parallel().forEach(city -> System.out.println("parallel "+city));

        /*
         *  Podemos aplicar un filtro, esto es un esquema programación pipeline
         * el cual es un esquema que interpreta un flujo constante de trabajo de forma secuencial, 
         * dando como entrada de cada proceso la salida del anterior de forma concatenada.
         */
        cities.stream().filter(city -> city.startsWith("V")).forEach(city -> System.out.println("filtro "+city));

        //lo mismo pero con método
        cities.stream().filter(this::filtrarCiudad).forEach(city -> System.out.println("filtro "+city));

        /**
         * Tenemos que diferenciar con el Pipeline, que tenemos métodos terminales, y los que no lo son
         * filter, no seria un método terminal, por ejemplo, no podemos acabar con él.
         * De no tener un método terminal, se compilará, pero no se ejecutará
         */

    }

    public void useWithStream(String city){
        System.out.println("function "+city);
    }

    public boolean filtrarCiudad(String city){
        return city.startsWith("V");
    }
}
