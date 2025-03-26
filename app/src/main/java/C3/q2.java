package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes2.dex */
public final class q2 extends AbstractC0813a {
    public static final Parcelable.Creator<q2> CREATOR = new r2();

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1034o;

    /* renamed from: s, reason: collision with root package name */
    public final List f1035s;

    public q2(boolean z7, List list) {
        this.f1034o = z7;
        this.f1035s = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q2.class == obj.getClass()) {
            q2 q2Var = (q2) obj;
            if (this.f1034o == q2Var.f1034o && Objects.equals(this.f1035s, q2Var.f1035s)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f1034o), this.f1035s);
    }

    public final String toString() {
        return "AppWearDetailsParcelable{isWatchface=" + this.f1034o + ", watchfaceCategories=" + String.valueOf(this.f1035s) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        boolean z7 = this.f1034o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.c(parcel, 1, z7);
        AbstractC0814b.u(parcel, 2, this.f1035s, false);
        AbstractC0814b.b(parcel, a8);
    }
}
