package cleancode;

public class cleancode1 {
	public static double Simple(double p,double t,double r) {
		return (p*t*r)/100;
	}
	
	public static double Compound(double p,double t,double r){
		return p* Math.pow(1.0+r/100.0,t)-p;
		
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		System.out.println(Simple(1000,2,3));
		System.out.println(Compound(5000,8,4));
	}
	

}

