package de.siteof.util.filter;

import java.io.FileFilter;

/**
 * <p>This class is a call-back for an object filter.</p>
 * <p>(This class is inspired by the {@link FileFilter})</p>
 */
public interface IObjectFilter<T> {

	boolean matches(T o);

}
