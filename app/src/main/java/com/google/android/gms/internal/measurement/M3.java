package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* loaded from: classes.dex */
final class M3 implements Comparator {
    M3() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        K3 k32 = (K3) obj;
        K3 k33 = (K3) obj2;
        Q3 q32 = (Q3) k32.iterator();
        Q3 q33 = (Q3) k33.iterator();
        while (q32.hasNext() && q33.hasNext()) {
            int compare = Integer.compare(K3.d(q32.zza()), K3.d(q33.zza()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(k32.s(), k33.s());
    }
}
