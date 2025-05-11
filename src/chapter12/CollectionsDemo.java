package chapter12;

import java.util.HashSet;
import java.util.Set;

public class CollectionsDemo {
    public static void setDemo(){
        Set<String> fruit= new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        //printing a collection using iterator
        var i= fruit.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        //printing a collection using enhanced for loop
        for (String item: fruit )
        {
            System.out.println(item);
        }
        //printing a collection using forEach method
        //fruit.forEach(x->System.out.println(x));
        fruit.forEach(System.out::println);


    }
    public static void main(String[] args) {
        setDemo();
        /*listDemo();
        queueDemo();
        mapDemo();*/
    }
}
