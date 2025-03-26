package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: C3.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0478y extends AbstractC0813a {
    public static final Parcelable.Creator<C0478y> CREATOR = new C0481z();

    /* renamed from: o, reason: collision with root package name */
    public final int f1062o;

    public C0478y(int i8) {
        this.f1062o = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f1062o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, i9);
        AbstractC0814b.b(parcel, a8);
    }
}
