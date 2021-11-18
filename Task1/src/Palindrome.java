interface PerformOperation3 {
	 boolean isPalindrome(String name);
	}
	public class Palindrome {
		public static void main(String[] args) {
			
			PerformOperation3 po =(String name) ->  { for(int i=0,j=name.length()-1;i<j;i++,j--)
			{
			if(name.charAt(i)!=name.charAt(j))
				return false;
		    }return true;
			};
		
			
			System.out.println(po.isPalindrome("daddy"));
			System.out.println(po.isPalindrome("mom"));
		}


	}

