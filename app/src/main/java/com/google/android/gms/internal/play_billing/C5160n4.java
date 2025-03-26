package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.android.gms.internal.play_billing.n4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5160n4 extends F1 {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f29952a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f29953b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f29954c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f29955d;

    /* renamed from: e, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f29956e;

    C5160n4(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f29952a = atomicReferenceFieldUpdater;
        this.f29953b = atomicReferenceFieldUpdater2;
        this.f29954c = atomicReferenceFieldUpdater3;
        this.f29955d = atomicReferenceFieldUpdater4;
        this.f29956e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    final void a(N4 n42, N4 n43) {
        this.f29953b.lazySet(n42, n43);
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    final void b(N4 n42, Thread thread) {
        this.f29952a.lazySet(n42, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    final boolean c(P4 p42, C5206v3 c5206v3, C5206v3 c5206v32) {
        return M3.a(this.f29955d, p42, c5206v3, c5206v32);
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    final boolean d(P4 p42, Object obj, Object obj2) {
        return M3.a(this.f29956e, p42, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.F1
    final boolean e(P4 p42, N4 n42, N4 n43) {
        return M3.a(this.f29954c, p42, n42, n43);
    }
}
