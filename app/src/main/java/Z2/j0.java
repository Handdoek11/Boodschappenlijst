package Z2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1105d;

/* loaded from: classes.dex */
public final class j0 extends AbstractC0813a {
    public static final Parcelable.Creator<j0> CREATOR = new k0();

    /* renamed from: o, reason: collision with root package name */
    Bundle f6369o;

    /* renamed from: s, reason: collision with root package name */
    C1105d[] f6370s;

    /* renamed from: t, reason: collision with root package name */
    int f6371t;

    /* renamed from: u, reason: collision with root package name */
    C0767f f6372u;

    j0(Bundle bundle, C1105d[] c1105dArr, int i8, C0767f c0767f) {
        this.f6369o = bundle;
        this.f6370s = c1105dArr;
        this.f6371t = i8;
        this.f6372u = c0767f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.e(parcel, 1, this.f6369o, false);
        AbstractC0814b.v(parcel, 2, this.f6370s, i8, false);
        AbstractC0814b.m(parcel, 3, this.f6371t);
        AbstractC0814b.r(parcel, 4, this.f6372u, i8, false);
        AbstractC0814b.b(parcel, a8);
    }
}
