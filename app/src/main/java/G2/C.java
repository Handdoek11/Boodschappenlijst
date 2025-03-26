package G2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.zzba;
import com.google.android.gms.internal.ads.AbstractC3187kg0;
import com.google.android.gms.internal.ads.AbstractC3351m70;

/* loaded from: classes.dex */
public final class C extends AbstractC0813a {
    public static final Parcelable.Creator<C> CREATOR = new D();

    /* renamed from: o, reason: collision with root package name */
    public final String f2564o;

    /* renamed from: s, reason: collision with root package name */
    public final int f2565s;

    C(String str, int i8) {
        this.f2564o = str == null ? "" : str;
        this.f2565s = i8;
    }

    public static C B0(Throwable th) {
        D2.W0 a8 = AbstractC3351m70.a(th);
        return new C(AbstractC3187kg0.d(th.getMessage()) ? a8.f1163s : th.getMessage(), a8.f1162o);
    }

    public final zzba A0() {
        return new zzba(this.f2564o, this.f2565s);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f2564o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, str, false);
        AbstractC0814b.m(parcel, 2, this.f2565s);
        AbstractC0814b.b(parcel, a8);
    }
}
