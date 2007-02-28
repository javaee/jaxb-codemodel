import com.sun.codemodel.JCodeModel;
import junit.framework.TestCase;

/**
 * @author Kohsuke Kawaguchi
 */
public class JCodeModelTest extends TestCase {
    public void testParseArray() throws Exception {
        JCodeModel cm = new JCodeModel();
        cm.parseType("java.util.ArrayList<java.lang.String[]>[]");
    }

}
