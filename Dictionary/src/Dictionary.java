import java.util.HashMap;
import java.util.Scanner;

/**
 * @author C.G.Stewart
 * @version 02/02/18
 */

public class Dictionary
    {
        // instance variables - replace the example below with your own

        /**
         * Constructor for objects of class Dictionary
         */

        public Dictionary()
        {
            // initialise instance variables

        }

        /**
         * An example of a method - replace this comment with your own
         *
         * @param  y  a sample parameter for a method
         * @return    the sum of x and y
         */

        public void HashMap()
        {
            HashMap<String, String> Dictionary = new HashMap<String, String>();

            Dictionary.put("A","Alpha");
            Dictionary.put("B","Beta");
            Dictionary.put("C","Gamma");
            Dictionary.put("D","Delta");
            Dictionary.put("E","Epsilon");
            Dictionary.put("F","Zeta");

            Scanner dict = new Scanner(System.in);
            String input = dict.nextLine();
            if(input.equals("A"))
            {
                String key = Dictionary.get("A");
                System.out.println(key);
            }

            else if(input.equals("B"))
            {
                String key2 = Dictionary.get("B");
                System.out.println(key2);
            }

            else if(input.equals("C"))
            {
                String key3 = Dictionary.get("C");
                System.out.println(key3);
            }
            else if(input.equals("D"))
            {
                String key4 = Dictionary.get("D");
                System.out.println(key4);
            }
            else if(input.equals("E"))
            {
                String key5 = Dictionary.get("E");
                System.out.println(key5);
            }
            else if(input.equals("F"))
            {
                String key6 = Dictionary.get("F");
                System.out.println(key6);
            }
        }
    }