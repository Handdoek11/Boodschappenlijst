package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class M0 extends AbstractC0813a {
    public static final Parcelable.Creator<M0> CREATOR = new N0();

    /* renamed from: o, reason: collision with root package name */
    public final int f888o;

    /* renamed from: s, reason: collision with root package name */
    public final C0454p1 f889s;

    public M0(int i8, C0454p1 c0454p1) {
        this.f888o = i8;
        this.f889s = c0454p1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f888o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, i9);
        AbstractC0814b.r(parcel, 3, this.f889s, i8, false);
        AbstractC0814b.b(parcel, a8);
    }
}
