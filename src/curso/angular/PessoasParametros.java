package curso.angular;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import jdk.nashorn.internal.runtime.JSONListAdapter;



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
		
		System.out.println("PessoasParametros");
		//System.out.println(request.getParameter("codPessoa"));
		
		
		
		JSONObject jsonObject;
		JSONArray jsonArray = new JSONArray();
		jsonObject = new JSONObject();
		try {
			jsonObject.put("codPessoa", 518);
			jsonObject.put("cidade", "salvador");
			jsonArray.put(jsonObject);
			jsonObject.put("codPessoa", 538);
			jsonObject.put("cidade", "salvador");
			jsonArray.put(jsonObject);
			jsonObject.put("codPessoa", 215);
			jsonObject.put("cidade", "salvador");
			jsonArray.put(jsonObject);
			
			//response.getWriter().write(jsonObject.toString());//por codPessoa
			response.getWriter().write(jsonArray.toString());
		} catch (JSONException e) {
			e.printStackTrace();
		}
	
		
		
	
	}
}
