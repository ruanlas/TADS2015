package teste;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hsqldb.jdbc.JDBCDriver;

@WebServlet("/teste-servlet")
public class TesteServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {
			Class.forName(JDBCDriver.class.getName());

			try (Connection conn = DriverManager.getConnection(
					"jdbc:hsqldb:mem:banco-em-memoria", "", "")) {

				try (PreparedStatement createTable = conn
						.prepareStatement("CREATE TABLE Teste(valor int)")) {
					createTable.executeUpdate();
				}

				try (PreparedStatement insert = conn.prepareStatement(
						"INSERT INTO Teste VALUES (?), (?)")) {
					insert.setInt(1, 500);
					insert.setInt(2, 600);
					insert.executeUpdate();
				}

				try (ResultSet resultado =
						conn.prepareStatement("SELECT * FROM Teste")
								.executeQuery()) {

					List<Integer> dados = new ArrayList<>();
					while (resultado.next()) {
						dados.add(resultado.getInt("valor"));
					}

					request.setAttribute("dados", dados);
				}
			}

			request.getRequestDispatcher("WEB-INF/jsp/teste-jsp.jsp")
					.forward(request, response);

		} catch (SQLException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

}
