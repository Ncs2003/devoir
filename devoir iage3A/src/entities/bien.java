package entities;

import java.util.ArrayList;
import java.util.List;

public class bien {
    private int id;
    private String reference; 
    private String description; 
    private String prix;
    private String datecreation;

   List<zone>  zone =new ArrayList<>();
    
    public List<zone> getzone() {
        return zone;
    }

    public void setzone(List<zone>zone) {
        this.zone = zone;
    }
    public bien (){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }
    public String getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(String datecreation) {
        this.datecreation = datecreation;
    }
}
