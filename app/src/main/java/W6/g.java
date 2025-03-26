package W6;

import J6.AbstractC0650j;
import J6.r;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final b f5872a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final c f5873b = new c();

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f5874a;

        public a(Throwable th) {
            this.f5874a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && r.a(this.f5874a, ((a) obj).f5874a);
        }

        public int hashCode() {
            Throwable th = this.f5874a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // W6.g.c
        public String toString() {
            return "Closed(" + this.f5874a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC0650j abstractC0650j) {
            this();
        }

        public final Object a(Throwable th) {
            return g.b(new a(th));
        }

        public final Object b() {
            return g.b(g.f5873b);
        }

        public final Object c(Object obj) {
            return g.b(obj);
        }

        private b() {
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public static final Throwable c(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f5874a;
        }
        return null;
    }

    public static final Object d(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static final boolean e(Object obj) {
        return obj instanceof a;
    }

    public static final boolean f(Object obj) {
        return !(obj instanceof c);
    }

    public static Object b(Object obj) {
        return obj;
    }
}
