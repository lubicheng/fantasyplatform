import ognl.Ognl;
import ognl.OgnlException;


public class OGNLUtils {

	public static Object getValue(String expr) {
		try {
			Ognl.getValue("", "");
		} catch (OgnlException e) { 
		}
		return expr;
		
	}
}
