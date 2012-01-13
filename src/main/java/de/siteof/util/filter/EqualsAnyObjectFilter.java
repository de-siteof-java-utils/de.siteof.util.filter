package de.siteof.util.filter;

/**
 * <p>This filter returns true if the object matches any of the constant values provided.</p>
 */
public class EqualsAnyObjectFilter<T> implements IObjectFilter<T> {

	private final Object[] values;

	public EqualsAnyObjectFilter(Object[] values) {
		this.values	= values;
	}

	@Override
	public boolean matches(T o) {
		for(int i = 0; i < values.length; i++) {
			if (values[i].equals(o)) {
				return true;
			}
		}
		return false;
	}

}
