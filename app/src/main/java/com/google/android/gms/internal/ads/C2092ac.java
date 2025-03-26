package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.ac, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2092ac implements Comparator {
    C2092ac(C2309cc c2309cc) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C2635fc c2635fc = (C2635fc) obj;
        C2635fc c2635fc2 = (C2635fc) obj2;
        int i8 = c2635fc.f22074c - c2635fc2.f22074c;
        return i8 != 0 ? i8 : Long.compare(c2635fc.f22072a, c2635fc2.f22072a);
    }
}
