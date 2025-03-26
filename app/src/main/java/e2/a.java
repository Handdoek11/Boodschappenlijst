package E2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a extends AbstractC0813a {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: o, reason: collision with root package name */
    public final String f2142o;

    /* renamed from: s, reason: collision with root package name */
    public final String f2143s;

    /* renamed from: t, reason: collision with root package name */
    public final String f2144t;

    public a(String str, String str2, String str3) {
        this.f2142o = str;
        this.f2143s = str2;
        this.f2144t = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f2142o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, str, false);
        AbstractC0814b.s(parcel, 2, this.f2143s, false);
        AbstractC0814b.s(parcel, 3, this.f2144t, false);
        AbstractC0814b.b(parcel, a8);
    }
}
