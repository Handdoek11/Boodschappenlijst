package l7;

import J6.H;
import m7.K;
import s.AbstractC6719b;

/* loaded from: classes2.dex */
public final class o extends v {

    /* renamed from: t, reason: collision with root package name */
    private final boolean f38865t;

    /* renamed from: u, reason: collision with root package name */
    private final String f38866u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Object obj, boolean z7) {
        super(null);
        J6.r.e(obj, "body");
        this.f38865t = z7;
        this.f38866u = obj.toString();
    }

    @Override // l7.v
    public String b() {
        return this.f38866u;
    }

    public boolean d() {
        return this.f38865t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !J6.r.a(H.b(o.class), H.b(obj.getClass()))) {
            return false;
        }
        o oVar = (o) obj;
        return d() == oVar.d() && J6.r.a(b(), oVar.b());
    }

    public int hashCode() {
        return (AbstractC6719b.a(d()) * 31) + b().hashCode();
    }

    @Override // l7.v
    public String toString() {
        if (!d()) {
            return b();
        }
        StringBuilder sb = new StringBuilder();
        K.c(sb, b());
        String sb2 = sb.toString();
        J6.r.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
