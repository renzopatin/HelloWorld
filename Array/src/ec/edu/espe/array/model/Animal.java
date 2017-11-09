/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.array.model;

/**
 *
 * @author renzo
 */
public class Animal {

    public Animal(int id, String eyes, String name) {
        this.id = id;
        this.eyes = eyes;
        this.name = name;
    }
    
    private int id;
    private String eyes;
    private String name;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the ojos
     */
    public String getEyes() {
        return eyes;
    }

    /**
     * @param eyes the ojos to set
     */
    public void setEyes(String eyes) {
        this.eyes = eyes;
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
}
