package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: C3.z0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0482z0 extends AbstractC0813a {
    public static final Parcelable.Creator<C0482z0> CREATOR = new A0();

    /* renamed from: o, reason: collision with root package name */
    public final int f1063o;

    /* renamed from: s, reason: collision with root package name */
    public final List f1064s;

    public C0482z0(int i8, List list) {
        this.f1063o = i8;
        this.f1064s = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f1063o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, i9);
        AbstractC0814b.w(parcel, 3, this.f1064s, false);
        AbstractC0814b.b(parcel, a8);
    }
}
