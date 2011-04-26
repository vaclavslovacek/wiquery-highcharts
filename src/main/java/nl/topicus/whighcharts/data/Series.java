package nl.topicus.whighcharts.data;

import java.util.List;

public interface Series<K, V, E extends SeriesEntry<K, V>>
{
	public String getName();

	public List<E> getData();
}