package com.google.android.gms.wearable;

import Z2.AbstractC0777p;
import Z2.r;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class Asset extends AbstractC0813a implements ReflectedParcelable {
    public static final Parcelable.Creator<Asset> CREATOR = new a();

    /* renamed from: o, reason: collision with root package name */
    private final byte[] f31320o;

    /* renamed from: s, reason: collision with root package name */
    private final String f31321s;

    /* renamed from: t, reason: collision with root package name */
    public final ParcelFileDescriptor f31322t;

    /* renamed from: u, reason: collision with root package name */
    public final Uri f31323u;

    Asset(byte[] bArr, String str, ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
        this.f31320o = bArr;
        this.f31321s = str;
        this.f31322t = parcelFileDescriptor;
        this.f31323u = uri;
    }

    public static Asset A0(ParcelFileDescriptor parcelFileDescriptor) {
        r.l(parcelFileDescriptor);
        return new Asset(null, null, parcelFileDescriptor, null);
    }

    public static Asset B0(String str) {
        r.l(str);
        return new Asset(null, str, null, null);
    }

    public String C0() {
        return this.f31321s;
    }

    public ParcelFileDescriptor D0() {
        return this.f31322t;
    }

    public final byte[] E0() {
        return this.f31320o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return Arrays.equals(this.f31320o, asset.f31320o) && AbstractC0777p.a(this.f31321s, asset.f31321s) && AbstractC0777p.a(this.f31322t, asset.f31322t) && AbstractC0777p.a(this.f31323u, asset.f31323u);
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.f31320o, this.f31321s, this.f31322t, this.f31323u});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Asset[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f31321s == null) {
            sb.append(", nodigest");
        } else {
            sb.append(", ");
            sb.append(this.f31321s);
        }
        if (this.f31320o != null) {
            sb.append(", size=");
            sb.append(((byte[]) r.l(this.f31320o)).length);
        }
        if (this.f31322t != null) {
            sb.append(", fd=");
            sb.append(this.f31322t);
        }
        if (this.f31323u != null) {
            sb.append(", uri=");
            sb.append(this.f31323u);
        }
        sb.append("]");
        return sb.toString();
    }

    public Uri u0() {
        return this.f31323u;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        r.l(parcel);
        byte[] bArr = this.f31320o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.g(parcel, 2, bArr, false);
        AbstractC0814b.s(parcel, 3, C0(), false);
        int i9 = i8 | 1;
        AbstractC0814b.r(parcel, 4, this.f31322t, i9, false);
        AbstractC0814b.r(parcel, 5, this.f31323u, i9, false);
        AbstractC0814b.b(parcel, a8);
    }
}
