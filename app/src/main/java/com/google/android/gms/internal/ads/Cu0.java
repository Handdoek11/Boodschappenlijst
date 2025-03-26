package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class Cu0 implements InterfaceC1344Gh0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1344Gh0 f14254a;

    /* renamed from: b, reason: collision with root package name */
    private long f14255b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f14256c = Uri.EMPTY;

    /* renamed from: d, reason: collision with root package name */
    private Map f14257d = Collections.emptyMap();

    public Cu0(InterfaceC1344Gh0 interfaceC1344Gh0) {
        this.f14254a = interfaceC1344Gh0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3684pA0
    public final int C(byte[] bArr, int i8, int i9) {
        int C7 = this.f14254a.C(bArr, i8, i9);
        if (C7 != -1) {
            this.f14255b += C7;
        }
        return C7;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final Uri a() {
        return this.f14254a.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0, com.google.android.gms.internal.ads.Ds0
    public final Map b() {
        return this.f14254a.b();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final void d() {
        this.f14254a.d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final long e(C4393vk0 c4393vk0) {
        this.f14256c = c4393vk0.f27331a;
        this.f14257d = Collections.emptyMap();
        try {
            long e8 = this.f14254a.e(c4393vk0);
            Uri a8 = a();
            if (a8 != null) {
                this.f14256c = a8;
            }
            this.f14257d = b();
            return e8;
        } catch (Throwable th) {
            Uri a9 = a();
            if (a9 != null) {
                this.f14256c = a9;
            }
            this.f14257d = b();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1344Gh0
    public final void f(Wu0 wu0) {
        wu0.getClass();
        this.f14254a.f(wu0);
    }

    public final long g() {
        return this.f14255b;
    }

    public final Uri i() {
        return this.f14256c;
    }

    public final Map j() {
        return this.f14257d;
    }
}
