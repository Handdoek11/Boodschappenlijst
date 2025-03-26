package q3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class E6 extends AbstractC0813a {
    public static final Parcelable.Creator<E6> CREATOR = new S6();

    /* renamed from: o, reason: collision with root package name */
    private final String f41086o;

    /* renamed from: s, reason: collision with root package name */
    private final String f41087s;

    /* renamed from: t, reason: collision with root package name */
    private final String f41088t;

    /* renamed from: u, reason: collision with root package name */
    private final String f41089u;

    /* renamed from: v, reason: collision with root package name */
    private final String f41090v;

    /* renamed from: w, reason: collision with root package name */
    private final D6 f41091w;

    /* renamed from: x, reason: collision with root package name */
    private final D6 f41092x;

    public E6(String str, String str2, String str3, String str4, String str5, D6 d62, D6 d63) {
        this.f41086o = str;
        this.f41087s = str2;
        this.f41088t = str3;
        this.f41089u = str4;
        this.f41090v = str5;
        this.f41091w = d62;
        this.f41092x = d63;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, this.f41086o, false);
        AbstractC0814b.s(parcel, 2, this.f41087s, false);
        AbstractC0814b.s(parcel, 3, this.f41088t, false);
        AbstractC0814b.s(parcel, 4, this.f41089u, false);
        AbstractC0814b.s(parcel, 5, this.f41090v, false);
        AbstractC0814b.r(parcel, 6, this.f41091w, i8, false);
        AbstractC0814b.r(parcel, 7, this.f41092x, i8, false);
        AbstractC0814b.b(parcel, a8);
    }
}
