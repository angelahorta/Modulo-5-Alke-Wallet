package cl.modulo5.clase;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/deposito")
public class deposito extends HttpServlet {
	
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
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
      crossorigin="anonymous"
    />
    <title>Alka Wallet</title>
  </head>
  <style>
    .formCustom {
      width: fit-content;
      padding-top: 50px;
    }
    .colorFondo {
      background-color: antiquewhite;
    }
  </style>
  <body class="colorFondo">
    <div>
      <nav class="navbar bg-body-tertiary fixed-top">
        <div class="container-fluid">
          <a class="navbar-brand" href="#">Bienvenido a Alke Wallet!</a>
          <button
            class="navbar-toggler"
            type="button"
            data-bs-toggle="offcanvas"
            data-bs-target="#offcanvasNavbar"
            aria-controls="offcanvasNavbar"
            aria-label="Toggle navigation"
          >
            <span class="navbar-toggler-icon"></span>
          </button>
          <div
            class="offcanvas offcanvas-end"
            tabindex="-1"
            id="offcanvasNavbar"
            aria-labelledby="offcanvasNavbarLabel"
          >
            <div class="offcanvas-header">
              <h5 class="offcanvas-title" id="offcanvasNavbarLabel"></h5>
              <button
                type="button"
                class="btn-close"
                data-bs-dismiss="offcanvas"
                aria-label="Close"
              ></button>
            </div>
            <div class="offcanvas-body">
              <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
                <li class="nav-item">
                  <a
                    class="nav-link active"
                    aria-current="page"
                    href="/Alke-Wallet/menu"
                    >Menu principal</a
                  >
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="/Alke-Wallet/deposito">Depósito</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="/Alke-Wallet/enviar_dinero"
                    >Enviar dinero</a
                  >
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="/Alke-Wallet/transacciones"
                    >&Uacute;ltimos Movimientos</a
                  >
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="/Alke-Wallet/login">Salir</a>
                </li>
              </ul>
            </div>
          </div>
        </div>
      </nav>
    </div>
    <div style="padding-top: 60px; text-align: center">
      <h1>Deposito</h1>
    </div>

    <div class="container formCustom">
      <form id="depositoForm">
        <div class="mb-3">
          <label for="exampleInputCuentaOrigen1" class="form-label"
            >Cuenta de Origen</label
          >
          <div class="mb-3">
            <select class="form-select" aria-label="Default select example">
              <option selected>Entidad Bancaria</option>
              <option value="1">Banco Estado</option>
              <option value="2">Banco de Chile</option>
              <option value="3">Otros Bancos</option>
            </select>
          </div>
        </div>

        <div class="mb-3">
          <label for="exampleInputNumber1" class="form-label">Monto</label>
          <input type="number" class="form-control" id="exampleInputNumber1" />
        </div>
        <button type="submit" class="btn btn-primary">Login</button>
        <div id="contenedor-mensajeDepo"></div>
      </form>
    </div>
  </body>
  <script
    src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
    crossorigin="anonymous"
  ></script>
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
  <script src="/js/arch.js"></script>
</html>
			""";
	print.println(html);
	
	}

}
