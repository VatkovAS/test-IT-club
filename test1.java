import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Введите строку: ");
		String str = scanner.nextLine();
		
		System.out.println("Введите натуральное число N: ");
		while (!scanner.hasNextInt()) 
		    {
		        System.out.println("Введено некорректное число! Повторите ввод");
		        scanner.next();
		    }
		int n = scanner.nextInt();
		
		if (n <= 0)
		{
		    n = 1;
		}
        for(int i = 0; i < n; i++) 
		    {
		        System.out.println(str);
		    }
	}
}