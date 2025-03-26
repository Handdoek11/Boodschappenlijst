package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public abstract class K2 extends AbstractC5080a2 {

    /* renamed from: o, reason: collision with root package name */
    private final M2 f29780o;

    /* renamed from: s, reason: collision with root package name */
    protected M2 f29781s;

    protected K2(M2 m22) {
        this.f29780o = m22;
        if (m22.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f29781s = m22.p();
    }

    private static void k(Object obj, Object obj2) {
        C5171p3.a().b(obj.getClass()).e(obj, obj2);
    }

    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final K2 clone() {
        K2 k22 = (K2) this.f29780o.k(5, null, null);
        k22.f29781s = e();
        return k22;
    }

    public final K2 m(M2 m22) {
        if (!this.f29780o.equals(m22)) {
            if (!this.f29781s.g()) {
                s();
            }
            k(this.f29781s, m22);
        }
        return this;
    }

    public final M2 p() {
        M2 e8 = e();
        if (M2.z(e8, true)) {
            return e8;
        }
        throw new zzji(e8);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5117g3
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public M2 e() {
        if (!this.f29781s.g()) {
            return this.f29781s;
        }
        this.f29781s.v();
        return this.f29781s;
    }

    protected final void r() {
        if (this.f29781s.g()) {
            return;
        }
        s();
    }

    protected void s() {
        M2 p8 = this.f29780o.p();
        k(p8, this.f29781s);
        this.f29781s = p8;
    }
}
