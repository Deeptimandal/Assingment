interface PerformOperation2 {
	 boolean isPrime(int number);
	}
	public class Prime {
		public static void main(String[] args) {
			
			PerformOperation2 po =(int number) ->  {
				for(int i=2;i<number;i++)
				{
				if(number%i==0) 
					return false;
				
				}return true;
			};
		
			
			System.out.println(po.isPrime(9));
			System.out.println(po.isPrime(37));
		}


	}
