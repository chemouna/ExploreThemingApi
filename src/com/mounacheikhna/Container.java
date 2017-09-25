package com.mounacheikhna;

import java.util.ArrayList;
import java.util.List;

public class Container implements Themable {

    private TabsLayout tabs;
    private Panel currentPanel;

    public Container() {
        this.tabs = new TabsLayout();
        this.currentPanel = new Panel();
    }

    void theme() {
        System.out.println("theme ");
        ThemeRenderer themeRenderer = new ThemeRenderer();
        visit(themeRenderer);
    }

    @Override
    public List<Themable> getThemableChildren() {
        ArrayList<Themable> list = new ArrayList<>();
        list.add(tabs);
        list.add(currentPanel);
        return list;
    }

    @Override
    public void visit(ThemeRenderer themeRenderer) {
        System.out.println("Container visit ");
        themeRenderer.accept(this);
    }

}
