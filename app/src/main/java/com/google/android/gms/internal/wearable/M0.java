package com.google.android.gms.internal.wearable;

/* loaded from: classes2.dex */
final class M0 implements U0 {

    /* renamed from: a, reason: collision with root package name */
    private final I0 f30075a;

    /* renamed from: b, reason: collision with root package name */
    private final Y0 f30076b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f30077c = false;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC5241e0 f30078d;

    private M0(Y0 y02, AbstractC5241e0 abstractC5241e0, I0 i02) {
        this.f30076b = y02;
        this.f30078d = abstractC5241e0;
        this.f30075a = i02;
    }

    static M0 j(Y0 y02, AbstractC5241e0 abstractC5241e0, I0 i02) {
        return new M0(y02, abstractC5241e0, i02);
    }

    @Override // com.google.android.gms.internal.wearable.U0
    public final int a(Object obj) {
        int b8 = ((AbstractC5258m0) obj).zzc.b();
        if (!this.f30077c) {
            return b8;
        }
        androidx.appcompat.app.E.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.wearable.U0
    public final Object b() {
        I0 i02 = this.f30075a;
        return i02 instanceof AbstractC5258m0 ? ((AbstractC5258m0) i02).i() : i02.m().t();
    }

    @Override // com.google.android.gms.internal.wearable.U0
    public final int c(Object obj) {
        int hashCode = ((AbstractC5258m0) obj).zzc.hashCode();
        if (!this.f30077c) {
            return hashCode;
        }
        androidx.appcompat.app.E.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.wearable.U0
    public final void d(Object obj) {
        this.f30076b.a(obj);
        this.f30078d.a(obj);
    }

    @Override // com.google.android.gms.internal.wearable.U0
    public final void e(Object obj, Object obj2) {
        W0.u(this.f30076b, obj, obj2);
        if (this.f30077c) {
            W0.t(this.f30078d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.wearable.U0
    public final boolean f(Object obj) {
        androidx.appcompat.app.E.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.wearable.U0
    public final boolean g(Object obj, Object obj2) {
        if (!((AbstractC5258m0) obj).zzc.equals(((AbstractC5258m0) obj2).zzc)) {
            return false;
        }
        if (!this.f30077c) {
            return true;
        }
        androidx.appcompat.app.E.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.wearable.U0
    public final void h(Object obj, k1 k1Var) {
        androidx.appcompat.app.E.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.wearable.U0
    public final void i(Object obj, byte[] bArr, int i8, int i9, F f8) {
        AbstractC5258m0 abstractC5258m0 = (AbstractC5258m0) obj;
        if (abstractC5258m0.zzc == Z0.c()) {
            abstractC5258m0.zzc = Z0.f();
        }
        androidx.appcompat.app.E.a(obj);
        throw null;
    }
}
