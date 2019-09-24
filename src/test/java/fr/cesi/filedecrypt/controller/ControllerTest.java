package fr.cesi.filedecrypt.controller;

import org.junit.Test;

import static org.junit.Assert.*;

public class ControllerTest {

    @Test
    public void start() {
        Controller controller = new Controller(null, null);
        assertEquals(true, controller.start());
    }

    @Test
    public void setModel() {

    }

    @Test
    public void setView() {

    }

    @Test
    public void getModel() {

    }

    @Test
    public void getView() {

    }
}