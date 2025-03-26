package D2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class M1 extends AbstractC0813a {
    public static final Parcelable.Creator<M1> CREATOR = new N1();

    /* renamed from: o, reason: collision with root package name */
    public final String f1153o;

    M1(String str) {
        this.f1153o = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f1153o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 15, str, false);
        AbstractC0814b.b(parcel, a8);
    }
}
