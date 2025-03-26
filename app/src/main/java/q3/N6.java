package q3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class N6 extends AbstractC0813a {
    public static final Parcelable.Creator<N6> CREATOR = new b7();

    /* renamed from: o, reason: collision with root package name */
    private final String f41386o;

    /* renamed from: s, reason: collision with root package name */
    private final String f41387s;

    /* renamed from: t, reason: collision with root package name */
    private final int f41388t;

    public N6(String str, String str2, int i8) {
        this.f41386o = str;
        this.f41387s = str2;
        this.f41388t = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, this.f41386o, false);
        AbstractC0814b.s(parcel, 2, this.f41387s, false);
        AbstractC0814b.m(parcel, 3, this.f41388t);
        AbstractC0814b.b(parcel, a8);
    }
}
