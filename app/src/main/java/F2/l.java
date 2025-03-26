package F2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import i3.BinderC5853b;
import i3.InterfaceC5852a;

/* loaded from: classes.dex */
public final class l extends AbstractC0813a {
    public static final Parcelable.Creator<l> CREATOR = new k();

    /* renamed from: A, reason: collision with root package name */
    public final boolean f2259A;

    /* renamed from: o, reason: collision with root package name */
    public final String f2260o;

    /* renamed from: s, reason: collision with root package name */
    public final String f2261s;

    /* renamed from: t, reason: collision with root package name */
    public final String f2262t;

    /* renamed from: u, reason: collision with root package name */
    public final String f2263u;

    /* renamed from: v, reason: collision with root package name */
    public final String f2264v;

    /* renamed from: w, reason: collision with root package name */
    public final String f2265w;

    /* renamed from: x, reason: collision with root package name */
    public final String f2266x;

    /* renamed from: y, reason: collision with root package name */
    public final Intent f2267y;

    /* renamed from: z, reason: collision with root package name */
    public final InterfaceC0570b f2268z;

    public l(Intent intent, InterfaceC0570b interfaceC0570b) {
        this(null, null, null, null, null, null, null, intent, BinderC5853b.p2(interfaceC0570b).asBinder(), false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f2260o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 2, str, false);
        AbstractC0814b.s(parcel, 3, this.f2261s, false);
        AbstractC0814b.s(parcel, 4, this.f2262t, false);
        AbstractC0814b.s(parcel, 5, this.f2263u, false);
        AbstractC0814b.s(parcel, 6, this.f2264v, false);
        AbstractC0814b.s(parcel, 7, this.f2265w, false);
        AbstractC0814b.s(parcel, 8, this.f2266x, false);
        AbstractC0814b.r(parcel, 9, this.f2267y, i8, false);
        AbstractC0814b.l(parcel, 10, BinderC5853b.p2(this.f2268z).asBinder(), false);
        AbstractC0814b.c(parcel, 11, this.f2259A);
        AbstractC0814b.b(parcel, a8);
    }

    public l(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z7) {
        this.f2260o = str;
        this.f2261s = str2;
        this.f2262t = str3;
        this.f2263u = str4;
        this.f2264v = str5;
        this.f2265w = str6;
        this.f2266x = str7;
        this.f2267y = intent;
        this.f2268z = (InterfaceC0570b) BinderC5853b.J0(InterfaceC5852a.AbstractBinderC0269a.D0(iBinder));
        this.f2259A = z7;
    }

    public l(String str, String str2, String str3, String str4, String str5, String str6, String str7, InterfaceC0570b interfaceC0570b) {
        this(str, str2, str3, str4, str5, str6, str7, null, BinderC5853b.p2(interfaceC0570b).asBinder(), false);
    }
}
