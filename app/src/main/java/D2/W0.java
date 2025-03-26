package D2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import w2.C6876b;

/* loaded from: classes.dex */
public final class W0 extends AbstractC0813a {
    public static final Parcelable.Creator<W0> CREATOR = new C0536r1();

    /* renamed from: o, reason: collision with root package name */
    public final int f1162o;

    /* renamed from: s, reason: collision with root package name */
    public final String f1163s;

    /* renamed from: t, reason: collision with root package name */
    public final String f1164t;

    /* renamed from: u, reason: collision with root package name */
    public W0 f1165u;

    /* renamed from: v, reason: collision with root package name */
    public IBinder f1166v;

    public W0(int i8, String str, String str2, W0 w02, IBinder iBinder) {
        this.f1162o = i8;
        this.f1163s = str;
        this.f1164t = str2;
        this.f1165u = w02;
        this.f1166v = iBinder;
    }

    public final C6876b A0() {
        C6876b c6876b;
        W0 w02 = this.f1165u;
        if (w02 == null) {
            c6876b = null;
        } else {
            String str = w02.f1164t;
            c6876b = new C6876b(w02.f1162o, w02.f1163s, str);
        }
        return new C6876b(this.f1162o, this.f1163s, this.f1164t, c6876b);
    }

    public final w2.m B0() {
        C6876b c6876b;
        W0 w02 = this.f1165u;
        U0 u02 = null;
        if (w02 == null) {
            c6876b = null;
        } else {
            c6876b = new C6876b(w02.f1162o, w02.f1163s, w02.f1164t);
        }
        int i8 = this.f1162o;
        String str = this.f1163s;
        String str2 = this.f1164t;
        IBinder iBinder = this.f1166v;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            u02 = queryLocalInterface instanceof U0 ? (U0) queryLocalInterface : new S0(iBinder);
        }
        return new w2.m(i8, str, str2, c6876b, w2.u.d(u02));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f1162o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.s(parcel, 2, this.f1163s, false);
        AbstractC0814b.s(parcel, 3, this.f1164t, false);
        AbstractC0814b.r(parcel, 4, this.f1165u, i8, false);
        AbstractC0814b.l(parcel, 5, this.f1166v, false);
        AbstractC0814b.b(parcel, a8);
    }
}
