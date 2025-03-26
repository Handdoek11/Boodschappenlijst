package C2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class l extends AbstractC0813a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: o, reason: collision with root package name */
    public final boolean f787o;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f788s;

    /* renamed from: t, reason: collision with root package name */
    public final String f789t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f790u;

    /* renamed from: v, reason: collision with root package name */
    public final float f791v;

    /* renamed from: w, reason: collision with root package name */
    public final int f792w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f793x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f794y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f795z;

    l(boolean z7, boolean z8, String str, boolean z9, float f8, int i8, boolean z10, boolean z11, boolean z12) {
        this.f787o = z7;
        this.f788s = z8;
        this.f789t = str;
        this.f790u = z9;
        this.f791v = f8;
        this.f792w = i8;
        this.f793x = z10;
        this.f794y = z11;
        this.f795z = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        boolean z7 = this.f787o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.c(parcel, 2, z7);
        AbstractC0814b.c(parcel, 3, this.f788s);
        AbstractC0814b.s(parcel, 4, this.f789t, false);
        AbstractC0814b.c(parcel, 5, this.f790u);
        AbstractC0814b.j(parcel, 6, this.f791v);
        AbstractC0814b.m(parcel, 7, this.f792w);
        AbstractC0814b.c(parcel, 8, this.f793x);
        AbstractC0814b.c(parcel, 9, this.f794y);
        AbstractC0814b.c(parcel, 10, this.f795z);
        AbstractC0814b.b(parcel, a8);
    }

    public l(boolean z7, boolean z8, boolean z9, float f8, int i8, boolean z10, boolean z11, boolean z12) {
        this(z7, z8, null, z9, f8, -1, z10, z11, z12);
    }
}
