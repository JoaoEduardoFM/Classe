package classe;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nomeEquals = "Pedro";
		u1.email = "pedro@email.com";
		
		Usuario u2 = new Usuario();
		u2.nomeEquals  = "Pedro";
		u2.email = "pedro@email.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
	}
}
