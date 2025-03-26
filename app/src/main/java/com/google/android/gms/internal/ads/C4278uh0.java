package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4278uh0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f27091a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f27092b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f27093c;

    C4278uh0(Object obj, Object obj2, Object obj3) {
        this.f27091a = obj;
        this.f27092b = obj2;
        this.f27093c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f27093c;
        Object obj2 = this.f27092b;
        Object obj3 = this.f27091a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
