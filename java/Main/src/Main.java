import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // hola chat
        System.out.println("Hello world!");

        String myString = "Esto es una cadena de texto";
        myString = "cambio de valores de la cadena de texto";
        System.out.println(myString);

        final String myConst = "Esto es un const de texto";

        Integer myInt = 7;
        myInt = myInt + 9;
        System.out.println(myInt);

        Double myDouble = 5.3;
        System.out.println(myDouble);

        Float myFloat = null;
        System.out.println(myFloat);

        Boolean myBoolean = true;
        System.out.println(myBoolean);

        if (myFloat != null) {
            System.out.println(myFloat + 10);
        } else {
            System.out.println("mi float es nulo");
        }

        List myArray = new ArrayList();
        myArray.add(myString);
        myArray.add(myInt.toString());
        System.out.println(myArray);

        Map<String, String> myMap = new HashMap<>();
        myMap.put("string", myString);
        myMap.put("int", myInt.toString());
        System.out.println(myMap);

        for (int i = 0; i < myArray.size(); i++) {
            System.out.println(myArray.get(i));
        }

        Main myMain = new Main();
        System.out.println(myMain.myFunction(10, 5));
        System.out.println(myMain.myFunction(324324, 3214324));
    }

    public int myFunction(int myFirstNumber, int mySecondNumber){
        return myFirstNumber + mySecondNumber;

    }


}