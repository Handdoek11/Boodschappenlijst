package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.iQ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2948iQ implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4203ty0 f22972a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4203ty0 f22973b;

    public C2948iQ(InterfaceC4203ty0 interfaceC4203ty0, InterfaceC4203ty0 interfaceC4203ty02) {
        this.f22972a = interfaceC4203ty0;
        this.f22973b = interfaceC4203ty02;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* synthetic */ Object zzb() {
        S80 s80 = (S80) this.f22972a.zzb();
        final CookieManager a8 = C2.v.u().a((Context) this.f22973b.zzb());
        I80 i8 = B80.a(new Callable() { // from class: com.google.android.gms.internal.ads.dQ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CookieManager cookieManager = a8;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) D2.A.c().a(AbstractC3184kf.f23823Y0));
            }
        }, M80.WEBVIEW_COOKIE, s80).i(1L, TimeUnit.SECONDS);
        final InterfaceC4333v80 interfaceC4333v80 = new InterfaceC4333v80() { // from class: com.google.android.gms.internal.ads.eQ
            @Override // com.google.android.gms.internal.ads.InterfaceC4333v80
            public final Object a(Object obj) {
                return "";
            }
        };
        return i8.c(Exception.class, new InterfaceC1420Ij0(interfaceC4333v80) { // from class: com.google.android.gms.internal.ads.C80
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return AbstractC2326ck0.h("");
            }
        }).a();
    }
}
