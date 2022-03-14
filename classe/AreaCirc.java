package classe;

public class AreaCirc {

	double raio;
	static double pi = 3.1415;
	
	AreaCirc (double raioInicial) {
		raio = raioInicial;
		pi = 3.14;		
	}
	double area() {
		return pi * Math.pow(raio,2);
	}
	}

	