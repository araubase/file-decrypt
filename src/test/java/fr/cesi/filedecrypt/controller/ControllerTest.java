package fr.cesi.filedecrypt.controller;

import fr.cesi.filedecrypt.interfaces.IModel;
import fr.cesi.filedecrypt.interfaces.IView;
import fr.cesi.filedecrypt.view.FileFrame;
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
        IView view = new FileFrame(new Decryptor());

        Controller controller = new Controller(null, null);
        controller.setView(view);

        assertEquals(view, controller.getView());
    }

    @Test
    public void getModel() {

    }

    @Test
    public void getView() {
        IView view = new FileFrame(new Decryptor());

        Controller controller = new Controller(null, view);

        assertEquals(view, controller.getView());
    }

}