package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class KH0 extends AbstractC3478nG0 {

    /* renamed from: k, reason: collision with root package name */
    protected final IG0 f16570k;

    protected KH0(IG0 ig0) {
        this.f16570k = ig0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3478nG0
    protected final /* bridge */ /* synthetic */ int A(Object obj, int i8) {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3478nG0
    protected final /* synthetic */ long B(Object obj, long j8, GG0 gg0) {
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3478nG0
    protected final /* synthetic */ GG0 C(Object obj, GG0 gg0) {
        return D(gg0);
    }

    protected abstract GG0 D(GG0 gg0);

    protected abstract void E(AbstractC1981Yl abstractC1981Yl);

    protected abstract void F();

    @Override // com.google.android.gms.internal.ads.IG0
    public final E7 G() {
        return this.f16570k.G();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2608fG0, com.google.android.gms.internal.ads.IG0
    public final AbstractC1981Yl J() {
        this.f16570k.J();
        return null;
    }

    @Override // com.google.android.gms.internal.ads.IG0
    public abstract void b(EG0 eg0);

    @Override // com.google.android.gms.internal.ads.AbstractC3478nG0, com.google.android.gms.internal.ads.AbstractC2608fG0
    protected final void t(Wu0 wu0) {
        super.t(wu0);
        F();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2608fG0, com.google.android.gms.internal.ads.IG0
    public final boolean u() {
        this.f16570k.u();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3478nG0
    protected final /* synthetic */ void y(Object obj, IG0 ig0, AbstractC1981Yl abstractC1981Yl) {
        E(abstractC1981Yl);
    }
}
