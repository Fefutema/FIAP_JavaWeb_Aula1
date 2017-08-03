package br.com.fiap.servlets;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MinhaPrimeiraServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		PrintWriter w = resp.getWriter();
		w.append("<h1>Minha primeira servlet</h1>");
		
		String nome = req.getParameter("nome");
		String email = req.getParameter("email"); 
		String telefone = req.getParameter("tel");
		StringBuffer sb =new StringBuffer();
		sb.append(nome);
		sb.append(",");
		sb.append(email);
		sb.append(",");
		sb.append(telefone);
		sb.append(";");
		File file = new File("D:/forms.txt");
		
		try( 	
				FileWriter fw1 = new FileWriter(file, true);
			){
			
			fw1.write(sb.toString() + "\r\n");
			fw1.flush();
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		req.getRequestDispatcher("/sucesso").include(req, resp);
		//req.getRequestDispatcher("/sucesso").forward(req, resp);
		
	}
	
}
