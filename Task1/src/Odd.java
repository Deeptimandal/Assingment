
interface PerformOperation {
	 boolean isOdd(int number);
	}
	public class Odd {
		public static void main(String[] args) {
			
			PerformOperation po =(int number) ->  number%2 == 0 ? false : true;
			
			System.out.println(po.isOdd(5));
			System.out.println(po.isOdd(6));
		}


	}
