package zajecia;




/**
 * Created by RENT on 2017-04-13.
 */
public class Zajecia_8 {
    public static void main(String[] args) {
//        System.out.println(countCharacterIn("Ala ma kota", 'a'));
//        System.out.println(countCharacterIn("Ala ma kota i dwa psy", 'a'));
//        System.out.println(countCharacterIn("ala ma kota i dwa psy", 'a'));
        String pokemonMessage = "ASUHADNUIJASHDsiadjna adasjdhsand adawdd asdzxc";
        System.out.println(countCapitalLetters(pokemonMessage));
        System.out.println(countSmalllLetters(pokemonMessage));
        System.out.println(countWords(pokemonMessage));
        System.out.println(switchCase("Ala ma Kota"));
        System.out.println(ananimOf("Ala ma Kota"));
    }

    public static void charAndStringTest() {
        String message = "Ala ma kota";
        message += " i dwa psy";
        char znak = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.print(znak + ", ");
            znak++;
        }
        char[] charArray = message.toCharArray();
        System.out.println(message.length());
        countCharacterIn(message, 'a');
    }

    //zliczanie literek
    public static int countCharacterIn(String message, char character) {
        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (message.charAt(i) == character) {
                counter++;
            }
        }
        return counter;

    }

    public static int countCapitalLetters(String message) {
        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 65 && charArray[i] <= 90) {

                counter++;

            }
        }
        return counter;
    }

    public static int countSmalllLetters(String message) {
        char[] charArray = message.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                // zamiast if i counter++ -->   counter += (charArray[i] >= && charArray[i] <= 122) ? 1:0;
                counter++;

            }
        }
        return counter;
    }

    public static int countWords(String message) {
        char[] charArray = message.toCharArray();
        int counter = 1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {

                counter++;

            }
        }
        return counter;
    }

    public static String switchCase(String message) {
        char[] charArray = message.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 97 && charArray[i] <= 122) {
                charArray[i] -= 32;
            } else if (charArray[i] >= 65 && charArray[i] <= 90) {
                charArray[i] += 32;


            }
        }
        return String.valueOf(charArray);


    }

    public static String ananimOf(String message) {
        char[] charArray = message.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {

            char tmp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = tmp;
        }
        return String.valueOf(charArray);

    }
    

}

