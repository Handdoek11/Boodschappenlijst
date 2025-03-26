package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Bk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1169Bk implements InterfaceC1662Pi {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f13846a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C1665Pk f13847b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ InterfaceC3194kk f13848c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C1700Qk f13849d;

    C1169Bk(C1700Qk c1700Qk, long j8, C1665Pk c1665Pk, InterfaceC3194kk interfaceC3194kk) {
        this.f13846a = j8;
        this.f13847b = c1665Pk;
        this.f13848c = interfaceC3194kk;
        this.f13849d = c1700Qk;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1662Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        AbstractC0608p0.k("onGmsg /jsLoaded. JsLoaded latency is " + (C2.v.c().a() - this.f13846a) + " ms.");
        AbstractC0608p0.k("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        synchronized (this.f13849d.f18524a) {
            AbstractC0608p0.k("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            if (this.f13847b.a() != -1 && this.f13847b.a() != 1) {
                this.f13849d.f18532i = 0;
                InterfaceC3194kk interfaceC3194kk = this.f13848c;
                interfaceC3194kk.H0("/log", AbstractC1627Oi.f17921g);
                interfaceC3194kk.H0("/result", AbstractC1627Oi.f17929o);
                this.f13847b.e(this.f13848c);
                this.f13849d.f18531h = this.f13847b;
                AbstractC0608p0.k("Successfully loaded JS Engine.");
                AbstractC0608p0.k("loadJavascriptEngine > /jsLoaded handler: Lock released");
                return;
            }
            AbstractC0608p0.k("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
