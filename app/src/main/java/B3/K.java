package B3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.wearable.AbstractC5259n;
import com.google.android.gms.internal.wearable.C5255l;
import java.util.List;

/* loaded from: classes2.dex */
public final class K extends AbstractC0813a {
    public static final Parcelable.Creator<K> CREATOR = new L();

    /* renamed from: o, reason: collision with root package name */
    private final List f406o;

    /* renamed from: s, reason: collision with root package name */
    private final List f407s;

    /* renamed from: t, reason: collision with root package name */
    private final List f408t;

    public K(List list, List list2, List list3) {
        this.f406o = list;
        this.f407s = list2;
        this.f408t = list3;
    }

    public final String toString() {
        C5255l a8 = AbstractC5259n.a(this);
        a8.b("allowedDataItemFilters", this.f406o);
        a8.b("allowedCapabilities", this.f407s);
        a8.b("allowedPackages", this.f408t);
        return a8.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        List list = this.f406o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.w(parcel, 1, list, false);
        AbstractC0814b.u(parcel, 2, this.f407s, false);
        AbstractC0814b.u(parcel, 3, this.f408t, false);
        AbstractC0814b.b(parcel, a8);
    }
}
