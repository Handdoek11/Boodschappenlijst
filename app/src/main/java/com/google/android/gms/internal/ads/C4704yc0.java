package com.google.android.gms.internal.ads;

import Z2.AbstractC0765d;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.C1103b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.yc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4704yc0 implements AbstractC0765d.a, AbstractC0765d.b {

    /* renamed from: a, reason: collision with root package name */
    protected final C1966Yc0 f28150a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28151b;

    /* renamed from: c, reason: collision with root package name */
    private final String f28152c;

    /* renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue f28153d;

    /* renamed from: e, reason: collision with root package name */
    private final HandlerThread f28154e;

    public C4704yc0(Context context, String str, String str2) {
        this.f28151b = str;
        this.f28152c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f28154e = handlerThread;
        handlerThread.start();
        C1966Yc0 c1966Yc0 = new C1966Yc0(context, handlerThread.getLooper(), this, this, 9200000);
        this.f28150a = c1966Yc0;
        this.f28153d = new LinkedBlockingQueue();
        c1966Yc0.q();
    }

    static E8 a() {
        C2918i8 B02 = E8.B0();
        B02.F(32768L);
        return (E8) B02.x();
    }

    @Override // Z2.AbstractC0765d.b
    public final void D0(C1103b c1103b) {
        try {
            this.f28153d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // Z2.AbstractC0765d.a
    public final void J0(Bundle bundle) {
        C2421dd0 d8 = d();
        if (d8 != null) {
            try {
                try {
                    this.f28153d.put(d8.q2(new C2001Zc0(this.f28151b, this.f28152c)).A0());
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    c();
                    this.f28154e.quit();
                    throw th;
                }
            } catch (Throwable unused2) {
                this.f28153d.put(a());
            }
            c();
            this.f28154e.quit();
        }
    }

    public final E8 b(int i8) {
        E8 e8;
        try {
            e8 = (E8) this.f28153d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            e8 = null;
        }
        return e8 == null ? a() : e8;
    }

    public final void c() {
        C1966Yc0 c1966Yc0 = this.f28150a;
        if (c1966Yc0 != null) {
            if (c1966Yc0.h() || this.f28150a.e()) {
                this.f28150a.g();
            }
        }
    }

    protected final C2421dd0 d() {
        try {
            return this.f28150a.j0();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // Z2.AbstractC0765d.a
    public final void w0(int i8) {
        try {
            this.f28153d.put(a());
        } catch (InterruptedException unused) {
        }
    }
}
