package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: C3.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0456q0 extends AbstractC0813a {
    public static final Parcelable.Creator<C0456q0> CREATOR = new C0453p0();

    /* renamed from: o, reason: collision with root package name */
    public final int f1031o;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1032s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1033t;

    public C0456q0(int i8, boolean z7, boolean z8) {
        this.f1031o = i8;
        this.f1032s = z7;
        this.f1033t = z8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f1031o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, i9);
        AbstractC0814b.c(parcel, 3, this.f1032s);
        AbstractC0814b.c(parcel, 4, this.f1033t);
        AbstractC0814b.b(parcel, a8);
    }
}
