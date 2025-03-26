package D2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g2 extends AbstractC0813a {
    public static final Parcelable.Creator<g2> CREATOR = new h2();

    /* renamed from: o, reason: collision with root package name */
    public final String f1269o;

    /* renamed from: s, reason: collision with root package name */
    public long f1270s;

    /* renamed from: t, reason: collision with root package name */
    public W0 f1271t;

    /* renamed from: u, reason: collision with root package name */
    public final Bundle f1272u;

    /* renamed from: v, reason: collision with root package name */
    public final String f1273v;

    /* renamed from: w, reason: collision with root package name */
    public final String f1274w;

    /* renamed from: x, reason: collision with root package name */
    public final String f1275x;

    /* renamed from: y, reason: collision with root package name */
    public final String f1276y;

    public g2(String str, long j8, W0 w02, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f1269o = str;
        this.f1270s = j8;
        this.f1271t = w02;
        this.f1272u = bundle;
        this.f1273v = str2;
        this.f1274w = str3;
        this.f1275x = str4;
        this.f1276y = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f1269o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, str, false);
        AbstractC0814b.p(parcel, 2, this.f1270s);
        AbstractC0814b.r(parcel, 3, this.f1271t, i8, false);
        AbstractC0814b.e(parcel, 4, this.f1272u, false);
        AbstractC0814b.s(parcel, 5, this.f1273v, false);
        AbstractC0814b.s(parcel, 6, this.f1274w, false);
        AbstractC0814b.s(parcel, 7, this.f1275x, false);
        AbstractC0814b.s(parcel, 8, this.f1276y, false);
        AbstractC0814b.b(parcel, a8);
    }
}
