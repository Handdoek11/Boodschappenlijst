package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes2.dex */
public final class H0 extends AbstractC0813a {
    public static final Parcelable.Creator<H0> CREATOR = new I0();

    /* renamed from: o, reason: collision with root package name */
    public final int f871o;

    /* renamed from: s, reason: collision with root package name */
    public final List f872s;

    public H0(int i8, List list) {
        this.f871o = i8;
        this.f872s = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f871o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.w(parcel, 2, this.f872s, false);
        AbstractC0814b.b(parcel, a8);
    }
}
