package twg2.primitiveIoTypes;

import lombok.Getter;

/**
 * @author TeamworkGuy2
 * @since 20151-18
 */
public enum JPrimitiveType {
	BOOLEAN(Boolean.TYPE, Boolean.class, IoType.BOOLEAN, PrimitiveOrString.BOOLEAN, Boolean.FALSE,              "boolean","Boolean",  "boolean","Boolean","boolean",  "Boolean"),
	BYTE(Byte.TYPE, Byte.class, IoType.BYTE, PrimitiveOrString.BYTE,                Byte.valueOf((byte)0),      "byte",   "Byte",     "byte",   "Byte",   "byte",     "Byte"),
	CHAR(Character.TYPE, Character.class, IoType.CHAR, PrimitiveOrString.CHAR,      Character.valueOf((char)0), "char",   "Character","char",   "Char",   "character","Character"),
	SHORT(Short.TYPE, Short.class, IoType.SHORT, PrimitiveOrString.SHORT,           Short.valueOf((short)0),    "short",  "Short",    "short",  "Short",  "short",    "Short"),
	INT(Integer.TYPE, Integer.class, IoType.INT, PrimitiveOrString.INT,             Integer.valueOf((int)0),    "int",    "Integer",  "int",    "Int",    "integer",  "Integer"),
	FLOAT(Float.TYPE, Float.class, IoType.FLOAT, PrimitiveOrString.FLOAT,           Float.valueOf((float)0),    "float",  "Float",    "float",  "Float",  "float",    "Float"),
	LONG(Long.TYPE, Long.class, IoType.LONG, PrimitiveOrString.LONG,                Long.valueOf((long)0),      "long",   "Long",     "long",   "Long",   "long",     "Long"),
	DOUBLE(Double.TYPE, Double.class, IoType.DOUBLE, PrimitiveOrString.DOUBLE,      Double.valueOf((double)0),  "double", "Double",   "double", "Double", "double",   "Double");

	final @Getter Class<?> type;
	final @Getter Class<?> wrapperType;
	final @Getter IoType ioType;
	final @Getter PrimitiveOrString primitiveOrStringType;
	final @Getter Object defaultValue;
	final @Getter String javaPrimitiveName;
	final @Getter String javaObjectName;
	final @Getter String shortName;
	final @Getter String shortTitleCaseName;
	final @Getter String fullName;
	final @Getter String fullTitleCaseName;


	private JPrimitiveType(Class<?> type, Class<?> wrapperType, IoType ioType, PrimitiveOrString primitiveOrStringType, Object defaultValue, String javaPrimitiveName, String javaObjectName,
			String shortName, String shortTitleCaseName, String fullName, String fullTitleCaseName) {
		this.type = type;
		this.wrapperType = wrapperType;
		this.ioType = ioType;
		this.primitiveOrStringType = primitiveOrStringType;
		this.defaultValue = defaultValue;
		this.javaPrimitiveName = javaPrimitiveName;
		this.javaObjectName = javaObjectName;

		this.shortName = shortName;
		this.shortTitleCaseName = shortTitleCaseName;
		this.fullName = fullName;
		this.fullTitleCaseName = fullTitleCaseName;
	}


	public static final JPrimitiveType fromType(Class<?> type) {
		JPrimitiveType prim = tryFromType(type);
		if(prim == null) {
			throw new IllegalArgumentException("unknown primitive type: " + type);
		}
		return prim;
	}


	public static final JPrimitiveType tryFromType(Class<?> type) {
		if(type == Boolean.TYPE || type == Boolean.class) {
			return BOOLEAN;
		}
		else if(type == Byte.TYPE || type == Byte.class) {
			return BYTE;
		}
		else if(type == Character.TYPE || type == Character.class) {
			return CHAR;
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


	public static final JPrimitiveType fromWrapperType(Class<?> type) {
		JPrimitiveType prim = tryFromWrapperType(type);
		if(prim == null) {
			throw new IllegalArgumentException("unknown primitive wrapper type: " + type);
		}
		return prim;
	}


	public static final JPrimitiveType tryFromWrapperType(Class<?> type) {
		if(type == Boolean.TYPE) {
			return BOOLEAN;
		}
		else if(type == Byte.TYPE) {
			return BYTE;
		}
		else if(type == Character.TYPE) {
			return CHAR;
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


	public static final JPrimitiveType fromPrimitiveType(Class<?> type) {
		JPrimitiveType prim = tryFromPrimitiveType(type);
		if(prim == null) {
			throw new IllegalArgumentException("unknown primitive type: " + type);
		}
		return prim;
	}


	public static final JPrimitiveType tryFromPrimitiveType(Class<?> type) {
		if(type == Boolean.class) {
			return BOOLEAN;
		}
		else if(type == Byte.class) {
			return BYTE;
		}
		else if(type == Character.class) {
			return CHAR;
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


	public static final JPrimitiveType fromIoType(IoType t) throws IllegalArgumentException {
		JPrimitiveType prim = tryFromIoType(t);
		if(prim == null) {
			throw new IllegalArgumentException("cannot convert " + IoType.class.getSimpleName() + " enum '" + t + "', has no " + JPrimitiveType.class.getSimpleName() + " equivalent");
		}
		return prim;
	}


	public static final JPrimitiveType tryFromIoType(IoType t) {
		switch(t) {
		case BOOLEAN:
			return BOOLEAN;
		case BYTE:
			return BYTE;
		case CHAR:
			return CHAR;
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


	public static final JPrimitiveType fromJNumericType(JNumericType t) throws IllegalArgumentException {
		JPrimitiveType prim = tryFromJNumericType(t);
		if(prim == null) {
			throw new IllegalArgumentException("cannot convert " + JNumericType.class.getSimpleName() + " enum '" + t + "', has no " + JPrimitiveType.class.getSimpleName() + " equivalent");
		}
		return prim;
	}


	public static final JPrimitiveType tryFromJNumericType(JNumericType t) {
		switch(t) {
		case BYTE:
			return BYTE;
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


	public static final JPrimitiveType fromPrimitiveOrString(PrimitiveOrString t) throws IllegalArgumentException {
		JPrimitiveType prim = tryFromPrimitiveOrString(t);
		if(prim == null) {
			throw new IllegalArgumentException("cannot convert " + PrimitiveOrString.class.getSimpleName() + " enum '" + t + "', has no " + JPrimitiveType.class.getSimpleName() + " equivalent");
		}
		return prim;
	}


	public static final JPrimitiveType tryFromPrimitiveOrString(PrimitiveOrString t) {
		switch(t) {
		case BOOLEAN:
			return BOOLEAN;
		case BYTE:
			return BYTE;
		case CHAR:
			return CHAR;
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
