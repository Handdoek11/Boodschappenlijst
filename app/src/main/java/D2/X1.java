package D2;

import Z2.AbstractC0777p;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class X1 extends AbstractC0813a {
    public static final Parcelable.Creator<X1> CREATOR = new Z1();

    /* renamed from: A, reason: collision with root package name */
    public final M1 f1169A;

    /* renamed from: B, reason: collision with root package name */
    public final Location f1170B;

    /* renamed from: C, reason: collision with root package name */
    public final String f1171C;

    /* renamed from: D, reason: collision with root package name */
    public final Bundle f1172D;

    /* renamed from: E, reason: collision with root package name */
    public final Bundle f1173E;

    /* renamed from: F, reason: collision with root package name */
    public final List f1174F;

    /* renamed from: G, reason: collision with root package name */
    public final String f1175G;

    /* renamed from: H, reason: collision with root package name */
    public final String f1176H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f1177I;

    /* renamed from: J, reason: collision with root package name */
    public final X f1178J;

    /* renamed from: K, reason: collision with root package name */
    public final int f1179K;

    /* renamed from: L, reason: collision with root package name */
    public final String f1180L;

    /* renamed from: M, reason: collision with root package name */
    public final List f1181M;

    /* renamed from: N, reason: collision with root package name */
    public final int f1182N;

    /* renamed from: O, reason: collision with root package name */
    public final String f1183O;

    /* renamed from: P, reason: collision with root package name */
    public final int f1184P;

    /* renamed from: Q, reason: collision with root package name */
    public final long f1185Q;

    /* renamed from: o, reason: collision with root package name */
    public final int f1186o;

    /* renamed from: s, reason: collision with root package name */
    public final long f1187s;

    /* renamed from: t, reason: collision with root package name */
    public final Bundle f1188t;

    /* renamed from: u, reason: collision with root package name */
    public final int f1189u;

    /* renamed from: v, reason: collision with root package name */
    public final List f1190v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f1191w;

    /* renamed from: x, reason: collision with root package name */
    public final int f1192x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1193y;

    /* renamed from: z, reason: collision with root package name */
    public final String f1194z;

    public X1(int i8, long j8, Bundle bundle, int i9, List list, boolean z7, int i10, boolean z8, String str, M1 m12, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z9, X x7, int i11, String str5, List list3, int i12, String str6, int i13, long j9) {
        this.f1186o = i8;
        this.f1187s = j8;
        this.f1188t = bundle == null ? new Bundle() : bundle;
        this.f1189u = i9;
        this.f1190v = list;
        this.f1191w = z7;
        this.f1192x = i10;
        this.f1193y = z8;
        this.f1194z = str;
        this.f1169A = m12;
        this.f1170B = location;
        this.f1171C = str2;
        this.f1172D = bundle2 == null ? new Bundle() : bundle2;
        this.f1173E = bundle3;
        this.f1174F = list2;
        this.f1175G = str3;
        this.f1176H = str4;
        this.f1177I = z9;
        this.f1178J = x7;
        this.f1179K = i11;
        this.f1180L = str5;
        this.f1181M = list3 == null ? new ArrayList() : list3;
        this.f1182N = i12;
        this.f1183O = str6;
        this.f1184P = i13;
        this.f1185Q = j9;
    }

    public final boolean A0(Object obj) {
        if (!(obj instanceof X1)) {
            return false;
        }
        X1 x12 = (X1) obj;
        return this.f1186o == x12.f1186o && this.f1187s == x12.f1187s && H2.q.a(this.f1188t, x12.f1188t) && this.f1189u == x12.f1189u && AbstractC0777p.a(this.f1190v, x12.f1190v) && this.f1191w == x12.f1191w && this.f1192x == x12.f1192x && this.f1193y == x12.f1193y && AbstractC0777p.a(this.f1194z, x12.f1194z) && AbstractC0777p.a(this.f1169A, x12.f1169A) && AbstractC0777p.a(this.f1170B, x12.f1170B) && AbstractC0777p.a(this.f1171C, x12.f1171C) && H2.q.a(this.f1172D, x12.f1172D) && H2.q.a(this.f1173E, x12.f1173E) && AbstractC0777p.a(this.f1174F, x12.f1174F) && AbstractC0777p.a(this.f1175G, x12.f1175G) && AbstractC0777p.a(this.f1176H, x12.f1176H) && this.f1177I == x12.f1177I && this.f1179K == x12.f1179K && AbstractC0777p.a(this.f1180L, x12.f1180L) && AbstractC0777p.a(this.f1181M, x12.f1181M) && this.f1182N == x12.f1182N && AbstractC0777p.a(this.f1183O, x12.f1183O) && this.f1184P == x12.f1184P;
    }

    public final boolean B0() {
        return this.f1188t.getBoolean("is_sdk_preload", false);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof X1) {
            return A0(obj) && this.f1185Q == ((X1) obj).f1185Q;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0777p.b(Integer.valueOf(this.f1186o), Long.valueOf(this.f1187s), this.f1188t, Integer.valueOf(this.f1189u), this.f1190v, Boolean.valueOf(this.f1191w), Integer.valueOf(this.f1192x), Boolean.valueOf(this.f1193y), this.f1194z, this.f1169A, this.f1170B, this.f1171C, this.f1172D, this.f1173E, this.f1174F, this.f1175G, this.f1176H, Boolean.valueOf(this.f1177I), Integer.valueOf(this.f1179K), this.f1180L, this.f1181M, Integer.valueOf(this.f1182N), this.f1183O, Integer.valueOf(this.f1184P), Long.valueOf(this.f1185Q));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f1186o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.p(parcel, 2, this.f1187s);
        AbstractC0814b.e(parcel, 3, this.f1188t, false);
        AbstractC0814b.m(parcel, 4, this.f1189u);
        AbstractC0814b.u(parcel, 5, this.f1190v, false);
        AbstractC0814b.c(parcel, 6, this.f1191w);
        AbstractC0814b.m(parcel, 7, this.f1192x);
        AbstractC0814b.c(parcel, 8, this.f1193y);
        AbstractC0814b.s(parcel, 9, this.f1194z, false);
        AbstractC0814b.r(parcel, 10, this.f1169A, i8, false);
        AbstractC0814b.r(parcel, 11, this.f1170B, i8, false);
        AbstractC0814b.s(parcel, 12, this.f1171C, false);
        AbstractC0814b.e(parcel, 13, this.f1172D, false);
        AbstractC0814b.e(parcel, 14, this.f1173E, false);
        AbstractC0814b.u(parcel, 15, this.f1174F, false);
        AbstractC0814b.s(parcel, 16, this.f1175G, false);
        AbstractC0814b.s(parcel, 17, this.f1176H, false);
        AbstractC0814b.c(parcel, 18, this.f1177I);
        AbstractC0814b.r(parcel, 19, this.f1178J, i8, false);
        AbstractC0814b.m(parcel, 20, this.f1179K);
        AbstractC0814b.s(parcel, 21, this.f1180L, false);
        AbstractC0814b.u(parcel, 22, this.f1181M, false);
        AbstractC0814b.m(parcel, 23, this.f1182N);
        AbstractC0814b.s(parcel, 24, this.f1183O, false);
        AbstractC0814b.m(parcel, 25, this.f1184P);
        AbstractC0814b.p(parcel, 26, this.f1185Q);
        AbstractC0814b.b(parcel, a8);
    }
}
