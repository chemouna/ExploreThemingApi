package com.mounacheikhna;

import java.util.ArrayList;
import java.util.List;

public class ThemableAdapter implements Themable {

    @Override
    public List<Themable> getThemableChildren() {
        return new ArrayList<>();
    }

    @Override
    public void visit(ThemeRenderer themeRenderer) {

    }

}
