package twg2.primitiveIoTypes;

import lombok.Getter;

/**
 * @author TeamworkGuy2
 * @since 20151-18
 */
public enum JavaPrimitive {
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


	private JavaPrimitive(Class<?> type, Class<?> wrapperType, IoType ioType, PrimitiveOrString primitiveOrStringType, Object defaultValue, String javaPrimitiveName, String javaObjectName,
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


	public static final JavaPrimitive getByType(Class<?> type) {
		JavaPrimitive prim = tryGetByType(type);
		if(prim == null) {
			throw new IllegalArgumentException("unknown primitive type: " + type);
		}
		return prim;
	}


	public static final JavaPrimitive tryGetByType(Class<?> type) {
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


	public static final JavaPrimitive getWrapperType(Class<?> type) {
		JavaPrimitive prim = tryGetWrapperType(type);
		if(prim == null) {
			throw new IllegalArgumentException("unknown primitive wrapper type: " + type);
		}
		return prim;
	}


	public static final JavaPrimitive tryGetWrapperType(Class<?> type) {
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


	public static final JavaPrimitive getPrimitiveType(Class<?> type) {
		JavaPrimitive prim = tryGetPrimitiveType(type);
		if(prim == null) {
			throw new IllegalArgumentException("unknown primitive type: " + type);
		}
		return prim;
	}


	public static final JavaPrimitive tryGetPrimitiveType(Class<?> type) {
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


	public static final JavaPrimitive tryGetIoType(IoType t) {
		switch(t) {
		case BOOLEAN:
			return JavaPrimitive.BOOLEAN;
		case BYTE:
			return JavaPrimitive.BYTE;
		case CHAR:
			return JavaPrimitive.CHAR;
		case SHORT:
			return JavaPrimitive.SHORT;
		case INT:
			return JavaPrimitive.INT;
		case LONG:
			return JavaPrimitive.LONG;
		case FLOAT:
			return JavaPrimitive.FLOAT;
		case DOUBLE:
			return JavaPrimitive.DOUBLE;
		case BINARY:
			throw new IllegalArgumentException("cannot convert IoType enum '" + IoType.BINARY + "', has no JavaPrimitive equivalent");
		case STRING:
			throw new IllegalArgumentException("cannot convert IoType enum '" + IoType.STRING + "', has no JavaPrimitive equivalent");
		default:
			throw new IllegalArgumentException("cannot convert IoType enum '" + t + "' to JavaPrimitive enum");
		}
	}


	public static final JavaPrimitive tryGetPrimitiveOrString(PrimitiveOrString t) {
		switch(t) {
		case BOOLEAN:
			return JavaPrimitive.BOOLEAN;
		case BYTE:
			return JavaPrimitive.BYTE;
		case CHAR:
			return JavaPrimitive.CHAR;
		case SHORT:
			return JavaPrimitive.SHORT;
		case INT:
			return JavaPrimitive.INT;
		case LONG:
			return JavaPrimitive.LONG;
		case FLOAT:
			return JavaPrimitive.FLOAT;
		case DOUBLE:
			return JavaPrimitive.DOUBLE;
		case STRING:
			throw new IllegalArgumentException("cannot convert PrimitiveOrString enum '" + PrimitiveOrString.STRING + "', has no JavaPrimitive equivalent");
		default:
			throw new IllegalArgumentException("cannot convert PrimitiveOrString enum '" + t + "' to JavaPrimitive enum");
		}
	}

}
