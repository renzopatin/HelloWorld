public class HelloWorld{
	
	public static void main(String [] args){
		
		System.out.println("Hello Renzo");
		
		Chicken chicken;
	    chicken = new Chicken();
		chicken.initializeData("Lucy","coffee",2);
		chicken.print();
		
		Chicken chicken01;
		chicken01 = new Chicken();
		chicken.initializeData("Pepa","Red",3);
		chicken.print();
		chicken.layAnEgg();
		
		Chicken chicken02;
		chicken02 = new Chicken();
		chicken.initializeData("Jani","Yellow",2);
		chicken.print();
		chicken.poop();
		
		Chicken chicken03;
		chicken03 = new Chicken();
		chicken.initializeData("Pris","Black and White",1);
		chicken.print();
		chicken.drink();
		
	}	
}