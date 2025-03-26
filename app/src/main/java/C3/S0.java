package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class S0 extends AbstractC0813a {
    public static final Parcelable.Creator<S0> CREATOR = new T0();

    /* renamed from: o, reason: collision with root package name */
    public final int f902o;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f903s;

    public S0(int i8, boolean z7) {
        this.f902o = i8;
        this.f903s = z7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f902o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.c(parcel, 2, this.f903s);
        AbstractC0814b.b(parcel, a8);
    }
}
