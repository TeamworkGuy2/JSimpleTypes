package twg2.simpleTypes.ioPrimitives;

import lombok.Getter;

/**
 * @author TeamworkGuy2
 * @since 2015-5-22
 */
public enum PrimitiveOrString {
	BOOLEAN(IoType.BOOLEAN, Boolean.TYPE),
	BYTE(IoType.BYTE, Byte.TYPE),
	CHAR(IoType.CHAR, Character.TYPE),
	SHORT(IoType.SHORT, Short.TYPE),
	INT(IoType.INT, Integer.TYPE),
	LONG(IoType.LONG, Long.TYPE),
	FLOAT(IoType.FLOAT, Float.TYPE),
	DOUBLE(IoType.DOUBLE, Double.TYPE),
	STRING(IoType.STRING, String.class);

	final @Getter IoType ioType;
	final @Getter Class<?> type;


	private PrimitiveOrString(IoType ioType, Class<?> type) {
		this.ioType = ioType;
		this.type = type;
	}


	public static PrimitiveOrString fromIoType(IoType t) {
		PrimitiveOrString resType = tryFromIoType(t);
		if(resType == null) {
			throw new IllegalArgumentException("cannot convert " + IoType.class.getSimpleName() + " enum ''" + t + "', has no " + PrimitiveOrString.class.getSimpleName() + " equivalent");
		}
		return resType;
	}


	public static PrimitiveOrString tryFromIoType(IoType t) {
		switch(t) {
		case BOOLEAN:
			return PrimitiveOrString.BOOLEAN;
		case BYTE:
			return PrimitiveOrString.BYTE;
		case CHAR:
			return PrimitiveOrString.CHAR;
		case DOUBLE:
			return PrimitiveOrString.DOUBLE;
		case FLOAT:
			return PrimitiveOrString.FLOAT;
		case INT:
			return PrimitiveOrString.INT;
		case LONG:
			return PrimitiveOrString.LONG;
		case SHORT:
			return PrimitiveOrString.SHORT;
		case STRING:
			return PrimitiveOrString.STRING;
		case BINARY:
			return null;
		default:
			return null;
		}
	}

}
