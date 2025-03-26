package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.yG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4676yG0 extends AbstractC4131tG0 {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f28060e = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Object f28061c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f28062d;

    private C4676yG0(AbstractC1981Yl abstractC1981Yl, Object obj, Object obj2) {
        super(abstractC1981Yl);
        this.f28061c = obj;
        this.f28062d = obj2;
    }

    public static C4676yG0 q(E7 e72) {
        return new C4676yG0(new AG0(e72), C4721yl.f28182o, f28060e);
    }

    public static C4676yG0 r(AbstractC1981Yl abstractC1981Yl, Object obj, Object obj2) {
        return new C4676yG0(abstractC1981Yl, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4131tG0, com.google.android.gms.internal.ads.AbstractC1981Yl
    public final int a(Object obj) {
        Object obj2;
        if (f28060e.equals(obj) && (obj2 = this.f28062d) != null) {
            obj = obj2;
        }
        return this.f26863b.a(obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4131tG0, com.google.android.gms.internal.ads.AbstractC1981Yl
    public final C1945Xk d(int i8, C1945Xk c1945Xk, boolean z7) {
        this.f26863b.d(i8, c1945Xk, z7);
        if (Objects.equals(c1945Xk.f20117b, this.f28062d) && z7) {
            c1945Xk.f20117b = f28060e;
        }
        return c1945Xk;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4131tG0, com.google.android.gms.internal.ads.AbstractC1981Yl
    public final C4721yl e(int i8, C4721yl c4721yl, long j8) {
        this.f26863b.e(i8, c4721yl, j8);
        if (Objects.equals(c4721yl.f28184a, this.f28061c)) {
            c4721yl.f28184a = C4721yl.f28182o;
        }
        return c4721yl;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4131tG0, com.google.android.gms.internal.ads.AbstractC1981Yl
    public final Object f(int i8) {
        Object f8 = this.f26863b.f(i8);
        return Objects.equals(f8, this.f28062d) ? f28060e : f8;
    }

    public final C4676yG0 p(AbstractC1981Yl abstractC1981Yl) {
        return new C4676yG0(abstractC1981Yl, this.f28061c, this.f28062d);
    }
}
