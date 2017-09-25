package com.mounacheikhna;

import java.util.ArrayList;
import java.util.List;

public class TabsLayout implements Themable {

    @Override
    public List<Themable> getThemableChildren() {
        return new ArrayList<>();
    }

    @Override
    public void visit(ThemeRenderer themeRenderer) {
        System.out.println("TabsLayout visit");
        themeRenderer.accept(this);
    }
}
