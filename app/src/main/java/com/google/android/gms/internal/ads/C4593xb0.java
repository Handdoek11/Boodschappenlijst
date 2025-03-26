package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.xb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4593xb0 {

    /* renamed from: b, reason: collision with root package name */
    private static final C4593xb0 f27885b = new C4593xb0();

    /* renamed from: a, reason: collision with root package name */
    private Context f27886a;

    private C4593xb0() {
    }

    public static C4593xb0 b() {
        return f27885b;
    }

    public final Context a() {
        return this.f27886a;
    }

    public final void c(Context context) {
        this.f27886a = context != null ? context.getApplicationContext() : null;
    }
}
