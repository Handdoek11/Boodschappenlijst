package q3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class O6 extends AbstractC0813a {
    public static final Parcelable.Creator<O6> CREATOR = new Q6();

    /* renamed from: A, reason: collision with root package name */
    private final N6 f41401A;

    /* renamed from: B, reason: collision with root package name */
    private final M6 f41402B;

    /* renamed from: C, reason: collision with root package name */
    private final I6 f41403C;

    /* renamed from: D, reason: collision with root package name */
    private final E6 f41404D;

    /* renamed from: E, reason: collision with root package name */
    private final F6 f41405E;

    /* renamed from: F, reason: collision with root package name */
    private final G6 f41406F;

    /* renamed from: o, reason: collision with root package name */
    private final int f41407o;

    /* renamed from: s, reason: collision with root package name */
    private final String f41408s;

    /* renamed from: t, reason: collision with root package name */
    private final String f41409t;

    /* renamed from: u, reason: collision with root package name */
    private final byte[] f41410u;

    /* renamed from: v, reason: collision with root package name */
    private final Point[] f41411v;

    /* renamed from: w, reason: collision with root package name */
    private final int f41412w;

    /* renamed from: x, reason: collision with root package name */
    private final H6 f41413x;

    /* renamed from: y, reason: collision with root package name */
    private final K6 f41414y;

    /* renamed from: z, reason: collision with root package name */
    private final L6 f41415z;

    public O6(int i8, String str, String str2, byte[] bArr, Point[] pointArr, int i9, H6 h62, K6 k62, L6 l62, N6 n62, M6 m62, I6 i62, E6 e62, F6 f62, G6 g62) {
        this.f41407o = i8;
        this.f41408s = str;
        this.f41409t = str2;
        this.f41410u = bArr;
        this.f41411v = pointArr;
        this.f41412w = i9;
        this.f41413x = h62;
        this.f41414y = k62;
        this.f41415z = l62;
        this.f41401A = n62;
        this.f41402B = m62;
        this.f41403C = i62;
        this.f41404D = e62;
        this.f41405E = f62;
        this.f41406F = g62;
    }

    public final int A0() {
        return this.f41407o;
    }

    public final String B0() {
        return this.f41409t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, this.f41407o);
        AbstractC0814b.s(parcel, 2, this.f41408s, false);
        AbstractC0814b.s(parcel, 3, this.f41409t, false);
        AbstractC0814b.g(parcel, 4, this.f41410u, false);
        AbstractC0814b.v(parcel, 5, this.f41411v, i8, false);
        AbstractC0814b.m(parcel, 6, this.f41412w);
        AbstractC0814b.r(parcel, 7, this.f41413x, i8, false);
        AbstractC0814b.r(parcel, 8, this.f41414y, i8, false);
        AbstractC0814b.r(parcel, 9, this.f41415z, i8, false);
        AbstractC0814b.r(parcel, 10, this.f41401A, i8, false);
        AbstractC0814b.r(parcel, 11, this.f41402B, i8, false);
        AbstractC0814b.r(parcel, 12, this.f41403C, i8, false);
        AbstractC0814b.r(parcel, 13, this.f41404D, i8, false);
        AbstractC0814b.r(parcel, 14, this.f41405E, i8, false);
        AbstractC0814b.r(parcel, 15, this.f41406F, i8, false);
        AbstractC0814b.b(parcel, a8);
    }
}
