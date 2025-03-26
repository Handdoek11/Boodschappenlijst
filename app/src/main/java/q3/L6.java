package q3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class L6 extends AbstractC0813a {
    public static final Parcelable.Creator<L6> CREATOR = new Z6();

    /* renamed from: o, reason: collision with root package name */
    private final String f41343o;

    /* renamed from: s, reason: collision with root package name */
    private final String f41344s;

    public L6(String str, String str2) {
        this.f41343o = str;
        this.f41344s = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, this.f41343o, false);
        AbstractC0814b.s(parcel, 2, this.f41344s, false);
        AbstractC0814b.b(parcel, a8);
    }
}
