package D2;

import w2.AbstractC6879e;

/* loaded from: classes.dex */
public final class S1 extends J {

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC6879e f1159o;

    /* renamed from: s, reason: collision with root package name */
    private final Object f1160s;

    public S1(AbstractC6879e abstractC6879e, Object obj) {
        this.f1159o = abstractC6879e;
        this.f1160s = obj;
    }

    @Override // D2.K
    public final void a() {
        Object obj;
        AbstractC6879e abstractC6879e = this.f1159o;
        if (abstractC6879e == null || (obj = this.f1160s) == null) {
            return;
        }
        abstractC6879e.b(obj);
    }

    @Override // D2.K
    public final void h0(W0 w02) {
        AbstractC6879e abstractC6879e = this.f1159o;
        if (abstractC6879e != null) {
            abstractC6879e.a(w02.B0());
        }
    }
}
