import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFuc {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(28,253,24,56,89,89,253,34,56,747);
	    System.out.println("GIVEN LIST :"+number);
	    //all the even numbers  in the list
	    System.out.println("EVEN LIST :" +number.stream().filter(num -> num%2==0).collect(Collectors.toList()));
	    //All two digit numbers starting with 2.
	    System.out.println("2 DIGIT NO. STARTING WITH 2 :" +number.stream().filter(num -> num<30 && num>19).collect(Collectors.toList()));
	    //Unique numbers in the list.
	    System.out.println("UNIQUE NO. LIST :" +number.stream().distinct().collect(Collectors.toList()));
	    
	}

}
