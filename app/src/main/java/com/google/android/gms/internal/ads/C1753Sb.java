package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Sb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1753Sb {

    /* renamed from: a, reason: collision with root package name */
    private final Object f18929a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private C1683Qb f18930b = null;

    /* renamed from: c, reason: collision with root package name */
    private boolean f18931c = false;

    public final Activity a() {
        synchronized (this.f18929a) {
            try {
                C1683Qb c1683Qb = this.f18930b;
                if (c1683Qb == null) {
                    return null;
                }
                return c1683Qb.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Context b() {
        synchronized (this.f18929a) {
            try {
                C1683Qb c1683Qb = this.f18930b;
                if (c1683Qb == null) {
                    return null;
                }
                return c1683Qb.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(InterfaceC1718Rb interfaceC1718Rb) {
        synchronized (this.f18929a) {
            try {
                if (this.f18930b == null) {
                    this.f18930b = new C1683Qb();
                }
                this.f18930b.f(interfaceC1718Rb);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Context context) {
        synchronized (this.f18929a) {
            try {
                if (!this.f18931c) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        H2.p.g("Can not cast Context to Application");
                        return;
                    }
                    if (this.f18930b == null) {
                        this.f18930b = new C1683Qb();
                    }
                    this.f18930b.g(application, context);
                    this.f18931c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(InterfaceC1718Rb interfaceC1718Rb) {
        synchronized (this.f18929a) {
            try {
                C1683Qb c1683Qb = this.f18930b;
                if (c1683Qb == null) {
                    return;
                }
                c1683Qb.h(interfaceC1718Rb);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
