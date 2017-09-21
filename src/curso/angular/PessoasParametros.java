package curso.angular;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



@WebServlet("/pessoas/")
public class PessoasParametros extends HttpServlet{
private static final long serialVersionUID = 1L;
	
	public PessoasParametros() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("application/json");
		response.setHeader("Cache-Control", "nocache");
		response.setCharacterEncoding("utf-8");
		
		System.out.println(request.getParameter("codPessoa"));
		
		
		
		JSONObject jsonObject;
		
		
			jsonObject = new JSONObject();
			try {
				jsonObject.put("codPessoa", request.getParameter("codPessoa"));
				jsonObject.put("cidade", "curitiba");
			} catch (JSONException e) {
				e.printStackTrace();
			}
			
		response.getWriter().write(jsonObject.toString());
	
	}
}
