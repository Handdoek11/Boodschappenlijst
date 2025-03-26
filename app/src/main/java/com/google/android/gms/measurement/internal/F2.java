package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.InterfaceC4888d0;
import com.google.android.gms.internal.measurement.N6;
import e3.C5745b;

/* loaded from: classes2.dex */
final class F2 implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    private final /* synthetic */ InterfaceC4888d0 f30339o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ ServiceConnection f30340s;

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ G2 f30341t;

    F2(G2 g22, InterfaceC4888d0 interfaceC4888d0, ServiceConnection serviceConnection) {
        this.f30339o = interfaceC4888d0;
        this.f30340s = serviceConnection;
        this.f30341t = g22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        G2 g22 = this.f30341t;
        E2 e22 = g22.f30488b;
        String str = g22.f30487a;
        InterfaceC4888d0 interfaceC4888d0 = this.f30339o;
        ServiceConnection serviceConnection = this.f30340s;
        Bundle a8 = e22.a(str, interfaceC4888d0);
        e22.f30336a.j().l();
        e22.f30336a.O();
        if (a8 != null) {
            long j8 = a8.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j8 == 0) {
                e22.f30336a.h().J().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = a8.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    e22.f30336a.h().E().a("No referrer defined in Install Referrer response");
                } else {
                    e22.f30336a.h().I().b("InstallReferrer API result", string);
                    boolean z7 = N6.a() && e22.f30336a.x().r(G.f30413V0);
                    Bundle A7 = e22.f30336a.J().A(Uri.parse("?" + string), z7);
                    if (A7 == null) {
                        e22.f30336a.h().E().a("No campaign params defined in Install Referrer result");
                    } else {
                        if (!z7) {
                            String string2 = A7.getString("medium");
                            if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                                long j9 = a8.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                                if (j9 == 0) {
                                    e22.f30336a.h().E().a("Install Referrer is missing click timestamp for ad campaign");
                                } else {
                                    A7.putLong("click_timestamp", j9);
                                }
                            }
                        } else if (A7.containsKey("gclid") || A7.containsKey("gbraid")) {
                            long j10 = a8.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                            if (j10 > 0) {
                                A7.putLong("click_timestamp", j10);
                            }
                        }
                        if (j8 == e22.f30336a.D().f31289h.a()) {
                            e22.f30336a.h().I().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (e22.f30336a.n()) {
                            e22.f30336a.D().f31289h.b(j8);
                            e22.f30336a.h().I().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            A7.putString("_cis", "referrer API v2");
                            e22.f30336a.F().e0("auto", "_cmp", A7, str);
                        }
                    }
                }
            }
        }
        if (serviceConnection != null) {
            C5745b.b().c(e22.f30336a.zza(), serviceConnection);
        }
    }
}
