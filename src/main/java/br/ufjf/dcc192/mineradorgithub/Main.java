package br.ufjf.dcc192.mineradorgithub;

import java.io.IOException;
import org.kohsuke.github.GHPersonSet;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GHRepository.Contributor;
import org.kohsuke.github.GHRepositorySearchBuilder;
import org.kohsuke.github.GHUser;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.PagedIterable;

public class Main {

   
    
    public static void MineraGit(String[] args) throws IOException {
        
        GitHub github = GitHub.connectUsingOAuth("d86d88a950f74c985f055680a28ffab177264607");
        GHRepositorySearchBuilder repo = github.searchRepositories();
        GHRepositorySearchBuilder repos = repo.q("contabilidade");
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

        }

    }
    
    }
