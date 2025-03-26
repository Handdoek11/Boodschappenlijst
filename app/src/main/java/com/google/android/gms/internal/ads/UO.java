package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class UO implements RF {

    /* renamed from: o, reason: collision with root package name */
    private final Bundle f19364o = new Bundle();

    @Override // com.google.android.gms.internal.ads.RF
    public final synchronized void C(String str) {
        this.f19364o.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final synchronized void Z(String str) {
        this.f19364o.putInt(str, 2);
    }

    public final synchronized Bundle a() {
        return new Bundle(this.f19364o);
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final synchronized void m(String str, String str2) {
        this.f19364o.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void n(String str) {
    }
}
