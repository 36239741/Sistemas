package controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;
/**
 * Servlet implementation class Register_control
 */
@WebServlet("/Register_control")
public class Register_control extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register_control() {
        super();
        // TODO Auto-generated constructor stub
    }


    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String nome = request.getParameter("name");
		String email = request.getParameter("email");
		String login = request.getParameter("login");
		String senha = request.getParameter("pass");
		Usuario usr = new Usuario();
		usr.setNome(nome);
		usr.setEmail(email);
		usr.setLogin(login);
		usr.setSenha(encrypt(senha));
		UsuarioDao dao = new UsuarioDao();
		if(dao.Insere(usr)) {
			response.sendRedirect("login.jsp?success");
		}
		else {
			response.sendRedirect("index.jsp");
		}
		
		
    }

    // independente do métopdo http, o processRequest é chamado.
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    processRequest(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    processRequest(req, resp);


}
    public String encrypt(String senha) {
    	BCrypt bcrypt = new BCrypt();
    	String senhaHash = bcrypt.hashpw(senha, bcrypt.gensalt());
    	
    	return senhaHash;
    }
}
