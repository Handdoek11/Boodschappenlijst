package q3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class I6 extends AbstractC0813a {
    public static final Parcelable.Creator<I6> CREATOR = new W6();

    /* renamed from: o, reason: collision with root package name */
    private final double f41182o;

    /* renamed from: s, reason: collision with root package name */
    private final double f41183s;

    public I6(double d8, double d9) {
        this.f41182o = d8;
        this.f41183s = d9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.h(parcel, 1, this.f41182o);
        AbstractC0814b.h(parcel, 2, this.f41183s);
        AbstractC0814b.b(parcel, a8);
    }
}
