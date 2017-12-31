

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServerBd
 */
@WebServlet("/ServerBd")
public class ServerBd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServerBd() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DataBase bd = null;
		try {
			bd = new DataBase();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("DEU EXCE��O");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("DEU EXCE��O AQUII");
		}
		Pagador meuPagador = new Pagador(1,"Ruan Luiz Alves da Silva", "543.654.756.098-56", "5343545333");
		Pagador meuPagador2 = new Pagador(2,"Jo�o da Silva Tavares", "529.697.008.008-51", "1276548733");
		
		try {
			bd.insertPagador(meuPagador);
			bd.insertPagador(meuPagador2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("NewFile.jsp").forward(request, response);
	}

}
