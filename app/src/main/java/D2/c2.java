package D2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import w2.C6882h;

/* loaded from: classes.dex */
public final class c2 extends AbstractC0813a {
    public static final Parcelable.Creator<c2> CREATOR = new d2();

    /* renamed from: A, reason: collision with root package name */
    public boolean f1215A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1216B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1217C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1218D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f1219E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f1220F;

    /* renamed from: o, reason: collision with root package name */
    public final String f1221o;

    /* renamed from: s, reason: collision with root package name */
    public final int f1222s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1223t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1224u;

    /* renamed from: v, reason: collision with root package name */
    public final int f1225v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1226w;

    /* renamed from: x, reason: collision with root package name */
    public final c2[] f1227x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1228y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f1229z;

    public c2() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static int A0(DisplayMetrics displayMetrics) {
        return (int) (E0(displayMetrics) * displayMetrics.density);
    }

    public static c2 B0() {
        return new c2("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static c2 C0() {
        return new c2("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static c2 D0() {
        return new c2("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    private static int E0(DisplayMetrics displayMetrics) {
        int i8 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i8 <= 400) {
            return 32;
        }
        return i8 <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f1221o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 2, str, false);
        AbstractC0814b.m(parcel, 3, this.f1222s);
        AbstractC0814b.m(parcel, 4, this.f1223t);
        AbstractC0814b.c(parcel, 5, this.f1224u);
        AbstractC0814b.m(parcel, 6, this.f1225v);
        AbstractC0814b.m(parcel, 7, this.f1226w);
        AbstractC0814b.v(parcel, 8, this.f1227x, i8, false);
        AbstractC0814b.c(parcel, 9, this.f1228y);
        AbstractC0814b.c(parcel, 10, this.f1229z);
        AbstractC0814b.c(parcel, 11, this.f1215A);
        AbstractC0814b.c(parcel, 12, this.f1216B);
        AbstractC0814b.c(parcel, 13, this.f1217C);
        AbstractC0814b.c(parcel, 14, this.f1218D);
        AbstractC0814b.c(parcel, 15, this.f1219E);
        AbstractC0814b.c(parcel, 16, this.f1220F);
        AbstractC0814b.b(parcel, a8);
    }

    public c2(Context context, C6882h c6882h) {
        this(context, new C6882h[]{c6882h});
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c2(android.content.Context r13, w2.C6882h[] r14) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.c2.<init>(android.content.Context, w2.h[]):void");
    }

    c2(String str, int i8, int i9, boolean z7, int i10, int i11, c2[] c2VarArr, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f1221o = str;
        this.f1222s = i8;
        this.f1223t = i9;
        this.f1224u = z7;
        this.f1225v = i10;
        this.f1226w = i11;
        this.f1227x = c2VarArr;
        this.f1228y = z8;
        this.f1229z = z9;
        this.f1215A = z10;
        this.f1216B = z11;
        this.f1217C = z12;
        this.f1218D = z13;
        this.f1219E = z14;
        this.f1220F = z15;
    }
}
