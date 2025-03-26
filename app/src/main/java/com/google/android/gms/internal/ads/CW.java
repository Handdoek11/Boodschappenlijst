package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public final class CW implements C2.g {

    /* renamed from: a, reason: collision with root package name */
    private C2.g f14183a;

    @Override // C2.g
    public final synchronized void a() {
        C2.g gVar = this.f14183a;
        if (gVar != null) {
            gVar.a();
        }
    }

    @Override // C2.g
    public final synchronized void b(View view) {
        C2.g gVar = this.f14183a;
        if (gVar != null) {
            gVar.b(view);
        }
    }

    public final synchronized void c(C2.g gVar) {
        this.f14183a = gVar;
    }

    @Override // C2.g
    public final synchronized void zzb() {
        C2.g gVar = this.f14183a;
        if (gVar != null) {
            gVar.zzb();
        }
    }
}
