package com.mounacheikhna;

import java.util.List;

public interface Themable {

    List<Themable> getThemableChildren();

    /**
     * this visit is necessary just to dispatch to children of a component so that they theme themeselves
     * @param themeRenderer
     */
    void visit(ThemeRenderer themeRenderer);

}
