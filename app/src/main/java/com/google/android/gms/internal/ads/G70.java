package com.google.android.gms.internal.ads;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class G70 extends AbstractC0813a {
    public static final Parcelable.Creator<G70> CREATOR = new H70();

    /* renamed from: A, reason: collision with root package name */
    private final int f15275A;

    /* renamed from: B, reason: collision with root package name */
    private final int[] f15276B;

    /* renamed from: C, reason: collision with root package name */
    private final int[] f15277C;

    /* renamed from: D, reason: collision with root package name */
    public final int f15278D;

    /* renamed from: o, reason: collision with root package name */
    private final D70[] f15279o;

    /* renamed from: s, reason: collision with root package name */
    public final Context f15280s;

    /* renamed from: t, reason: collision with root package name */
    private final int f15281t;

    /* renamed from: u, reason: collision with root package name */
    public final D70 f15282u;

    /* renamed from: v, reason: collision with root package name */
    public final int f15283v;

    /* renamed from: w, reason: collision with root package name */
    public final int f15284w;

    /* renamed from: x, reason: collision with root package name */
    public final int f15285x;

    /* renamed from: y, reason: collision with root package name */
    public final String f15286y;

    /* renamed from: z, reason: collision with root package name */
    private final int f15287z;

    public G70(int i8, int i9, int i10, int i11, String str, int i12, int i13) {
        D70[] values = D70.values();
        this.f15279o = values;
        int[] a8 = E70.a();
        this.f15276B = a8;
        int[] a9 = F70.a();
        this.f15277C = a9;
        this.f15280s = null;
        this.f15281t = i8;
        this.f15282u = values[i8];
        this.f15283v = i9;
        this.f15284w = i10;
        this.f15285x = i11;
        this.f15286y = str;
        this.f15287z = i12;
        this.f15278D = a8[i12];
        this.f15275A = i13;
        int i14 = a9[i13];
    }

    public static G70 A0(D70 d70, Context context) {
        if (d70 == D70.Rewarded) {
            return new G70(context, d70, ((Integer) D2.A.c().a(AbstractC3184kf.f23917i6)).intValue(), ((Integer) D2.A.c().a(AbstractC3184kf.f23971o6)).intValue(), ((Integer) D2.A.c().a(AbstractC3184kf.f23989q6)).intValue(), (String) D2.A.c().a(AbstractC3184kf.f24007s6), (String) D2.A.c().a(AbstractC3184kf.f23935k6), (String) D2.A.c().a(AbstractC3184kf.f23953m6));
        }
        if (d70 == D70.Interstitial) {
            return new G70(context, d70, ((Integer) D2.A.c().a(AbstractC3184kf.f23926j6)).intValue(), ((Integer) D2.A.c().a(AbstractC3184kf.f23980p6)).intValue(), ((Integer) D2.A.c().a(AbstractC3184kf.f23998r6)).intValue(), (String) D2.A.c().a(AbstractC3184kf.f24016t6), (String) D2.A.c().a(AbstractC3184kf.f23944l6), (String) D2.A.c().a(AbstractC3184kf.f23962n6));
        }
        if (d70 != D70.AppOpen) {
            return null;
        }
        return new G70(context, d70, ((Integer) D2.A.c().a(AbstractC3184kf.f24040w6)).intValue(), ((Integer) D2.A.c().a(AbstractC3184kf.f24056y6)).intValue(), ((Integer) D2.A.c().a(AbstractC3184kf.f24064z6)).intValue(), (String) D2.A.c().a(AbstractC3184kf.f24024u6), (String) D2.A.c().a(AbstractC3184kf.f24032v6), (String) D2.A.c().a(AbstractC3184kf.f24048x6));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f15281t;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.m(parcel, 2, this.f15283v);
        AbstractC0814b.m(parcel, 3, this.f15284w);
        AbstractC0814b.m(parcel, 4, this.f15285x);
        AbstractC0814b.s(parcel, 5, this.f15286y, false);
        AbstractC0814b.m(parcel, 6, this.f15287z);
        AbstractC0814b.m(parcel, 7, this.f15275A);
        AbstractC0814b.b(parcel, a8);
    }

    private G70(Context context, D70 d70, int i8, int i9, int i10, String str, String str2, String str3) {
        int i11;
        this.f15279o = D70.values();
        this.f15276B = E70.a();
        this.f15277C = F70.a();
        this.f15280s = context;
        this.f15281t = d70.ordinal();
        this.f15282u = d70;
        this.f15283v = i8;
        this.f15284w = i9;
        this.f15285x = i10;
        this.f15286y = str;
        if ("oldest".equals(str2)) {
            i11 = 1;
        } else {
            i11 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.f15278D = i11;
        this.f15287z = i11 - 1;
        "onAdClosed".equals(str3);
        this.f15275A = 0;
    }
}
