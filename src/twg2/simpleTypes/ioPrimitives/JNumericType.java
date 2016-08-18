package twg2.simpleTypes.ioPrimitives;

import lombok.Getter;

/**
 * @author TeamworkGuy2
 * @since 20151-18
 */
public enum JNumericType {
	BYTE(Byte.TYPE, Byte.class, IoType.BYTE, JPrimitiveType.BYTE, PrimitiveOrString.BYTE,             Byte.valueOf((byte)0),      "byte",   "Byte",     "byte",   "Byte",   "byte",     "Byte"),
	SHORT(Short.TYPE, Short.class, IoType.SHORT, JPrimitiveType.SHORT, PrimitiveOrString.SHORT,       Short.valueOf((short)0),    "short",  "Short",    "short",  "Short",  "short",    "Short"),
	INT(Integer.TYPE, Integer.class, IoType.INT, JPrimitiveType.INT, PrimitiveOrString.INT,           Integer.valueOf((int)0),    "int",    "Integer",  "int",    "Int",    "integer",  "Integer"),
	FLOAT(Float.TYPE, Float.class, IoType.FLOAT, JPrimitiveType.FLOAT, PrimitiveOrString.FLOAT,       Float.valueOf((float)0),    "float",  "Float",    "float",  "Float",  "float",    "Float"),
	LONG(Long.TYPE, Long.class, IoType.LONG, JPrimitiveType.LONG, PrimitiveOrString.LONG,             Long.valueOf((long)0),      "long",   "Long",     "long",   "Long",   "long",     "Long"),
	DOUBLE(Double.TYPE, Double.class, IoType.DOUBLE, JPrimitiveType.DOUBLE, PrimitiveOrString.DOUBLE, Double.valueOf((double)0),  "double", "Double",   "double", "Double", "double",   "Double");

	final @Getter Class<?> type;
	final @Getter Class<?> wrapperType;
	final @Getter IoType ioType;
	final @Getter JPrimitiveType jPrimitiveType;
	final @Getter PrimitiveOrString primitiveOrStringType;
	final @Getter Object defaultValue;
	final @Getter String javaPrimitiveName;
	final @Getter String javaObjectName;
	final @Getter String shortName;
	final @Getter String shortTitleCaseName;
	final @Getter String fullName;
	final @Getter String fullTitleCaseName;


	private JNumericType(Class<?> type, Class<?> wrapperType, IoType ioType, JPrimitiveType jPrimitiveType, PrimitiveOrString primitiveOrStringType, Object defaultValue, String javaPrimitiveName, String javaObjectName,
			String shortName, String shortTitleCaseName, String fullName, String fullTitleCaseName) {
		this.type = type;
		this.wrapperType = wrapperType;
		this.ioType = ioType;
		this.jPrimitiveType = jPrimitiveType;
		this.primitiveOrStringType = primitiveOrStringType;
		this.defaultValue = defaultValue;
		this.javaPrimitiveName = javaPrimitiveName;
		this.javaObjectName = javaObjectName;

		this.shortName = shortName;
		this.shortTitleCaseName = shortTitleCaseName;
		this.fullName = fullName;
		this.fullTitleCaseName = fullTitleCaseName;
	}


	public static final JNumericType fromType(Class<?> type, boolean allowPrimitiveType, boolean allowWrapperType) {
		JNumericType prim = tryFromType(type, allowPrimitiveType, allowWrapperType);
		if(prim == null) {
			throw new IllegalArgumentException("unknown numeric type: " + type);
		}
		return prim;
	}


	public static final JNumericType tryFromType(Class<?> type, boolean allowPrimitiveType, boolean allowWrapperType) {
		if(allowPrimitiveType) {
			if(allowWrapperType) {
				return tryFromPrimitiveOrWrapperType(type);
			}
			else {
				return tryFromPrimitiveType(type);
			}
		}
		else if(allowWrapperType) {
			return tryFromWrapperType(type);
		}
		return null;
	}


	/** Alias for {@link #fromPrimitiveOrWrapperType(Class)}
	 */
	public static final JNumericType fromType(Class<?> type) {
		return fromPrimitiveOrWrapperType(type);
	}


	public static final JNumericType fromPrimitiveOrWrapperType(Class<?> type) {
		JNumericType prim = tryFromPrimitiveOrWrapperType(type);
		if(prim == null) {
			throw new IllegalArgumentException("unknown numeric type: " + type);
		}
		return prim;
	}


	/** Alias for {@link #tryFromPrimitiveOrWrapperType(Class)}
	 */
	public static final JNumericType tryFromType(Class<?> type) {
		return tryFromPrimitiveOrWrapperType(type);
	}


