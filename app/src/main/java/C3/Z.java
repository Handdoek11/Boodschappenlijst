package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class Z extends AbstractC0813a {
    public static final Parcelable.Creator<Z> CREATOR = new C0408a0();

    /* renamed from: o, reason: collision with root package name */
    private final byte[] f922o;

    public Z(byte[] bArr) {
        this.f922o = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        byte[] bArr = this.f922o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.g(parcel, 1, (byte[]) bArr.clone(), false);
        AbstractC0814b.b(parcel, a8);
    }
}
