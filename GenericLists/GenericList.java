/* Implementation of Exceptions and Generics */
import java.util.ArrayList;
import java.util.*;

public class GenericList {
    public void someList() {
        int idx;
        ArrayList<Object> myList = new ArrayList<Object>();

        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for(idx=0;idx<myList.size();idx++){
            try{
                Integer castedValue = (Integer) myList.get(idx);
                myList.set(idx, castedValue);
            } catch (ClassCastException e){
                System.out.println("ERROR ON INDEX #" + idx);
                System.out.println("Value: " + myList.get(idx));
                System.out.println("Error Message: " + e.getMessage());
            }
        }

        return;
    }
}
