package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class t2 extends AbstractC0813a {
    public static final Parcelable.Creator<t2> CREATOR = new u2();

    /* renamed from: o, reason: collision with root package name */
    public final int f1049o;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1050s;

    public t2(int i8, boolean z7) {
        this.f1049o = i8;
        this.f1050s = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj;
        return this.f1049o == t2Var.f1049o && this.f1050s == t2Var.f1050s;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1049o), Boolean.valueOf(this.f1050s));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f1049o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.c(parcel, 2, this.f1050s);
        AbstractC0814b.b(parcel, a8);
    }
}
