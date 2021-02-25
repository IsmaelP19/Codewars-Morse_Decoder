import java.util.HashMap;
import java.util.Map;


public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        // remember that you can access the preloaded Morse code table through MorseCode.get(code)

        String res = "";
        Map<String, String> MapMorseCode = MorseCode();

        String[] words = morseCode.split("   "); // every 3 spaces we have a different word

        Integer i = 0;
        while(i< words.length) {

            String[] letters = words[i].split(" "); // every 1 space we have a different letter

            Integer j = 0;
            while(j< letters.length) {
                String letter = MapMorseCode.get(letters[j]);  // MorseCode available in CodeWars.

                res += letter;
                j++;
            }
           if(i!= words.length-1) {
               res += " ";
           }

            i++;

        }

        return res;


    }

    private static Map<String, String> MorseCode() {
        Map<String, String> morseCode = new HashMap<>();
        morseCode.put(".-", "A");
        morseCode.put("-...","B");
        morseCode.put("-.-.","C");
        morseCode.put("-..","D");
        morseCode.put(".","E");
        morseCode.put("..-.","F");
        morseCode.put("--.","G");
        morseCode.put("....","H");
        morseCode.put("..","I");
        morseCode.put(".---","J");
        morseCode.put("-.-","K");
        morseCode.put(".-..","L");
        morseCode.put("--","M");
        morseCode.put("-.","N");
        morseCode.put("---","O");
        morseCode.put(".--.","P");
        morseCode.put("--.-","Q");
        morseCode.put(".-.","R");
        morseCode.put("...","S");
        morseCode.put("-","T");
        morseCode.put("..-","U");
        morseCode.put("...-","V");
        morseCode.put(".--","W");
        morseCode.put("-..-","X");
        morseCode.put("-.--","Y");
        morseCode.put("--..","Z");
        morseCode.put("-----","0");
        morseCode.put(".----","1");
        morseCode.put("..---","2");
        morseCode.put("...--","3");
        morseCode.put("....-","4");
        morseCode.put(".....","5");
        morseCode.put("-....","6");
        morseCode.put("--...","7");
        morseCode.put("---..","8");
        morseCode.put("----.","9");
        morseCode.put(".-.-.-",".");
        morseCode.put("--..--",",");
        morseCode.put("..--..","?");
        morseCode.put(".----.","'");
        morseCode.put("-.-.--","!");
        morseCode.put("-..-.","/");
        morseCode.put("-.--.","(");
        morseCode.put("-.--.-",")");
        morseCode.put(".-...","&");
        morseCode.put("---...",":");
        morseCode.put("-.-.-.",";");
        morseCode.put("-...-","=");
        morseCode.put(".-.-.","+");
        morseCode.put("-....-","-");
        morseCode.put("..--.-","_");
        morseCode.put("...-..-","$");
        morseCode.put(".--.-.","@");
        morseCode.put(".-..-.","\"");
        morseCode.put("···−−−···","SOS");


        return morseCode;
    }




}
