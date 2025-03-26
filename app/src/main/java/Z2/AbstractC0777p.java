package Z2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: Z2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0777p {

    /* renamed from: Z2.p$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f6391a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f6392b;

        /* synthetic */ a(Object obj, b0 b0Var) {
            r.l(obj);
            this.f6392b = obj;
            this.f6391a = new ArrayList();
        }

        public a a(String str, Object obj) {
            r.l(str);
            this.f6391a.add(str + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f6392b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f6391a.size();
            for (int i8 = 0; i8 < size; i8++) {
                sb.append((String) this.f6391a.get(i8));
                if (i8 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, null);
    }
}
