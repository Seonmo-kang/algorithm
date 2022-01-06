package Algorythm.Java;
import java.io.IOException;
import java.lang.reflect.Method;

/*
    Using Generic methods.
    Why?
    I can not just shove objects into a collection of unknown type
    The way to do deal with these problems is to use generic methods.
    - Just like type declarations, method declarations can be generic that is, parameterized by one or more type parameters.
*/
class Printer
{
   //Write your code here
    public <T> void printArray(T[] array){  // <T> void printArray(T[] array)
        for(T a : array){                   // for( T a : array)
            System.out.println(a);
        }
    }
}

public class JAVA_Generics {
    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}