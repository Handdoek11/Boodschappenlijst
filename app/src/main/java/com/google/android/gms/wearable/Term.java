package com.google.android.gms.wearable;

import B3.Q;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes2.dex */
public class Term extends AbstractC0813a implements ReflectedParcelable {
    public static final Parcelable.Creator<Term> CREATOR = new Q();

    /* renamed from: o, reason: collision with root package name */
    private final int f31342o;

    /* renamed from: s, reason: collision with root package name */
    private final String f31343s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f31344t;

    /* renamed from: u, reason: collision with root package name */
    private final String f31345u;

    /* renamed from: v, reason: collision with root package name */
    private final String f31346v;

    /* renamed from: w, reason: collision with root package name */
    private final int f31347w;

    public Term(int i8, String str, boolean z7, String str2, String str3, int i9) {
        this.f31342o = i8;
        this.f31345u = str2;
        this.f31344t = z7;
        this.f31343s = str;
        this.f31346v = str3;
        this.f31347w = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f31342o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.s(parcel, 2, this.f31343s, false);
        AbstractC0814b.c(parcel, 3, this.f31344t);
        AbstractC0814b.s(parcel, 4, this.f31345u, false);
        AbstractC0814b.s(parcel, 5, this.f31346v, false);
        AbstractC0814b.m(parcel, 6, this.f31347w);
        AbstractC0814b.b(parcel, a8);
    }
}
