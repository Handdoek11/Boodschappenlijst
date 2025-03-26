package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f14307M = 0;

    /* renamed from: A, reason: collision with root package name */
    public final byte[] f14308A;

    /* renamed from: B, reason: collision with root package name */
    public final int f14309B;

    /* renamed from: C, reason: collision with root package name */
    public final Pz0 f14310C;

    /* renamed from: D, reason: collision with root package name */
    public final int f14311D;

    /* renamed from: E, reason: collision with root package name */
    public final int f14312E;

    /* renamed from: F, reason: collision with root package name */
    public final int f14313F;

    /* renamed from: G, reason: collision with root package name */
    public final int f14314G;

    /* renamed from: H, reason: collision with root package name */
    public final int f14315H;

    /* renamed from: I, reason: collision with root package name */
    public final int f14316I;

    /* renamed from: J, reason: collision with root package name */
    public final int f14317J;

    /* renamed from: K, reason: collision with root package name */
    public final int f14318K;

    /* renamed from: L, reason: collision with root package name */
    private int f14319L;

    /* renamed from: a, reason: collision with root package name */
    public final String f14320a;

    /* renamed from: b, reason: collision with root package name */
    public final String f14321b;

    /* renamed from: c, reason: collision with root package name */
    public final List f14322c;

    /* renamed from: d, reason: collision with root package name */
    public final String f14323d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14324e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14325f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14326g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14327h;

    /* renamed from: i, reason: collision with root package name */
    public final int f14328i;

    /* renamed from: j, reason: collision with root package name */
    public final int f14329j;

    /* renamed from: k, reason: collision with root package name */
    public final String f14330k;

    /* renamed from: l, reason: collision with root package name */
    public final C3503nb f14331l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f14332m;

    /* renamed from: n, reason: collision with root package name */
    public final String f14333n;

    /* renamed from: o, reason: collision with root package name */
    public final String f14334o;

    /* renamed from: p, reason: collision with root package name */
    public final int f14335p;

    /* renamed from: q, reason: collision with root package name */
    public final int f14336q;

    /* renamed from: r, reason: collision with root package name */
    public final List f14337r;

    /* renamed from: s, reason: collision with root package name */
    public final C4785zG0 f14338s;

    /* renamed from: t, reason: collision with root package name */
    public final long f14339t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f14340u;

    /* renamed from: v, reason: collision with root package name */
    public final int f14341v;

    /* renamed from: w, reason: collision with root package name */
    public final int f14342w;

    /* renamed from: x, reason: collision with root package name */
    public final float f14343x;

    /* renamed from: y, reason: collision with root package name */
    public final int f14344y;

    /* renamed from: z, reason: collision with root package name */
    public final float f14345z;

    static {
        new D(new C2723gJ0());
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
    }

    public final int a() {
        int i8;
        int i9 = this.f14341v;
        if (i9 == -1 || (i8 = this.f14342w) == -1) {
            return -1;
        }
        return i9 * i8;
    }

    public final C2723gJ0 b() {
        return new C2723gJ0(this, null);
    }

    public final D c(int i8) {
        C2723gJ0 c2723gJ0 = new C2723gJ0(this, null);
        c2723gJ0.d(i8);
        return new D(c2723gJ0);
    }

    public final boolean d(D d8) {
        if (this.f14337r.size() != d8.f14337r.size()) {
            return false;
        }
        for (int i8 = 0; i8 < this.f14337r.size(); i8++) {
            if (!Arrays.equals((byte[]) this.f14337r.get(i8), (byte[]) d8.f14337r.get(i8))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i8;
        if (this == obj) {
            return true;
        }
        if (obj != null && D.class == obj.getClass()) {
            D d8 = (D) obj;
            int i9 = this.f14319L;
            if ((i9 == 0 || (i8 = d8.f14319L) == 0 || i9 == i8) && this.f14324e == d8.f14324e && this.f14325f == d8.f14325f && this.f14327h == d8.f14327h && this.f14328i == d8.f14328i && this.f14335p == d8.f14335p && this.f14339t == d8.f14339t && this.f14341v == d8.f14341v && this.f14342w == d8.f14342w && this.f14344y == d8.f14344y && this.f14309B == d8.f14309B && this.f14311D == d8.f14311D && this.f14312E == d8.f14312E && this.f14313F == d8.f14313F && this.f14314G == d8.f14314G && this.f14315H == d8.f14315H && this.f14316I == d8.f14316I && this.f14318K == d8.f14318K && Float.compare(this.f14343x, d8.f14343x) == 0 && Float.compare(this.f14345z, d8.f14345z) == 0 && Objects.equals(this.f14320a, d8.f14320a) && Objects.equals(this.f14321b, d8.f14321b) && this.f14322c.equals(d8.f14322c) && Objects.equals(this.f14330k, d8.f14330k) && Objects.equals(this.f14333n, d8.f14333n) && Objects.equals(this.f14334o, d8.f14334o) && Objects.equals(this.f14323d, d8.f14323d) && Arrays.equals(this.f14308A, d8.f14308A) && Objects.equals(this.f14331l, d8.f14331l) && Objects.equals(this.f14310C, d8.f14310C) && Objects.equals(this.f14338s, d8.f14338s) && d(d8)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i8 = this.f14319L;
        if (i8 != 0) {
            return i8;
        }
        String str = this.f14320a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f14321b;
        int hashCode2 = ((((hashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f14322c.hashCode();
        String str3 = this.f14323d;
        int hashCode3 = ((((((((((hashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f14324e) * 31) + this.f14325f) * 961) + this.f14327h) * 31) + this.f14328i) * 31;
        String str4 = this.f14330k;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C3503nb c3503nb = this.f14331l;
        int hashCode5 = (hashCode4 + (c3503nb == null ? 0 : c3503nb.hashCode())) * 961;
        String str5 = this.f14333n;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        int hashCode7 = ((((((((((((((((((((((((((((((((((hashCode6 + (this.f14334o != null ? r2.hashCode() : 0)) * 31) + this.f14335p) * 31) + ((int) this.f14339t)) * 31) + this.f14341v) * 31) + this.f14342w) * 31) + Float.floatToIntBits(this.f14343x)) * 31) + this.f14344y) * 31) + Float.floatToIntBits(this.f14345z)) * 31) + this.f14309B) * 31) + this.f14311D) * 31) + this.f14312E) * 31) + this.f14313F) * 31) + this.f14314G) * 31) + this.f14315H) * 31) + this.f14316I) * 31) - 1) * 31) - 1) * 31) + this.f14318K;
        this.f14319L = hashCode7;
        return hashCode7;
    }

    public final String toString() {
        return "Format(" + this.f14320a + ", " + this.f14321b + ", " + this.f14333n + ", " + this.f14334o + ", " + this.f14330k + ", " + this.f14329j + ", " + this.f14323d + ", [" + this.f14341v + ", " + this.f14342w + ", " + this.f14343x + ", " + String.valueOf(this.f14310C) + "], [" + this.f14311D + ", " + this.f14312E + "])";
    }

    private D(C2723gJ0 c2723gJ0) {
        boolean z7;
        String str;
        this.f14320a = c2723gJ0.f22315a;
        String e8 = AbstractC2301cW.e(c2723gJ0.f22318d);
        this.f14323d = e8;
        if (c2723gJ0.f22317c.isEmpty() && c2723gJ0.f22316b != null) {
            this.f14322c = AbstractC4169th0.x(new E0(e8, c2723gJ0.f22316b));
            this.f14321b = c2723gJ0.f22316b;
        } else if (!c2723gJ0.f22317c.isEmpty() && c2723gJ0.f22316b == null) {
            this.f14322c = c2723gJ0.f22317c;
            List list = c2723gJ0.f22317c;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((E0) list.get(0)).f14617b;
                    break;
                }
                E0 e02 = (E0) it.next();
                if (TextUtils.equals(e02.f14616a, e8)) {
                    str = e02.f14617b;
                    break;
                }
            }
            this.f14321b = str;
        } else if (c2723gJ0.f22317c.isEmpty() && c2723gJ0.f22316b == null) {
            z7 = true;
            AbstractC3796qC.f(z7);
            this.f14322c = c2723gJ0.f22317c;
            this.f14321b = c2723gJ0.f22316b;
        } else {
            for (int i8 = 0; i8 < c2723gJ0.f22317c.size(); i8++) {
                if (((E0) c2723gJ0.f22317c.get(i8)).f14617b.equals(c2723gJ0.f22316b)) {
                    z7 = true;
                    break;
                }
            }
            z7 = false;
            AbstractC3796qC.f(z7);
            this.f14322c = c2723gJ0.f22317c;
            this.f14321b = c2723gJ0.f22316b;
        }
        this.f14324e = c2723gJ0.f22319e;
        AbstractC3796qC.g(true, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.f14325f = c2723gJ0.f22320f;
        this.f14326g = 0;
        int i9 = c2723gJ0.f22322h;
        this.f14327h = i9;
        int i10 = c2723gJ0.f22323i;
        this.f14328i = i10;
        this.f14329j = i10 != -1 ? i10 : i9;
        this.f14330k = c2723gJ0.f22324j;
        this.f14331l = c2723gJ0.f22325k;
        this.f14332m = null;
        this.f14333n = c2723gJ0.f22326l;
        this.f14334o = c2723gJ0.f22327m;
        this.f14335p = c2723gJ0.f22328n;
        this.f14336q = c2723gJ0.f22329o;
        this.f14337r = c2723gJ0.f22330p == null ? Collections.emptyList() : c2723gJ0.f22330p;
        C4785zG0 c4785zG0 = c2723gJ0.f22331q;
        this.f14338s = c4785zG0;
        this.f14339t = c2723gJ0.f22332r;
        this.f14340u = c2723gJ0.f22333s;
        this.f14341v = c2723gJ0.f22334t;
        this.f14342w = c2723gJ0.f22335u;
        this.f14343x = c2723gJ0.f22336v;
        this.f14344y = c2723gJ0.f22337w == -1 ? 0 : c2723gJ0.f22337w;
        this.f14345z = c2723gJ0.f22338x == -1.0f ? 1.0f : c2723gJ0.f22338x;
        this.f14308A = c2723gJ0.f22339y;
        this.f14309B = c2723gJ0.f22340z;
        this.f14310C = c2723gJ0.f22306A;
        this.f14311D = c2723gJ0.f22307B;
        this.f14312E = c2723gJ0.f22308C;
        this.f14313F = c2723gJ0.f22309D;
        this.f14314G = c2723gJ0.f22310E == -1 ? 0 : c2723gJ0.f22310E;
        this.f14315H = c2723gJ0.f22311F != -1 ? c2723gJ0.f22311F : 0;
        this.f14316I = c2723gJ0.f22312G;
        this.f14317J = c2723gJ0.f22313H;
        if (c2723gJ0.f22314I != 0 || c4785zG0 == null) {
            this.f14318K = c2723gJ0.f22314I;
        } else {
            this.f14318K = 1;
        }
    }
}
