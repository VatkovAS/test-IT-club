import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Сколько раз в неделю вы пьете:");
		int razi = scanner.nextInt();
		System.out.println("Как много вы пьете каждый раз: ");
		float kolvo = scanner.nextFloat();
		
		if (razi < 0 || kolvo < 0) 
		    {
		        System.out.println("Введены некорректные данные");
		        System.exit(0);
		    }
		    
		float ned = kolvo * razi;
		
		int n = 17;
		float sum = 0;
		for(int i = 1; i < n; i++) 
		    {
		        sum += ned;
		        System.out.println("К " + i + " неделе будет выпито " + sum + " литров жидкости");
		    }
		 if (sum < 120){
		     System.out.println("К сожалению, студент не принят в клуб");
		 } else {
		     System.out.println("К сожалению, студент не принят в клуб");
		 }
	}
}