package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.ic, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2962ic implements Comparator {
    public C2962ic(C3069jc c3069jc) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C1963Yb c1963Yb = (C1963Yb) obj;
        C1963Yb c1963Yb2 = (C1963Yb) obj2;
        if (c1963Yb.d() < c1963Yb2.d()) {
            return -1;
        }
        if (c1963Yb.d() <= c1963Yb2.d()) {
            if (c1963Yb.b() < c1963Yb2.b()) {
                return -1;
            }
            if (c1963Yb.b() <= c1963Yb2.b()) {
                float a8 = (c1963Yb.a() - c1963Yb.d()) * (c1963Yb.c() - c1963Yb.b());
                float a9 = (c1963Yb2.a() - c1963Yb2.d()) * (c1963Yb2.c() - c1963Yb2.b());
                if (a8 > a9) {
                    return -1;
                }
                if (a8 >= a9) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
