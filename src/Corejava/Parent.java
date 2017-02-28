package Corejava;

public class Parent {
	
	void eat (){
		System.out.println("parent style of eating");
	}
	
	void walk(){
		
		System.out.println("parent style of walking");	
	}
	
	public static void main(String[] args) {
	}
	public class child extends Parent{
		void eat (){
		System.out.println("child stle of eating");
		
		child obj = new child ();
		
		obj.eat();	
			
		}	
	
	}
}
