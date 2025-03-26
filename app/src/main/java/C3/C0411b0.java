package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: C3.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0411b0 extends AbstractC0813a {
    public static final Parcelable.Creator<C0411b0> CREATOR = new C0414c0();

    /* renamed from: o, reason: collision with root package name */
    public final int f939o;

    /* renamed from: s, reason: collision with root package name */
    public final List f940s;

    public C0411b0(int i8, List list) {
        this.f939o = i8;
        this.f940s = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f939o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, i9);
        AbstractC0814b.w(parcel, 3, this.f940s, false);
        AbstractC0814b.b(parcel, a8);
    }
}
