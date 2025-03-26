package L0;

import J6.r;
import java.util.Map;
import y6.AbstractC6971J;

/* loaded from: classes.dex */
public abstract class d {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f3685a;

        public a(String str) {
            r.e(str, "name");
            this.f3685a = str;
        }

        public final String a() {
            return this.f3685a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return r.a(this.f3685a, ((a) obj).f3685a);
            }
            return false;
        }

        public int hashCode() {
            return this.f3685a.hashCode();
        }

        public String toString() {
            return this.f3685a;
        }
    }

    public static final class b {
    }

    public abstract Map a();

    public abstract Object b(a aVar);

    public final L0.a c() {
        return new L0.a(AbstractC6971J.o(a()), false);
    }

    public final d d() {
        return new L0.a(AbstractC6971J.o(a()), true);
    }
}
