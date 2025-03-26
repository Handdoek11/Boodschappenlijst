package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes2.dex */
public final class U0 extends AbstractC0813a {
    public static final Parcelable.Creator<U0> CREATOR = new V0();

    /* renamed from: o, reason: collision with root package name */
    public final int f910o;

    /* renamed from: s, reason: collision with root package name */
    public final List f911s;

    public U0(int i8, List list) {
        this.f910o = i8;
        this.f911s = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f910o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.w(parcel, 2, this.f911s, false);
        AbstractC0814b.b(parcel, a8);
    }
}
