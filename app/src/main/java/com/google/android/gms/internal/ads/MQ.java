package com.google.android.gms.internal.ads;

import Z2.AbstractC0765d;
import android.content.Context;
import android.os.Binder;
import com.google.android.gms.common.C1103b;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class MQ implements AbstractC0765d.a, AbstractC0765d.b {

    /* renamed from: a, reason: collision with root package name */
    protected final C1811Tq f17347a = new C1811Tq();

    /* renamed from: b, reason: collision with root package name */
    protected final Object f17348b = new Object();

    /* renamed from: c, reason: collision with root package name */
    protected boolean f17349c = false;

    /* renamed from: d, reason: collision with root package name */
    protected boolean f17350d = false;

    /* renamed from: e, reason: collision with root package name */
    protected C4618xo f17351e;

    /* renamed from: f, reason: collision with root package name */
    protected C2116ao f17352f;

    static void b(Context context, com.google.common.util.concurrent.d dVar, Executor executor) {
        if (((Boolean) AbstractC2426dg.f21635j.e()).booleanValue() || ((Boolean) AbstractC2426dg.f21633h.e()).booleanValue()) {
            AbstractC2326ck0.r(dVar, new JQ(context), executor);
        }
    }

    public void D0(C1103b c1103b) {
        H2.p.b("Disconnected from remote ad request service.");
        this.f17347a.d(new zzdyh(1));
    }

    protected final void a() {
        synchronized (this.f17348b) {
            try {
                this.f17350d = true;
                if (this.f17352f.h() || this.f17352f.e()) {
                    this.f17352f.g();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Z2.AbstractC0765d.a
    public final void w0(int i8) {
        H2.p.b("Cannot connect to remote service, fallback to local instance.");
    }
}
