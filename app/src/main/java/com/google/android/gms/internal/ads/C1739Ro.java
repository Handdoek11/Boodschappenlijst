package com.google.android.gms.internal.ads;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Ro, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1739Ro extends AbstractC0813a {
    public static final Parcelable.Creator<C1739Ro> CREATOR = new C1774So();

    /* renamed from: o, reason: collision with root package name */
    public final D2.X1 f18699o;

    /* renamed from: s, reason: collision with root package name */
    public final String f18700s;

    public C1739Ro(D2.X1 x12, String str) {
        this.f18699o = x12;
        this.f18700s = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        D2.X1 x12 = this.f18699o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.r(parcel, 2, x12, i8, false);
        AbstractC0814b.s(parcel, 3, this.f18700s, false);
        AbstractC0814b.b(parcel, a8);
    }
}
