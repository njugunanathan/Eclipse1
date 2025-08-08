package contact;

public class finess {
	String car;
	int sale;
	String fine="System";
	public void chores() {
		System.out.println("Be responsible");
	}
	public void neat() {
		System.out.println("Hurry up");
	}
	public void noise() {
		System.out.println("Be silent for once");
	}
	public void volt() {
		System.out.println("Repeat the farming experience");
	}
	finess(String car,int sale){
		this.car=car;
		this.sale=sale;
	}
     public static void main(String[] args) {
    	 finess myon=new finess("dear",670);
    	 myon.chores();
   	     myon.neat();
   	     myon.noise();
   	     myon.volt();
   	     Spots odr=new Spots();
   	     System.out.println(myon.fine);
   	     System.out.println(odr.x);
   	  System.out.println(myon.car);
   	System.out.println(myon.sale);
     }}
	
   
	
     