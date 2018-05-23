
package br.ufjf.dcc192.mineradorgithub.Comandos;

import br.ufjf.dcc192.mineradorgithub.Modelos.Repositorios;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RepositorioCommand implements Comando {
   

    @Override
    public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setAttribute("repositorios", Repositorios.getRepositorios().asList());
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/repositorios.jsp");
        despachante.forward(request, response);
    }
}
