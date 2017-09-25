package com.mounacheikhna;

import java.util.List;

public class Controller implements Themable {

    public List<Themable> getThemableChildren() {
        return null;
    }

    @Override
    public void visit(ThemeRenderer themeRenderer) {

    }
}
