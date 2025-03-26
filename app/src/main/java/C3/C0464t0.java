package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: C3.t0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0464t0 extends AbstractC0813a {
    public static final Parcelable.Creator<C0464t0> CREATOR = new C0467u0();

    /* renamed from: o, reason: collision with root package name */
    public final int f1044o;

    /* renamed from: s, reason: collision with root package name */
    public final String f1045s;

    public C0464t0(int i8, String str) {
        this.f1044o = i8;
        this.f1045s = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f1044o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, i9);
        AbstractC0814b.s(parcel, 3, this.f1045s, false);
        AbstractC0814b.b(parcel, a8);
    }
}
