package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.h6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2805h6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f22475a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22476b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22477c;

    /* renamed from: d, reason: collision with root package name */
    public final List f22478d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f22479e;

    public C2805h6(int i8, String str, int i9, List list, byte[] bArr) {
        this.f22475a = i8;
        this.f22476b = str;
        this.f22477c = i9;
        this.f22478d = list == null ? Collections.emptyList() : DesugarCollections.unmodifiableList(list);
        this.f22479e = bArr;
    }

    public final int a() {
        int i8 = this.f22477c;
        if (i8 != 2) {
            return i8 != 3 ? 0 : 512;
        }
        return 2048;
    }
}
