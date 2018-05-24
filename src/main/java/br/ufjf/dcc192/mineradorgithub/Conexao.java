
package br.ufjf.dcc192.mineradorgithub;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GHRepositorySearchBuilder;
import org.kohsuke.github.GitHub;


public class Conexao {
        GitHub gitHub;
        
        public GitHub getConexao() throws IOException{
            if(gitHub==null){
                gitHub=GitHub.connectUsingOAuth("1b61c9649d1ac83ae49bd72936134becb4394436");
            }
            return gitHub;
        }
}
