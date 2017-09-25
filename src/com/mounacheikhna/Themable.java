package com.mounacheikhna;

import java.util.List;

public interface Themable {

    List<Themable> getThemableChildren();

    void visit(ThemeRenderer themeRenderer);

}
