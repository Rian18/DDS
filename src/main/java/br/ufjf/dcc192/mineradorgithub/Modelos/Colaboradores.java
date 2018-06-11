
package br.ufjf.dcc192.mineradorgithub.Modelos;

/**
 *
 * @author Rian Alves
 */
public class Colaboradores {

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }
    private String nome;
    private String email;
    private int contribuicao;
    private String localizacao;
    private String url;
    private String imagem_URL;

    public String getImagem_URL() {
        return imagem_URL;
    }

    public void setImagem_URL(String imagem_URL) {
        this.imagem_URL = imagem_URL;
    }

    public Colaboradores(String nome, String email, int contribuicao, String localizacao,String url,String imagem_URL) {
        this.nome = nome;
        this.email = email;
        this.contribuicao = contribuicao;
        this.localizacao = localizacao;
        this.url = url;
        this.imagem_URL = imagem_URL;
    }
  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

     public void setEmail(String email) {
        this.email = email;
    }

    public int getContribuicao() {
        return contribuicao;
    }

    public void setContribuicao(int contribuicao) {
        this.contribuicao = contribuicao;
    }

   
    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    
    
}
