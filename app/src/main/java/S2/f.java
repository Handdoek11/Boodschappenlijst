package S2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f extends AbstractC0813a {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* renamed from: o, reason: collision with root package name */
    private final String f5080o;

    /* renamed from: s, reason: collision with root package name */
    private final int f5081s;

    public f(String str, int i8) {
        this.f5080o = str;
        this.f5081s = i8;
    }

    public final int A0() {
        return this.f5081s;
    }

    public final String B0() {
        return this.f5080o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, this.f5080o, false);
        AbstractC0814b.m(parcel, 2, this.f5081s);
        AbstractC0814b.b(parcel, a8);
    }
}
