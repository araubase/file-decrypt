package fr.cesi.filedecrypt.model;

public class MapPersonne {

    private int id;
    private String mail;
    private String password;
    private String request;

    public MapPersonne(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

    public String selectIDByLoginAndPassword() {
        return "SELECT * FROM Personne WHERE mail LIKE '" + this.mail + "' AND password LIKE '" + this.password + "'";
    }
}
