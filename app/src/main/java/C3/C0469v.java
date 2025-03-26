package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: C3.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0469v extends AbstractC0813a {
    public static final Parcelable.Creator<C0469v> CREATOR = new C0475x();

    /* renamed from: o, reason: collision with root package name */
    public final int f1051o;

    public C0469v(int i8) {
        this.f1051o = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f1051o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, i9);
        AbstractC0814b.b(parcel, a8);
    }
}
