package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class R20 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f18589a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18590b;

    public R20(C4077sq c4077sq, Executor executor, String str, PackageInfo packageInfo, int i8) {
        this.f18589a = executor;
        this.f18590b = str;
    }

    final /* synthetic */ com.google.common.util.concurrent.d a(Throwable th) {
        return AbstractC2326ck0.h(new S20(this.f18590b));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return AbstractC2326ck0.f(AbstractC2326ck0.m(AbstractC2326ck0.h(this.f18590b), new InterfaceC1376Hf0() { // from class: com.google.android.gms.internal.ads.P20
            @Override // com.google.android.gms.internal.ads.InterfaceC1376Hf0
            public final Object apply(Object obj) {
                return new S20((String) obj);
            }
        }, this.f18589a), Throwable.class, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.Q20
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f18357a.a((Throwable) obj);
            }
        }, this.f18589a);
    }
}
