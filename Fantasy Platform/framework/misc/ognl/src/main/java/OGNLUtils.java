import org.apache.commons.collections.map.LRUMap;

import ognl.Ognl;
import ognl.OgnlException;

public class OGNLUtils {

	private static LRUMap cache = new LRUMap();

	public static Object getValue(String expr, Object root)
			throws OgnlException {

		Object exprObject = cache.get("expr");

		if (exprObject == null) {

			exprObject = Ognl.parseExpression(expr);
			
			cache.put(expr, exprObject);
		}

		return Ognl.getValue(exprObject, root); 

	}
}
