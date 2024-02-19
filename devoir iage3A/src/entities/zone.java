package entities;

import java.util.ArrayList;

public class zone {
    private String id;
    private String nom;

     ArrayList<bien> bienList=new ArrayList<>();

    public void setbienList(ArrayList<bien> bienList) {
        this.bienList = bienList;
    }

    public ArrayList<bien> getbienList() {
        return bienList;
    }
    public zone() {
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
}
