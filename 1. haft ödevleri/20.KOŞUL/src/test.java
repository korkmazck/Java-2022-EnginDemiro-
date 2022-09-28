import java.util.Scanner;

import javax.naming.StringRefAddr;

public class test {

	public static void main(String[] args) {
		// if else
		
		/*if (2>3) {
			System.out.println("5 , 3ten buyuktur");
			
		}
		else 
			System.out.println("5 3 ten kucuktur");
		*/
		//vize 1 %30   vize2 %30  final %40
		// geçme notu 60
		// öğrencı ad soyad final notlar
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("adınızı giriniz:");
		
		  String isim = scanner.nextLine();
		  
		  System.out.println("soysiminizi giriniz:");
		  
		  String soyisim = scanner.nextLine();
		  
		  System.out.println("dersi giriniz:");
		  
		  String dersİsmi = scanner.nextLine();
		  
		  System.out.println("vize1 notunuzu giriniz:");
		  
		 double vize1 = scanner.nextDouble();
		 
		 System.out.println("vize2 notunuzu giriniz:");
		 
		 double vize2 = scanner.nextDouble();
		 
		 System.out.println("final notunuzu giriniz");
		 
		 double finalNot = scanner.nextDouble();
		 
		 double sonuc = (vize1*0.3)+ (vize2*0.3) + ( finalNot*0.4);
		 
		 if (sonuc> 60) {
			 System.out.println(isim +  soyisim + "adlı ögrenci " + dersİsmi +  " dersinden " +  sonuc + "ortalamayla gecmistir" );
			
		}
			
		 else {
			 System.out.println("Dersten Kaldınız");
			 
			
		}		  

	}

}
