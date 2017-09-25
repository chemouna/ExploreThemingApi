package com.mounacheikhna;

import java.util.ArrayList;
import java.util.List;

public class Container implements Themable {

    TabsLayout tabs;
    Panel currentPanel;

    void theme() {
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
        themeRenderer.accept(this);
    }

}
