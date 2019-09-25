package fr.cesi.filedecrypt.model;

import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.*;

public class CADTest {

    @Test
    public void getRows() {
        CAD cad = new CAD();
        ResultSet result = cad.getRows("SELECT * FROM Personne");

        boolean b = false;
        try {
            while (result.next()) {
                b = true;
            }
        } catch (SQLException ex) {}

        assertTrue(b);
    }

    @Test
    public void actionRows() {
        CAD cad = new CAD();
        boolean b = cad.actionRows("UPDATE Personne SET mail = 'julien.griffoul@viacesi.fr' WHERE mail = 'julien.griffoul@viacesi.fr'");

        assertTrue(b);
    }
}