package com.google.android.gms.internal.ads;

import G2.InterfaceC0611r0;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.qx, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3874qx {

    /* renamed from: a, reason: collision with root package name */
    private final Context f26022a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0611r0 f26023b;

    /* renamed from: c, reason: collision with root package name */
    private final C4038sT f26024c;

    /* renamed from: d, reason: collision with root package name */
    private final C3160kM f26025d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceExecutorServiceC3522nk0 f26026e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f26027f;

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f26028g;

    /* renamed from: h, reason: collision with root package name */
    InterfaceC1843Un f26029h;

    /* renamed from: i, reason: collision with root package name */
    InterfaceC1843Un f26030i;

    C3874qx(Context context, InterfaceC0611r0 interfaceC0611r0, C4038sT c4038sT, C3160kM c3160kM, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk0, InterfaceExecutorServiceC3522nk0 interfaceExecutorServiceC3522nk02, ScheduledExecutorService scheduledExecutorService) {
        this.f26022a = context;
        this.f26023b = interfaceC0611r0;
        this.f26024c = c4038sT;
        this.f26025d = c3160kM;
        this.f26026e = interfaceExecutorServiceC3522nk0;
        this.f26027f = interfaceExecutorServiceC3522nk02;
        this.f26028g = scheduledExecutorService;
    }

    public static boolean j(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) D2.A.c().a(AbstractC3184kf.ba));
    }

    private final com.google.common.util.concurrent.d k(final String str, final InputEvent inputEvent, Random random) {
        try {
            if (!str.contains((CharSequence) D2.A.c().a(AbstractC3184kf.ba)) || this.f26023b.L()) {
                return AbstractC2326ck0.h(str);
            }
            final Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter((String) D2.A.c().a(AbstractC3184kf.ca), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (inputEvent != null) {
                return (Sj0) AbstractC2326ck0.f((Sj0) AbstractC2326ck0.n(Sj0.D(this.f26024c.a()), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.kx
                    @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
                    public final com.google.common.util.concurrent.d a(Object obj) {
                        return this.f24227a.d(buildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.f26027f), Throwable.class, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.lx
                    @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
                    public final com.google.common.util.concurrent.d a(Object obj) {
                        return this.f24404a.e(buildUpon, (Throwable) obj);
                    }
                }, this.f26026e);
            }
            buildUpon.appendQueryParameter((String) D2.A.c().a(AbstractC3184kf.da), "11");
            return AbstractC2326ck0.h(buildUpon.toString());
        } catch (Exception e8) {
            return AbstractC2326ck0.g(e8);
        }
    }

    public final com.google.common.util.concurrent.d b(final String str, Random random) {
        return TextUtils.isEmpty(str) ? AbstractC2326ck0.h(str) : AbstractC2326ck0.f(k(str, this.f26025d.a(), random), Throwable.class, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.hx
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                return this.f22891a.c(str, (Throwable) obj);
            }
        }, this.f26026e);
    }

    final /* synthetic */ com.google.common.util.concurrent.d c(String str, final Throwable th) {
        this.f26026e.k(new Runnable() { // from class: com.google.android.gms.internal.ads.jx
            @Override // java.lang.Runnable
            public final void run() {
                this.f23476o.g(th);
            }
        });
        return AbstractC2326ck0.h(str);
    }

    final /* synthetic */ com.google.common.util.concurrent.d d(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) D2.A.c().a(AbstractC3184kf.da), "10");
            return AbstractC2326ck0.h(builder.toString());
        }
        Uri.Builder buildUpon = builder.build().buildUpon();
        buildUpon.appendQueryParameter((String) D2.A.c().a(AbstractC3184kf.ea), "1");
        buildUpon.appendQueryParameter((String) D2.A.c().a(AbstractC3184kf.da), "12");
        if (str.contains((CharSequence) D2.A.c().a(AbstractC3184kf.fa))) {
            buildUpon.authority((String) D2.A.c().a(AbstractC3184kf.ga));
        }
        return (Sj0) AbstractC2326ck0.n(Sj0.D(this.f26024c.b(buildUpon.build(), inputEvent)), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.mx
            @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
            public final com.google.common.util.concurrent.d a(Object obj) {
                String str2 = (String) D2.A.c().a(AbstractC3184kf.da);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return AbstractC2326ck0.h(builder2.toString());
            }
        }, this.f26027f);
    }

    final /* synthetic */ com.google.common.util.concurrent.d e(Uri.Builder builder, final Throwable th) {
        this.f26026e.k(new Runnable() { // from class: com.google.android.gms.internal.ads.ix
            @Override // java.lang.Runnable
            public final void run() {
                this.f23103o.h(th);
            }
        });
        builder.appendQueryParameter((String) D2.A.c().a(AbstractC3184kf.da), "9");
        return AbstractC2326ck0.h(builder.toString());
    }

    final /* synthetic */ void g(Throwable th) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.ia)).booleanValue()) {
            InterfaceC1843Un e8 = C1773Sn.e(this.f26022a);
            this.f26030i = e8;
            e8.a(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            InterfaceC1843Un c8 = C1773Sn.c(this.f26022a);
            this.f26029h = c8;
            c8.a(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    final /* synthetic */ void h(Throwable th) {
        if (((Boolean) D2.A.c().a(AbstractC3184kf.ia)).booleanValue()) {
            InterfaceC1843Un e8 = C1773Sn.e(this.f26022a);
            this.f26030i = e8;
            e8.a(th, "AttributionReporting");
        } else {
            InterfaceC1843Un c8 = C1773Sn.c(this.f26022a);
            this.f26029h = c8;
            c8.a(th, "AttributionReportingSampled");
        }
    }

    public final void i(String str, C2959ia0 c2959ia0, Random random, H2.v vVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC2326ck0.r(AbstractC2326ck0.o(k(str, this.f26025d.a(), random), ((Integer) D2.A.c().a(AbstractC3184kf.ha)).intValue(), TimeUnit.MILLISECONDS, this.f26028g), new C3765px(this, c2959ia0, str, vVar), this.f26026e);
    }
}
