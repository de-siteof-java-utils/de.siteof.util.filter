package de.siteof.util.filter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class FilterUtil {

	@SuppressWarnings("unchecked")
	public static <T> T[] filterArray(T[] a, IObjectFilter<T> filter) {
		if ((a == null) || (filter == null)) {
			return a;
		}
		Collection<T> list	= new ArrayList<T>(a.length);
		for (int i = 0; i < a.length; i++) {
			if ((filter == null) || (filter.matches(a[i]))) {
				list.add(a[i]);
			}
		}
		return list.toArray((T[]) Array.newInstance(a.getClass().getComponentType(), list.size()));
	}

}
