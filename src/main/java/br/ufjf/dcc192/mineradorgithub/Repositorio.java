
package br.ufjf.dcc192.mineradorgithub;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rian Alves
 */
public class Repositorio {
     private String description;
    private String fullName;
    private String name;
    private String email;
    private String clbName;
    private String clbContib;
    private String clbEmail;
    private String clbLocation;
    private ArrayList<Repositorio> repositorios;

    public Repositorio(String description, String fullName, String name, String email, String clbName, String clbContib, String clbEmail, String clbLocation) {
        this.description = description;
        this.fullName = fullName;
        this.name = name;
        this.email = email;
        this.clbName = clbName;
        this.clbContib = clbContib;
        this.clbEmail = clbEmail;
        this.clbLocation = clbLocation;
    }
    
     public Repositorio(String description, String fullName, String name, String email) {
        this.description = description;
        this.fullName = fullName;
        this.name = name;
        this.email = email;
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
     * @return the clbName
     */
    public String getClbName() {
        return clbName;
    }

    /**
     * @param clbName the clbName to set
     */
    public void setClbName(String clbName) {
        this.clbName = clbName;
    }

    /**
     * @return the clbContib
     */
    public String getClbContib() {
        return clbContib;
    }

    /**
     * @param clbContib the clbContib to set
     */
    public void setClbContib(String clbContib) {
        this.clbContib = clbContib;
    }

    /**
     * @return the clbEmail
     */
    public String getClbEmail() {
        return clbEmail;
    }

    /**
     * @param clbEmail the clbEmail to set
     */
    public void setClbEmail(String clbEmail) {
        this.clbEmail = clbEmail;
    }

    /**
     * @return the clbLocation
     */
    public String getClbLocation() {
        return clbLocation;
    }

    /**
     * @param clbLocation the clbLocation to set
     */
    public void setClbLocation(String clbLocation) {
        this.clbLocation = clbLocation;
    }
    
}
