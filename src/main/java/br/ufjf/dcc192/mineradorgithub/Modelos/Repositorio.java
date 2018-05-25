package br.ufjf.dcc192.mineradorgithub.Modelos;
import br.ufjf.dcc192.mineradorgithub.Modelos.Colaboradores;
import java.util.List;
/**
 *
 * @author Rian Alves
 */
public class Repositorio {

    /**
     * @return the colaboradores
     */
    public List <Colaboradores> getColaboradores() {
        return colaboradores;
    }

    /**
     * @param colaboradores the colaboradores to set
     */
    public void setColaboradores(List <Colaboradores> colaboradores) {
        this.colaboradores = colaboradores;
    }
    private long id; 
    private String description;
    private String fullName;
    private String name;
    private String email;
    private String url;

    private List<Colaboradores> colaboradores;

    public Repositorio(long id,String description, String fullName, String name, String email,List<Colaboradores> colaboradores,String url) {
        this.id = id;
        this.description = description;
        this.fullName = fullName;
        this.name = name;
        this.email = email;
        this.colaboradores = colaboradores;
        this.url = url;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

}
