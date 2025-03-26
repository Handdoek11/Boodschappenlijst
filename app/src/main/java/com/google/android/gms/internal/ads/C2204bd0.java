package com.google.android.gms.internal.ads;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.ads.bd0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2204bd0 extends AbstractC0813a {
    public static final Parcelable.Creator<C2204bd0> CREATOR = new C2312cd0();

    /* renamed from: o, reason: collision with root package name */
    public final int f20901o;

    /* renamed from: s, reason: collision with root package name */
    private E8 f20902s = null;

    /* renamed from: t, reason: collision with root package name */
    private byte[] f20903t;

    C2204bd0(int i8, byte[] bArr) {
        this.f20901o = i8;
        this.f20903t = bArr;
        zzb();
    }

    private final void zzb() {
        E8 e8 = this.f20902s;
        if (e8 != null || this.f20903t == null) {
            if (e8 == null || this.f20903t != null) {
                if (e8 != null && this.f20903t != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (e8 != null || this.f20903t != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    public final E8 A0() {
        if (this.f20902s == null) {
            try {
                this.f20902s = E8.X0(this.f20903t, Eu0.a());
                this.f20903t = null;
            } catch (zzgyg | NullPointerException e8) {
                throw new IllegalStateException(e8);
            }
        }
        zzb();
        return this.f20902s;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f20901o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        byte[] bArr = this.f20903t;
        if (bArr == null) {
            bArr = this.f20902s.m();
        }
        AbstractC0814b.g(parcel, 2, bArr, false);
        AbstractC0814b.b(parcel, a8);
    }
}
