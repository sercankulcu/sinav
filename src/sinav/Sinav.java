package sinav;

import java.io.IOException;
import java.util.Scanner;

public class Sinav {

	public void soru1() throws IOException
	{
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		char[] backup = new char[s.length()];
		System.out.println(s);
		for(int i = 0; i < s.length(); i++)
			backup[s.length() - i - 1] = s.charAt(i);
		System.out.println(backup);
		scanner.close();
	}

	public void soru2()
	{
		int param = 30;
		int result = 300;

		if(param > 45)
		{
			result = result - param;
			param = param + 7;
		}

		else if(param > 18)
		{
			result = result + param;
		}

		System.out.println(result * param);
	}

	public void soru3()
	{
		int toplam = 0;
		for(int i = 0; i < 1000; i++)
		{
			toplam += i;
		}
		System.out.println("toplam:" + toplam);
	}

	public void soru4()
	{
		int toplam = 0;
		int i = 0;
		while(i < 1000)
		{
			toplam += i;
			i++;
		}
		System.out.println("toplam:" + toplam);
	}

	public void soru5()
	{
		int k = 0;
		int p = 1;
		int n = 32;
		int m = 2;
		while(n > 1)
		{
			k++;
			n = n / m;
		}
		System.out.println("k: " + k);
	}

	public static void main(String[] args) throws IOException {
		
		Sinav sinav = new Sinav();
		sinav.soru1();
		sinav.soru2();
		sinav.soru3();
		sinav.soru4();
		sinav.soru5();
	}

}
