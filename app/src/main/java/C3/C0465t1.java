package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: C3.t1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0465t1 extends AbstractC0813a {
    public static final Parcelable.Creator<C0465t1> CREATOR = new C0468u1();

    /* renamed from: o, reason: collision with root package name */
    public final String f1046o;

    /* renamed from: s, reason: collision with root package name */
    public final String f1047s;

    /* renamed from: t, reason: collision with root package name */
    public final long f1048t;

    public C0465t1(String str, String str2, long j8) {
        this.f1046o = str;
        this.f1047s = str2;
        this.f1048t = j8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f1046o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 2, str, false);
        AbstractC0814b.s(parcel, 3, this.f1047s, false);
        AbstractC0814b.p(parcel, 4, this.f1048t);
        AbstractC0814b.b(parcel, a8);
    }
}
