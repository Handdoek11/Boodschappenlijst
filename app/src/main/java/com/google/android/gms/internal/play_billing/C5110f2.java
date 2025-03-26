package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.f2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5110f2 {

    /* renamed from: b, reason: collision with root package name */
    static final C5110f2 f29901b;

    /* renamed from: c, reason: collision with root package name */
    static final C5110f2 f29902c;

    /* renamed from: a, reason: collision with root package name */
    final Throwable f29903a;

    static {
        if (P4.f29798u) {
            f29902c = null;
            f29901b = null;
        } else {
            f29902c = new C5110f2(false, null);
            f29901b = new C5110f2(true, null);
        }
    }

    C5110f2(boolean z7, Throwable th) {
        this.f29903a = th;
    }
}
