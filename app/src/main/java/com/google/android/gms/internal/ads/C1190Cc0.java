package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.Cc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1190Cc0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14205a;

    /* renamed from: b, reason: collision with root package name */
    private final Looper f14206b;

    public C1190Cc0(Context context, Looper looper) {
        this.f14205a = context;
        this.f14206b = looper;
    }

    public final void a(String str) {
        C1686Qc0 b02 = C1791Tc0.b0();
        b02.C(this.f14205a.getPackageName());
        b02.E(2);
        C1581Nc0 b03 = C1651Pc0.b0();
        b03.C(str);
        b03.D(2);
        b02.D(b03);
        new C1226Dc0(this.f14205a, this.f14206b, (C1791Tc0) b02.x()).a();
    }
}
