package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import v3.C6835a;

/* loaded from: classes2.dex */
final class e implements C6835a.InterfaceC0339a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ f f32717a;

    public e(f fVar) {
        this.f32717a = fVar;
    }

    @Override // w3.t
    public final void a(String str, String str2, Bundle bundle, long j8) {
        if (str == null || !a.f(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j8);
        bundle2.putBundle("params", bundle);
        this.f32717a.f32718a.a(3, bundle2);
    }
}
