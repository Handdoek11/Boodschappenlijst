package q3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class C6 extends AbstractC0813a {
    public static final Parcelable.Creator<C6> CREATOR = new B6();

    /* renamed from: o, reason: collision with root package name */
    private final int f41048o;

    /* renamed from: s, reason: collision with root package name */
    private final String[] f41049s;

    public C6(int i8, String[] strArr) {
        this.f41048o = i8;
        this.f41049s = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, this.f41048o);
        AbstractC0814b.t(parcel, 2, this.f41049s, false);
        AbstractC0814b.b(parcel, a8);
    }
}
