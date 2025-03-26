package w2;

import D2.C0510i1;
import D2.InterfaceC0484a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.AbstractC3077jg;
import com.google.android.gms.internal.ads.AbstractC3184kf;
import com.google.android.gms.internal.ads.C1773Sn;
import x2.InterfaceC6905d;

/* loaded from: classes.dex */
public abstract class k extends ViewGroup {

    /* renamed from: o, reason: collision with root package name */
    protected final C0510i1 f44292o;

    protected k(Context context, int i8) {
        super(context);
        this.f44292o = new C0510i1(this, i8);
    }

    public void a() {
        AbstractC3184kf.a(getContext());
        if (((Boolean) AbstractC3077jg.f23299e.e()).booleanValue()) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.Ya)).booleanValue()) {
                H2.c.f2922b.execute(new Runnable() { // from class: w2.B
                    @Override // java.lang.Runnable
                    public final void run() {
                        k kVar = this.f44246o;
                        try {
                            kVar.f44292o.n();
                        } catch (IllegalStateException e8) {
                            C1773Sn.c(kVar.getContext()).a(e8, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.f44292o.n();
    }

    public void b(final C6881g c6881g) {
        Z2.r.e("#008 Must be called on the main UI thread.");
        AbstractC3184kf.a(getContext());
        if (((Boolean) AbstractC3077jg.f23300f.e()).booleanValue()) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.bb)).booleanValue()) {
                H2.c.f2922b.execute(new Runnable() { // from class: w2.D
                    @Override // java.lang.Runnable
                    public final void run() {
                        k kVar = this.f44248o;
                        try {
                            kVar.f44292o.p(c6881g.f44270a);
                        } catch (IllegalStateException e8) {
                            C1773Sn.c(kVar.getContext()).a(e8, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.f44292o.p(c6881g.f44270a);
    }

    public void c() {
        AbstractC3184kf.a(getContext());
        if (((Boolean) AbstractC3077jg.f23301g.e()).booleanValue()) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.Za)).booleanValue()) {
                H2.c.f2922b.execute(new Runnable() { // from class: w2.C
                    @Override // java.lang.Runnable
                    public final void run() {
                        k kVar = this.f44247o;
                        try {
                            kVar.f44292o.q();
                        } catch (IllegalStateException e8) {
                            C1773Sn.c(kVar.getContext()).a(e8, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.f44292o.q();
    }

    public void d() {
        AbstractC3184kf.a(getContext());
        if (((Boolean) AbstractC3077jg.f23302h.e()).booleanValue()) {
            if (((Boolean) D2.A.c().a(AbstractC3184kf.Xa)).booleanValue()) {
                H2.c.f2922b.execute(new Runnable() { // from class: w2.A
                    @Override // java.lang.Runnable
                    public final void run() {
                        k kVar = this.f44245o;
                        try {
                            kVar.f44292o.r();
                        } catch (IllegalStateException e8) {
                            C1773Sn.c(kVar.getContext()).a(e8, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.f44292o.r();
    }

    public AbstractC6878d getAdListener() {
        return this.f44292o.d();
    }

    public C6882h getAdSize() {
        return this.f44292o.e();
    }

    public String getAdUnitId() {
        return this.f44292o.m();
    }

    public o getOnPaidEventListener() {
        this.f44292o.f();
        return null;
    }

    public u getResponseInfo() {
        return this.f44292o.g();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i12 = ((i10 - i8) - measuredWidth) / 2;
        int i13 = ((i11 - i9) - measuredHeight) / 2;
        childAt.layout(i12, i13, measuredWidth + i12, measuredHeight + i13);
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        C6882h c6882h;
        int i10;
        int i11 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                c6882h = getAdSize();
            } catch (NullPointerException e8) {
                H2.p.e("Unable to retrieve ad size.", e8);
                c6882h = null;
            }
            if (c6882h != null) {
                Context context = getContext();
                int f8 = c6882h.f(context);
                i10 = c6882h.d(context);
                i11 = f8;
            } else {
                i10 = 0;
            }
        } else {
            measureChild(childAt, i8, i9);
            i11 = childAt.getMeasuredWidth();
            i10 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i11, getSuggestedMinimumWidth()), i8), View.resolveSize(Math.max(i10, getSuggestedMinimumHeight()), i9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(AbstractC6878d abstractC6878d) {
        this.f44292o.t(abstractC6878d);
        if (abstractC6878d == 0) {
            this.f44292o.s(null);
            return;
        }
        if (abstractC6878d instanceof InterfaceC0484a) {
            this.f44292o.s((InterfaceC0484a) abstractC6878d);
        }
        if (abstractC6878d instanceof InterfaceC6905d) {
            this.f44292o.x((InterfaceC6905d) abstractC6878d);
        }
    }

    public void setAdSize(C6882h c6882h) {
        this.f44292o.u(c6882h);
    }

    public void setAdUnitId(String str) {
        this.f44292o.w(str);
    }

    public void setOnPaidEventListener(o oVar) {
        this.f44292o.z(oVar);
    }
}
