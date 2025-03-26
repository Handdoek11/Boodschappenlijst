package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import v3.C6835a;

/* loaded from: classes2.dex */
final class c implements C6835a.InterfaceC0339a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ d f32712a;

    public c(d dVar) {
        this.f32712a = dVar;
    }

    @Override // w3.t
    public final void a(String str, String str2, Bundle bundle, long j8) {
        if (this.f32712a.f32713a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", a.a(str2));
            this.f32712a.f32714b.a(2, bundle2);
        }
    }
}
