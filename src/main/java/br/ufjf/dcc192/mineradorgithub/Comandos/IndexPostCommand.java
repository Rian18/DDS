
package br.ufjf.dcc192.mineradorgithub.Comandos;

import br.ufjf.dcc192.mineradorgithub.Modelos.Repositorios;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GHRepositorySearchBuilder;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.PagedIterable;


public class IndexPostCommand implements Comando {
   

    @Override
    public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String termo = request.getParameter("termo");
        GitHub github = GitHub.connectUsingOAuth("d86d88a950f74c985f055680a28ffab177264607");
        GHRepositorySearchBuilder repo = github.searchRepositories();
        GHRepositorySearchBuilder repos = repo.q(termo);
        Repositorios.setRepositorios(repos.list());
        response.sendRedirect("repositorios.html");
    }
}

