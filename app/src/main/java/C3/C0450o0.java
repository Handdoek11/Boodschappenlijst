package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: C3.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0450o0 extends AbstractC0813a {
    public static final Parcelable.Creator<C0450o0> CREATOR = new C0447n0();

    /* renamed from: o, reason: collision with root package name */
    public final int f1016o;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f1017s;

    public C0450o0(int i8, boolean z7) {
        this.f1016o = i8;
        this.f1017s = z7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f1016o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, i9);
        AbstractC0814b.c(parcel, 3, this.f1017s);
        AbstractC0814b.b(parcel, a8);
    }
}
