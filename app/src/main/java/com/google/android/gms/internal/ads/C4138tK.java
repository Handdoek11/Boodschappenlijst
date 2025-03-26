package com.google.android.gms.internal.ads;

import android.os.Bundle;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: com.google.android.gms.internal.ads.tK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4138tK implements Yj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1811Tq f26869a;

    C4138tK(C4247uK c4247uK, C1811Tq c1811Tq) {
        this.f26869a = c1811Tq;
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final void a(Throwable th) {
        H2.p.d("Failed to load media data due to video view load failure.");
        this.f26869a.d(th);
    }

    @Override // com.google.android.gms.internal.ads.Yj0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        InterfaceC4410vt interfaceC4410vt = (InterfaceC4410vt) obj;
        if (interfaceC4410vt == null) {
            this.f26869a.d(new zzegu(1, "Missing webview from video view future."));
            return;
        }
        final C1811Tq c1811Tq = this.f26869a;
        interfaceC4410vt.Z0("/video", new C3319ls(new Consumer() { // from class: com.google.android.gms.internal.ads.sK
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void p(Object obj2) {
                Bundle bundle = new Bundle();
                bundle.putString("mediaUrl", (String) obj2);
                c1811Tq.c(bundle);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }));
        interfaceC4410vt.e0();
    }
}
