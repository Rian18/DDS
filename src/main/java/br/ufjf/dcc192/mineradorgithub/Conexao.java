
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
                gitHub=GitHub.connectUsingOAuth("f546c97774d116ccab0c4f7a02ff9d82036b9eeb");
            }
            return gitHub;
        }
}
