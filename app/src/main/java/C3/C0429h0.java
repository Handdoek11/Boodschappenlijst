package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: C3.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0429h0 extends AbstractC0813a {
    public static final Parcelable.Creator<C0429h0> CREATOR = new C0432i0();

    /* renamed from: o, reason: collision with root package name */
    public final int f971o;

    /* renamed from: s, reason: collision with root package name */
    public final C0434j f972s;

    public C0429h0(int i8, C0434j c0434j) {
        this.f971o = i8;
        this.f972s = c0434j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f971o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, i9);
        AbstractC0814b.r(parcel, 3, this.f972s, i8, false);
        AbstractC0814b.b(parcel, a8);
    }
}
