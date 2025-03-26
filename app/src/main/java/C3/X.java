package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class X extends AbstractC0813a {
    public static final Parcelable.Creator<X> CREATOR = new Y();

    /* renamed from: o, reason: collision with root package name */
    public final int f917o;

    /* renamed from: s, reason: collision with root package name */
    public final int f918s;

    public X(int i8, int i9) {
        this.f917o = i8;
        this.f918s = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f917o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, i9);
        AbstractC0814b.m(parcel, 3, this.f918s);
        AbstractC0814b.b(parcel, a8);
    }
}
