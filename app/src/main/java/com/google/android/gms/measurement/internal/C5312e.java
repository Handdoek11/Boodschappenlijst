package com.google.android.gms.measurement.internal;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5312e extends AbstractC0813a {
    public static final Parcelable.Creator<C5312e> CREATOR = new C5305d();

    /* renamed from: A, reason: collision with root package name */
    public long f30919A;

    /* renamed from: B, reason: collision with root package name */
    public E f30920B;

    /* renamed from: o, reason: collision with root package name */
    public String f30921o;

    /* renamed from: s, reason: collision with root package name */
    public String f30922s;

    /* renamed from: t, reason: collision with root package name */
    public Y5 f30923t;

    /* renamed from: u, reason: collision with root package name */
    public long f30924u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f30925v;

    /* renamed from: w, reason: collision with root package name */
    public String f30926w;

    /* renamed from: x, reason: collision with root package name */
    public E f30927x;

    /* renamed from: y, reason: collision with root package name */
    public long f30928y;

    /* renamed from: z, reason: collision with root package name */
    public E f30929z;

    C5312e(C5312e c5312e) {
        Z2.r.l(c5312e);
        this.f30921o = c5312e.f30921o;
        this.f30922s = c5312e.f30922s;
        this.f30923t = c5312e.f30923t;
        this.f30924u = c5312e.f30924u;
        this.f30925v = c5312e.f30925v;
        this.f30926w = c5312e.f30926w;
        this.f30927x = c5312e.f30927x;
        this.f30928y = c5312e.f30928y;
        this.f30929z = c5312e.f30929z;
        this.f30919A = c5312e.f30919A;
        this.f30920B = c5312e.f30920B;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 2, this.f30921o, false);
        AbstractC0814b.s(parcel, 3, this.f30922s, false);
        AbstractC0814b.r(parcel, 4, this.f30923t, i8, false);
        AbstractC0814b.p(parcel, 5, this.f30924u);
        AbstractC0814b.c(parcel, 6, this.f30925v);
        AbstractC0814b.s(parcel, 7, this.f30926w, false);
        AbstractC0814b.r(parcel, 8, this.f30927x, i8, false);
        AbstractC0814b.p(parcel, 9, this.f30928y);
        AbstractC0814b.r(parcel, 10, this.f30929z, i8, false);
        AbstractC0814b.p(parcel, 11, this.f30919A);
        AbstractC0814b.r(parcel, 12, this.f30920B, i8, false);
        AbstractC0814b.b(parcel, a8);
    }

    C5312e(String str, String str2, Y5 y52, long j8, boolean z7, String str3, E e8, long j9, E e9, long j10, E e10) {
        this.f30921o = str;
        this.f30922s = str2;
        this.f30923t = y52;
        this.f30924u = j8;
        this.f30925v = z7;
        this.f30926w = str3;
        this.f30927x = e8;
        this.f30928y = j9;
        this.f30929z = e9;
        this.f30919A = j10;
        this.f30920B = e10;
    }
}
