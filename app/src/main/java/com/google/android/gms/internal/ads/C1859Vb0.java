package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Vb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1859Vb0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4375vb0 f19629a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f19630b;

    public C1859Vb0(C4375vb0 c4375vb0, String str) {
        ArrayList arrayList = new ArrayList();
        this.f19630b = arrayList;
        this.f19629a = c4375vb0;
        arrayList.add(str);
    }

    public final C4375vb0 a() {
        return this.f19629a;
    }

    public final ArrayList b() {
        return this.f19630b;
    }

    public final void c(String str) {
        this.f19630b.add(str);
    }
}
