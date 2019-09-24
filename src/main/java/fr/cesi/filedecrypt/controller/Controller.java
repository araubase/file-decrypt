package fr.cesi.filedecrypt.controller;

import fr.cesi.filedecrypt.interfaces.IController;
import fr.cesi.filedecrypt.interfaces.IModel;
import fr.cesi.filedecrypt.interfaces.IView;

public class Controller implements IController {

    private IModel model;
    private IView view;

    public Controller(IModel model, IView view) {
        this.model = model;
        this.view = view;
    }

    public void setModel(IModel model) {
        this.model = model;
    }

    public void setView(IView view) {
        this.view = view;
    }

    public IModel getModel() {
        return this.model;
    }

    public IView getView() {
        return this.view;
    }

    @Override
    public boolean start() {
        return true;
    }
}
