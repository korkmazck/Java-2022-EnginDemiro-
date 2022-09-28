
public class sayıBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[]{1,2,5,7,9,0};
        int the_num = 4;
        boolean is_in = false;

        for(int num : nums){
            if(num == the_num){
                is_in = true;
                break;
            }
        }
        if(is_in){
            System.out.println("sayi dahil");
        }else{
            System.out.println("sayi dahil degildir");
    }
}

	}


