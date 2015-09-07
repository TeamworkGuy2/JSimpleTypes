package twg2.dataTypeLike;

import java.util.List;

/** Interface for {@link Enum} like classes
 * @param <T> the type of elements in this enumeration
 * @author TeamworkGuy2
 * @since 2014-10-31
 */
public interface EnumLike<T> {

	/** Returns the list of values in this enumeration.
	 * The return list SHOULD BE immutable and multiple calls to this method from the same
	 * JVM session MUST return the same reference list for multi-thread programs and caching purposes.
	 * @return the values in this enumeration
	 */
	public List<T> values();


	/** Returns the enum constant corresponding to the provided name
	 * @param enumConstName the name of the enum constant to lookup
	 * @return the enum constant corresponding to the specified enum constant name,
	 * returns null if {@code enumConstName} does not match the name of any of this instance's values
	 */
	public T valueOf(String enumConstName);

}
