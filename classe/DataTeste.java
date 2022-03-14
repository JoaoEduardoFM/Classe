package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
	Data d1 = new Data(10,10,2022);
	
	var d2 = new Data();
	d2.dia = 26;
	d2.mes = 11;
	d2.ano = 2019;
	
	System.out.println(d1.obterDataFormatada());
	System.out.println(d2.obterDataFormatada());
}
}
