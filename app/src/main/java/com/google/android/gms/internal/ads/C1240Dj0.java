package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.android.gms.internal.ads.Dj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1240Dj0 extends AbstractC1204Cj0 {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f14539a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicIntegerFieldUpdater f14540b;

    C1240Dj0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.f14539a = atomicReferenceFieldUpdater;
        this.f14540b = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1204Cj0
    final int a(AbstractC1348Gj0 abstractC1348Gj0) {
        return this.f14540b.decrementAndGet(abstractC1348Gj0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1204Cj0
    final void b(AbstractC1348Gj0 abstractC1348Gj0, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f14539a;
            if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, abstractC1348Gj0, null, set2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1348Gj0) == null);
    }
}
