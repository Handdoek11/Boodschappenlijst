package Z2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Z2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0776o extends AbstractC0813a {
    public static final Parcelable.Creator<C0776o> CREATOR = new K();

    /* renamed from: o, reason: collision with root package name */
    private final int f6382o;

    /* renamed from: s, reason: collision with root package name */
    private final int f6383s;

    /* renamed from: t, reason: collision with root package name */
    private final int f6384t;

    /* renamed from: u, reason: collision with root package name */
    private final long f6385u;

    /* renamed from: v, reason: collision with root package name */
    private final long f6386v;

    /* renamed from: w, reason: collision with root package name */
    private final String f6387w;

    /* renamed from: x, reason: collision with root package name */
    private final String f6388x;

    /* renamed from: y, reason: collision with root package name */
    private final int f6389y;

    /* renamed from: z, reason: collision with root package name */
    private final int f6390z;

    public C0776o(int i8, int i9, int i10, long j8, long j9, String str, String str2, int i11) {
        this(i8, i9, i10, j8, j9, str, str2, i11, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f6382o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.m(parcel, 2, this.f6383s);
        AbstractC0814b.m(parcel, 3, this.f6384t);
        AbstractC0814b.p(parcel, 4, this.f6385u);
        AbstractC0814b.p(parcel, 5, this.f6386v);
        AbstractC0814b.s(parcel, 6, this.f6387w, false);
        AbstractC0814b.s(parcel, 7, this.f6388x, false);
        AbstractC0814b.m(parcel, 8, this.f6389y);
        AbstractC0814b.m(parcel, 9, this.f6390z);
        AbstractC0814b.b(parcel, a8);
    }

    public C0776o(int i8, int i9, int i10, long j8, long j9, String str, String str2, int i11, int i12) {
        this.f6382o = i8;
        this.f6383s = i9;
        this.f6384t = i10;
        this.f6385u = j8;
        this.f6386v = j9;
        this.f6387w = str;
        this.f6388x = str2;
        this.f6389y = i11;
        this.f6390z = i12;
    }
}
