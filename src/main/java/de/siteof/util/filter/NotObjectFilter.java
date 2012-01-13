/**
 *
 */
package de.siteof.util.filter;

/**
 * <p>Implements a logical not on the provided filter.</p>
 * <p>i.e.: this filter will return true if the provider does not - and vice versa</p>
 */
public class NotObjectFilter<T> implements IObjectFilter<T> {

	private final IObjectFilter<T> filter;

	public NotObjectFilter(IObjectFilter<T> filter) {
		this.filter	= filter;
	}

	@Override
	public boolean matches(T o) {
		return !filter.matches(o);
	}

}
