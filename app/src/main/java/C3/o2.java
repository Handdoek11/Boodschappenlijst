package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes2.dex */
public final class o2 extends AbstractC0813a {
    public static final Parcelable.Creator<o2> CREATOR = new p2();

    /* renamed from: o, reason: collision with root package name */
    public final int f1020o;

    /* renamed from: s, reason: collision with root package name */
    public final List f1021s;

    /* renamed from: t, reason: collision with root package name */
    public final i2 f1022t;

    public o2(int i8, List list, i2 i2Var) {
        this.f1020o = i8;
        this.f1021s = list;
        this.f1022t = i2Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f1020o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.w(parcel, 2, this.f1021s, false);
        AbstractC0814b.r(parcel, 3, this.f1022t, i8, false);
        AbstractC0814b.b(parcel, a8);
    }
}
