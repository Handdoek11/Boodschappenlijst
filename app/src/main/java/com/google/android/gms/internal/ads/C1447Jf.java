package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Jf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1447Jf extends androidx.browser.customtabs.e {

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f16282b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private Context f16283c;

    /* renamed from: d, reason: collision with root package name */
    private HN f16284d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.browser.customtabs.f f16285e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.browser.customtabs.c f16286f;

    private final void h(Context context) {
        String c8;
        if (this.f16286f != null || context == null || (c8 = androidx.browser.customtabs.c.c(context, null)) == null) {
            return;
        }
        androidx.browser.customtabs.c.a(context, c8, this);
    }

    @Override // androidx.browser.customtabs.e
    public final void a(ComponentName componentName, androidx.browser.customtabs.c cVar) {
        this.f16286f = cVar;
        cVar.g(0L);
        this.f16285e = cVar.e(new C1411If(this));
    }

    public final androidx.browser.customtabs.f c() {
        if (this.f16285e == null) {
            AbstractC1497Kq.f16644a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Hf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15763o.e();
                }
            });
        }
        return this.f16285e;
    }

    public final void d(Context context, HN hn) {
        if (this.f16282b.getAndSet(true)) {
            return;
        }
        this.f16283c = context;
        this.f16284d = hn;
        h(context);
    }

    final /* synthetic */ void e() {
        h(this.f16283c);
    }

    final /* synthetic */ void f(int i8) {
        HN hn = this.f16284d;
        if (hn != null) {
            GN a8 = hn.a();
            a8.b("action", "cct_nav");
            a8.b("cct_navs", String.valueOf(i8));
            a8.g();
        }
    }

    public final void g(final int i8) {
        if (!((Boolean) D2.A.c().a(AbstractC3184kf.f23675F4)).booleanValue() || this.f16284d == null) {
            return;
        }
        AbstractC1497Kq.f16644a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.Gf
            @Override // java.lang.Runnable
            public final void run() {
                this.f15422o.f(i8);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f16286f = null;
        this.f16285e = null;
    }
}
