package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.mJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3375mJ0 implements InterfaceExecutorC3484nJ0 {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Executor f24491o;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ WE f24492s;

    C3375mJ0(Executor executor, WE we) {
        this.f24491o = executor;
        this.f24492s = we;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f24491o.execute(runnable);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceExecutorC3484nJ0
    public final void zza() {
        this.f24492s.a(this.f24491o);
    }
}
