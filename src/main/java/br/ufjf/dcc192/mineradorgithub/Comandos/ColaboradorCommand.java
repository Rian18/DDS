
package br.ufjf.dcc192.mineradorgithub.Comandos;

import br.ufjf.dcc192.mineradorgithub.Modelos.Repositorios;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.kohsuke.github.GHRepository;


public class ColaboradorCommand implements Comando {
   

    @Override
    public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Integer codigoRepositorio = Integer.parseInt(request.getParameter("repo"));
        GHRepository repositorio = Repositorios.findById(codigoRepositorio);
        request.setAttribute("colaboradores", repositorio.listCollaborators().asList());
        request.setAttribute("repositorio", repositorio);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/colaboradores.jsp");
        despachante.forward(request, response);
    }
}

