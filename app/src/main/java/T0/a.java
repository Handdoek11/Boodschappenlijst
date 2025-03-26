package T0;

import J6.r;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map f5161a = new LinkedHashMap();

    /* renamed from: T0.a$a, reason: collision with other inner class name */
    public static final class C0103a extends a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0103a f5162b = new C0103a();

        private C0103a() {
        }

        @Override // T0.a
        public Object a(b bVar) {
            r.e(bVar, "key");
            return null;
        }
    }

    public interface b {
    }

    public abstract Object a(b bVar);

    public final Map b() {
        return this.f5161a;
    }
}
