package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class J0 extends AbstractC0813a {
    public static final Parcelable.Creator<J0> CREATOR = new L0();

    /* renamed from: o, reason: collision with root package name */
    public final int f879o;

    /* renamed from: s, reason: collision with root package name */
    public final ParcelFileDescriptor f880s;

    public J0(int i8, ParcelFileDescriptor parcelFileDescriptor) {
        this.f879o = i8;
        this.f880s = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f879o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, i9);
        AbstractC0814b.r(parcel, 3, this.f880s, i8 | 1, false);
        AbstractC0814b.b(parcel, a8);
    }
}
