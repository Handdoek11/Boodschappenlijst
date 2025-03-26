package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class D1 extends AbstractC0813a {
    public static final Parcelable.Creator<D1> CREATOR = new E1();

    /* renamed from: o, reason: collision with root package name */
    private final String f860o;

    public D1(String str) {
        this.f860o = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f860o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, str, false);
        AbstractC0814b.b(parcel, a8);
    }
}
