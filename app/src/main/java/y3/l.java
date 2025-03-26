package y3;

import Z2.Q;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1103b;

/* loaded from: classes2.dex */
public final class l extends AbstractC0813a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: o, reason: collision with root package name */
    final int f44572o;

    /* renamed from: s, reason: collision with root package name */
    private final C1103b f44573s;

    /* renamed from: t, reason: collision with root package name */
    private final Q f44574t;

    l(int i8, C1103b c1103b, Q q8) {
        this.f44572o = i8;
        this.f44573s = c1103b;
        this.f44574t = q8;
    }

    public final C1103b A0() {
        return this.f44573s;
    }

    public final Q B0() {
        return this.f44574t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, this.f44572o);
        AbstractC0814b.r(parcel, 2, this.f44573s, i8, false);
        AbstractC0814b.r(parcel, 3, this.f44574t, i8, false);
        AbstractC0814b.b(parcel, a8);
    }
}
