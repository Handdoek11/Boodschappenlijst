package q3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class F6 extends AbstractC0813a {
    public static final Parcelable.Creator<F6> CREATOR = new T6();

    /* renamed from: o, reason: collision with root package name */
    private final J6 f41106o;

    /* renamed from: s, reason: collision with root package name */
    private final String f41107s;

    /* renamed from: t, reason: collision with root package name */
    private final String f41108t;

    /* renamed from: u, reason: collision with root package name */
    private final K6[] f41109u;

    /* renamed from: v, reason: collision with root package name */
    private final H6[] f41110v;

    /* renamed from: w, reason: collision with root package name */
    private final String[] f41111w;

    /* renamed from: x, reason: collision with root package name */
    private final C6[] f41112x;

    public F6(J6 j62, String str, String str2, K6[] k6Arr, H6[] h6Arr, String[] strArr, C6[] c6Arr) {
        this.f41106o = j62;
        this.f41107s = str;
        this.f41108t = str2;
        this.f41109u = k6Arr;
        this.f41110v = h6Arr;
        this.f41111w = strArr;
        this.f41112x = c6Arr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.r(parcel, 1, this.f41106o, i8, false);
        AbstractC0814b.s(parcel, 2, this.f41107s, false);
        AbstractC0814b.s(parcel, 3, this.f41108t, false);
        AbstractC0814b.v(parcel, 4, this.f41109u, i8, false);
        AbstractC0814b.v(parcel, 5, this.f41110v, i8, false);
        AbstractC0814b.t(parcel, 6, this.f41111w, false);
        AbstractC0814b.v(parcel, 7, this.f41112x, i8, false);
        AbstractC0814b.b(parcel, a8);
    }
}
