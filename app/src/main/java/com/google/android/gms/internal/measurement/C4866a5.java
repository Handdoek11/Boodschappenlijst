package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.a5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4866a5 implements InterfaceC4964l5 {

    /* renamed from: a, reason: collision with root package name */
    private final W4 f29214a;

    /* renamed from: b, reason: collision with root package name */
    private final A5 f29215b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f29216c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC4919g4 f29217d;

    private C4866a5(A5 a52, AbstractC4919g4 abstractC4919g4, W4 w42) {
        this.f29215b = a52;
        this.f29216c = abstractC4919g4.d(w42);
        this.f29217d = abstractC4919g4;
        this.f29214a = w42;
    }

    static C4866a5 i(A5 a52, AbstractC4919g4 abstractC4919g4, W4 w42) {
        return new C4866a5(a52, abstractC4919g4, w42);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4964l5
    public final int a(Object obj) {
        A5 a52 = this.f29215b;
        int e8 = a52.e(a52.k(obj));
        return this.f29216c ? e8 + this.f29217d.b(obj).a() : e8;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4964l5
    public final boolean b(Object obj) {
        return this.f29217d.b(obj).n();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4964l5
    public final int c(Object obj) {
        int hashCode = this.f29215b.k(obj).hashCode();
        return this.f29216c ? (hashCode * 53) + this.f29217d.b(obj).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4964l5
    public final void d(Object obj, S5 s52) {
        Iterator l8 = this.f29217d.b(obj).l();
        if (l8.hasNext()) {
            androidx.appcompat.app.E.a(((Map.Entry) l8.next()).getKey());
            throw null;
        }
        A5 a52 = this.f29215b;
        a52.d(a52.k(obj), s52);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4964l5
    public final void e(Object obj) {
        this.f29215b.l(obj);
        this.f29217d.f(obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4964l5
    public final void f(Object obj, Object obj2) {
        AbstractC4980n5.n(this.f29215b, obj, obj2);
        if (this.f29216c) {
            AbstractC4980n5.l(this.f29217d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4964l5
    public final void g(Object obj, byte[] bArr, int i8, int i9, J3 j32) {
        AbstractC5010r4 abstractC5010r4 = (AbstractC5010r4) obj;
        if (abstractC5010r4.zzb == C5075z5.k()) {
            abstractC5010r4.zzb = C5075z5.l();
        }
        androidx.appcompat.app.E.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4964l5
    public final boolean h(Object obj, Object obj2) {
        if (!this.f29215b.k(obj).equals(this.f29215b.k(obj2))) {
            return false;
        }
        if (this.f29216c) {
            return this.f29217d.b(obj).equals(this.f29217d.b(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4964l5
    public final Object zza() {
        W4 w42 = this.f29214a;
        return w42 instanceof AbstractC5010r4 ? ((AbstractC5010r4) w42).z() : w42.f().n();
    }
}
