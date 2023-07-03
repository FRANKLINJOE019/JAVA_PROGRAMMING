public class Main {
	public static void main(String[] args) {
		float a;
		float b;
		float c;
		float R;
		double X1;
		double X2;
		a=6;
		b=-7;
		c=1;
		R=b*b-4*a*c;    
		if (R>0){
			X1=-b+Math.sqrt(R)/(2*a);
			X2=-b-Math.sqrt(R)/(2*a);
			System.out.println("there are two real roots");
			System.out.println("X1 ="  + X1);
			System.out.println("X2 ="  + X2);
		}
		else if(R==0.0){
			X1=-b/(2*a);
			System.out.println("there is one real root");
			System.out.println("X1="  +X1);
		}
		else if(R<0.0){
			System.out.println("there is no real root");
		}

	}

}






