package io.github.fatihbozik.licencegenerator.util;

import com.intellij.openapi.util.IconLoader;

import javax.swing.Icon;

/**
 * {@link Icons} class that holds icon resources.
 *
 * @author Fatih Bozik
 */
public final class Icons {
    /** General ignore icon. */
    public static final Icon LICENCE = IconLoader.getIcon("/icons/licence.png");

    /** Private constructor to prevent creating {@link Icons} instance. */
    private Icons() {
    }
}
