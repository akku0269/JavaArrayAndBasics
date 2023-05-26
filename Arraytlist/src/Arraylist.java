import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        //wrapper class
//        Integer i = Integer.valueOf(4);
//        System.out.println(i);
//
//        Float f = Float.valueOf(4.5f);
//        System.out.println(f);

        //creating an Arraylist
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Boolean> l2 = new ArrayList<>();
        ArrayList<Float> l3 = new ArrayList<>();

        //add element
        l1.add(5);
        l1.add(6);
        l1.add(8);
        l1.add(4);
        l1.add(12);

        //get an element of index i
        System.out.println(l1.get(1));   //  6

        // print with loop
        for(int i = 0; i<l1.size() ;i++){
            System.out.println(l1.get(i) + " ");
        }

        //printing arraylist directly
        System.out.println(l1);

        //adding element at some index i ;
        l1.add(1 , 100);
        System.out.println(l1);          // 100

        //modifying element at index i
        l1.set(2,9);
        System.out.println(l1);

        //removing an element at index i
        l1.remove(3);
        System.out.println(l1);

        l1.remove(Integer.valueOf(8)); // if we sout this whole line it will give boolean(we can check that element exists or not)
        System.out.println(l1);

        //checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(6));
        System.out.println(ans);

        //if you don't put any class you can put anything inside
        ArrayList l =  new ArrayList();

        l.add("pr");
        l.add(3);
        l.add(true);

        System.out.println(l);


    }
}