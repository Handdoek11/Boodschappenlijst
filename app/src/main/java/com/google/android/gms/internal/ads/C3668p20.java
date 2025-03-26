package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.p20, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3668p20 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25321a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f25322b;

    C3668p20(Context context, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0) {
        this.f25321a = context;
        this.f25322b = interfaceExecutorServiceC3522nk0;
    }

    final /* synthetic */ C3777q20 a() {
        Context context = this.f25321a;
        return new C3777q20(AbstractC1829Ue.b(context), AbstractC1829Ue.a(context));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 59;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return ((Boolean) AbstractC2426dg.f21627b.e()).booleanValue() ? this.f25322b.p0(new Callable() { // from class: com.google.android.gms.internal.ads.o20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f25086o.a();
            }
        }) : AbstractC2326ck0.h(new C3777q20(-1, -1));
    }
}
