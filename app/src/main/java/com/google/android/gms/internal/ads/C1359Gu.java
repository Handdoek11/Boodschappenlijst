package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.Gu, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1359Gu implements InterfaceC2462dy0 {

    /* renamed from: a, reason: collision with root package name */
    private final C1179Bu f15496a;

    public C1359Gu(C1179Bu c1179Bu) {
        this.f15496a = c1179Bu;
    }

    public static WeakReference b(C1179Bu c1179Bu) {
        WeakReference g8 = c1179Bu.g();
        AbstractC3332ly0.b(g8);
        return g8;
    }

    public final WeakReference a() {
        return b(this.f15496a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4203ty0
    public final /* synthetic */ Object zzb() {
        return b(this.f15496a);
    }
}
