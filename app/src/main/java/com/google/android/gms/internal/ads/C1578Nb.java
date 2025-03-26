package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Nb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1578Nb {

    /* renamed from: a, reason: collision with root package name */
    private final int f17554a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17555b;

    /* renamed from: c, reason: collision with root package name */
    private final int f17556c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f17557d;

    /* renamed from: e, reason: collision with root package name */
    private final C2309cc f17558e;

    /* renamed from: f, reason: collision with root package name */
    private final C3069jc f17559f;

    /* renamed from: n, reason: collision with root package name */
    private int f17567n;

    /* renamed from: g, reason: collision with root package name */
    private final Object f17560g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList f17561h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private final ArrayList f17562i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private final ArrayList f17563j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private int f17564k = 0;

    /* renamed from: l, reason: collision with root package name */
    private int f17565l = 0;

    /* renamed from: m, reason: collision with root package name */
    private int f17566m = 0;

    /* renamed from: o, reason: collision with root package name */
    private String f17568o = "";

    /* renamed from: p, reason: collision with root package name */
    private String f17569p = "";

    /* renamed from: q, reason: collision with root package name */
    private String f17570q = "";

    public C1578Nb(int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z7) {
        this.f17554a = i8;
        this.f17555b = i9;
        this.f17556c = i10;
        this.f17557d = z7;
        this.f17558e = new C2309cc(i11);
        this.f17559f = new C3069jc(i12, i13, i14);
    }

    private final void m(String str, boolean z7, float f8, float f9, float f10, float f11) {
        if (str != null) {
            if (str.length() < this.f17556c) {
                return;
            }
            synchronized (this.f17560g) {
                try {
                    this.f17561h.add(str);
                    this.f17564k += str.length();
                    if (z7) {
                        this.f17562i.add(str);
                        this.f17563j.add(new C1963Yb(f8, f9, f10, f11, this.f17562i.size() - 1));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static final String n(ArrayList arrayList, int i8) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            sb.append((String) arrayList.get(i9));
            sb.append(' ');
            i9++;
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    final int a(int i8, int i9) {
        return this.f17557d ? this.f17555b : (i8 * this.f17554a) + (i9 * this.f17555b);
    }

    final int b() {
        return this.f17564k;
    }

    public final String c() {
        return this.f17568o;
    }

    public final String d() {
        return this.f17570q;
    }

    public final void e() {
        synchronized (this.f17560g) {
            this.f17566m--;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1578Nb)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((C1578Nb) obj).f17568o;
        return str != null && str.equals(this.f17568o);
    }

    public final void f() {
        synchronized (this.f17560g) {
            this.f17566m++;
        }
    }

    public final void g(int i8) {
        this.f17565l = i8;
    }

    public final void h(String str, boolean z7, float f8, float f9, float f10, float f11) {
        m(str, z7, f8, f9, f10, f11);
    }

    public final int hashCode() {
        return this.f17568o.hashCode();
    }

    public final void i(String str, boolean z7, float f8, float f9, float f10, float f11) {
        m(str, z7, f8, f9, f10, f11);
        synchronized (this.f17560g) {
            try {
                if (this.f17566m < 0) {
                    H2.p.b("ActivityContent: negative number of WebViews.");
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        synchronized (this.f17560g) {
            try {
                int a8 = a(this.f17564k, this.f17565l);
                if (a8 > this.f17567n) {
                    this.f17567n = a8;
                    if (!C2.v.s().j().R()) {
                        this.f17568o = this.f17558e.a(this.f17561h);
                        this.f17569p = this.f17558e.a(this.f17562i);
                    }
                    if (!C2.v.s().j().O()) {
                        this.f17570q = this.f17559f.a(this.f17562i, this.f17563j);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (this.f17560g) {
            try {
                int a8 = a(this.f17564k, this.f17565l);
                if (a8 > this.f17567n) {
                    this.f17567n = a8;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean l() {
        boolean z7;
        synchronized (this.f17560g) {
            z7 = this.f17566m == 0;
        }
        return z7;
    }

    public final String toString() {
        ArrayList arrayList = this.f17561h;
        return "ActivityContent fetchId: " + this.f17565l + " score:" + this.f17567n + " total_length:" + this.f17564k + "\n text: " + n(arrayList, 100) + "\n viewableText" + n(this.f17562i, 100) + "\n signture: " + this.f17568o + "\n viewableSignture: " + this.f17569p + "\n viewableSignatureForVertical: " + this.f17570q;
    }
}
