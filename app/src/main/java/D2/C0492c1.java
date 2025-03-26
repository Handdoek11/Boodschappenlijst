package D2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: D2.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0492c1 extends AbstractC0813a {
    public static final Parcelable.Creator<C0492c1> CREATOR = new C0495d1();

    /* renamed from: o, reason: collision with root package name */
    public final int f1214o;

    public C0492c1(int i8) {
        this.f1214o = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f1214o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, i9);
        AbstractC0814b.b(parcel, a8);
    }
}
