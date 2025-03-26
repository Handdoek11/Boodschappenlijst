package w2;

import D2.C0555y;
import D2.c2;
import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;

/* renamed from: w2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6882h {

    /* renamed from: a, reason: collision with root package name */
    private final int f44282a;

    /* renamed from: b, reason: collision with root package name */
    private final int f44283b;

    /* renamed from: c, reason: collision with root package name */
    private final String f44284c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f44285d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f44286e;

    /* renamed from: f, reason: collision with root package name */
    private int f44287f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f44288g;

    /* renamed from: h, reason: collision with root package name */
    private int f44289h;

    /* renamed from: i, reason: collision with root package name */
    public static final C6882h f44271i = new C6882h(320, 50, "320x50_mb");

    /* renamed from: j, reason: collision with root package name */
    public static final C6882h f44272j = new C6882h(468, 60, "468x60_as");

    /* renamed from: k, reason: collision with root package name */
    public static final C6882h f44273k = new C6882h(320, 100, "320x100_as");

    /* renamed from: l, reason: collision with root package name */
    public static final C6882h f44274l = new C6882h(728, 90, "728x90_as");

    /* renamed from: m, reason: collision with root package name */
    public static final C6882h f44275m = new C6882h(300, 250, "300x250_as");

    /* renamed from: n, reason: collision with root package name */
    public static final C6882h f44276n = new C6882h(160, 600, "160x600_as");

    /* renamed from: o, reason: collision with root package name */
    public static final C6882h f44277o = new C6882h(-1, -2, "smart_banner");

    /* renamed from: p, reason: collision with root package name */
    public static final C6882h f44278p = new C6882h(-3, -4, "fluid");

    /* renamed from: q, reason: collision with root package name */
    public static final C6882h f44279q = new C6882h(0, 0, "invalid");

    /* renamed from: s, reason: collision with root package name */
    public static final C6882h f44281s = new C6882h(50, 50, "50x50_mb");

    /* renamed from: r, reason: collision with root package name */
    public static final C6882h f44280r = new C6882h(-3, 0, "search_v2");

    public C6882h(int i8, int i9) {
        this(i8, i9, (i8 == -1 ? "FULL" : String.valueOf(i8)) + "x" + (i9 == -2 ? "AUTO" : String.valueOf(i9)) + "_as");
    }

    public static C6882h a(Context context, int i8) {
        C6882h h8 = H2.g.h(context, i8, 50, 0);
        h8.f44285d = true;
        return h8;
    }

    public static C6882h b(Context context, int i8) {
        int e8 = H2.g.e(context, 0);
        if (e8 == -1) {
            return f44279q;
        }
        C6882h c6882h = new C6882h(i8, 0);
        c6882h.f44287f = e8;
        c6882h.f44286e = true;
        return c6882h;
    }

    public int c() {
        return this.f44283b;
    }

    public int d(Context context) {
        int i8 = this.f44283b;
        if (i8 == -4 || i8 == -3) {
            return -1;
        }
        if (i8 == -2) {
            return c2.A0(context.getResources().getDisplayMetrics());
        }
        C0555y.b();
        return H2.g.B(context, i8);
    }

    public int e() {
        return this.f44282a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6882h)) {
            return false;
        }
        C6882h c6882h = (C6882h) obj;
        return this.f44282a == c6882h.f44282a && this.f44283b == c6882h.f44283b && this.f44284c.equals(c6882h.f44284c);
    }

    public int f(Context context) {
        int i8 = this.f44282a;
        if (i8 == -3) {
            return -1;
        }
        if (i8 != -1) {
            C0555y.b();
            return H2.g.B(context, i8);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<c2> creator = c2.CREATOR;
        return displayMetrics.widthPixels;
    }

    public boolean g() {
        return this.f44282a == -3 && this.f44283b == -4;
    }

    final int h() {
        return this.f44289h;
    }

    public int hashCode() {
        return this.f44284c.hashCode();
    }

    final int i() {
        return this.f44287f;
    }

    final void j(int i8) {
        this.f44287f = i8;
    }

    final void k(int i8) {
        this.f44289h = i8;
    }

    final void l(boolean z7) {
        this.f44286e = true;
    }

    final void m(boolean z7) {
        this.f44288g = true;
    }

    final boolean n() {
        return this.f44285d;
    }

    final boolean o() {
        return this.f44286e;
    }

    final boolean p() {
        return this.f44288g;
    }

    public String toString() {
        return this.f44284c;
    }

    C6882h(int i8, int i9, String str) {
        if (i8 < 0 && i8 != -1 && i8 != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i8);
        }
        if (i9 < 0 && i9 != -2 && i9 != -4) {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i9);
        }
        this.f44282a = i8;
        this.f44283b = i9;
        this.f44284c = str;
    }
}
