package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import G2.InterfaceC0611r0;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.iJ, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2940iJ {

    /* renamed from: k, reason: collision with root package name */
    static final ImageView.ScaleType f22943k = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0611r0 f22944a;

    /* renamed from: b, reason: collision with root package name */
    private final L60 f22945b;

    /* renamed from: c, reason: collision with root package name */
    private final MI f22946c;

    /* renamed from: d, reason: collision with root package name */
    private final HI f22947d;

    /* renamed from: e, reason: collision with root package name */
    private final C4463wJ f22948e;

    /* renamed from: f, reason: collision with root package name */
    private final FJ f22949f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f22950g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f22951h;

    /* renamed from: i, reason: collision with root package name */
    private final C1553Mg f22952i;

    /* renamed from: j, reason: collision with root package name */
    private final EI f22953j;

    public C2940iJ(InterfaceC0611r0 interfaceC0611r0, L60 l60, MI mi, HI hi, C4463wJ c4463wJ, FJ fj, Executor executor, Executor executor2, EI ei) {
        this.f22944a = interfaceC0611r0;
        this.f22945b = l60;
        this.f22952i = l60.f16771i;
        this.f22946c = mi;
        this.f22947d = hi;
        this.f22948e = c4463wJ;
        this.f22949f = fj;
        this.f22950g = executor;
        this.f22951h = executor2;
        this.f22953j = ei;
    }

    private static void h(RelativeLayout.LayoutParams layoutParams, int i8) {
        if (i8 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i8 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i8 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean i(ViewGroup viewGroup, boolean z7) {
        View S7 = z7 ? this.f22947d.S() : this.f22947d.T();
        if (S7 == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (S7.getParent() instanceof ViewGroup) {
            ((ViewGroup) S7.getParent()).removeView(S7);
        }
        viewGroup.addView(S7, ((Boolean) D2.A.c().a(AbstractC3184kf.f23802V3)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    final /* synthetic */ void a(ViewGroup viewGroup) {
        HI hi = this.f22947d;
        if (hi.S() != null) {
            boolean z7 = viewGroup != null;
            if (hi.P() == 2 || hi.P() == 1) {
                this.f22944a.f0(this.f22945b.f16768f, String.valueOf(hi.P()), z7);
            } else if (hi.P() == 6) {
                this.f22944a.f0(this.f22945b.f16768f, "2", z7);
                this.f22944a.f0(this.f22945b.f16768f, "1", z7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ void b(com.google.android.gms.internal.ads.HJ r10) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2940iJ.b(com.google.android.gms.internal.ads.HJ):void");
    }

    public final void c(HJ hj) {
        if (hj == null || this.f22948e == null || hj.e() == null || !this.f22946c.g()) {
            return;
        }
        try {
            hj.e().addView(this.f22948e.a());
        } catch (zzcfj e8) {
            AbstractC0608p0.l("web view can not be obtained", e8);
        }
    }

    public final void d(HJ hj) {
        if (hj == null) {
            return;
        }
        Context context = hj.c().getContext();
        if (G2.X.h(context, this.f22946c.f17320a)) {
            if (!(context instanceof Activity)) {
                H2.p.b("Activity context is needed for policy validator.");
                return;
            }
            if (this.f22949f == null || hj.e() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.f22949f.a(hj.e(), windowManager), G2.X.b());
            } catch (zzcfj e8) {
                AbstractC0608p0.l("web view can not be obtained", e8);
            }
        }
    }

    public final void e(final HJ hj) {
        this.f22950g.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.gJ
            @Override // java.lang.Runnable
            public final void run() {
                this.f22304o.b(hj);
            }
        });
    }

    public final boolean f(ViewGroup viewGroup) {
        return i(viewGroup, false);
    }

    public final boolean g(ViewGroup viewGroup) {
        return i(viewGroup, true);
    }
}
