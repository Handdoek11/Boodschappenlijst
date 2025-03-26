package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* renamed from: C3.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0435j0 extends AbstractC0813a {
    public static final Parcelable.Creator<C0435j0> CREATOR = new C0438k0();

    /* renamed from: o, reason: collision with root package name */
    public final int f985o;

    /* renamed from: s, reason: collision with root package name */
    public final ParcelFileDescriptor f986s;

    public C0435j0(int i8, ParcelFileDescriptor parcelFileDescriptor) {
        this.f985o = i8;
        this.f986s = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f985o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, i9);
        AbstractC0814b.r(parcel, 3, this.f986s, i8, false);
        AbstractC0814b.b(parcel, a8);
    }
}
