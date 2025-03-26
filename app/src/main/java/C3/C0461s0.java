package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: C3.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0461s0 extends AbstractC0813a {
    public static final Parcelable.Creator<C0461s0> CREATOR = new C0458r0();

    /* renamed from: o, reason: collision with root package name */
    public final int f1041o;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1042s;

    public C0461s0(int i8, boolean z7) {
        this.f1041o = i8;
        this.f1042s = z7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f1041o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, i9);
        AbstractC0814b.c(parcel, 3, this.f1042s);
        AbstractC0814b.b(parcel, a8);
    }
}
