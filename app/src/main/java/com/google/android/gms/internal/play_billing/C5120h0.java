package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5120h0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f29910a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f29911b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f29912c;

    C5120h0(Object obj, Object obj2, Object obj3) {
        this.f29910a = obj;
        this.f29911b = obj2;
        this.f29912c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f29912c;
        Object obj2 = this.f29911b;
        Object obj3 = this.f29910a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
