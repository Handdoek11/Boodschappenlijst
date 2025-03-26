package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class D0 extends AbstractC0813a {
    public static final Parcelable.Creator<D0> CREATOR = new E0();

    /* renamed from: o, reason: collision with root package name */
    public final int f858o;

    /* renamed from: s, reason: collision with root package name */
    public final String f859s;

    public D0(int i8, String str) {
        this.f858o = i8;
        this.f859s = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f858o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, i9);
        AbstractC0814b.s(parcel, 3, this.f859s, false);
        AbstractC0814b.b(parcel, a8);
    }
}
