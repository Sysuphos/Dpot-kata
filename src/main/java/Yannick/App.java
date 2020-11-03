package Yannick;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.sound.sampled.SourceDataLine;

/**
 * Hello world!
 */
public final class App {

    
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }


    public static boolean isLeapYear(int year){
        boolean isBissextile = false;


		if( ( ((float)year/400) == (Math.floor(year/400)) ) 
						|| ( ((float)year/4) == (Math.floor(year/4)) 
						&& ((float)year/100) != (Math.floor(year/100)) ) ){
			
			isBissextile = true;	
			
        }
        return isBissextile;
    }

    public static String compute(int number){
        
        String fooBarQix = "";
        String foo = "Foo";
        String bar = "Bar";
        String qix = "Qix";

        //checker Si le chiffre est un modulo de 3 /
        if(number%3 == 0){
            fooBarQix = fooBarQix + foo;     
        }
        //checker Si le chiffre est un modulo de 5 
        if(number%5 == 0){
            fooBarQix = fooBarQix + bar;     
        }
        //checker Si le chiffre est un modulo de 7
        if(number%7 == 0){
            fooBarQix = fooBarQix + qix;     
        }

        //go en array
        List<String> numberString = Arrays.asList(Integer.toString(number).split(""));
        //  > pour chaque chiffre de l'array de nombres
        //  > if(chiffe.equals(3))...
        //  > if(chiffe.equals(5))...
        //  > etc...
        for ( String chiffre : numberString) {
            if(chiffre.equals("3")){
                fooBarQix += foo;
            }if(chiffre.equals("5")){
                fooBarQix += bar;
            }if(chiffre.equals("7")){
                fooBarQix += qix;
            }if(chiffre.equals("0") && !fooBarQix.equals("")){
                fooBarQix += "*";
            }
        }
        //return result;

        if(fooBarQix.equals("")){
            for ( String chiffre : numberString) {
                if(chiffre.equals("0")){
                    fooBarQix += "*";
                }else{
                    fooBarQix += chiffre;
                }
            }
            System.out.println(fooBarQix);
            return fooBarQix;
        }
        System.out.println(fooBarQix);
        return fooBarQix;
    }

    public static String writeNumbre(int number){
        String numberStr = Integer.toString(number);
        //formate number
        String formatted = numberStr.replaceAll("(\\d)(?=(\\d{3})+$)", "$1,");
        
        //split number
        String[] parts = formatted.split(",");
        System.out.println(parts.length);
        System.out.println(parts[0]);

        String x = "004";

        //String to integer
        int i = Integer.parseInt(x);  
        System.out.println(i+6);
        return parts[0];
    }

}
