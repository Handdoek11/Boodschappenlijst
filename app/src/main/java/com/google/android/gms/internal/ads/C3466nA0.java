package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.nA0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3466nA0 implements InterfaceC2487eA0 {

    /* renamed from: a, reason: collision with root package name */
    public final BG0 f24894a;

    /* renamed from: d, reason: collision with root package name */
    public int f24897d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24898e;

    /* renamed from: c, reason: collision with root package name */
    public final List f24896c = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Object f24895b = new Object();

    public C3466nA0(IG0 ig0, boolean z7) {
        this.f24894a = new BG0(ig0, z7);
    }

    public final void a(int i8) {
        this.f24897d = i8;
        this.f24898e = false;
        this.f24896c.clear();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2487eA0
    public final AbstractC1981Yl zza() {
        return this.f24894a.H();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2487eA0
    public final Object zzb() {
        return this.f24895b;
    }
}
