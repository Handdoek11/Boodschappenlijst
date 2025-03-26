package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.dd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2420dd {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f21621a;

    /* renamed from: b, reason: collision with root package name */
    private int f21622b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2637fd f21623c;

    /* synthetic */ C2420dd(C2637fd c2637fd, byte[] bArr, AbstractC2528ed abstractC2528ed) {
        this.f21623c = c2637fd;
        this.f21621a = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void d() {
        try {
            C2637fd c2637fd = this.f21623c;
            if (c2637fd.f22080b) {
                c2637fd.f22079a.n0(this.f21621a);
                this.f21623c.f22079a.K(0);
                this.f21623c.f22079a.z(this.f21622b);
                this.f21623c.f22079a.z0(null);
                this.f21623c.f22079a.c();
            }
        } catch (RemoteException e8) {
            H2.p.c("Clearcut log failed", e8);
        }
    }

    public final C2420dd a(int i8) {
        this.f21622b = i8;
        return this;
    }

    public final synchronized void c() {
        this.f21623c.f22081c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.cd
            @Override // java.lang.Runnable
            public final void run() {
                this.f21255o.d();
            }
        });
    }
}
