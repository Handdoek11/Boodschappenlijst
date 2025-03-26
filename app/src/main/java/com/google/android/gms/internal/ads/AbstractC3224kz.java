package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.Spanned;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.kz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC3224kz {

    /* renamed from: a, reason: collision with root package name */
    private static final String f24232a = Integer.toString(0, 36);

    /* renamed from: b, reason: collision with root package name */
    private static final String f24233b = Integer.toString(1, 36);

    /* renamed from: c, reason: collision with root package name */
    private static final String f24234c = Integer.toString(2, 36);

    /* renamed from: d, reason: collision with root package name */
    private static final String f24235d = Integer.toString(3, 36);

    /* renamed from: e, reason: collision with root package name */
    private static final String f24236e = Integer.toString(4, 36);

    public static ArrayList a(Spanned spanned) {
        ArrayList arrayList = new ArrayList();
        for (C3356mA c3356mA : (C3356mA[]) spanned.getSpans(0, spanned.length(), C3356mA.class)) {
            arrayList.add(b(spanned, c3356mA, 1, c3356mA.a()));
        }
        for (C3576oB c3576oB : (C3576oB[]) spanned.getSpans(0, spanned.length(), C3576oB.class)) {
            arrayList.add(b(spanned, c3576oB, 2, c3576oB.a()));
        }
        for (C1540Lz c1540Lz : (C1540Lz[]) spanned.getSpans(0, spanned.length(), C1540Lz.class)) {
            arrayList.add(b(spanned, c1540Lz, 3, null));
        }
        for (PB pb : (PB[]) spanned.getSpans(0, spanned.length(), PB.class)) {
            arrayList.add(b(spanned, pb, 4, pb.a()));
        }
        return arrayList;
    }

    private static Bundle b(Spanned spanned, Object obj, int i8, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f24232a, spanned.getSpanStart(obj));
        bundle2.putInt(f24233b, spanned.getSpanEnd(obj));
        bundle2.putInt(f24234c, spanned.getSpanFlags(obj));
        bundle2.putInt(f24235d, i8);
        if (bundle != null) {
            bundle2.putBundle(f24236e, bundle);
        }
        return bundle2;
    }
}
