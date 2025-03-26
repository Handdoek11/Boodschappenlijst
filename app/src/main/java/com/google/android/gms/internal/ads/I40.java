package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class I40 implements U70 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2369d50 f15857a;

    /* renamed from: b, reason: collision with root package name */
    public final C2586f50 f15858b;

    /* renamed from: c, reason: collision with root package name */
    public final D2.X1 f15859c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15860d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f15861e;

    /* renamed from: f, reason: collision with root package name */
    public final D2.i2 f15862f;

    /* renamed from: g, reason: collision with root package name */
    public final J70 f15863g;

    public I40(InterfaceC2369d50 interfaceC2369d50, C2586f50 c2586f50, D2.X1 x12, String str, Executor executor, D2.i2 i2Var, J70 j70) {
        this.f15857a = interfaceC2369d50;
        this.f15858b = c2586f50;
        this.f15859c = x12;
        this.f15860d = str;
        this.f15861e = executor;
        this.f15862f = i2Var;
        this.f15863g = j70;
    }

    @Override // com.google.android.gms.internal.ads.U70
    public final J70 zza() {
        return this.f15863g;
    }

    @Override // com.google.android.gms.internal.ads.U70
    public final Executor zzb() {
        return this.f15861e;
    }
}
