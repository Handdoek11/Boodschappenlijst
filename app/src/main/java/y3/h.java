package y3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* loaded from: classes2.dex */
public final class h extends AbstractC0813a implements W2.f {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: o, reason: collision with root package name */
    private final List f44568o;

    /* renamed from: s, reason: collision with root package name */
    private final String f44569s;

    public h(List list, String str) {
        this.f44568o = list;
        this.f44569s = str;
    }

    @Override // W2.f
    public final Status m0() {
        return this.f44569s != null ? Status.f13219w : Status.f13215A;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        List list = this.f44568o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.u(parcel, 1, list, false);
        AbstractC0814b.s(parcel, 2, this.f44569s, false);
        AbstractC0814b.b(parcel, a8);
    }
}
