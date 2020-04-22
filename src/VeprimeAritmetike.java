public class VeprimeAritmetike {
	 public static void main(String[]args){
		 int a,b;
	 a=5;
	 b=17;
	 System.out.println("Vlera fillestare e a eshte:" +a  );
	 System.out.println("Vlera fillestare e b eshte:" +b  );
			a = ++b;
	System.out.println ("Vlera pas veprimit (a=++b) e a eshte :" +a );
	System.out.println ("Vlera pas veprimit (b=++b) e b eshte :" +b);
	a=5;
	b=17;
	a=b++;
	System.out.println("Vlera pas veprimit (a=b++) e a eshte :"+a);
	System.out.println("Vlera pas veprimit (a=b++) e b eshte :"+b);
	a = b%3;
		System.out.println("Vlera e a pas veprimit (a=b%) eshte:" +a);
		a+=b;
		System.out.println("Vlera e a pas veprimit (a+=b) eshte :"+a);
		a=(++b)*2;
				System.out.println("Vlera e a pas veprimit (a + (++b)*2) eshte:"+a);
		b = (a<3)?3:6;
		 System.out.println("Vlera e b pas veprimit (b = (a<3)?3:6) eshte :"+b);
		 b = a/b+5;
		 System.out.println("Vlera e b pas veprimit (b = a/b+5) eshte :" +b)
;				
			

	 }
}
	 

