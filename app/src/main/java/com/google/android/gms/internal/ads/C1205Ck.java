package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import G2.C0578a0;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ck, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1205Ck implements InterfaceC1662Pi {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC3194kk f14215a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C0578a0 f14216b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1700Qk f14217c;

    C1205Ck(C1700Qk c1700Qk, N9 n9, InterfaceC3194kk interfaceC3194kk, C0578a0 c0578a0) {
        this.f14215a = interfaceC3194kk;
        this.f14216b = c0578a0;
        this.f14217c = c1700Qk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        AbstractC0608p0.k("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        synchronized (this.f14217c.f18524a) {
            try {
                AbstractC0608p0.k("loadJavascriptEngine > /requestReload handler: Lock acquired");
                H2.p.f("JS Engine is requesting an update");
                if (this.f14217c.f18532i == 0) {
                    H2.p.f("Starting reload.");
                    this.f14217c.f18532i = 2;
                    this.f14217c.d(null);
                }
                this.f14215a.M0("/requestReload", (InterfaceC1662Pi) this.f14216b.a());
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0608p0.k("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
