package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class F0 extends AbstractC0813a {
    public static final Parcelable.Creator<F0> CREATOR = new G0();

    /* renamed from: o, reason: collision with root package name */
    public final int f862o;

    /* renamed from: s, reason: collision with root package name */
    public final Z f863s;

    public F0(int i8, Z z7) {
        this.f862o = i8;
        this.f863s = z7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f862o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.r(parcel, 2, this.f863s, i8, false);
        AbstractC0814b.b(parcel, a8);
    }
}
