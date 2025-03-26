package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class O0 extends AbstractC0813a {
    public static final Parcelable.Creator<O0> CREATOR = new P0();

    /* renamed from: o, reason: collision with root package name */
    public final int f892o;

    /* renamed from: s, reason: collision with root package name */
    public final String f893s;

    public O0(int i8, String str) {
        this.f892o = i8;
        this.f893s = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f892o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, i9);
        AbstractC0814b.s(parcel, 3, this.f893s, false);
        AbstractC0814b.b(parcel, a8);
    }
}
