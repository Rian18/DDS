package br.ufjf.dcc192.mineradorgithub;

import br.ufjf.dcc192.mineradorgithub.Modelos.Repositorio;
import br.ufjf.dcc192.mineradorgithub.Modelos.Colaboradores;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.kohsuke.github.GHPersonSet;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GHRepository.Contributor;
import org.kohsuke.github.GHRepositorySearchBuilder;
import org.kohsuke.github.GHUser;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;
import org.kohsuke.github.PagedIterable;

/**
 *
 * @author Rian Alves
 */
public class MineraGit {

    private List<Repositorio> lstRepositorios = new ArrayList<>();
    
    private List<Colaboradores> lstColaboradores = new ArrayList<>();

    public List<Repositorio> Operacao(String palavraChave) throws IOException {

        Conexao conexao = new Conexao();
        String url = "";
        GitHub github = conexao.getConexao();
        GHRepositorySearchBuilder repo = github.searchRepositories();
        GHRepositorySearchBuilder repos = repo.q(palavraChave);
        PagedIterable<GHRepository> repositorios = repos.list();
        for (GHRepository repositorio : repositorios) {
            
            System.out.println(repositorio.getDescription());
            System.out.println(repositorio.getFullName());
            url = repositorio.getHtmlUrl().toString();
            System.out.println(url);
            GHUser user = repositorio.getOwner();
            System.out.println("Nome: " + user.getName() + " Email:" + user.getEmail());
            PagedIterable<GHRepository.Contributor> colaboradores = repositorio.listContributors();
            for (GHRepository.Contributor colaboradore : colaboradores) {
                System.out.println(colaboradore.getName());
                System.out.println(colaboradore.getContributions());
                System.out.println(colaboradore.getEmail());
                System.out.println(colaboradore.getLocation());
                lstColaboradores.add(new Colaboradores(colaboradore.getName(), colaboradore.getEmail(),
                        colaboradore.getContributions(), colaboradore.getLocation()));
            }
            System.out.println("-----------------||----------------");
            lstRepositorios.add(new Repositorio(repositorio.getId(),repositorio.getDescription(),
                    repositorio.getFullName(), user.getName(), user.getEmail(), lstColaboradores,url));

            lstColaboradores.clear();
        }

        return lstRepositorios;

    }

}
