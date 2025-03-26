package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class QG0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f18435a;

    /* renamed from: b, reason: collision with root package name */
    public final GG0 f18436b;

    /* renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f18437c;

    private QG0(CopyOnWriteArrayList copyOnWriteArrayList, int i8, GG0 gg0) {
        this.f18437c = copyOnWriteArrayList;
        this.f18435a = 0;
        this.f18436b = gg0;
    }

    public final QG0 a(int i8, GG0 gg0) {
        return new QG0(this.f18437c, 0, gg0);
    }

    public final void b(Handler handler, RG0 rg0) {
        this.f18437c.add(new PG0(handler, rg0));
    }

    public final void c(final WE we) {
        Iterator it = this.f18437c.iterator();
        while (it.hasNext()) {
            PG0 pg0 = (PG0) it.next();
            final RG0 rg0 = pg0.f18171b;
            Handler handler = pg0.f18170a;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.OG0
                @Override // java.lang.Runnable
                public final void run() {
                    we.a(rg0);
                }
            };
            int i8 = AbstractC2301cW.f21206a;
            if (handler.getLooper().getThread().isAlive()) {
                if (handler.getLooper() == Looper.myLooper()) {
                    runnable.run();
                } else {
                    handler.post(runnable);
                }
            }
        }
    }

    public final void d(final CG0 cg0) {
        c(new WE() { // from class: com.google.android.gms.internal.ads.JG0
            @Override // com.google.android.gms.internal.ads.WE
            public final void a(Object obj) {
                ((RG0) obj).C(0, this.f16213a.f18436b, cg0);
            }
        });
    }

    public final void e(final C4458wG0 c4458wG0, final CG0 cg0) {
        c(new WE() { // from class: com.google.android.gms.internal.ads.NG0
            @Override // com.google.android.gms.internal.ads.WE
            public final void a(Object obj) {
                ((RG0) obj).i(0, this.f17494a.f18436b, c4458wG0, cg0);
            }
        });
    }

    public final void f(final C4458wG0 c4458wG0, final CG0 cg0) {
        c(new WE() { // from class: com.google.android.gms.internal.ads.LG0
            @Override // com.google.android.gms.internal.ads.WE
            public final void a(Object obj) {
                ((RG0) obj).A(0, this.f16804a.f18436b, c4458wG0, cg0);
            }
        });
    }

    public final void g(final C4458wG0 c4458wG0, final CG0 cg0, final IOException iOException, final boolean z7) {
        c(new WE() { // from class: com.google.android.gms.internal.ads.MG0
            @Override // com.google.android.gms.internal.ads.WE
            public final void a(Object obj) {
                ((RG0) obj).H(0, this.f17312a.f18436b, c4458wG0, cg0, iOException, z7);
            }
        });
    }

    public final void h(final C4458wG0 c4458wG0, final CG0 cg0) {
        c(new WE() { // from class: com.google.android.gms.internal.ads.KG0
            @Override // com.google.android.gms.internal.ads.WE
            public final void a(Object obj) {
                ((RG0) obj).t(0, this.f16562a.f18436b, c4458wG0, cg0);
            }
        });
    }

    public final void i(RG0 rg0) {
        Iterator it = this.f18437c.iterator();
        while (it.hasNext()) {
            PG0 pg0 = (PG0) it.next();
            if (pg0.f18171b == rg0) {
                this.f18437c.remove(pg0);
            }
        }
    }

    public QG0() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
