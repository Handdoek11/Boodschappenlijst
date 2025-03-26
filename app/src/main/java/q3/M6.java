package q3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class M6 extends AbstractC0813a {
    public static final Parcelable.Creator<M6> CREATOR = new a7();

    /* renamed from: o, reason: collision with root package name */
    private final String f41365o;

    /* renamed from: s, reason: collision with root package name */
    private final String f41366s;

    public M6(String str, String str2) {
        this.f41365o = str;
        this.f41366s = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, this.f41365o, false);
        AbstractC0814b.s(parcel, 2, this.f41366s, false);
        AbstractC0814b.b(parcel, a8);
    }
}
