package entities;

import java.util.ArrayList;

public class Adresse {
    private int id;
    private String ville;
    private String quartier;
    private String numVilla;

    ArrayList<Client> clientList=new ArrayList<>();

    public ArrayList<Client> getClientList() {
        return clientList;
    }
    public Adresse() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public String getQuartier() {
        return quartier;
    }
    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }
    public String getNumVilla() {
        return numVilla;
    }
    public void setNumVilla(String numVilla) {
        this.numVilla = numVilla;
    }
}
