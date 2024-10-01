package programs;

public class TenPrimes {

	public static void main(String[] args) {
		int number,i,count;
		for(number=1;number<30;number++) {
			count=0;
			for(i=2;i<number/2;i++) {
				
		
			if(number%i==0) {
				count++;
				break;
		
			}
			}
			
			if((count==0)&&(number!=1))
			{
				System.out.println("Prime number is:"+number);
			}
		}

	}

}
