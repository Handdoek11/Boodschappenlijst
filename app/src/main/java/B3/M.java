package B3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.wearable.AbstractC5259n;
import com.google.android.gms.internal.wearable.C5255l;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class M extends AbstractC0813a {
    public static final Parcelable.Creator<M> CREATOR = new N();

    /* renamed from: o, reason: collision with root package name */
    private final Uri f409o;

    /* renamed from: s, reason: collision with root package name */
    private final int f410s;

    public M(Uri uri, int i8) {
        this.f409o = uri;
        this.f410s = i8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof M)) {
            return false;
        }
        M m8 = (M) obj;
        return Objects.equals(this.f409o, m8.f409o) && this.f410s == m8.f410s;
    }

    public final int hashCode() {
        return Objects.hash(this.f409o, Integer.valueOf(this.f410s));
    }

    public final String toString() {
        C5255l a8 = AbstractC5259n.a(this);
        a8.b("uri", this.f409o);
        a8.a("filterType", this.f410s);
        return a8.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        Uri uri = this.f409o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.r(parcel, 1, uri, i8, false);
        AbstractC0814b.m(parcel, 2, this.f410s);
        AbstractC0814b.b(parcel, a8);
    }
}
