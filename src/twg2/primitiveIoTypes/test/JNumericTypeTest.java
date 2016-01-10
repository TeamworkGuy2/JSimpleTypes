package twg2.primitiveIoTypes.test;

import org.junit.Assert;
import org.junit.Test;

import twg2.primitiveIoTypes.IoType;
import twg2.primitiveIoTypes.JNumericType;
import twg2.primitiveIoTypes.JPrimitiveType;
import twg2.primitiveIoTypes.PrimitiveOrString;

/**
 * @author TeamworkGuy2
 * @since 2016-1-10
 */
public class JNumericTypeTest {

	@Test
	public void test() {
		Assert.assertEquals(null, JNumericType.tryFromIoType(IoType.STRING));
		Assert.assertEquals(JNumericType.SHORT, JNumericType.tryFromIoType(IoType.SHORT));

		Assert.assertEquals(null, JNumericType.tryFromJPrimitiveType(JPrimitiveType.BOOLEAN));
		Assert.assertEquals(JNumericType.INT, JNumericType.tryFromJPrimitiveType(JPrimitiveType.INT));

		Assert.assertEquals(null, JNumericType.tryFromPrimitiveOrString(PrimitiveOrString.CHAR));
		Assert.assertEquals(JNumericType.LONG, JNumericType.tryFromPrimitiveOrString(PrimitiveOrString.LONG));

		Assert.assertEquals(null, JNumericType.tryFromType(Float.TYPE, false, false));
		Assert.assertEquals(null, JNumericType.tryFromType(Float.TYPE, false, true));
		Assert.assertEquals(JNumericType.FLOAT, JNumericType.tryFromType(Float.TYPE, true, false));
		Assert.assertEquals(JNumericType.FLOAT, JNumericType.tryFromType(Float.TYPE, true, true));

		Assert.assertEquals(null, JNumericType.tryFromType(Float.class, false, false));
		Assert.assertEquals(JNumericType.FLOAT, JNumericType.tryFromType(Float.class, false, true));
		Assert.assertEquals(null, JNumericType.tryFromType(Float.class, true, false));
		Assert.assertEquals(JNumericType.FLOAT, JNumericType.tryFromType(Float.class, true, true));
	}

}
