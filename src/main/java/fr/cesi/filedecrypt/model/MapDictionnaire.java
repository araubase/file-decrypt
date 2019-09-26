package fr.cesi.filedecrypt.model;

public class MapDictionnaire {

    private int id;
    private String mot;

    /**
     * Constructor
     * @param mot
     */
    public MapDictionnaire(String mot) {
        this.mot = mot;
    }

    /**
     * Return SQL request
     * @return
     */
    public String selectWord() {
        return "SELECT * FROM Dictionnaire WHERE mot LIKE '" + this.mot.replaceAll("['\"\\\\]", "\\\\$0") + "'";
    }

}
