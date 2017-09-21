package curso.angular;
 
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
/**
 * Servlet implementation class MeuServlet
 *
 * Classe do Servlet
 */
@WebServlet("/MeuServlet")
public class Teste extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    /**
     * @see HttpServlet#HttpServlet()
     *
     * Construtor do Servlet
     */
    public Teste() {
        super();
        // TODO Auto-generated constructor stub
    }
 
    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     *
     * Método GET
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
        String meuHtml = "<html xmlns=\"http://www.w3.org/1999/xhtml\">" +
                         "<head><title>Desenvolvimento Aberto</title></head>" +
                         "<body>" +
                         "<h1>Desenvolvimento Aberto</h1> <br />" +
                         "<h3>Java - Servlet - doGet</h3>" +
                         "Pagina criada pelo metodo do Servlet <br />" +
 
                         // Para que o método post seja disparado
                         // o form precisa saber o método - method="post"
                         // também funciona com o metodo get
 
                         "<form action=\"MeuServlet\" method=\"post\"> <br />" +
                         "<input type=\"submit\" value=\"Enviar\">" +
                         "</form>" +
                         "</body>" +
                         "</html>";
 
        PrintWriter imprimir = response.getWriter();
 
        imprimir.println(meuHtml);      
 
        // Recupera Parametros da URL
 
        String parametro = request.getParameter("Parametro1");  
 
        if (parametro != null )
        {
            imprimir.println("O parametro digitado foi: " + parametro);
        }
 
    }
 
    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     *
     * Método POST
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
        PrintWriter imprimir = response.getWriter();
 
        imprimir.println("Método POST foi disparado!");
    }
 
}