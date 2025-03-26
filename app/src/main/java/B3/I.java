package B3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.wearable.AbstractC5259n;
import com.google.android.gms.internal.wearable.C5255l;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes2.dex */
public final class I extends AbstractC0813a {
    public static final Parcelable.Creator<I> CREATOR = new J();

    /* renamed from: o, reason: collision with root package name */
    private final List f405o;

    public I(List list) {
        this.f405o = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof I) {
            return Objects.equals(this.f405o, ((I) obj).f405o);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f405o);
    }

    public final String toString() {
        C5255l a8 = AbstractC5259n.a(this);
        a8.b("dataItemFilters", this.f405o);
        return a8.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        List list = this.f405o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.w(parcel, 1, list, false);
        AbstractC0814b.b(parcel, a8);
    }
}
