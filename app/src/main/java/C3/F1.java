package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class F1 extends AbstractC0813a {
    public static final Parcelable.Creator<F1> CREATOR = new G1();

    /* renamed from: o, reason: collision with root package name */
    public final int f864o;

    /* renamed from: s, reason: collision with root package name */
    public final int f865s;

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f866t;

    public F1(int i8, int i9, byte[] bArr) {
        this.f864o = i8;
        this.f865s = i9;
        this.f866t = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f864o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.m(parcel, 2, this.f865s);
        AbstractC0814b.g(parcel, 3, this.f866t, false);
        AbstractC0814b.b(parcel, a8);
    }
}
