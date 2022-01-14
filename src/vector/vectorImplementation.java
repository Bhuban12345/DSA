package vector;

import java.util.Vector;

public class vectorImplementation {
    public static void main(String[] args) {
        //Creating vector.
        Vector<String> vec = new Vector<String>();
        //Adding vector element Using add() method.
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");
        //Adding vector element by addElement() method.
        vec.addElement("Rat");
        vec.addElement("Cat");
        vec.addElement("Deer");
        //Way of printing the vector elements.
        System.out.println("Vector elements are:"+vec);
        //Calculate the size of the vector.
        int x = vec.size();
        System.out.println("The size of the given vector is:"+x);
        // Calculate the capacity of the given vector.
        int y = vec.capacity();
        System.out.println("The capacity of the vector is:"+y);
        //To find the index of the any element.
        if (vec.contains("Dog")){
            System.out.println(vec.indexOf("Dog"));
        }else{
            System.out.println("The given element is not present in the given vector");
        }
        //To finding the first and the last element of the vector.
        String strFirst = vec.firstElement();
        String strLast = vec.lastElement();
        System.out.println("The first element is:"+strFirst+"The last element is:"+strLast);
    }
}
