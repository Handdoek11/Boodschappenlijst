package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class m2 extends AbstractC0813a {
    public static final Parcelable.Creator<m2> CREATOR = new n2();

    /* renamed from: o, reason: collision with root package name */
    public final String f1008o;

    /* renamed from: s, reason: collision with root package name */
    public final String f1009s;

    /* renamed from: t, reason: collision with root package name */
    public final i2 f1010t;

    /* renamed from: u, reason: collision with root package name */
    public final String f1011u;

    /* renamed from: v, reason: collision with root package name */
    public final String f1012v;

    /* renamed from: w, reason: collision with root package name */
    public final Float f1013w;

    /* renamed from: x, reason: collision with root package name */
    public final q2 f1014x;

    public m2(String str, String str2, i2 i2Var, String str3, String str4, Float f8, q2 q2Var) {
        this.f1008o = str;
        this.f1009s = str2;
        this.f1010t = i2Var;
        this.f1011u = str3;
        this.f1012v = str4;
        this.f1013w = f8;
        this.f1014x = q2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m2.class == obj.getClass()) {
            m2 m2Var = (m2) obj;
            if (Objects.equals(this.f1008o, m2Var.f1008o) && Objects.equals(this.f1009s, m2Var.f1009s) && Objects.equals(this.f1010t, m2Var.f1010t) && Objects.equals(this.f1011u, m2Var.f1011u) && Objects.equals(this.f1012v, m2Var.f1012v) && Objects.equals(this.f1013w, m2Var.f1013w) && Objects.equals(this.f1014x, m2Var.f1014x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f1008o, this.f1009s, this.f1010t, this.f1011u, this.f1012v, this.f1013w, this.f1014x);
    }

    public final String toString() {
        i2 i2Var = this.f1010t;
        return "AppParcelable{title='" + this.f1009s + "', developerName='" + this.f1011u + "', formattedPrice='" + this.f1012v + "', starRating=" + this.f1013w + ", wearDetails=" + String.valueOf(this.f1014x) + ", deepLinkUri='" + this.f1008o + "', icon=" + String.valueOf(i2Var) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f1008o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, str, false);
        AbstractC0814b.s(parcel, 2, this.f1009s, false);
        AbstractC0814b.r(parcel, 3, this.f1010t, i8, false);
        AbstractC0814b.s(parcel, 4, this.f1011u, false);
        AbstractC0814b.s(parcel, 5, this.f1012v, false);
        AbstractC0814b.k(parcel, 6, this.f1013w, false);
        AbstractC0814b.r(parcel, 7, this.f1014x, i8, false);
        AbstractC0814b.b(parcel, a8);
    }
}
