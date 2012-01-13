package de.siteof.util.filter;

/**
 * <p>Implements a logical and on all of the provided filters.</p>
 * <p>i.e.: all of the filter have to match</p>
 */
public class AndObjectFilter<T> implements IObjectFilter<T> {

	private final IObjectFilter<T>[] filters;

	public AndObjectFilter(IObjectFilter<T>[] filters) {
		this.filters	= filters;
	}

	@Override
	public boolean matches(T o) {
		for (int i = 0; i < filters.length; i++) {
			if (!filters[i].matches(o)) {
				return false;
			}
		}
		return true;
	}

}
