package com.google.android.gms.internal.ads;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import z2.C7070e;

/* renamed from: com.google.android.gms.internal.ads.Mg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1553Mg extends AbstractC0813a {
    public static final Parcelable.Creator<C1553Mg> CREATOR = new C1588Ng();

    /* renamed from: A, reason: collision with root package name */
    public final boolean f17385A;

    /* renamed from: B, reason: collision with root package name */
    public final int f17386B;

    /* renamed from: o, reason: collision with root package name */
    public final int f17387o;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f17388s;

    /* renamed from: t, reason: collision with root package name */
    public final int f17389t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f17390u;

    /* renamed from: v, reason: collision with root package name */
    public final int f17391v;

    /* renamed from: w, reason: collision with root package name */
    public final D2.Q1 f17392w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f17393x;

    /* renamed from: y, reason: collision with root package name */
    public final int f17394y;

    /* renamed from: z, reason: collision with root package name */
    public final int f17395z;

    public C1553Mg(int i8, boolean z7, int i9, boolean z8, int i10, D2.Q1 q12, boolean z9, int i11, int i12, boolean z10, int i13) {
        this.f17387o = i8;
        this.f17388s = z7;
        this.f17389t = i9;
        this.f17390u = z8;
        this.f17391v = i10;
        this.f17392w = q12;
        this.f17393x = z9;
        this.f17394y = i11;
        this.f17385A = z10;
        this.f17395z = i12;
        this.f17386B = i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.ads.nativead.c A0(com.google.android.gms.internal.ads.C1553Mg r5) {
        /*
            com.google.android.gms.ads.nativead.c$a r0 = new com.google.android.gms.ads.nativead.c$a
            r0.<init>()
            if (r5 != 0) goto Lc
            com.google.android.gms.ads.nativead.c r5 = r0.a()
            return r5
        Lc:
            int r1 = r5.f17387o
            r2 = 2
            if (r1 == r2) goto L45
            r3 = 3
            if (r1 == r3) goto L39
            r4 = 4
            if (r1 == r4) goto L18
            goto L4a
        L18:
            boolean r1 = r5.f17393x
            r0.e(r1)
            int r1 = r5.f17394y
            r0.d(r1)
            int r1 = r5.f17395z
            boolean r4 = r5.f17385A
            r0.b(r1, r4)
            int r1 = r5.f17386B
            r4 = 1
            if (r1 != 0) goto L30
        L2e:
            r2 = r4
            goto L36
        L30:
            if (r1 != r2) goto L34
            r2 = r3
            goto L36
        L34:
            if (r1 != r4) goto L2e
        L36:
            r0.q(r2)
        L39:
            D2.Q1 r1 = r5.f17392w
            if (r1 == 0) goto L45
            w2.x r2 = new w2.x
            r2.<init>(r1)
            r0.h(r2)
        L45:
            int r1 = r5.f17391v
            r0.c(r1)
        L4a:
            boolean r1 = r5.f17388s
            r0.g(r1)
            boolean r5 = r5.f17390u
            r0.f(r5)
            com.google.android.gms.ads.nativead.c r5 = r0.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1553Mg.A0(com.google.android.gms.internal.ads.Mg):com.google.android.gms.ads.nativead.c");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f17387o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.c(parcel, 2, this.f17388s);
        AbstractC0814b.m(parcel, 3, this.f17389t);
        AbstractC0814b.c(parcel, 4, this.f17390u);
        AbstractC0814b.m(parcel, 5, this.f17391v);
        AbstractC0814b.r(parcel, 6, this.f17392w, i8, false);
        AbstractC0814b.c(parcel, 7, this.f17393x);
        AbstractC0814b.m(parcel, 8, this.f17394y);
        AbstractC0814b.m(parcel, 9, this.f17395z);
        AbstractC0814b.c(parcel, 10, this.f17385A);
        AbstractC0814b.m(parcel, 11, this.f17386B);
        AbstractC0814b.b(parcel, a8);
    }

    public C1553Mg(C7070e c7070e) {
        this(4, c7070e.f(), c7070e.b(), c7070e.e(), c7070e.a(), c7070e.d() != null ? new D2.Q1(c7070e.d()) : null, c7070e.g(), c7070e.c(), 0, false, 0);
    }
}
