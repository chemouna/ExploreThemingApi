package com.mounacheikhna;

import java.util.List;

public class Panel implements Themable {

    @Override
    public List<Themable> getThemableChildren()  {
        return null;
    }

    @Override
    public void visit(ThemeRenderer themeRenderer) {

    }
}
