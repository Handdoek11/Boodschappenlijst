package com.google.android.gms.internal.ads;

import Z2.AbstractC0765d;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.C1103b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Ac0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1118Ac0 implements AbstractC0765d.a, AbstractC0765d.b {

    /* renamed from: a, reason: collision with root package name */
    protected final C1966Yc0 f13604a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13605b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13606c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue f13607d;

    /* renamed from: e, reason: collision with root package name */
    private final HandlerThread f13608e;

    /* renamed from: f, reason: collision with root package name */
    private final C3941rc0 f13609f;

    /* renamed from: g, reason: collision with root package name */
    private final long f13610g;

    /* renamed from: h, reason: collision with root package name */
    private final int f13611h;

    public C1118Ac0(Context context, int i8, int i9, String str, String str2, String str3, C3941rc0 c3941rc0) {
        this.f13605b = str;
        this.f13611h = i9;
        this.f13606c = str2;
        this.f13609f = c3941rc0;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f13608e = handlerThread;
        handlerThread.start();
        this.f13610g = System.currentTimeMillis();
        C1966Yc0 c1966Yc0 = new C1966Yc0(context, handlerThread.getLooper(), this, this, 19621000);
        this.f13604a = c1966Yc0;
        this.f13607d = new LinkedBlockingQueue();
        c1966Yc0.q();
    }

    private final void d(int i8, long j8, Exception exc) {
        this.f13609f.c(i8, System.currentTimeMillis() - j8, exc);
    }

    @Override // Z2.AbstractC0765d.b
    public final void D0(C1103b c1103b) {
        try {
            d(4012, this.f13610g, null);
            this.f13607d.put(new C3181kd0(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // Z2.AbstractC0765d.a
    public final void J0(Bundle bundle) {
        C2421dd0 c8 = c();
        if (c8 != null) {
            try {
                C3181kd0 r32 = c8.r3(new C2965id0(1, this.f13611h, this.f13605b, this.f13606c));
                d(5011, this.f13610g, null);
                this.f13607d.put(r32);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public final C3181kd0 a(int i8) {
        C3181kd0 c3181kd0;
        try {
            c3181kd0 = (C3181kd0) this.f13607d.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            d(2009, this.f13610g, e8);
            c3181kd0 = null;
        }
        d(3004, this.f13610g, null);
        if (c3181kd0 != null) {
            if (c3181kd0.f23628t == 7) {
                C3941rc0.g(3);
            } else {
                C3941rc0.g(2);
            }
        }
        return c3181kd0 == null ? new C3181kd0(null, 1) : c3181kd0;
    }

    public final void b() {
        C1966Yc0 c1966Yc0 = this.f13604a;
        if (c1966Yc0 != null) {
            if (c1966Yc0.h() || this.f13604a.e()) {
                this.f13604a.g();
            }
        }
    }

    protected final C2421dd0 c() {
        try {
            return this.f13604a.j0();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // Z2.AbstractC0765d.a
    public final void w0(int i8) {
        try {
            d(4011, this.f13610g, null);
            this.f13607d.put(new C3181kd0(null, 1));
        } catch (InterruptedException unused) {
        }
    }
}