	public static final JNumericType tryFromPrimitiveOrWrapperType(Class<?> type) {
		if(type == Byte.TYPE || type == Byte.class) {
			return BYTE;
		}
		else if(type == Short.TYPE || type == Short.class) {
			return SHORT;
		}
		else if(type == Integer.TYPE || type == Integer.class) {
			return INT;
		}
		else if(type == Float.TYPE || type == Float.class) {
			return FLOAT;
		}
		else if(type == Long.TYPE || type == Long.class) {
			return LONG;
		}
		else if(type == Double.TYPE || type == Double.class) {
			return DOUBLE;
		}
		else {
			return null;
		}
	}


	public static final JNumericType fromWrapperType(Class<?> type) {
		JNumericType prim = tryFromWrapperType(type);
		if(prim == null) {
			throw new IllegalArgumentException("unknown numeric wrapper type: " + type);
		}
		return prim;
	}


	public static final JNumericType tryFromWrapperType(Class<?> type) {
		if(type == Byte.class) {
			return BYTE;
		}
		else if(type == Short.class) {
			return SHORT;
		}
		else if(type == Integer.class) {
			return INT;
		}
		else if(type == Float.class) {
			return FLOAT;
		}
		else if(type == Long.class) {
			return LONG;
		}
		else if(type == Double.class) {
			return DOUBLE;
		}
		else {
			return null;
		}
	}


	public static final JNumericType fromPrimitiveType(Class<?> type) {
		JNumericType prim = tryFromPrimitiveType(type);
		if(prim == null) {
			throw new IllegalArgumentException("unknown numeric type: " + type);
		}
		return prim;
	}


	public static final JNumericType tryFromPrimitiveType(Class<?> type) {
		if(type == Byte.TYPE) {
			return BYTE;
		}
		else if(type == Short.TYPE) {
			return SHORT;
		}
		else if(type == Integer.TYPE) {
			return INT;
		}
		else if(type == Float.TYPE) {
			return FLOAT;
		}
		else if(type == Long.TYPE) {
			return LONG;
		}
		else if(type == Double.TYPE) {
			return DOUBLE;
		}
		else {
			return null;
		}
	}


	public static final JNumericType fromIoType(IoType t) {
		JNumericType resType = tryFromIoType(t);
		if(resType == null) {
			throw new IllegalArgumentException("cannot convert " + IoType.class.getSimpleName() + " enum '" + t + "', has no " + JNumericType.class.getSimpleName() + " equivalent");
		}
		return resType;
	}


	public static final JNumericType tryFromIoType(IoType t) {
		switch(t) {
		case BOOLEAN:
			return null;
		case BYTE:
			return BYTE;
		case CHAR:
			return null;
		case SHORT:
			return SHORT;
		case INT:
			return INT;
		case LONG:
			return LONG;
		case FLOAT:
			return FLOAT;
		case DOUBLE:
			return DOUBLE;
		case BINARY:
			return null;
		case STRING:
			return null;
		default:
			return null;
		}
	}


	public static final JNumericType fromJPrimitiveType(JPrimitiveType t) {
		JNumericType resType = tryFromJPrimitiveType(t);
		if(resType == null) {
			throw new IllegalArgumentException("cannot convert " + JPrimitiveType.class.getSimpleName() + " enum '" + t + "', has no " + JNumericType.class.getSimpleName() + " equivalent");
		}
		return resType;
	}


	public static final JNumericType tryFromJPrimitiveType(JPrimitiveType t) {
		switch(t) {
		case BOOLEAN:
			return null;
		case BYTE:
			return BYTE;
		case CHAR:
			return null;
		case DOUBLE:
			return DOUBLE;
		case FLOAT:
			return FLOAT;
		case INT:
			return INT;
		case LONG:
			return LONG;
		case SHORT:
			return SHORT;
		default:
			return null;
		}
	}


	public static final JNumericType fromPrimitiveOrString(PrimitiveOrString t) {
		JNumericType resType = tryFromPrimitiveOrString(t);
		if(resType == null) {
			throw new IllegalArgumentException("cannot convert " + PrimitiveOrString.class.getSimpleName() + " enum '" + t + "', has no " + JNumericType.class.getSimpleName() + " equivalent");
		}
		return resType;
	}


	public static final JNumericType tryFromPrimitiveOrString(PrimitiveOrString t) {
		switch(t) {
		case BOOLEAN:
			return null;
		case BYTE:
			return BYTE;
		case CHAR:
			return null;
		case SHORT:
			return SHORT;
		case INT:
			return INT;
		case LONG:
			return LONG;
		case FLOAT:
			return FLOAT;
		case DOUBLE:
			return DOUBLE;
		case STRING:
			return null;
		default:
			return null;
		}
	}

}
