package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.a30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2039a30 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceExecutorServiceC3522nk0 f20624a;

    public C2039a30(C1580Nc c1580Nc, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, Context context) {
        this.f20624a = interfaceExecutorServiceC3522nk0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f20624a.p0(new Callable(this) { // from class: com.google.android.gms.internal.ads.Z20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C2148b30(new JSONObject());
            }
        });
    }
}
