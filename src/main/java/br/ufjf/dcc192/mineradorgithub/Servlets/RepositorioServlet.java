package br.ufjf.dcc192.mineradorgithub.Servlets;

import br.ufjf.dcc192.mineradorgithub.Main;
import br.ufjf.dcc192.mineradorgithub.MineraGit;
import br.ufjf.dcc192.mineradorgithub.Modelos.Repositorio;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.kohsuke.github.GHRepository;

/**
 *
 * @author Rian Alves
 */
@WebServlet(name = "RepositorioServlet", urlPatterns = {"/login.html","/repositorio.html", "/contribuidores.html"})
public class RepositorioServlet extends HttpServlet {

    private List<Repositorio> repositorios;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (null != request.getServletPath()) switch (request.getServletPath()) {
            case "/login.html":{
                RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/Login.jsp");
                despachante.forward(request, response);
                    break;
                }
            case "/repositorio.html":{
                RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/Repositorio.jsp");
                despachante.forward(request, response);
                    break;
                }
            case "/contribuidores.html":{
                Integer idRepositorio = Integer.parseInt(request.getParameter("repo"));
                Repositorio repositorio = this.findById(idRepositorio);
                request.setAttribute("contribuidores", repositorio.getColaboradores());
                RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/Contribuidores.jsp");
                despachante.forward(request, response);
                    break;
                }
            default:
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        String keyword = request.getParameter("keyword");
        
        MineraGit mineracao = new MineraGit();
        mineracao.Operacao(keyword);
        repositorios = mineracao.Operacao(keyword);
        RequestDispatcher dispacher = request.getRequestDispatcher("/WEB-INF/Repositorio.jsp");
        request.setAttribute("repositorios", repositorios);
        dispacher.forward(request, response);

    }
    
    public Repositorio findById(Integer codigoRepositorio) {
        for (Repositorio repositorio : repositorios) {
            if (repositorio.getId() == codigoRepositorio) {
                return repositorio;
            }
        }
        return null;
    }

}
