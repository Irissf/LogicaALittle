package ejercicios;

import java.util.Hashtable;

public class TablaHash {
    
    Hashtable<Integer,String> user = new Hashtable<>();

    public TablaHash(){

        user.put(1,"Iris");
        user.put(2,"Maria");
        user.put(3,"Marta");
        user.put(4,"Hugo");
        user.put(5,"Raúl");

    }

    public void printName(int key){
        System.out.println(user.get(key)); 
    }

    //dado un texto sacar palabras repetidas
    public void repeatWords(String text){
        
        String[] words = text.trim().split(" ");
        Hashtable<String,Integer> repeatWordsNum = new Hashtable<>();

        for (int i = 0; i < words.length; i++) {
            if (repeatWordsNum.containsKey(words[i])) {
                repeatWordsNum.replace(words[i], repeatWordsNum.get(words[i])+1);
            }else{
                repeatWordsNum.put(words[i],1);
            }
        }
        
        System.out.println(repeatWordsNum);
        
    }
}
