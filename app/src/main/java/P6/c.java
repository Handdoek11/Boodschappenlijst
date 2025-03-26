package P6;

import J6.AbstractC0650j;
import J6.r;

/* loaded from: classes2.dex */
public final class c extends P6.a implements f {

    /* renamed from: v, reason: collision with root package name */
    public static final a f4418v = new a(null);

    /* renamed from: w, reason: collision with root package name */
    private static final c f4419w = new c(1, 0);

    public static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public c(char c8, char c9) {
        super(c8, c9, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (e() != cVar.e() || j() != cVar.j()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (e() * 31) + j();
    }

    public boolean isEmpty() {
        return r.f(e(), j()) > 0;
    }

    public boolean o(char c8) {
        return r.f(e(), c8) <= 0 && r.f(c8, j()) <= 0;
    }

    public String toString() {
        return e() + ".." + j();
    }
}
