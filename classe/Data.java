package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data (){
		this(1,1,1970);
	}
	String obterDataFormatada () {
		String formatoData = "%d/%d/%d";//variavel local
		return String.format(formatoData,this.dia,mes,ano);
	}	
	Data (int dia,int mes,int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	}

