package com.google.android.gms.measurement.internal;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes2.dex */
public final class M5 extends AbstractC0813a {
    public static final Parcelable.Creator<M5> CREATOR = new e6();

    /* renamed from: A, reason: collision with root package name */
    public final long f30591A;

    /* renamed from: B, reason: collision with root package name */
    public final String f30592B;

    /* renamed from: C, reason: collision with root package name */
    private final long f30593C;

    /* renamed from: D, reason: collision with root package name */
    public final long f30594D;

    /* renamed from: E, reason: collision with root package name */
    public final int f30595E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f30596F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f30597G;

    /* renamed from: H, reason: collision with root package name */
    public final String f30598H;

    /* renamed from: I, reason: collision with root package name */
    public final Boolean f30599I;

    /* renamed from: J, reason: collision with root package name */
    public final long f30600J;

    /* renamed from: K, reason: collision with root package name */
    public final List f30601K;

    /* renamed from: L, reason: collision with root package name */
    private final String f30602L;

    /* renamed from: M, reason: collision with root package name */
    public final String f30603M;

    /* renamed from: N, reason: collision with root package name */
    public final String f30604N;

    /* renamed from: O, reason: collision with root package name */
    public final String f30605O;

    /* renamed from: P, reason: collision with root package name */
    public final boolean f30606P;

    /* renamed from: Q, reason: collision with root package name */
    public final long f30607Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f30608R;

    /* renamed from: S, reason: collision with root package name */
    public final String f30609S;

    /* renamed from: T, reason: collision with root package name */
    public final int f30610T;

    /* renamed from: U, reason: collision with root package name */
    public final long f30611U;

    /* renamed from: V, reason: collision with root package name */
    public final String f30612V;

    /* renamed from: W, reason: collision with root package name */
    public final String f30613W;

    /* renamed from: o, reason: collision with root package name */
    public final String f30614o;

    /* renamed from: s, reason: collision with root package name */
    public final String f30615s;

    /* renamed from: t, reason: collision with root package name */
    public final String f30616t;

    /* renamed from: u, reason: collision with root package name */
    public final String f30617u;

    /* renamed from: v, reason: collision with root package name */
    public final long f30618v;

    /* renamed from: w, reason: collision with root package name */
    public final long f30619w;

    /* renamed from: x, reason: collision with root package name */
    public final String f30620x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f30621y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f30622z;

    M5(String str, String str2, String str3, long j8, String str4, long j9, long j10, String str5, boolean z7, boolean z8, String str6, long j11, long j12, int i8, boolean z9, boolean z10, String str7, Boolean bool, long j13, List list, String str8, String str9, String str10, String str11, boolean z11, long j14, int i9, String str12, int i10, long j15, String str13, String str14) {
        Z2.r.f(str);
        this.f30614o = str;
        this.f30615s = TextUtils.isEmpty(str2) ? null : str2;
        this.f30616t = str3;
        this.f30591A = j8;
        this.f30617u = str4;
        this.f30618v = j9;
        this.f30619w = j10;
        this.f30620x = str5;
        this.f30621y = z7;
        this.f30622z = z8;
        this.f30592B = str6;
        this.f30593C = j11;
        this.f30594D = j12;
        this.f30595E = i8;
        this.f30596F = z9;
        this.f30597G = z10;
        this.f30598H = str7;
        this.f30599I = bool;
        this.f30600J = j13;
        this.f30601K = list;
        this.f30602L = null;
        this.f30603M = str9;
        this.f30604N = str10;
        this.f30605O = str11;
        this.f30606P = z11;
        this.f30607Q = j14;
        this.f30608R = i9;
        this.f30609S = str12;
        this.f30610T = i10;
        this.f30611U = j15;
        this.f30612V = str13;
        this.f30613W = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 2, this.f30614o, false);
        AbstractC0814b.s(parcel, 3, this.f30615s, false);
        AbstractC0814b.s(parcel, 4, this.f30616t, false);
        AbstractC0814b.s(parcel, 5, this.f30617u, false);
        AbstractC0814b.p(parcel, 6, this.f30618v);
        AbstractC0814b.p(parcel, 7, this.f30619w);
        AbstractC0814b.s(parcel, 8, this.f30620x, false);
        AbstractC0814b.c(parcel, 9, this.f30621y);
        AbstractC0814b.c(parcel, 10, this.f30622z);
        AbstractC0814b.p(parcel, 11, this.f30591A);
        AbstractC0814b.s(parcel, 12, this.f30592B, false);
        AbstractC0814b.p(parcel, 13, this.f30593C);
        AbstractC0814b.p(parcel, 14, this.f30594D);
        AbstractC0814b.m(parcel, 15, this.f30595E);
        AbstractC0814b.c(parcel, 16, this.f30596F);
        AbstractC0814b.c(parcel, 18, this.f30597G);
        AbstractC0814b.s(parcel, 19, this.f30598H, false);
        AbstractC0814b.d(parcel, 21, this.f30599I, false);
        AbstractC0814b.p(parcel, 22, this.f30600J);
        AbstractC0814b.u(parcel, 23, this.f30601K, false);
        AbstractC0814b.s(parcel, 24, this.f30602L, false);
        AbstractC0814b.s(parcel, 25, this.f30603M, false);
        AbstractC0814b.s(parcel, 26, this.f30604N, false);
        AbstractC0814b.s(parcel, 27, this.f30605O, false);
        AbstractC0814b.c(parcel, 28, this.f30606P);
        AbstractC0814b.p(parcel, 29, this.f30607Q);
        AbstractC0814b.m(parcel, 30, this.f30608R);
        AbstractC0814b.s(parcel, 31, this.f30609S, false);
        AbstractC0814b.m(parcel, 32, this.f30610T);
        AbstractC0814b.p(parcel, 34, this.f30611U);
        AbstractC0814b.s(parcel, 35, this.f30612V, false);
        AbstractC0814b.s(parcel, 36, this.f30613W, false);
        AbstractC0814b.b(parcel, a8);
    }

    M5(String str, String str2, String str3, String str4, long j8, long j9, String str5, boolean z7, boolean z8, long j10, String str6, long j11, long j12, int i8, boolean z9, boolean z10, String str7, Boolean bool, long j13, List list, String str8, String str9, String str10, String str11, boolean z11, long j14, int i9, String str12, int i10, long j15, String str13, String str14) {
        this.f30614o = str;
        this.f30615s = str2;
        this.f30616t = str3;
        this.f30591A = j10;
        this.f30617u = str4;
        this.f30618v = j8;
        this.f30619w = j9;
        this.f30620x = str5;
        this.f30621y = z7;
        this.f30622z = z8;
        this.f30592B = str6;
        this.f30593C = j11;
        this.f30594D = j12;
        this.f30595E = i8;
        this.f30596F = z9;
        this.f30597G = z10;
        this.f30598H = str7;
        this.f30599I = bool;
        this.f30600J = j13;
        this.f30601K = list;
        this.f30602L = str8;
        this.f30603M = str9;
        this.f30604N = str10;
        this.f30605O = str11;
        this.f30606P = z11;
        this.f30607Q = j14;
        this.f30608R = i9;
        this.f30609S = str12;
        this.f30610T = i10;
        this.f30611U = j15;
        this.f30612V = str13;
        this.f30613W = str14;
    }
}
