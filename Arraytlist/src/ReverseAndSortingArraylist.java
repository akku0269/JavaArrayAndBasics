import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReverseAndSortingArraylist {

    static void reverseList(ArrayList<Integer> list){
        int i = 0 ; int j = list.size()-1;
        while(i<j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i , list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(1);
        list.add(9);
        list.add(6);

        System.out.println("Original list : " +list);
        //reverseList(list);
        Collections.reverse(list);  // reverse code is present in collection library , so we can use it directly
        System.out.println("Reverse list :" +list);

        Collections.sort(list); //default in ascending order
        System.out.println("Sorted list in Ascending order: " +list);

        Collections.sort(list , Collections.reverseOrder());
        System.out.println("Sorted list in Descending order: " +list);


        ArrayList<String> l1 = new ArrayList<>();

        l1.add("Welcome");
        l1.add("To");
        l1.add("Physics");
        l1.add("Wallah");

        Collections.sort(l1);
        System.out.println("Sorted list in Ascending order: " +l1);

        Collections.sort(l1 , Collections.reverseOrder());
        System.out.println("Sorted list in Descending order: " +l1);


    }
}
