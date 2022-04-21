package ejercicios;

public class SpiralMatrix {
    //Given an m x n matrix, return all elements of the matrix in spiral order.

    /*
        Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]

        1 ->  2 -> 3
                   |
        4 ->  5    6
        |          |
        7  <- 8 <- 9 

        Output: [1,2,3,6,9,8,7,4,5]
    
    */

    int [][] espiral = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

    public int[] RetornarSpiral(){
        
        int[] espiralFinal = new int[espiral.length];
        int contador = 0;

        int ancho = 0;
        int alto = 0;
        
        //pintamos
        for (int i = 0; i < espiral.length; i++) {
            for (int j = 0; j < espiral[i].length; j++) {
                System.out.print(espiral[i][j] + "\t");
                    if (i == 0){
                        ancho++;
                    }
            }    
                System.out.println();
                alto++;
        }

        System.out.println("ancho "+ancho+" alto "+alto);

        

        return null;
    }
}
