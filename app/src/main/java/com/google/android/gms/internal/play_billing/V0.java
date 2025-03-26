package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
final class V0 extends R0 {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f29843a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f29844b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f29845c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f29846d;

    /* renamed from: e, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f29847e;

    V0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f29843a = atomicReferenceFieldUpdater;
        this.f29844b = atomicReferenceFieldUpdater2;
        this.f29845c = atomicReferenceFieldUpdater3;
        this.f29846d = atomicReferenceFieldUpdater4;
        this.f29847e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    final U0 a(AbstractC5091c1 abstractC5091c1, U0 u02) {
        return (U0) this.f29846d.getAndSet(abstractC5091c1, u02);
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    final C5085b1 b(AbstractC5091c1 abstractC5091c1, C5085b1 c5085b1) {
        return (C5085b1) this.f29845c.getAndSet(abstractC5091c1, c5085b1);
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    final void c(C5085b1 c5085b1, C5085b1 c5085b12) {
        this.f29844b.lazySet(c5085b1, c5085b12);
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    final void d(C5085b1 c5085b1, Thread thread) {
        this.f29843a.lazySet(c5085b1, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    final boolean e(AbstractC5091c1 abstractC5091c1, U0 u02, U0 u03) {
        return AbstractC5097d1.a(this.f29846d, abstractC5091c1, u02, u03);
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    final boolean f(AbstractC5091c1 abstractC5091c1, Object obj, Object obj2) {
        return AbstractC5097d1.a(this.f29847e, abstractC5091c1, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    final boolean g(AbstractC5091c1 abstractC5091c1, C5085b1 c5085b1, C5085b1 c5085b12) {
        return AbstractC5097d1.a(this.f29845c, abstractC5091c1, c5085b1, c5085b12);
    }
}
