package q3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class H6 extends AbstractC0813a {
    public static final Parcelable.Creator<H6> CREATOR = new V6();

    /* renamed from: o, reason: collision with root package name */
    private final int f41167o;

    /* renamed from: s, reason: collision with root package name */
    private final String f41168s;

    /* renamed from: t, reason: collision with root package name */
    private final String f41169t;

    /* renamed from: u, reason: collision with root package name */
    private final String f41170u;

    public H6(int i8, String str, String str2, String str3) {
        this.f41167o = i8;
        this.f41168s = str;
        this.f41169t = str2;
        this.f41170u = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, this.f41167o);
        AbstractC0814b.s(parcel, 2, this.f41168s, false);
        AbstractC0814b.s(parcel, 3, this.f41169t, false);
        AbstractC0814b.s(parcel, 4, this.f41170u, false);
        AbstractC0814b.b(parcel, a8);
    }
}
