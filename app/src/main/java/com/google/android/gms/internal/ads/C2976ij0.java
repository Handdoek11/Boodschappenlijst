package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.android.gms.internal.ads.ij0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2976ij0 extends AbstractC2541ej0 {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f23050a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f23051b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f23052c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f23053d;

    /* renamed from: e, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f23054e;

    C2976ij0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f23050a = atomicReferenceFieldUpdater;
        this.f23051b = atomicReferenceFieldUpdater2;
        this.f23052c = atomicReferenceFieldUpdater3;
        this.f23053d = atomicReferenceFieldUpdater4;
        this.f23054e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2541ej0
    final C2868hj0 a(AbstractC3738pj0 abstractC3738pj0, C2868hj0 c2868hj0) {
        return (C2868hj0) this.f23053d.getAndSet(abstractC3738pj0, c2868hj0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2541ej0
    final C3629oj0 b(AbstractC3738pj0 abstractC3738pj0, C3629oj0 c3629oj0) {
        return (C3629oj0) this.f23052c.getAndSet(abstractC3738pj0, c3629oj0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2541ej0
    final void c(C3629oj0 c3629oj0, C3629oj0 c3629oj02) {
        this.f23051b.lazySet(c3629oj0, c3629oj02);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2541ej0
    final void d(C3629oj0 c3629oj0, Thread thread) {
        this.f23050a.lazySet(c3629oj0, thread);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2541ej0
    final boolean e(AbstractC3738pj0 abstractC3738pj0, C2868hj0 c2868hj0, C2868hj0 c2868hj02) {
        return AbstractC3847qj0.a(this.f23053d, abstractC3738pj0, c2868hj0, c2868hj02);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2541ej0
    final boolean f(AbstractC3738pj0 abstractC3738pj0, Object obj, Object obj2) {
        return AbstractC3847qj0.a(this.f23054e, abstractC3738pj0, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2541ej0
    final boolean g(AbstractC3738pj0 abstractC3738pj0, C3629oj0 c3629oj0, C3629oj0 c3629oj02) {
        return AbstractC3847qj0.a(this.f23052c, abstractC3738pj0, c3629oj0, c3629oj02);
    }
}
