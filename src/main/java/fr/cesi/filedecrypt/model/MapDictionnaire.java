package fr.cesi.filedecrypt.model;

public class MapDictionnaire {

    private int id;
    private String mot;

    public MapDictionnaire(String mot) {
        this.mot = mot;
    }

    public String selectWord() {
        return "SELECT * FROM Dictionnaire WHERE mot LIKE '" + this.mot + "'";
    }

}
