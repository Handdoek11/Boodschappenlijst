package q3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class D6 extends AbstractC0813a {
    public static final Parcelable.Creator<D6> CREATOR = new R6();

    /* renamed from: o, reason: collision with root package name */
    private final int f41061o;

    /* renamed from: s, reason: collision with root package name */
    private final int f41062s;

    /* renamed from: t, reason: collision with root package name */
    private final int f41063t;

    /* renamed from: u, reason: collision with root package name */
    private final int f41064u;

    /* renamed from: v, reason: collision with root package name */
    private final int f41065v;

    /* renamed from: w, reason: collision with root package name */
    private final int f41066w;

    /* renamed from: x, reason: collision with root package name */
    private final boolean f41067x;

    /* renamed from: y, reason: collision with root package name */
    private final String f41068y;

    public D6(int i8, int i9, int i10, int i11, int i12, int i13, boolean z7, String str) {
        this.f41061o = i8;
        this.f41062s = i9;
        this.f41063t = i10;
        this.f41064u = i11;
        this.f41065v = i12;
        this.f41066w = i13;
        this.f41067x = z7;
        this.f41068y = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, this.f41061o);
        AbstractC0814b.m(parcel, 2, this.f41062s);
        AbstractC0814b.m(parcel, 3, this.f41063t);
        AbstractC0814b.m(parcel, 4, this.f41064u);
        AbstractC0814b.m(parcel, 5, this.f41065v);
        AbstractC0814b.m(parcel, 6, this.f41066w);
        AbstractC0814b.c(parcel, 7, this.f41067x);
        AbstractC0814b.s(parcel, 8, this.f41068y, false);
        AbstractC0814b.b(parcel, a8);
    }
}
