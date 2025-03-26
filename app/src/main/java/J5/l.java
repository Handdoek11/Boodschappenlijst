package j5;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
class l {

    /* renamed from: r, reason: collision with root package name */
    private static final Interpolator f38329r = new e(0.15f);

    /* renamed from: a, reason: collision with root package name */
    private C6080c f38330a;

    /* renamed from: b, reason: collision with root package name */
    private RecyclerView.F f38331b;

    /* renamed from: c, reason: collision with root package name */
    private View f38332c;

    /* renamed from: d, reason: collision with root package name */
    private int f38333d;

    /* renamed from: e, reason: collision with root package name */
    private int f38334e;

    /* renamed from: f, reason: collision with root package name */
    private int f38335f;

    /* renamed from: g, reason: collision with root package name */
    private int f38336g;

    /* renamed from: h, reason: collision with root package name */
    private int f38337h;

    /* renamed from: i, reason: collision with root package name */
    private final int f38338i;

    /* renamed from: j, reason: collision with root package name */
    private float f38339j;

    /* renamed from: k, reason: collision with root package name */
    private float f38340k;

    /* renamed from: l, reason: collision with root package name */
    private int f38341l;

    /* renamed from: m, reason: collision with root package name */
    private int f38342m;

    /* renamed from: n, reason: collision with root package name */
    private float f38343n;

    /* renamed from: o, reason: collision with root package name */
    private int f38344o;

    /* renamed from: p, reason: collision with root package name */
    private int f38345p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f38346q;

    public l(C6080c c6080c, RecyclerView.F f8, int i8, boolean z7) {
        this.f38330a = c6080c;
        this.f38331b = f8;
        this.f38333d = f.f(i8);
        this.f38334e = f.h(i8);
        this.f38335f = f.g(i8);
        this.f38336g = f.e(i8);
        this.f38346q = z7;
        View a8 = k.a(f8);
        this.f38332c = a8;
        this.f38337h = a8.getWidth();
        int height = this.f38332c.getHeight();
        this.f38338i = height;
        this.f38339j = a(this.f38337h);
        this.f38340k = a(height);
    }

    private static float a(int i8) {
        if (i8 != 0) {
            return 1.0f / i8;
        }
        return 0.0f;
    }

    private static int b(int i8, int i9, int i10) {
        return Math.min(Math.max(i8, i9), i10);
    }

    public void c() {
        this.f38330a = null;
        this.f38331b = null;
        this.f38341l = 0;
        this.f38342m = 0;
        this.f38337h = 0;
        this.f38339j = 0.0f;
        this.f38340k = 0.0f;
        this.f38333d = 0;
        this.f38334e = 0;
        this.f38335f = 0;
        this.f38336g = 0;
        this.f38343n = 0.0f;
        this.f38344o = 0;
        this.f38345p = 0;
        this.f38332c = null;
    }

    public void d() {
        int i8 = (int) (this.f38331b.f10944a.getResources().getDisplayMetrics().density * 48.0f);
        int max = Math.max(0, this.f38337h - i8);
        int max2 = Math.max(0, this.f38338i - i8);
        this.f38344o = b(this.f38330a.l(this.f38331b), -max, max);
        this.f38345p = b(this.f38330a.m(this.f38331b), -max2, max2);
    }

    public void e(int i8, int i9, int i10) {
        if (this.f38341l == i9 && this.f38342m == i10) {
            return;
        }
        this.f38341l = i9;
        this.f38342m = i10;
        boolean z7 = this.f38346q;
        int i11 = z7 ? i9 + this.f38344o : this.f38345p + i10;
        int i12 = z7 ? this.f38337h : this.f38338i;
        float f8 = z7 ? this.f38339j : this.f38340k;
        int i13 = z7 ? i11 > 0 ? this.f38335f : this.f38333d : i11 > 0 ? this.f38336g : this.f38334e;
        float min = i13 != 1 ? i13 != 2 ? 0.0f : Math.min(Math.max(i11 * f8, -1.0f), 1.0f) : Math.signum(i11) * f38329r.getInterpolation(Math.min(Math.abs(i11), i12) * f8);
        this.f38330a.b(this.f38331b, i8, this.f38343n, min, true, this.f38346q, false, true);
        this.f38343n = min;
    }
}
