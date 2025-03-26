package D2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class X extends AbstractC0813a {
    public static final Parcelable.Creator<X> CREATOR = new C0550w0();

    /* renamed from: o, reason: collision with root package name */
    public final String f1167o;

    /* renamed from: s, reason: collision with root package name */
    public final String f1168s;

    public X(String str, String str2) {
        this.f1167o = str;
        this.f1168s = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f1167o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, str, false);
        AbstractC0814b.s(parcel, 2, this.f1168s, false);
        AbstractC0814b.b(parcel, a8);
    }
}
