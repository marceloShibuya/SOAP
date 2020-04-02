package br.com.fiap.bean;

import org.apache.axis2.AxisFault;

public class Produto {
	
	public String consultaProd(int cod)throws AxisFault{
		
		if(cod == 401) {
			return "Camisa Branca";
		}else if(cod == 402) {
			return "Camisa Azul";
		}else if(cod == 403) {
			return "Camisa Rosa";
		}else {
			return "Produto não encontrado";
		}
	}

}
