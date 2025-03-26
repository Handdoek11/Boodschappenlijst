package F3;

import D3.i;
import D3.j;
import D3.k;
import D3.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final a f2322a;

    /* renamed from: b, reason: collision with root package name */
    private final a f2323b;

    /* renamed from: c, reason: collision with root package name */
    final float f2324c;

    /* renamed from: d, reason: collision with root package name */
    final float f2325d;

    /* renamed from: e, reason: collision with root package name */
    final float f2326e;

    /* renamed from: f, reason: collision with root package name */
    final float f2327f;

    /* renamed from: g, reason: collision with root package name */
    final float f2328g;

    /* renamed from: h, reason: collision with root package name */
    final float f2329h;

    /* renamed from: i, reason: collision with root package name */
    final int f2330i;

    /* renamed from: j, reason: collision with root package name */
    final int f2331j;

    /* renamed from: k, reason: collision with root package name */
    int f2332k;

    d(Context context, int i8, int i9, int i10, a aVar) {
        a aVar2 = new a();
        this.f2323b = aVar2;
        aVar = aVar == null ? new a() : aVar;
        if (i8 != 0) {
            aVar.f2354o = i8;
        }
        TypedArray a8 = a(context, aVar.f2354o, i9, i10);
        Resources resources = context.getResources();
        this.f2324c = a8.getDimensionPixelSize(l.f2052y, -1);
        this.f2330i = context.getResources().getDimensionPixelSize(D3.d.f1450M);
        this.f2331j = context.getResources().getDimensionPixelSize(D3.d.f1452O);
        this.f2325d = a8.getDimensionPixelSize(l.f1697I, -1);
        this.f2326e = a8.getDimension(l.f1681G, resources.getDimension(D3.d.f1489o));
        this.f2328g = a8.getDimension(l.f1721L, resources.getDimension(D3.d.f1490p));
        this.f2327f = a8.getDimension(l.f2044x, resources.getDimension(D3.d.f1489o));
        this.f2329h = a8.getDimension(l.f1689H, resources.getDimension(D3.d.f1490p));
        boolean z7 = true;
        this.f2332k = a8.getInt(l.f1777S, 1);
        aVar2.f2362z = aVar.f2362z == -2 ? 255 : aVar.f2362z;
        if (aVar.f2334B != -2) {
            aVar2.f2334B = aVar.f2334B;
        } else if (a8.hasValue(l.f1769R)) {
            aVar2.f2334B = a8.getInt(l.f1769R, 0);
        } else {
            aVar2.f2334B = -1;
        }
        if (aVar.f2333A != null) {
            aVar2.f2333A = aVar.f2333A;
        } else if (a8.hasValue(l.f1641B)) {
            aVar2.f2333A = a8.getString(l.f1641B);
        }
        aVar2.f2338F = aVar.f2338F;
        aVar2.f2339G = aVar.f2339G == null ? context.getString(j.f1594j) : aVar.f2339G;
        aVar2.f2340H = aVar.f2340H == 0 ? i.f1582a : aVar.f2340H;
        aVar2.f2341I = aVar.f2341I == 0 ? j.f1599o : aVar.f2341I;
        if (aVar.f2343K != null && !aVar.f2343K.booleanValue()) {
            z7 = false;
        }
        aVar2.f2343K = Boolean.valueOf(z7);
        aVar2.f2335C = aVar.f2335C == -2 ? a8.getInt(l.f1753P, -2) : aVar.f2335C;
        aVar2.f2336D = aVar.f2336D == -2 ? a8.getInt(l.f1761Q, -2) : aVar.f2336D;
        aVar2.f2358v = Integer.valueOf(aVar.f2358v == null ? a8.getResourceId(l.f2060z, k.f1611a) : aVar.f2358v.intValue());
        aVar2.f2359w = Integer.valueOf(aVar.f2359w == null ? a8.getResourceId(l.f1633A, 0) : aVar.f2359w.intValue());
        aVar2.f2360x = Integer.valueOf(aVar.f2360x == null ? a8.getResourceId(l.f1705J, k.f1611a) : aVar.f2360x.intValue());
        aVar2.f2361y = Integer.valueOf(aVar.f2361y == null ? a8.getResourceId(l.f1713K, 0) : aVar.f2361y.intValue());
        aVar2.f2355s = Integer.valueOf(aVar.f2355s == null ? G(context, a8, l.f2028v) : aVar.f2355s.intValue());
        aVar2.f2357u = Integer.valueOf(aVar.f2357u == null ? a8.getResourceId(l.f1649C, k.f1614d) : aVar.f2357u.intValue());
        if (aVar.f2356t != null) {
            aVar2.f2356t = aVar.f2356t;
        } else if (a8.hasValue(l.f1657D)) {
            aVar2.f2356t = Integer.valueOf(G(context, a8, l.f1657D));
        } else {
            aVar2.f2356t = Integer.valueOf(new S3.d(context, aVar2.f2357u.intValue()).i().getDefaultColor());
        }
        aVar2.f2342J = Integer.valueOf(aVar.f2342J == null ? a8.getInt(l.f2036w, 8388661) : aVar.f2342J.intValue());
        aVar2.f2344L = Integer.valueOf(aVar.f2344L == null ? a8.getDimensionPixelSize(l.f1673F, resources.getDimensionPixelSize(D3.d.f1451N)) : aVar.f2344L.intValue());
        aVar2.f2345M = Integer.valueOf(aVar.f2345M == null ? a8.getDimensionPixelSize(l.f1665E, resources.getDimensionPixelSize(D3.d.f1491q)) : aVar.f2345M.intValue());
        aVar2.f2346N = Integer.valueOf(aVar.f2346N == null ? a8.getDimensionPixelOffset(l.f1729M, 0) : aVar.f2346N.intValue());
        aVar2.f2347O = Integer.valueOf(aVar.f2347O == null ? a8.getDimensionPixelOffset(l.f1785T, 0) : aVar.f2347O.intValue());
        aVar2.f2348P = Integer.valueOf(aVar.f2348P == null ? a8.getDimensionPixelOffset(l.f1737N, aVar2.f2346N.intValue()) : aVar.f2348P.intValue());
        aVar2.f2349Q = Integer.valueOf(aVar.f2349Q == null ? a8.getDimensionPixelOffset(l.f1793U, aVar2.f2347O.intValue()) : aVar.f2349Q.intValue());
        aVar2.f2352T = Integer.valueOf(aVar.f2352T == null ? a8.getDimensionPixelOffset(l.f1745O, 0) : aVar.f2352T.intValue());
        aVar2.f2350R = Integer.valueOf(aVar.f2350R == null ? 0 : aVar.f2350R.intValue());
        aVar2.f2351S = Integer.valueOf(aVar.f2351S == null ? 0 : aVar.f2351S.intValue());
        aVar2.f2353U = Boolean.valueOf(aVar.f2353U == null ? a8.getBoolean(l.f2020u, false) : aVar.f2353U.booleanValue());
        a8.recycle();
        if (aVar.f2337E == null) {
            aVar2.f2337E = Build.VERSION.SDK_INT >= 24 ? Locale.getDefault(Locale.Category.FORMAT) : Locale.getDefault();
        } else {
            aVar2.f2337E = aVar.f2337E;
        }
        this.f2322a = aVar;
    }

    private static int G(Context context, TypedArray typedArray, int i8) {
        return S3.c.a(context, typedArray, i8).getDefaultColor();
    }

    private TypedArray a(Context context, int i8, int i9, int i10) {
        AttributeSet attributeSet;
        int i11;
        if (i8 != 0) {
            AttributeSet i12 = com.google.android.material.drawable.d.i(context, i8, "badge");
            i11 = i12.getStyleAttribute();
            attributeSet = i12;
        } else {
            attributeSet = null;
            i11 = 0;
        }
        return com.google.android.material.internal.l.i(context, attributeSet, l.f2012t, i9, i11 == 0 ? i10 : i11, new int[0]);
    }

    int A() {
        return this.f2323b.f2349Q.intValue();
    }

    int B() {
        return this.f2323b.f2347O.intValue();
    }

    boolean C() {
        return this.f2323b.f2334B != -1;
    }

    boolean D() {
        return this.f2323b.f2333A != null;
    }

    boolean E() {
        return this.f2323b.f2353U.booleanValue();
    }

    boolean F() {
        return this.f2323b.f2343K.booleanValue();
    }

    void H(int i8) {
        this.f2322a.f2362z = i8;
        this.f2323b.f2362z = i8;
    }

    int b() {
        return this.f2323b.f2350R.intValue();
    }

    int c() {
        return this.f2323b.f2351S.intValue();
    }

    int d() {
        return this.f2323b.f2362z;
    }

    int e() {
        return this.f2323b.f2355s.intValue();
    }

    int f() {
        return this.f2323b.f2342J.intValue();
    }

    int g() {
        return this.f2323b.f2344L.intValue();
    }

    int h() {
        return this.f2323b.f2359w.intValue();
    }

    int i() {
        return this.f2323b.f2358v.intValue();
    }

    int j() {
        return this.f2323b.f2356t.intValue();
    }

    int k() {
        return this.f2323b.f2345M.intValue();
    }

    int l() {
        return this.f2323b.f2361y.intValue();
    }

    int m() {
        return this.f2323b.f2360x.intValue();
    }

    int n() {
        return this.f2323b.f2341I;
    }

    CharSequence o() {
        return this.f2323b.f2338F;
    }

    CharSequence p() {
        return this.f2323b.f2339G;
    }

    int q() {
        return this.f2323b.f2340H;
    }

    int r() {
        return this.f2323b.f2348P.intValue();
    }

    int s() {
        return this.f2323b.f2346N.intValue();
    }

    int t() {
        return this.f2323b.f2352T.intValue();
    }

    int u() {
        return this.f2323b.f2335C;
    }

    int v() {
        return this.f2323b.f2336D;
    }

    int w() {
        return this.f2323b.f2334B;
    }

    Locale x() {
        return this.f2323b.f2337E;
    }

    String y() {
        return this.f2323b.f2333A;
    }

    int z() {
        return this.f2323b.f2357u.intValue();
    }

    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0038a();

        /* renamed from: A, reason: collision with root package name */
        private String f2333A;

        /* renamed from: B, reason: collision with root package name */
        private int f2334B;

        /* renamed from: C, reason: collision with root package name */
        private int f2335C;

        /* renamed from: D, reason: collision with root package name */
        private int f2336D;

        /* renamed from: E, reason: collision with root package name */
        private Locale f2337E;

        /* renamed from: F, reason: collision with root package name */
        private CharSequence f2338F;

        /* renamed from: G, reason: collision with root package name */
        private CharSequence f2339G;

        /* renamed from: H, reason: collision with root package name */
        private int f2340H;

        /* renamed from: I, reason: collision with root package name */
        private int f2341I;

        /* renamed from: J, reason: collision with root package name */
        private Integer f2342J;

        /* renamed from: K, reason: collision with root package name */
        private Boolean f2343K;

        /* renamed from: L, reason: collision with root package name */
        private Integer f2344L;

        /* renamed from: M, reason: collision with root package name */
        private Integer f2345M;

        /* renamed from: N, reason: collision with root package name */
        private Integer f2346N;

        /* renamed from: O, reason: collision with root package name */
        private Integer f2347O;

        /* renamed from: P, reason: collision with root package name */
        private Integer f2348P;

        /* renamed from: Q, reason: collision with root package name */
        private Integer f2349Q;

        /* renamed from: R, reason: collision with root package name */
        private Integer f2350R;

        /* renamed from: S, reason: collision with root package name */
        private Integer f2351S;

        /* renamed from: T, reason: collision with root package name */
        private Integer f2352T;

        /* renamed from: U, reason: collision with root package name */
        private Boolean f2353U;

        /* renamed from: o, reason: collision with root package name */
        private int f2354o;

        /* renamed from: s, reason: collision with root package name */
        private Integer f2355s;

        /* renamed from: t, reason: collision with root package name */
        private Integer f2356t;

        /* renamed from: u, reason: collision with root package name */
        private Integer f2357u;

        /* renamed from: v, reason: collision with root package name */
        private Integer f2358v;

        /* renamed from: w, reason: collision with root package name */
        private Integer f2359w;

        /* renamed from: x, reason: collision with root package name */
        private Integer f2360x;

        /* renamed from: y, reason: collision with root package name */
        private Integer f2361y;

        /* renamed from: z, reason: collision with root package name */
        private int f2362z;

        /* renamed from: F3.d$a$a, reason: collision with other inner class name */
        class C0038a implements Parcelable.Creator {
            C0038a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a() {
            this.f2362z = 255;
            this.f2334B = -2;
            this.f2335C = -2;
            this.f2336D = -2;
            this.f2343K = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            parcel.writeInt(this.f2354o);
            parcel.writeSerializable(this.f2355s);
            parcel.writeSerializable(this.f2356t);
            parcel.writeSerializable(this.f2357u);
            parcel.writeSerializable(this.f2358v);
            parcel.writeSerializable(this.f2359w);
            parcel.writeSerializable(this.f2360x);
            parcel.writeSerializable(this.f2361y);
            parcel.writeInt(this.f2362z);
            parcel.writeString(this.f2333A);
            parcel.writeInt(this.f2334B);
            parcel.writeInt(this.f2335C);
            parcel.writeInt(this.f2336D);
            CharSequence charSequence = this.f2338F;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.f2339G;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.f2340H);
            parcel.writeSerializable(this.f2342J);
            parcel.writeSerializable(this.f2344L);
            parcel.writeSerializable(this.f2345M);
            parcel.writeSerializable(this.f2346N);
            parcel.writeSerializable(this.f2347O);
            parcel.writeSerializable(this.f2348P);
            parcel.writeSerializable(this.f2349Q);
            parcel.writeSerializable(this.f2352T);
            parcel.writeSerializable(this.f2350R);
            parcel.writeSerializable(this.f2351S);
            parcel.writeSerializable(this.f2343K);
            parcel.writeSerializable(this.f2337E);
            parcel.writeSerializable(this.f2353U);
        }

        a(Parcel parcel) {
            this.f2362z = 255;
            this.f2334B = -2;
            this.f2335C = -2;
            this.f2336D = -2;
            this.f2343K = Boolean.TRUE;
            this.f2354o = parcel.readInt();
            this.f2355s = (Integer) parcel.readSerializable();
            this.f2356t = (Integer) parcel.readSerializable();
            this.f2357u = (Integer) parcel.readSerializable();
            this.f2358v = (Integer) parcel.readSerializable();
            this.f2359w = (Integer) parcel.readSerializable();
            this.f2360x = (Integer) parcel.readSerializable();
            this.f2361y = (Integer) parcel.readSerializable();
            this.f2362z = parcel.readInt();
            this.f2333A = parcel.readString();
            this.f2334B = parcel.readInt();
            this.f2335C = parcel.readInt();
            this.f2336D = parcel.readInt();
            this.f2338F = parcel.readString();
            this.f2339G = parcel.readString();
            this.f2340H = parcel.readInt();
            this.f2342J = (Integer) parcel.readSerializable();
            this.f2344L = (Integer) parcel.readSerializable();
            this.f2345M = (Integer) parcel.readSerializable();
            this.f2346N = (Integer) parcel.readSerializable();
            this.f2347O = (Integer) parcel.readSerializable();
            this.f2348P = (Integer) parcel.readSerializable();
            this.f2349Q = (Integer) parcel.readSerializable();
            this.f2352T = (Integer) parcel.readSerializable();
            this.f2350R = (Integer) parcel.readSerializable();
            this.f2351S = (Integer) parcel.readSerializable();
            this.f2343K = (Boolean) parcel.readSerializable();
            this.f2337E = (Locale) parcel.readSerializable();
            this.f2353U = (Boolean) parcel.readSerializable();
        }
    }
}
