package y3;

import Z2.O;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class j extends AbstractC0813a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: o, reason: collision with root package name */
    final int f44570o;

    /* renamed from: s, reason: collision with root package name */
    final O f44571s;

    j(int i8, O o8) {
        this.f44570o = i8;
        this.f44571s = o8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, this.f44570o);
        AbstractC0814b.r(parcel, 2, this.f44571s, i8, false);
        AbstractC0814b.b(parcel, a8);
    }
}
