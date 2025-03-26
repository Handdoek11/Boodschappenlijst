package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class B0 extends AbstractC0813a {
    public static final Parcelable.Creator<B0> CREATOR = new C0();

    /* renamed from: o, reason: collision with root package name */
    public final int f847o;

    /* renamed from: s, reason: collision with root package name */
    public final U f848s;

    public B0(int i8, U u7) {
        this.f847o = i8;
        this.f848s = u7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f847o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, i9);
        AbstractC0814b.r(parcel, 3, this.f848s, i8, false);
        AbstractC0814b.b(parcel, a8);
    }
}
