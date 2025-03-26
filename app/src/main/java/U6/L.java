package U6;

import A6.g;
import J6.AbstractC0650j;

/* loaded from: classes2.dex */
public final class L extends A6.a {

    /* renamed from: t, reason: collision with root package name */
    public static final a f5408t = new a(null);

    /* renamed from: s, reason: collision with root package name */
    private final String f5409s;

    public static final class a implements g.c {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    public L(String str) {
        super(f5408t);
        this.f5409s = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof L) && J6.r.a(this.f5409s, ((L) obj).f5409s);
    }

    public int hashCode() {
        return this.f5409s.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f5409s + ')';
    }
}
