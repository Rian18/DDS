package br.ufjf.dcc192.mineradorgithub.Servlets;

import br.ufjf.dcc192.mineradorgithub.Comandos.Comando;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RepositorioServlet", urlPatterns = {"/index.html", "/repositorios.html", "/colaboradores.html", "/colaboradores-detalhes.html"})
public class RepositorioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> rotas = new HashMap<>();
        rotas.put("/index.html", "br.ufjf.dcc192.mineradorgithub.Comandos.IndexCommand");
        rotas.put("/repositorios.html", "br.ufjf.dcc192.mineradorgithub.Comandos.RepositorioCommand");
        rotas.put("/colaboradores.html", "br.ufjf.dcc192.mineradorgithub.Comandos.ColaboradorCommand");
        rotas.put("/colaboradores-detalhes.html", "br.ufjf.dcc192.mineradorgithub.Comandos.ColaboradorDetalheCommand");

        String className = rotas.get(request.getServletPath());
        try {
            Comando comando = (Comando) Class.forName(className).newInstance();
            comando.exec(request, response);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(RepositorioServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> rotas = new HashMap<>();
        rotas.put("/index.html", "br.ufjf.dcc192.mineradorgithub.Comandos.IndexPostCommand");

        String className = rotas.get(request.getServletPath());
        try {
            Comando comando = (Comando) Class.forName(className).newInstance();
            comando.exec(request, response);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(RepositorioServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
