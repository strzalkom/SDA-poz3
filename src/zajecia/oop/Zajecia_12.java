package zajecia.oop;

import java.io.IOException;

/**
 * Created by RENT on 2017-04-24.
 */
public class Zajecia_12 {


    public static void main(String[] args)throws IOException {
        User user = new User();
        user.firstName = "Andrzej";
        user.lastName = "Nowak";
        user.phoneNumber = "897384723";

        user.age = 50;



        User user2 = new User();
        user2.firstName = "Wojciech";
        user2.lastName = "Kowalski";
        user2.phoneNumber = "341231223";

        user2.age = 30;




        Address address = new Address();
        address.city = "Porto";
        address.street = "Wielka";
        address.flatNumber = 4;
        address.postalCode = "65-234";
        address.country = "Irlandia";


        user.display();
        System.out.println();
        user2.display();
        System.out.println();
        address.display();
    }
    }