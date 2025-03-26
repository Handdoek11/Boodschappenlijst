package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class H1 extends AbstractC0813a {
    public static final Parcelable.Creator<H1> CREATOR = new I1();

    /* renamed from: o, reason: collision with root package name */
    public final int f873o;

    /* renamed from: s, reason: collision with root package name */
    public final int f874s;

    public H1(int i8, int i9) {
        this.f873o = i8;
        this.f874s = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f873o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, i9);
        AbstractC0814b.m(parcel, 3, this.f874s);
        AbstractC0814b.b(parcel, a8);
    }
}
