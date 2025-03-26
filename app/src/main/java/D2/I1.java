package D2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class I1 extends AbstractC0813a {
    public static final Parcelable.Creator<I1> CREATOR = new J1();

    /* renamed from: o, reason: collision with root package name */
    public final String f1147o;

    /* renamed from: s, reason: collision with root package name */
    public final int f1148s;

    /* renamed from: t, reason: collision with root package name */
    public final X1 f1149t;

    /* renamed from: u, reason: collision with root package name */
    public final int f1150u;

    public I1(String str, int i8, X1 x12, int i9) {
        this.f1147o = str;
        this.f1148s = i8;
        this.f1149t = x12;
        this.f1150u = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof I1) {
            I1 i12 = (I1) obj;
            if (this.f1147o.equals(i12.f1147o) && this.f1148s == i12.f1148s && this.f1149t.A0(i12.f1149t)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1147o, Integer.valueOf(this.f1148s), this.f1149t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f1147o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, str, false);
        AbstractC0814b.m(parcel, 2, this.f1148s);
        AbstractC0814b.r(parcel, 3, this.f1149t, i8, false);
        AbstractC0814b.m(parcel, 4, this.f1150u);
        AbstractC0814b.b(parcel, a8);
    }
}
