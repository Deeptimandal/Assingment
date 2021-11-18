
import java.util.*;
import java.util.stream.Collectors;
 
public class AddList {
 
    public static void main(String[] args) {
    	
        List<ArrayList<Integer>> listOfLists = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        listOfLists.add(list1);
        
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(4);
        list2.add(5);
        listOfLists.add(list2);
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.add(6);
        list3.add(7);
        listOfLists.add(list3);
        System.out.println("GIVEN LIST :"+listOfLists);
 
        System.out.println("SUM :" +listOfLists.stream().flatMap(Collection::stream).reduce(0, Integer::sum));
    }}
