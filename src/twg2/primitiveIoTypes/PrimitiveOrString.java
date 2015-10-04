package twg2.primitiveIoTypes;

import lombok.Getter;

/**
 * @author TeamworkGuy2
 * @since 2015-5-22
 */
public enum PrimitiveOrString {
	BOOLEAN(IoType.BOOLEAN),
	BYTE(IoType.BYTE),
	CHAR(IoType.CHAR),
	SHORT(IoType.SHORT),
	INT(IoType.INT),
	LONG(IoType.LONG),
	FLOAT(IoType.FLOAT),
	DOUBLE(IoType.DOUBLE),
	STRING(IoType.STRING);

	final @Getter IoType ioType;

	private PrimitiveOrString(IoType ioType) {
		this.ioType = ioType;
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
