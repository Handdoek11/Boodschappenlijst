package com.google.android.gms.internal.ads;

import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Ej0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1276Ej0 extends AbstractC1204Cj0 {
    /* synthetic */ C1276Ej0(AbstractC1312Fj0 abstractC1312Fj0) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1204Cj0
    final int a(AbstractC1348Gj0 abstractC1348Gj0) {
        int i8;
        synchronized (abstractC1348Gj0) {
            i8 = abstractC1348Gj0.f15430z - 1;
            abstractC1348Gj0.f15430z = i8;
        }
        return i8;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1204Cj0
    final void b(AbstractC1348Gj0 abstractC1348Gj0, Set set, Set set2) {
        synchronized (abstractC1348Gj0) {
            try {
                if (abstractC1348Gj0.f15429y == null) {
                    abstractC1348Gj0.f15429y = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
