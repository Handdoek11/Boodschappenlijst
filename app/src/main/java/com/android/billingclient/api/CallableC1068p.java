package com.android.billingclient.api;

import E1.InterfaceC0568h;
import java.util.concurrent.Callable;

/* renamed from: com.android.billingclient.api.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class CallableC1068p implements Callable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f12470o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ InterfaceC0568h f12471s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ C1054b f12472t;

    CallableC1068p(C1054b c1054b, String str, InterfaceC0568h interfaceC0568h) {
        this.f12470o = str;
        this.f12471s = interfaceC0568h;
        this.f12472t = c1054b;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C1072u p02 = this.f12472t.p0(this.f12470o);
        this.f12471s.a(p02.a(), p02.b());
        return null;
    }
}
