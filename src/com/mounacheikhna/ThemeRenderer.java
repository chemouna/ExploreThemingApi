package com.mounacheikhna;

import java.util.List;

public class ThemeRenderer {

    public void accept(Controller controller) {

    }

    public void accept(ThemableAdapter controller) {

    }

    public void accept(Panel panel) {

    }

    public void accept(Container container) {

    }

    public void accept(TabsLayout tabsLayout) {

    }

    public void accept(List<Themable> themables) {
        for (Themable themable : themables) {
            themable.visit(this);
        }
    }

}
