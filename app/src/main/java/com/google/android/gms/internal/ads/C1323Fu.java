package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Fu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1323Fu implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final C1179Bu f15218a;

    public C1323Fu(C1179Bu c1179Bu) {
        this.f15218a = c1179Bu;
    }

    public static Context b(C1179Bu c1179Bu) {
        Context b8 = c1179Bu.b();
        AbstractC3332ly0.b(b8);
        return b8;
    }

    public final Context a() {
        return b(this.f15218a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* synthetic */ Object zzb() {
        return b(this.f15218a);
    }
}
