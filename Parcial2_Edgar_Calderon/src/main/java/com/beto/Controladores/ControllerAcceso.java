package com.beto.Controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beto.DAO.ClsUsuario;
import com.beto.Entidades.Login;
import com.beto.Negocio.clsLogin;

/**
 * Servlet implementation class ControllerAcceso
 */
@WebServlet("/ControllerAcceso")
public class ControllerAcceso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerAcceso() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		Login log = new Login();
		clsLogin clsL = new clsLogin();
		
		log.setUser(user);
		log.setPass(pass);
		
		int valoracceso = clsL.acceso(log);
		
		if(valoracceso==1) {
			ClsUsuario clsUsuario = new ClsUsuario();
			var Usuario = clsUsuario.ListadoUSUARIOS();
			response.sendRedirect("Saludo.jsp");
			for(var iterar : Usuario)
			{
				System.out.println(iterar.getUsuario());
			}
		}else {
			response.sendRedirect("Error.jsp");
		}
	}

}
