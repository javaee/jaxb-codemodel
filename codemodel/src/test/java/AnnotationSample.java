
import com.sun.codemodel.JCodeModel;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.codemodel.writer.SingleStreamCodeWriter;

/**
 * @author Kohsuke Kawaguchi
 */
public class AnnotationSample {
    public static void main(String[] args) throws Exception {
        JCodeModel cm = new JCodeModel();
        JDefinedClass cls = cm._class("Test");
        JMethod m = cls.method(JMod.PUBLIC,cm.VOID,"foo");
        m.annotate(Deprecated.class);

        JFieldVar field = cls.field(JMod.PRIVATE,cm.DOUBLE,"y");
        field.annotate(Deprecated.class);

        cm.build(new SingleStreamCodeWriter(System.out));
    }
}
