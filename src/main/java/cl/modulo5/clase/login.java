package cl.modulo5.clase;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6000914007290912602L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	PrintWriter print = resp.getWriter();
	
	String html= """
			<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
      rel="stylesheet"
      href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
    />
    <link rel="stylesheet" href="/css/style.css" />
    <title>Login</title>
  </head>
  <style>
    .loginCustom {
      width: fit-content;
      padding-top: 50px;
    }
    .colorFondo {
      background-color: #e79696;
    }
  </style>

  <body class="colorFondo">
    <div class="container loginCustom">
      <h1>Login</h1>
      <form id="loginForm">
        <div class="form-group">
          <label for="username">Username:</label>
          <input type="text" id="username" class="form-control" />
        </div>
        <div class="form-group">
          <label for="password">Password:</label>
          <input type="password" id="password" class="form-control" />
        </div>
        <button type="submit" class="btn btn-primary">Login</button>
        <div id="contenedor-mensaje"></div>
      </form>
    </div>

    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="/js/arch.js"></script>
  </body>
</html>
			""";
	print.println(html);
	
	}

}
