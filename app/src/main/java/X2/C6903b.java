package x2;

import D2.A;
import Z2.r;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3077jg;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.C1773Sn;
import w2.C6882h;
import w2.k;
import w2.w;
import w2.x;

/* renamed from: x2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6903b extends k {
    public C6903b(Context context) {
        super(context, 0);
        r.m(context, "Context cannot be null");
    }

    public void e(final C6902a c6902a) {
        r.e("#008 Must be called on the main UI thread.");
        AbstractC3184kf.a(getContext());
        if (((Boolean) AbstractC3077jg.f23300f.e()).booleanValue()) {
            if (((Boolean) A.c().a(AbstractC3184kf.bb)).booleanValue()) {
                H2.c.f2922b.execute(new Runnable() { // from class: x2.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44428o.f(c6902a);
                    }
                });
                return;
            }
        }
        this.f44292o.p(c6902a.a());
    }

    final /* synthetic */ void f(C6902a c6902a) {
        try {
            this.f44292o.p(c6902a.a());
        } catch (IllegalStateException e8) {
            C1773Sn.c(getContext()).a(e8, "AdManagerAdView.loadAd");
        }
    }

    public C6882h[] getAdSizes() {
        return this.f44292o.a();
    }

    public InterfaceC6905d getAppEventListener() {
        return this.f44292o.k();
    }

    public w getVideoController() {
        return this.f44292o.i();
    }

    public x getVideoOptions() {
        return this.f44292o.j();
    }

    public void setAdSizes(C6882h... c6882hArr) {
        if (c6882hArr == null || c6882hArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f44292o.v(c6882hArr);
    }

    public void setAppEventListener(InterfaceC6905d interfaceC6905d) {
        this.f44292o.x(interfaceC6905d);
    }

    public void setManualImpressionsEnabled(boolean z7) {
        this.f44292o.y(z7);
    }

    public void setVideoOptions(x xVar) {
        this.f44292o.A(xVar);
    }
}
