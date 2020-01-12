import java.util.HashMap;
import java.util.Scanner;

/**
 * @author C.G.Stewart
 * @version 02/02/18
 */

public class Dictionary
    {
        public Dictionary(){}
        public void HashMap()
        {
            HashMap<String, String> Dictionary = new HashMap<String, String>();
            
            String[] keys = {"A", "B", "C", "D", "E", "F"};
            String[] values = {"Alpha", "Beta", "Gamma", "Delta", "Epsilon", "Zeta"};
            
            for(i=0; i < keys.length; i++){
                for(j=0; j < values.length; j++){
                    Dictionary.put(keys[i], values[j])
                }
            }

            Scanner dict = new Scanner(System.in);
            String input = dict.nextLine();
            
            switch(input):
                case "A":
                    System.out.println(Dictionary.get("A"));    
                case "B": 
                    System.out.println(Dictionary.get("B"));
                case "C": 
                    System.out.println(Dictionary.get("C"));
                case "D": 
                    System.out.println(Dictionary.get("D"));
                case "E": 
                    System.out.println(Dictionary.get("E"));
                case "F":
                    System.out.println(Dictionary.get("F"));
        }
    }
