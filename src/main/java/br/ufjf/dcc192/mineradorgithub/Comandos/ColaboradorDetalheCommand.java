
package br.ufjf.dcc192.mineradorgithub.Comandos;

import br.ufjf.dcc192.mineradorgithub.Modelos.Repositorios;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GHRepository.Contributor;


public class ColaboradorDetalheCommand implements Comando {
   

    @Override
    public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Integer codigoRepositorio = Integer.parseInt(request.getParameter("repo"));
        Integer codigoColaborador = Integer.parseInt(request.getParameter("colab"));
        GHRepository repositorio = Repositorios.findById(codigoRepositorio);
        Contributor contribuidor = Repositorios.findContributorByID(repositorio, codigoColaborador);
        request.setAttribute("contribuidor", contribuidor);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/contribuidor-detalhe.jsp");
        despachante.forward(request, response);
    }
}

