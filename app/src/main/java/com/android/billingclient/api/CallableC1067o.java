package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.AbstractC5114g0;
import java.util.concurrent.Callable;

/* renamed from: com.android.billingclient.api.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class CallableC1067o implements Callable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f12467o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ E1.i f12468s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ C1054b f12469t;

    CallableC1067o(C1054b c1054b, String str, E1.i iVar) {
        this.f12467o = str;
        this.f12468s = iVar;
        this.f12469t = c1054b;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        E1.D W7 = this.f12469t.W(this.f12467o, 9);
        if (W7.b() != null) {
            this.f12468s.a(W7.a(), W7.b());
            return null;
        }
        this.f12468s.a(W7.a(), AbstractC5114g0.s());
        return null;
    }
}
