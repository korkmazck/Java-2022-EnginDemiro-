
public class AsalSayı {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
        int extra = num % 2;
        boolean isPrime = true;

        if(num == 1)
            System.out.println("Sayı asal değildir...");

        

        if(num < 1)
            System.out.println("Geçersiz sayı...");
        

        for(int i = 2; i < num; i++)
            if(num % i == 0 )
                isPrime = false;
            
        

        if(isPrime)
            System.out.println("Sayı asaldır...");
        else
            System.out.println("Sayı asal değildir...");
            	
            
        }   
}

	
        
        
        
        
        
      


