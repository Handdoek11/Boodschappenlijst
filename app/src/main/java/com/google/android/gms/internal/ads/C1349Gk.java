package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;

/* renamed from: com.google.android.gms.internal.ads.Gk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1349Gk implements InterfaceC1881Vq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1665Pk f15431a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ InterfaceC2160b90 f15432b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C1700Qk f15433c;

    C1349Gk(C1700Qk c1700Qk, C1665Pk c1665Pk, InterfaceC2160b90 interfaceC2160b90) {
        this.f15431a = c1665Pk;
        this.f15432b = interfaceC2160b90;
        this.f15433c = c1700Qk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1881Vq
    public final void zza() {
        AbstractC0608p0.k("loadNewJavascriptEngine (failure): Trying to acquire lock");
        synchronized (this.f15433c.f18524a) {
            try {
                AbstractC0608p0.k("loadNewJavascriptEngine (failure): Lock acquired");
                this.f15433c.f18532i = 1;
                AbstractC0608p0.k("Failed loading new engine. Marking new engine destroyable.");
                this.f15431a.h();
                if (((Boolean) AbstractC2534eg.f21868d.e()).booleanValue()) {
                    C1700Qk c1700Qk = this.f15433c;
                    if (c1700Qk.f18528e != null) {
                        RunnableC3791q90 runnableC3791q90 = c1700Qk.f18528e;
                        InterfaceC2160b90 interfaceC2160b90 = this.f15432b;
                        interfaceC2160b90.C("Failed loading new engine");
                        interfaceC2160b90.I0(false);
                        runnableC3791q90.b(interfaceC2160b90.k());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC0608p0.k("loadNewJavascriptEngine (failure): Lock released");
    }
}
