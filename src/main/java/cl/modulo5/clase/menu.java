package cl.modulo5.clase;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/menu")
public class menu extends HttpServlet {
	
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
    .colorFondo {
      background-color: antiquewhite;
    }
    .formatText {
      width: auto;
      text-align: center;
      padding-top: 10px;
    }
    .imageFormat {
      max-width: 20%;
      height: auto;
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
                    >Menú principal</a
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
      <h1>Menu principal</h1>
    </div>
    <div class="formatText">
      <h2>Hola, Angela Horta</h2>
      <h2>Tu saldo es: $110.000</h2>
      <h6 id="dateNow">Fecha: xx-xx-xxxx</h6>
    </div>
    <div
      id="carouselExampleFade"
      class="carousel slide carousel-fade"
      data-bs-ride="carousel"
      style="padding-top: 30px"
    >
      <div class="carousel-inner">
        <div
          class="carousel-item active d-flex justify-content-center"
          data-bs-interval="2000"
        >
          <img
            src="https://cdn-icons-png.flaticon.com/512/3846/3846014.png"
            class="imageFormat"
          />
        </div>
        <div
          class="carousel-item d-flex justify-content-center"
          data-bs-interval="2000"
        >
          <img
            src="https://cdn.icon-icons.com/icons2/3598/PNG/512/office_business_finance_payment_card_debit_icon_226228.png"
            class="imageFormat"
          />
        </div>
        <div
          class="carousel-item d-flex justify-content-center"
          data-bs-interval="2000"
        >
          <img
            src="https://cdn-icons-png.flaticon.com/512/1936/1936112.png"
            class="imageFormat"
          />
        </div>
        <div
          class="carousel-item d-flex justify-content-center"
          data-bs-interval="2000"
        >
          <img
            src="https://images.vexels.com/media/users/3/258887/isolated/preview/02d6895f2e2371143893c29dc66af93e-mano-que-sostiene-la-tarjeta-de-cra-dito-plana.png"
            class="imageFormat"
          />
        </div>
      </div>
      <button
        class="carousel-control-prev"
        type="button"
        data-bs-target="#carouselExampleFade"
        data-bs-slide="prev"
      >
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
      </button>
      <button
        class="carousel-control-next"
        type="button"
        data-bs-target="#carouselExampleFade"
        data-bs-slide="next"
      >
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
      </button>
    </div>
  </body>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script
    src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
    crossorigin="anonymous"
  ></script>
  <script src="/js/arch.js"></script>
</html>
			""";
	print.println(html);
	
	}

}
