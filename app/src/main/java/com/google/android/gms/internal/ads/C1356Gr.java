package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Gr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1356Gr {

    /* renamed from: b, reason: collision with root package name */
    private long f15448b;

    /* renamed from: a, reason: collision with root package name */
    private final long f15447a = TimeUnit.MILLISECONDS.toNanos(((Long) D2.A.c().a(AbstractC3184kf.f23758Q)).longValue());

    /* renamed from: c, reason: collision with root package name */
    private boolean f15449c = true;

    C1356Gr() {
    }

    public final void a(SurfaceTexture surfaceTexture, final InterfaceC3862qr interfaceC3862qr) {
        if (interfaceC3862qr == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.f15449c) {
            long j8 = timestamp - this.f15448b;
            if (Math.abs(j8) < this.f15447a) {
                return;
            }
        }
        this.f15449c = false;
        this.f15448b = timestamp;
        G2.D0.f2566l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.Fr
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC3862qr.i();
            }
        });
    }

    public final void b() {
        this.f15449c = true;
    }
}
