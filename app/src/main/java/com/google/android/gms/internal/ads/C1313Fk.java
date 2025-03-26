package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;

/* renamed from: com.google.android.gms.internal.ads.Fk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1313Fk implements InterfaceC1951Xq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1665Pk f15191a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2160b90 f15192b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1700Qk f15193c;

    C1313Fk(C1700Qk c1700Qk, C1665Pk c1665Pk, InterfaceC2160b90 interfaceC2160b90) {
        this.f15191a = c1665Pk;
        this.f15192b = interfaceC2160b90;
        this.f15193c = c1700Qk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1951Xq
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        AbstractC0608p0.k("loadNewJavascriptEngine (success): Trying to acquire lock");
        synchronized (this.f15193c.f18524a) {
            try {
                AbstractC0608p0.k("loadNewJavascriptEngine (success): Lock acquired");
                this.f15193c.f18532i = 0;
                C1700Qk c1700Qk = this.f15193c;
                if (c1700Qk.f18531h != null && this.f15191a != c1700Qk.f18531h) {
                    AbstractC0608p0.k("New JS engine is loaded, marking previous one as destroyable.");
                    this.f15193c.f18531h.h();
                }
                this.f15193c.f18531h = this.f15191a;
                if (((Boolean) AbstractC2534eg.f21868d.e()).booleanValue()) {
                    C1700Qk c1700Qk2 = this.f15193c;
                    if (c1700Qk2.f18528e != null) {
                        RunnableC3791q90 runnableC3791q90 = c1700Qk2.f18528e;
                        InterfaceC2160b90 interfaceC2160b90 = this.f15192b;
                        interfaceC2160b90.I0(true);
                        runnableC3791q90.b(interfaceC2160b90.k());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0608p0.k("loadNewJavascriptEngine (success): Lock released");
    }
}
