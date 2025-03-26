package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.a;

/* renamed from: com.google.android.gms.internal.ads.uT, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4256uT {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27060a;

    C4256uT(Context context) {
        this.f27060a = context;
    }

    public final com.google.common.util.concurrent.d a(boolean z7) {
        try {
            androidx.privacysandbox.ads.adservices.topics.a a8 = new a.C0178a().b("com.google.android.gms.ads").c(z7).a();
            Y0.a a9 = Y0.a.a(this.f27060a);
            return a9 != null ? a9.b(a8) : AbstractC2326ck0.g(new IllegalStateException());
        } catch (Exception e8) {
            return AbstractC2326ck0.g(e8);
        }
    }
}
