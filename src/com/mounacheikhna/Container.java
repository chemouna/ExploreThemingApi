package com.mounacheikhna;

public class Container {

    void applyTheme() {
        ThemeRenderer themeRenderer = new ThemeRenderer();

        themeRenderer.accept(this);
    }
}
