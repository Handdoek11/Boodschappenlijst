package D2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class K1 extends AbstractC0813a {
    public static final Parcelable.Creator<K1> CREATOR = new L1();

    /* renamed from: o, reason: collision with root package name */
    public final int f1151o;

    /* renamed from: s, reason: collision with root package name */
    public final int f1152s;

    public K1(int i8, int i9) {
        this.f1151o = i8;
        this.f1152s = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f1151o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.m(parcel, 2, this.f1152s);
        AbstractC0814b.b(parcel, a8);
    }

    public K1(w2.t tVar) {
        this.f1151o = tVar.c();
        this.f1152s = tVar.d();
    }
}
