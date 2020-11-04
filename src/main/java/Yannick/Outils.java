package Yannick;
import java.util.Arrays;
import java.util.List;

public class Outils {
    public static String translateEachPart(String str, String numberInWord){
        
        numberInWord = "";
        List<String> chiffreString = Arrays.asList(str.split(""));
        
        for (int i = 0 ; i< chiffreString.size(); i++) {

            //traduit centaine ou (unité si les dizaines sont supérieur à 19)
            if(i == 0 || (i == 2 && !chiffreString.get(1).equals("1"))){
                
                if(i == 2 && chiffreString.get(1).equals("0") && !chiffreString.get(0).equals("0")){
                    System.out.println("hello 2");
                    numberInWord += "and ";    
                }
                switch (chiffreString.get(i)) {
                    case "1":
                        numberInWord += "one ";
                      break;
                    case "2":
                         numberInWord += "two ";
                      break;
                    case "3":
                        numberInWord += "three ";
                      break;
                    case "4":
                        numberInWord += "four ";
                      break;
                    case "5":
                        numberInWord += "five ";
                      break;
                    case "6":
                        numberInWord += "six ";
                      break;
                    case "7":
                        numberInWord += "seven ";
                      break;
                    case "8":
                        numberInWord += "eight ";
                      break;
                    case "9":
                        numberInWord += "nine ";
                      break;
                // rajoute "hundred" pour les centaines; 
                }if(i == 0 && !chiffreString.get(0).equals("0")){
                    numberInWord += "hundred ";
                }
            //traduit les dizaines.
            }if(i == 1){
                switch (chiffreString.get(i)) {

                    //Traduit si les dizaine sont inferieur à 20.
                    case "1":
                        if(chiffreString.get(2).equals("0"))
                        numberInWord += "ten ";
                        if(chiffreString.get(2).equals("1"))
                        numberInWord += "eleven ";
                        if(chiffreString.get(2).equals("2"))
                        numberInWord += "twelve ";
                        if(chiffreString.get(2).equals("3"))
                        numberInWord += "thirteen ";
                        if(chiffreString.get(2).equals("4"))
                        numberInWord += "fourteen ";
                        if(chiffreString.get(2).equals("5"))
                        numberInWord += "fiveteen ";
                        if(chiffreString.get(2).equals("6"))
                        numberInWord += "sixteen ";
                        if(chiffreString.get(2).equals("7"))
                        numberInWord += "seventeen ";
                        if(chiffreString.get(2).equals("8"))
                        numberInWord += "eighteen ";
                        if(chiffreString.get(2).equals("9"))
                        numberInWord += "nineteen ";
                      break;
                    //traduit le reste des dizaine.
                    case "2":
                         numberInWord += "twenty ";
                      break;
                    case "3":
                        numberInWord += "thirty ";
                      break;
                    case "4":
                        numberInWord += "fourty ";
                      break;
                    case "5":
                        numberInWord += "fifty ";
                      break;
                    case "6":
                        numberInWord += "sixty ";
                      break;
                    case "7":
                        numberInWord += "seventy ";
                      break;
                    case "8":
                        numberInWord += "eighty ";
                      break;
                    case "9":
                        numberInWord += "ninety ";
                      break;
                }
            }
               
        }
        
        return numberInWord;
    }
}
