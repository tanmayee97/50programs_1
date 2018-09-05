
		import java.util.*;
		public class Project {
		    public static void main(String[] args){
		        Scanner all=new Scanner(System.in);
		        System.out.println("Welcome to Vacation planner");
		        System.out.print("What is your good Name?");
		        String name=all.nextLine();
		        System.out.print("Nice to meet you "+name+", Where are you Travelling to?");
		        String city=all.nextLine();
		        System.out.println("Great! "+city+" Sounds like a great trip");
		        System.out.println("******************");
		        System.out.println("");
		        System.out.print("How many days are you going to spend travelling?");
		        int days=all.nextInt();
		        System.out.print("How much money,in USD,are you planning to spend on your trip?");
		        int money=all.nextInt();
		        System.out.print("What is the three letter currency symbol for your travel destination?");
		        String currency=all.next();
		        System.out.print("How many "+currency+" are there in 1 USD?");
		        Double conv=all.nextDouble();
		        System.out.println("");
		        System.out.println("if you are travelling for"+days+"days that is same as "+days*24+" hours or "+days*24*60+" minutes");
		        System.out.println("if you are going to spend $"+money+"USD that means per day you can spend up to $"+money/days+"USD");
		        System.out.println("Your total budget in "+currency+" is "+money*conv+currency+",Which per day is "+money*conv/days+currency);
		        System.out.println("****************");
		        System.out.println("");
		        System.out.print("What is the time differnce,in hours,between your home and your destination?");
		        int diff=all.nextInt();
		        System.out.println("That means that when it is midnight at home it will be "+diff+":00 in your travel destination");
		        System.out.println("and when it is noon at home it will be "+(12+diff)+":00");
		        System.out.println("***************");
		        System.out.println("");
		        System.out.print("What is the Square area of your destination country in km2?");
		        int area=all.nextInt();
		        System.out.println("In miles2 that is "+area*0.386102);
		        System.out.println("****************");


		    }


	}


