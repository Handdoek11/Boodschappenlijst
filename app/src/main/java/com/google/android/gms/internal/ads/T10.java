package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class T10 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final C1950Xp f19051a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f19052b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f19053c;

    public T10(C1950Xp c1950Xp, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, Context context) {
        this.f19051a = c1950Xp;
        this.f19052b = interfaceExecutorServiceC3522nk0;
        this.f19053c = context;
    }

    final /* synthetic */ U10 a() {
        if (!this.f19051a.p(this.f19053c)) {
            return new U10(null, null, null, null, null);
        }
        String d8 = this.f19051a.d(this.f19053c);
        String str = d8 == null ? "" : d8;
        String b8 = this.f19051a.b(this.f19053c);
        String str2 = b8 == null ? "" : b8;
        String a8 = this.f19051a.a(this.f19053c);
        String str3 = a8 == null ? "" : a8;
        String str4 = true != this.f19051a.p(this.f19053c) ? null : "fa";
        return new U10(str, str2, str3, str4 == null ? "" : str4, "TIME_OUT".equals(str2) ? (Long) D2.A.c().a(AbstractC3184kf.f24010t0) : null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 34;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f19052b.p0(new Callable() { // from class: com.google.android.gms.internal.ads.S10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f18734o.a();
            }
        });
    }
}
