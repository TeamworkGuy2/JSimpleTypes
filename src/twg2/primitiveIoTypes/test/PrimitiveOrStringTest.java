package twg2.primitiveIoTypes.test;

import org.junit.Assert;
import org.junit.Test;

import twg2.primitiveIoTypes.IoType;
import twg2.primitiveIoTypes.PrimitiveOrString;

/**
 * @author TeamworkGuy2
 * @since 2016-1-10
 */
public class PrimitiveOrStringTest {

	@Test
	public void test() {
		Assert.assertEquals(null, PrimitiveOrString.tryFromIoType(IoType.BINARY));
		Assert.assertEquals(PrimitiveOrString.CHAR, PrimitiveOrString.tryFromIoType(IoType.CHAR));
		Assert.assertEquals(PrimitiveOrString.STRING, PrimitiveOrString.tryFromIoType(IoType.STRING));

		Assert.assertEquals(IoType.BYTE, PrimitiveOrString.BYTE.getIoType());
	}

}
