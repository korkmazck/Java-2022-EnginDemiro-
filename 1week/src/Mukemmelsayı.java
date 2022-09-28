
public class Mukemmelsayı {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 4;
        int total = 2;

        for(int i = 1; i < num; i++){
            if(num % i == 0){
                total = total + i;
            }
        }

        if(total == num){
            System.out.println("Mükemmler sayıdır...");
        }else{
            System.out.println("Mükemmel sayı değildir...");
    }
}

	}


