
package br.ufjf.dcc192.mineradorgithub;

/**
 *
 * @author Rian Alves
 */
public class Colaboradores {
    private String nome;
    private String email;
    private int contribuicao;
    private String localizacao;

    public Colaboradores(String nome, String email, int contribuicao, String localizacao) {
        this.nome = nome;
        this.email = email;
        this.contribuicao = contribuicao;
        this.localizacao = localizacao;
    }
    
    

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the contribuicao
     */
    public int getContribuicao() {
        return contribuicao;
    }

    /**
     * @param contribuicao the contribuicao to set
     */
    public void setContribuicao(int contribuicao) {
        this.contribuicao = contribuicao;
    }

    /**
     * @return the localizacao
     */
    public String getLocalizacao() {
        return localizacao;
    }

    /**
     * @param localizacao the localizacao to set
     */
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    
    
}