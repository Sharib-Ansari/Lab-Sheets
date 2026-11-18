
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class StudentIntrospection {
    public static void main(String[] args) throws Exception {
        BeanInfo info = Introspector.getBeanInfo(
                StudentBean.class, Object.class);

        System.out.println("Properties:");

        for (PropertyDescriptor p : info.getPropertyDescriptors()) {
            System.out.println(p.getName()
                    + " : " + p.getPropertyType().getSimpleName());
        }

        System.out.println("\nMethods:");

        for (Method m : StudentBean.class.getDeclaredMethods()) {
            System.out.println(m.getName());
        }
    }
}
