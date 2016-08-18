package twg2.simpleTypes.ioPrimitives.test;

import org.junit.Assert;
import org.junit.Test;

import twg2.simpleTypes.ioPrimitives.IoType;
import twg2.simpleTypes.ioPrimitives.PrimitiveOrString;

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
