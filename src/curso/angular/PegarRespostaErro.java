package curso.angular;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/pegarRespostaErro")
public class PegarRespostaErro extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public PegarRespostaErro() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		System.out.println("pegarRespostaErro");
		int numero = Integer.parseInt("a");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
	}

}
