package br.com.fiap.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bo.ProdutoBO;

/**
 * Servlet implementation class ProdutoServlet
 */
public class ProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProdutoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProdutoBO bo = new ProdutoBO();
		String retorno = bo.consultarProduto(Integer.parseInt(request.getParameter("codTxt")));
		
		if(retorno.equals("Camisa Branca")) {
			retorno = "img/img_01-camisa-branca.jpg";
		}else if(retorno.equals("Camisa Azul")) {
			retorno = "img/img_01-camisa-azul.jpg";
		}else if(retorno.equals("Camisa Rosa")) {
			retorno = "img/img_01-camisa-rosa.jpg";
		}else {
			retorno = "img/500px-stop.png";
		}
		request.setAttribute("produto", retorno);
		request.getRequestDispatcher("resultado.jsp").forward(request, response);	
	}
}
