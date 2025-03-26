package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class j extends RecyclerView.A {

    /* renamed from: k, reason: collision with root package name */
    protected PointF f11251k;

    /* renamed from: l, reason: collision with root package name */
    private final DisplayMetrics f11252l;

    /* renamed from: n, reason: collision with root package name */
    private float f11254n;

    /* renamed from: i, reason: collision with root package name */
    protected final LinearInterpolator f11249i = new LinearInterpolator();

    /* renamed from: j, reason: collision with root package name */
    protected final DecelerateInterpolator f11250j = new DecelerateInterpolator();

    /* renamed from: m, reason: collision with root package name */
    private boolean f11253m = false;

    /* renamed from: o, reason: collision with root package name */
    protected int f11255o = 0;

    /* renamed from: p, reason: collision with root package name */
    protected int f11256p = 0;

    public j(Context context) {
        this.f11252l = context.getResources().getDisplayMetrics();
    }

    private float A() {
        if (!this.f11253m) {
            this.f11254n = v(this.f11252l);
            this.f11253m = true;
        }
        return this.f11254n;
    }

    private int y(int i8, int i9) {
        int i10 = i8 - i9;
        if (i8 * i10 <= 0) {
            return 0;
        }
        return i10;
    }

    protected int B() {
        PointF pointF = this.f11251k;
        if (pointF != null) {
            float f8 = pointF.y;
            if (f8 != 0.0f) {
                return f8 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    protected void C(RecyclerView.A.a aVar) {
        PointF a8 = a(f());
        if (a8 == null || (a8.x == 0.0f && a8.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(a8);
        this.f11251k = a8;
        this.f11255o = (int) (a8.x * 10000.0f);
        this.f11256p = (int) (a8.y * 10000.0f);
        aVar.d((int) (this.f11255o * 1.2f), (int) (this.f11256p * 1.2f), (int) (x(10000) * 1.2f), this.f11249i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    protected void l(int i8, int i9, RecyclerView.B b8, RecyclerView.A.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f11255o = y(this.f11255o, i8);
        int y7 = y(this.f11256p, i9);
        this.f11256p = y7;
        if (this.f11255o == 0 && y7 == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    protected void m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    protected void n() {
        this.f11256p = 0;
        this.f11255o = 0;
        this.f11251k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.A
    protected void o(View view, RecyclerView.B b8, RecyclerView.A.a aVar) {
        int t7 = t(view, z());
        int u7 = u(view, B());
        int w7 = w((int) Math.sqrt((t7 * t7) + (u7 * u7)));
        if (w7 > 0) {
            aVar.d(-t7, -u7, w7, this.f11250j);
        }
    }

    public int s(int i8, int i9, int i10, int i11, int i12) {
        if (i12 == -1) {
            return i10 - i8;
        }
        if (i12 != 0) {
            if (i12 == 1) {
                return i11 - i9;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i13 = i10 - i8;
        if (i13 > 0) {
            return i13;
        }
        int i14 = i11 - i9;
        if (i14 < 0) {
            return i14;
        }
        return 0;
    }

    public int t(View view, int i8) {
        RecyclerView.p e8 = e();
        if (e8 == null || !e8.p()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(e8.V(view) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, e8.Y(view) + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, e8.i0(), e8.s0() - e8.j0(), i8);
    }

    public int u(View view, int i8) {
        RecyclerView.p e8 = e();
        if (e8 == null || !e8.q()) {
            return 0;
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        return s(e8.Z(view) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, e8.T(view) + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin, e8.k0(), e8.b0() - e8.h0(), i8);
    }

    protected float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    protected int w(int i8) {
        return (int) Math.ceil(x(i8) / 0.3356d);
    }

    protected int x(int i8) {
        return (int) Math.ceil(Math.abs(i8) * A());
    }

    protected int z() {
        PointF pointF = this.f11251k;
        if (pointF != null) {
            float f8 = pointF.x;
            if (f8 != 0.0f) {
                return f8 > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
