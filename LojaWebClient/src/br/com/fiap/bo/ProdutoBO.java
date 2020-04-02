package br.com.fiap.bo;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import br.com.fiap.bean.ProdutoStub;
import br.com.fiap.bean.ProdutoStub.ConsultaProd;
import br.com.fiap.bean.ProdutoStub.ConsultaProdResponse;

public class ProdutoBO {
	
	public String consultarProduto(int codigo) {
		
		ConsultaProd cp = new ConsultaProd();
		cp.setCod(codigo);
		
		ProdutoStub ps;
		
		try {
			ps = new ProdutoStub();
			ConsultaProdResponse cpr = ps.consultaProd(cp);
			return cpr.get_return();
		}catch(AxisFault e) {
			e.printStackTrace();
			e.getMessage();
		}catch(RemoteException e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
