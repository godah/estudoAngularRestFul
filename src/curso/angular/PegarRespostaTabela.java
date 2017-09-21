package curso.angular;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@WebServlet("/pegarRespostaTabela")
public class PegarRespostaTabela extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public PegarRespostaTabela() {
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		response.setContentType("application/json");
		response.setHeader("Cache-Control", "nocache");
		response.setCharacterEncoding("utf-8");
		

		JSONArray jsonArray = new JSONArray();
		
		JSONObject jsonObject;
		
		try {
			jsonObject = new JSONObject();
			jsonObject.put("nome", "alex");
			jsonObject.put("cidade", "mariná");
			jsonArray.put(jsonObject);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
				
		try {
			jsonObject = new JSONObject();
			jsonObject.put("nome", "joão");
			jsonObject.put("cidade", "curitiba");
			jsonArray.put(jsonObject);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		try {
			jsonObject = new JSONObject();
			jsonObject.put("nome", "José");
			jsonObject.put("cidade", "bahia");
			jsonArray.put(jsonObject);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		try {
			jsonObject = new JSONObject();
			jsonObject.put("nome", "James");
			jsonObject.put("cidade", "Ohio");
			jsonArray.put(jsonObject);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
		
		response.getWriter().write(jsonArray.toString());
	}
}
