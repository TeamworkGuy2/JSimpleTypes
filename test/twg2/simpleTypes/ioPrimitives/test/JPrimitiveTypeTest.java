package twg2.simpleTypes.ioPrimitives.test;

import org.junit.Assert;
import org.junit.Test;

import twg2.simpleTypes.ioPrimitives.IoType;
import twg2.simpleTypes.ioPrimitives.JNumericType;
import twg2.simpleTypes.ioPrimitives.JPrimitiveType;
import twg2.simpleTypes.ioPrimitives.PrimitiveOrString;

/**
 * @author TeamworkGuy2
 * @since 2016-1-10
 */
public class JPrimitiveTypeTest {

	@Test
	public void test() {
		Assert.assertEquals(null, JPrimitiveType.tryFromIoType(IoType.BINARY));
		Assert.assertEquals(JPrimitiveType.DOUBLE, JPrimitiveType.tryFromIoType(IoType.DOUBLE));

		Assert.assertEquals(JPrimitiveType.BYTE, JPrimitiveType.tryFromJNumericType(JNumericType.BYTE));

		Assert.assertEquals(null, JPrimitiveType.tryFromPrimitiveOrString(PrimitiveOrString.STRING));
		Assert.assertEquals(JPrimitiveType.FLOAT, JPrimitiveType.tryFromPrimitiveOrString(PrimitiveOrString.FLOAT));

		Assert.assertEquals(null, JPrimitiveType.tryFromType(Short.TYPE, false, false));
		Assert.assertEquals(null, JPrimitiveType.tryFromType(Short.TYPE, false, true));
		Assert.assertEquals(JPrimitiveType.SHORT, JPrimitiveType.tryFromType(Short.TYPE, true, false));
		Assert.assertEquals(JPrimitiveType.SHORT, JPrimitiveType.tryFromType(Short.TYPE, true, true));

		Assert.assertEquals(null, JPrimitiveType.tryFromType(Short.class, false, false));
		Assert.assertEquals(JPrimitiveType.SHORT, JPrimitiveType.tryFromType(Short.class, false, true));
		Assert.assertEquals(null, JPrimitiveType.tryFromType(Short.class, true, false));
		Assert.assertEquals(JPrimitiveType.SHORT, JPrimitiveType.tryFromType(Short.class, true, true));

		Assert.assertEquals(IoType.BOOLEAN, JPrimitiveType.BOOLEAN.getIoType());
		Assert.assertEquals(Boolean.TYPE, JPrimitiveType.BOOLEAN.getType());
		Assert.assertEquals(Boolean.class, JPrimitiveType.BOOLEAN.getWrapperType());
	}

}
