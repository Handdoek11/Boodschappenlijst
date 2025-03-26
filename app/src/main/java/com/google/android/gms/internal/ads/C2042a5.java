package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.a5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2042a5 {

    /* renamed from: c, reason: collision with root package name */
    private static final Comparator f20625c = new Comparator() { // from class: com.google.android.gms.internal.ads.Z4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((C2042a5) obj).f20626a.f20807b, ((C2042a5) obj2).f20626a.f20807b);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final C2151b5 f20626a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20627b;

    /* synthetic */ C2042a5(C2151b5 c2151b5, int i8, AbstractC2476e5 abstractC2476e5) {
        this.f20626a = c2151b5;
        this.f20627b = i8;
    }
}
