package com.mounacheikhna;

import java.util.List;

public class ThemeRenderer {

    public void accept(Controller controller) {
        accept(controller.getThemableChildren());
        System.out.println("Theming controller");
    }

    public void accept(ThemableAdapter adapter) {
        accept(adapter.getThemableChildren());
        System.out.println("Theming adapter");
    }

    public void accept(Panel panel) {
        accept(panel.getThemableChildren());
        System.out.println("Theming panel");
    }

    public void accept(Container container) {
        accept(container.getThemableChildren());
        System.out.println("Theming container");
    }

    public void accept(TabsLayout tabsLayout) {
        accept(tabsLayout.getThemableChildren());
        System.out.println("Theming tablayout");
    }

    public void accept(List<Themable> themables) {
        System.out.println("Theming themables");
        for (Themable themable : themables) {
            themable.visit(this);
        }
    }

    // maybe use T extends to do that ?

}
