package com.mounacheikhna;

import java.util.Arrays;
import java.util.List;

public class Panel implements Themable {

    //TODO: force the getting of the parent element

    private Controller controller;
    private TabsLayout tabsLayout;

    public Panel() {
        this.controller = new Controller();
        this.tabsLayout = new TabsLayout();
    }

    @Override
    public List<Themable> getThemableChildren()  {
        return Arrays.asList(controller, tabsLayout);
    }

    @Override
    public void visit(ThemeRenderer themeRenderer) {
        System.out.println("Panel visit");
        themeRenderer.accept(this);
    }
}
