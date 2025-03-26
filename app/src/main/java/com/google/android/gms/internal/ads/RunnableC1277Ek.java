package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.Ek, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC1277Ek implements Runnable {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ C1665Pk f14764o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ InterfaceC3194kk f14765s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ ArrayList f14766t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ long f14767u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ C1700Qk f14768v;

    RunnableC1277Ek(C1700Qk c1700Qk, C1665Pk c1665Pk, InterfaceC3194kk interfaceC3194kk, ArrayList arrayList, long j8) {
        this.f14764o = c1665Pk;
        this.f14765s = interfaceC3194kk;
        this.f14766t = arrayList;
        this.f14767u = j8;
        this.f14768v = c1700Qk;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        AbstractC0608p0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        synchronized (this.f14768v.f18524a) {
            try {
                AbstractC0608p0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                if (this.f14764o.a() != -1 && this.f14764o.a() != 1) {
                    if (((Boolean) D2.A.c().a(AbstractC3184kf.B7)).booleanValue()) {
                        this.f14764o.d(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                    } else {
                        this.f14764o.c();
                    }
                    InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0 = AbstractC1497Kq.f16649f;
                    final InterfaceC3194kk interfaceC3194kk = this.f14765s;
                    Objects.requireNonNull(interfaceC3194kk);
                    interfaceExecutorServiceC3522nk0.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Dk
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC3194kk.a();
                        }
                    });
                    String valueOf = String.valueOf(D2.A.c().a(AbstractC3184kf.f23856c));
                    int a8 = this.f14764o.a();
                    int i8 = this.f14768v.f18532i;
                    if (this.f14766t.isEmpty()) {
                        str = ". Still waiting for the engine to be loaded";
                    } else {
                        str = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is " + String.valueOf(this.f14766t.get(0));
                    }
                    AbstractC0608p0.k("Could not finish the full JS engine loading in " + valueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + a8 + ". Update status(fullLoadTimeout) is " + i8 + str + " ms. Total latency(fullLoadTimeout) is " + (C2.v.c().a() - this.f14767u) + " ms at timeout. Rejecting.");
                    AbstractC0608p0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                AbstractC0608p0.k("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
