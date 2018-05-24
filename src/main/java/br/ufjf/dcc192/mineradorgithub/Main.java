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
import org.kohsuke.github.PagedIterable;

public class Main {

    private static List<Repositorio> lstRepositorios = new ArrayList<>();
    private static List<Colaboradores> lstColaboradores = new ArrayList<>();
    
    

    public static void main(String args[]) throws IOException {
        int i = 0;
       

        GitHub github = GitHub.connectUsingOAuth("d86d88a950f74c985f055680a28ffab177264607");
        GHRepositorySearchBuilder repo = github.searchRepositories();
        GHRepositorySearchBuilder repos = repo.q("Floricultura");
        PagedIterable<GHRepository> repositorios = repos.list();
        for (GHRepository repositorio : repositorios) {
            System.out.println(repositorio.getDescription());
            System.out.println(repositorio.getFullName());
            GHUser user = repositorio.getOwner();
            System.out.println("Nome: " + user.getName() + " Email:" + user.getEmail());
            PagedIterable<Contributor> colaboradores = repositorio.listContributors();
            for (Contributor colaboradore : colaboradores) {
                System.out.println(colaboradore.getName());
                System.out.println(colaboradore.getContributions());
                System.out.println(colaboradore.getEmail());
                System.out.println(colaboradore.getLocation());
                lstColaboradores.add(new Colaboradores(colaboradore.getName(), colaboradore.getEmail(),
                        colaboradore.getContributions(), colaboradore.getLocation()));
            }
            System.out.println("-----------------||----------------");
            lstRepositorios.add(new Repositorio(repositorio.getDescription(),
                    repositorio.getFullName(), user.getName(), user.getEmail(), lstColaboradores,""));

            lstColaboradores.clear();
        }
        System.out.println("-----------------||----------------");
        for (int a = 0; a < i; a++) {
            System.out.println("Repositório: " + lstRepositorios.get(a).getFullName()
                    + " Descrição: " + lstRepositorios.get(a).getDescription());

        }

    }
    
    public List<Repositorio> RetornaRepositorios(List<Repositorio> repositorios)
    {
     
        
        return repositorios;
    
    
    }
}


/*  public static void MineraGit() throws IOException {
        int i = 0;

        GitHub github = GitHub.connectUsingOAuth("d86d88a950f74c985f055680a28ffab177264607");
        GHRepositorySearchBuilder repo = github.searchRepositories();
        GHRepositorySearchBuilder repos = repo.q("agropecuaria");
        PagedIterable<GHRepository> repositorios = repos.list();
        for (GHRepository repositorio : repositorios) {
            System.out.println(repositorio.getDescription());
            System.out.println(repositorio.getFullName());
            GHUser user = repositorio.getOwner();
            System.out.println("Nome: " + user.getName() + " Email:" + user.getEmail());
            PagedIterable<Contributor> colaboradores = repositorio.listContributors();
            for (Contributor colaboradore : colaboradores) {
                System.out.println(colaboradore.getName());
                System.out.println(colaboradore.getContributions());
                System.out.println(colaboradore.getEmail());
                System.out.println(colaboradore.getLocation());
            }
            System.out.println("-----------------||----------------");
            lstRepositorios.set(i, new Repositorio(repositorio.getDescription(),
                    repositorio.getFullName(), user.getName(), user.getEmail()));
            i++;
        }

        for (int a = 0; a < i; a++) {
            System.out.println("Repositório: " + lstRepositorios.get(a).getFullName()
                    + " Descrição: " + lstRepositorios.get(a).getDescription());
        }

    }*/
