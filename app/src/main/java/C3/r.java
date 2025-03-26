package C3;

import B3.AbstractC0387f;
import B3.InterfaceC0385d;
import Z2.AbstractC0777p;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class r extends AbstractC0813a implements InterfaceC0385d, AbstractC0387f.a {
    public static final Parcelable.Creator<r> CREATOR = new C0460s();

    /* renamed from: o, reason: collision with root package name */
    private final String f1036o;

    /* renamed from: s, reason: collision with root package name */
    private final String f1037s;

    /* renamed from: t, reason: collision with root package name */
    private final String f1038t;

    public r(String str, String str2, String str3) {
        this.f1036o = (String) Z2.r.l(str);
        this.f1037s = (String) Z2.r.l(str2);
        this.f1038t = (String) Z2.r.l(str3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f1036o.equals(rVar.f1036o) && AbstractC0777p.a(rVar.f1037s, this.f1037s) && AbstractC0777p.a(rVar.f1038t, this.f1038t);
    }

    public final int hashCode() {
        return this.f1036o.hashCode();
    }

    public final String toString() {
        int i8 = 0;
        for (char c8 : this.f1036o.toCharArray()) {
            i8 += c8;
        }
        String trim = this.f1036o.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i8;
        }
        return "Channel{token=" + trim + ", nodeId=" + this.f1037s + ", path=" + this.f1038t + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f1036o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 2, str, false);
        AbstractC0814b.s(parcel, 3, this.f1037s, false);
        AbstractC0814b.s(parcel, 4, this.f1038t, false);
        AbstractC0814b.b(parcel, a8);
    }
}
