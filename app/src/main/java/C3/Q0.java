package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class Q0 extends AbstractC0813a {
    public static final Parcelable.Creator<Q0> CREATOR = new R0();

    /* renamed from: o, reason: collision with root package name */
    public final int f898o;

    /* renamed from: s, reason: collision with root package name */
    public final int f899s;

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f900t;

    public Q0(int i8, int i9, byte[] bArr) {
        this.f898o = i8;
        this.f899s = i9;
        this.f900t = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f898o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.m(parcel, 2, this.f899s);
        AbstractC0814b.g(parcel, 3, this.f900t, false);
        AbstractC0814b.b(parcel, a8);
    }
}
