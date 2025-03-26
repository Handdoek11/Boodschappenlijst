package com.google.android.gms.internal.ads;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.kd0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3181kd0 extends AbstractC0813a {
    public static final Parcelable.Creator<C3181kd0> CREATOR = new C3290ld0();

    /* renamed from: o, reason: collision with root package name */
    public final int f23626o;

    /* renamed from: s, reason: collision with root package name */
    public final byte[] f23627s;

    /* renamed from: t, reason: collision with root package name */
    public final int f23628t;

    C3181kd0(int i8, byte[] bArr, int i9) {
        this.f23626o = i8;
        this.f23627s = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f23628t = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f23626o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.g(parcel, 2, this.f23627s, false);
        AbstractC0814b.m(parcel, 3, this.f23628t);
        AbstractC0814b.b(parcel, a8);
    }

    public C3181kd0(byte[] bArr, int i8) {
        this(1, null, 1);
    }
}
