package cl.modulo5.clase;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/transacciones")
public class transacciones extends HttpServlet {

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
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
      crossorigin="anonymous"
    />
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Alka Wallet</title>
  </head>
  <style>
    .formCustom {
      width: fit-content;
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
      <h1>Últimos movimientos</h1>
    </div>
    <div style="padding-top: 40px; padding-right: 40px; padding-left: 40px">
      <table class="table">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">Fecha</th>
            <th scope="col">Descripcion</th>
            <th scope="col">Monto</th>
            <th scope="col">Saldo</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <th scope="row">3</th>
            <td>10-03-2024</td>
            <td>Deposito con Cheque</td>
            <td>$50.000</td>
            <td>$110.000</td>
          </tr>
          <tr>
            <th scope="row">2</th>
            <td>04-03-2024</td>
            <td>Pago de Cuota 1/60</td>
            <td>$-20.000</td>
            <td>$60.000</td>
          </tr>
          <tr>
            <th scope="row">1</th>
            <td>01-03-2024</td>
            <td>Transferencia a Terceros</td>
            <td>$-50.000</td>
            <td>$80.000</td>
          </tr>
        </tbody>
      </table>
    </div>
  </body>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script
    src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
    crossorigin="anonymous"
  ></script>
</html>
			""";
	print.println(html);
	
	}
	
}
