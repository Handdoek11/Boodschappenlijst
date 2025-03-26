package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.t2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4102t2 extends AbstractC3558o2 {
    public static final Parcelable.Creator<C4102t2> CREATOR = new C3993s2();

    /* renamed from: s, reason: collision with root package name */
    public final int f26788s;

    /* renamed from: t, reason: collision with root package name */
    public final int f26789t;

    /* renamed from: u, reason: collision with root package name */
    public final int f26790u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f26791v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f26792w;

    public C4102t2(int i8, int i9, int i10, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f26788s = i8;
        this.f26789t = i9;
        this.f26790u = i10;
        this.f26791v = iArr;
        this.f26792w = iArr2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3558o2, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4102t2.class == obj.getClass()) {
            C4102t2 c4102t2 = (C4102t2) obj;
            if (this.f26788s == c4102t2.f26788s && this.f26789t == c4102t2.f26789t && this.f26790u == c4102t2.f26790u && Arrays.equals(this.f26791v, c4102t2.f26791v) && Arrays.equals(this.f26792w, c4102t2.f26792w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f26788s + 527) * 31) + this.f26789t) * 31) + this.f26790u) * 31) + Arrays.hashCode(this.f26791v)) * 31) + Arrays.hashCode(this.f26792w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f26788s);
        parcel.writeInt(this.f26789t);
        parcel.writeInt(this.f26790u);
        parcel.writeIntArray(this.f26791v);
        parcel.writeIntArray(this.f26792w);
    }

    C4102t2(Parcel parcel) {
        super("MLLT");
        this.f26788s = parcel.readInt();
        this.f26789t = parcel.readInt();
        this.f26790u = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i8 = AbstractC2301cW.f21206a;
        this.f26791v = createIntArray;
        this.f26792w = parcel.createIntArray();
    }
}
