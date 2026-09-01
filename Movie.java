package com.javaintro;

public class Movie {
 static String theatrename = "sudharsan";
 static String theatrelocation = "kanigiri";
 String moviename;
 int moviebudget;
 String moviereleasedate;
 
	void show()
	{
		System.out.println("theatrename :"+theatrename);
		System.out.println("theatrelocation :"+theatrelocation);
		System.out.println("moviename :"+ moviename);
		System.out.println("moviebudget :"+moviebudget+ "crores");
		System.out.println("Movie Release Date :"+moviereleasedate);
		System.out.println();
	}
		
	
	public static void main(String[] args) {
		
		Movie m1 = new Movie();
		m1.moviename = "irumudi";
		m1.moviebudget = 35 ;
		m1.moviereleasedate = "21-8-2026";
		
		Movie m2 = new Movie();
		m2.moviename = "toxic";
		m2.moviebudget = 150;
		m2.moviereleasedate = "26-8-2026";
		
		Movie m3 = new Movie();
		m3.moviename = "viswanath&sons";
		m3.moviebudget = 200;
		m3.moviereleasedate = "16-8-2026";
		
		Movie m4 = new Movie();
		m4.moviename = "pushpa2";
		m4.moviebudget = 450;
		m4.moviereleasedate = "21-12-2025";
		
		Movie m5 = new Movie();
		m5.moviename = "temper";
		m5.moviebudget = 120;
		m5.moviereleasedate = "21-8-2014";
		
		m1.show();
		m2.show();
		m3.show();
		m4.show();
		m5.show();
		
	
		
		
}
}
