package com.google.android.gms.internal.ads;

import Z2.AbstractC0765d;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C1103b;

/* renamed from: com.google.android.gms.internal.ads.Dc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1226Dc0 implements AbstractC0765d.a, AbstractC0765d.b {

    /* renamed from: a, reason: collision with root package name */
    private final C1966Yc0 f14523a;

    /* renamed from: b, reason: collision with root package name */
    private final C1791Tc0 f14524b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f14525c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private boolean f14526d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14527e = false;

    C1226Dc0(Context context, Looper looper, C1791Tc0 c1791Tc0) {
        this.f14524b = c1791Tc0;
        this.f14523a = new C1966Yc0(context, looper, this, this, 12800000);
    }

    private final void b() {
        synchronized (this.f14525c) {
            try {
                if (this.f14523a.h() || this.f14523a.e()) {
                    this.f14523a.g();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Z2.AbstractC0765d.b
    public final void D0(C1103b c1103b) {
    }

    @Override // Z2.AbstractC0765d.a
    public final void J0(Bundle bundle) {
        synchronized (this.f14525c) {
            try {
                if (this.f14527e) {
                    return;
                }
                this.f14527e = true;
                try {
                    this.f14523a.j0().I3(new C1896Wc0(this.f14524b.m()));
                } catch (Exception unused) {
                } catch (Throwable th) {
                    b();
                    throw th;
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void a() {
        synchronized (this.f14525c) {
            try {
                if (!this.f14526d) {
                    this.f14526d = true;
                    this.f14523a.q();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Z2.AbstractC0765d.a
    public final void w0(int i8) {
    }
}
