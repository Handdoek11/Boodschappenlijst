package D2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i2 extends AbstractC0813a {
    public static final Parcelable.Creator<i2> CREATOR = new j2();

    /* renamed from: o, reason: collision with root package name */
    public final int f1295o;

    public i2(int i8) {
        this.f1295o = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f1295o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, i9);
        AbstractC0814b.b(parcel, a8);
    }
}
