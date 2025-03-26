package com.google.android.gms.internal.ads;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.Wc0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1896Wc0 extends AbstractC0813a {
    public static final Parcelable.Creator<C1896Wc0> CREATOR = new C1931Xc0();

    /* renamed from: o, reason: collision with root package name */
    public final int f19820o;

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f19821s;

    C1896Wc0(int i8, byte[] bArr) {
        this.f19820o = i8;
        this.f19821s = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f19820o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.g(parcel, 2, this.f19821s, false);
        AbstractC0814b.b(parcel, a8);
    }

    public C1896Wc0(byte[] bArr) {
        this(1, bArr);
    }
}
