package com.mounacheikhna;

import java.util.Collections;
import java.util.List;

public class Controller implements Themable {

    private CustomAdapter adapter;

    public Controller() {
        this.adapter = new CustomAdapter();
    }

    public List<Themable> getThemableChildren() {
        return Collections.singletonList(adapter);
    }

    @Override
    public void visit(ThemeRenderer themeRenderer) {
        System.out.println("Controller visit");
        themeRenderer.accept(this);
    }
}
