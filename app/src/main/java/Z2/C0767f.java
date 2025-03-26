package Z2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Z2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0767f extends AbstractC0813a {
    public static final Parcelable.Creator<C0767f> CREATOR = new l0();

    /* renamed from: o, reason: collision with root package name */
    private final C0780t f6330o;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f6331s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f6332t;

    /* renamed from: u, reason: collision with root package name */
    private final int[] f6333u;

    /* renamed from: v, reason: collision with root package name */
    private final int f6334v;

    /* renamed from: w, reason: collision with root package name */
    private final int[] f6335w;

    public C0767f(C0780t c0780t, boolean z7, boolean z8, int[] iArr, int i8, int[] iArr2) {
        this.f6330o = c0780t;
        this.f6331s = z7;
        this.f6332t = z8;
        this.f6333u = iArr;
        this.f6334v = i8;
        this.f6335w = iArr2;
    }

    public int A0() {
        return this.f6334v;
    }

    public int[] B0() {
        return this.f6333u;
    }

    public int[] C0() {
        return this.f6335w;
    }

    public boolean D0() {
        return this.f6331s;
    }

    public boolean E0() {
        return this.f6332t;
    }

    public final C0780t F0() {
        return this.f6330o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.r(parcel, 1, this.f6330o, i8, false);
        AbstractC0814b.c(parcel, 2, D0());
        AbstractC0814b.c(parcel, 3, E0());
        AbstractC0814b.n(parcel, 4, B0(), false);
        AbstractC0814b.m(parcel, 5, A0());
        AbstractC0814b.n(parcel, 6, C0(), false);
        AbstractC0814b.b(parcel, a8);
    }
}
