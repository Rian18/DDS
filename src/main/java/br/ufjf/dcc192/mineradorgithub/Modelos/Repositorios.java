package br.ufjf.dcc192.mineradorgithub.Modelos;

import java.io.IOException;
import java.util.List;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GHRepository.Contributor;
import org.kohsuke.github.PagedIterable;

public class Repositorios {

    private static PagedIterable<GHRepository> repositorios;

    public static void setRepositorios(PagedIterable<GHRepository> repositorios) {
        Repositorios.repositorios = repositorios;
    }

    public static PagedIterable<GHRepository> getRepositorios() {
        return repositorios;
    }

    public static GHRepository findById(Integer codigoRepositorio) {
        for (GHRepository repositorio : repositorios) {
            if (repositorio.getId() == codigoRepositorio) {
                return repositorio;
            }
        }
        return null;
    }

    public static Contributor findContributorByID(GHRepository repositorio, Integer id) throws IOException {
        for (Contributor contribuidor : repositorio.listContributors().asList()) {
            if (contribuidor.getId() == id) {
                return contribuidor;
            }

        }
        return null;
    }
}
