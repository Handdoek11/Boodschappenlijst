package com.google.android.gms.internal.ads;

import G2.InterfaceC0611r0;
import android.content.pm.PackageInfo;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.i10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2905i10 implements InterfaceC3014j20 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f22902a;

    /* renamed from: b, reason: collision with root package name */
    private final L60 f22903b;

    /* renamed from: c, reason: collision with root package name */
    private final PackageInfo f22904c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC0611r0 f22905d;

    public C2905i10(InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, L60 l60, PackageInfo packageInfo, InterfaceC0611r0 interfaceC0611r0) {
        this.f22902a = interfaceExecutorServiceC3522nk0;
        this.f22903b = l60;
        this.f22904c = packageInfo;
        this.f22905d = interfaceC0611r0;
    }

    public static /* synthetic */ C3012j10 a(C2905i10 c2905i10) {
        return new C3012j10(c2905i10.f22903b, c2905i10.f22904c, c2905i10.f22905d);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final int zza() {
        return 26;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3014j20
    public final com.google.common.util.concurrent.d zzb() {
        return this.f22902a.p0(new Callable() { // from class: com.google.android.gms.internal.ads.h10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C2905i10.a(this.f22468o);
            }
        });
    }
}
