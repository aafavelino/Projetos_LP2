
public class Aplication {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Porta porta = new Porta(10, 5);
		Porta porta_clone;
		
		System.out.println(porta.isAberta());
		porta_clone = (Porta) porta.clone();
		System.out.println(porta_clone.isAberta());
		
		porta.setAberta(true);
		System.out.println(porta_clone.isAberta());
		System.out.println(porta.isAberta());
		
	}

}
