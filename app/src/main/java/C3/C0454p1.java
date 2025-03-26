package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: C3.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0454p1 extends AbstractC0813a implements B3.r {
    public static final Parcelable.Creator<C0454p1> CREATOR = new C0457q1();

    /* renamed from: o, reason: collision with root package name */
    private final String f1027o;

    /* renamed from: s, reason: collision with root package name */
    private final String f1028s;

    /* renamed from: t, reason: collision with root package name */
    private final int f1029t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f1030u;

    public C0454p1(String str, String str2, int i8, boolean z7) {
        this.f1027o = str;
        this.f1028s = str2;
        this.f1029t = i8;
        this.f1030u = z7;
    }

    @Override // B3.r
    public final String T() {
        return this.f1028s;
    }

    @Override // B3.r
    public final boolean e0() {
        return this.f1030u;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0454p1) {
            return ((C0454p1) obj).f1027o.equals(this.f1027o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1027o.hashCode();
    }

    public final String toString() {
        return "Node{" + this.f1028s + ", id=" + this.f1027o + ", hops=" + this.f1029t + ", isNearby=" + this.f1030u + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f1027o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 2, str, false);
        AbstractC0814b.s(parcel, 3, this.f1028s, false);
        AbstractC0814b.m(parcel, 4, this.f1029t);
        AbstractC0814b.c(parcel, 5, this.f1030u);
        AbstractC0814b.b(parcel, a8);
    }
}
