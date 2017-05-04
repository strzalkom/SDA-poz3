package zajecia;

import java.util.Scanner;

/**
 * Created by RENT on 2017-04-14.
 */
public class Zajecia_9 {
    public static void main(String[] args) {
        System.out.println(cezarCode("WOJNA",1));
        System.out.println(cezarCode("Ala Ma Kota I 2 Psy",2));

    }
public static String cezarCode(String messageToCode, int offset) {

//    char[] charArray = message.toCharArray();
//    for (int i = 0; i < charArray.length; i++) {
//       charArray[i]+= (1);
//
//}
 return cezarCoder(messageToCode,offset);
}
public static String cezarDecode(String coddedMessage, int offset) {
//    char[] charArray = message.toCharArray();
//    for (int i = 0; i < charArray.length; i++) {
//        charArray[i] += (-1);
//}
return cezarCoder(coddedMessage, -offset);
}
public static String cezarCoder(String message, int offset) {
    char[] charArray = message.toCharArray();

    for (int i = 0; i < charArray.length; i++) {
        charArray[i] += offset;
    }
return String.valueOf(charArray);
}





}
