
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
                gitHub=GitHub.connectUsingOAuth("d86d88a950f74c985f055680a28ffab177264607");
            }
            return gitHub;
        }
}
