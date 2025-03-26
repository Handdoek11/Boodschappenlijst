package N5;

import java.util.List;
import java.util.Map;
import java.util.Set;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public interface r {

    public static final class a {
        public static void a(r rVar, I6.p pVar) {
            J6.r.e(pVar, "body");
            for (Map.Entry entry : rVar.b()) {
                pVar.invoke((String) entry.getKey(), (List) entry.getValue());
            }
        }

        public static String b(r rVar, String str) {
            J6.r.e(str, "name");
            List d8 = rVar.d(str);
            if (d8 != null) {
                return (String) AbstractC6987o.D(d8);
            }
            return null;
        }
    }

    Set b();

    boolean c();

    List d(String str);

    String e(String str);

    void f(I6.p pVar);

    boolean isEmpty();

    Set names();
}
