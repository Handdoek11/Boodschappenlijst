package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;

/* renamed from: com.google.android.gms.internal.ads.pH0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3698pH0 extends AbstractC2608fG0 implements InterfaceC2719gH0 {

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC2646fh0 f25367h;

    /* renamed from: i, reason: collision with root package name */
    private final RE0 f25368i;

    /* renamed from: j, reason: collision with root package name */
    private final int f25369j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f25370k = true;

    /* renamed from: l, reason: collision with root package name */
    private long f25371l = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    private boolean f25372m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f25373n;

    /* renamed from: o, reason: collision with root package name */
    private Wu0 f25374o;

    /* renamed from: p, reason: collision with root package name */
    private E7 f25375p;

    /* renamed from: q, reason: collision with root package name */
    private final C3371mH0 f25376q;

    /* renamed from: r, reason: collision with root package name */
    private final VI0 f25377r;

    /* synthetic */ C3698pH0(E7 e72, InterfaceC2646fh0 interfaceC2646fh0, C3371mH0 c3371mH0, RE0 re0, VI0 vi0, int i8, boolean z7, InterfaceC3296lg0 interfaceC3296lg0, AbstractC3589oH0 abstractC3589oH0) {
        this.f25375p = e72;
        this.f25367h = interfaceC2646fh0;
        this.f25376q = c3371mH0;
        this.f25368i = re0;
        this.f25377r = vi0;
        this.f25369j = i8;
    }

    private final void y() {
        long j8 = this.f25371l;
        boolean z7 = this.f25372m;
        boolean z8 = this.f25373n;
        E7 G7 = G();
        DH0 dh0 = new DH0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j8, j8, 0L, 0L, z7, false, false, null, G7, z8 ? G7.f14646c : null);
        v(this.f25370k ? new C3262lH0(this, dh0) : dh0);
    }

    @Override // com.google.android.gms.internal.ads.IG0
    public final synchronized E7 G() {
        return this.f25375p;
    }

    @Override // com.google.android.gms.internal.ads.IG0
    public final void I() {
    }

    @Override // com.google.android.gms.internal.ads.IG0
    public final void b(EG0 eg0) {
        ((C3153kH0) eg0).y();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2608fG0, com.google.android.gms.internal.ads.IG0
    public final synchronized void c(E7 e72) {
        this.f25375p = e72;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2719gH0
    public final void d(long j8, boolean z7, boolean z8) {
        if (j8 == -9223372036854775807L) {
            j8 = this.f25371l;
        }
        if (!this.f25370k && this.f25371l == j8 && this.f25372m == z7 && this.f25373n == z8) {
            return;
        }
        this.f25371l = j8;
        this.f25372m = z7;
        this.f25373n = z8;
        this.f25370k = false;
        y();
    }

    @Override // com.google.android.gms.internal.ads.IG0
    public final EG0 e(GG0 gg0, RI0 ri0, long j8) {
        InterfaceC1344Gh0 zza = this.f25367h.zza();
        Wu0 wu0 = this.f25374o;
        if (wu0 != null) {
            zza.f(wu0);
        }
        C3128k5 c3128k5 = G().f14645b;
        c3128k5.getClass();
        Uri uri = c3128k5.f23502a;
        C3371mH0 c3371mH0 = this.f25376q;
        m();
        return new C3153kH0(uri, zza, new C2826hG0(c3371mH0.f24487a), this.f25368i, n(gg0), this.f25377r, p(gg0), this, ri0, null, this.f25369j, false, AbstractC2301cW.K(-9223372036854775807L), null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2608fG0
    protected final void t(Wu0 wu0) {
        this.f25374o = wu0;
        Looper.myLooper().getClass();
        m();
        y();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2608fG0
    protected final void w() {
    }
}
