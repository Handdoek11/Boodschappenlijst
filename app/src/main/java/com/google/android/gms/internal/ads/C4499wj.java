package com.google.android.gms.internal.ads;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.wj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4499wj extends AbstractC0813a {
    public static final Parcelable.Creator<C4499wj> CREATOR = new C4608xj();

    /* renamed from: o, reason: collision with root package name */
    public final String f27532o;

    /* renamed from: s, reason: collision with root package name */
    public final String[] f27533s;

    /* renamed from: t, reason: collision with root package name */
    public final String[] f27534t;

    C4499wj(String str, String[] strArr, String[] strArr2) {
        this.f27532o = str;
        this.f27533s = strArr;
        this.f27534t = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f27532o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, str, false);
        AbstractC0814b.t(parcel, 2, this.f27533s, false);
        AbstractC0814b.t(parcel, 3, this.f27534t, false);
        AbstractC0814b.b(parcel, a8);
    }
}
