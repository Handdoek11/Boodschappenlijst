package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes2.dex */
public final class L1 extends AbstractC0813a {
    public static final Parcelable.Creator<L1> CREATOR = new M1();

    /* renamed from: o, reason: collision with root package name */
    public final int f885o;

    /* renamed from: s, reason: collision with root package name */
    public final long f886s;

    /* renamed from: t, reason: collision with root package name */
    public final List f887t;

    public L1(int i8, long j8, List list) {
        this.f885o = i8;
        this.f886s = j8;
        this.f887t = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f885o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, i9);
        AbstractC0814b.p(parcel, 3, this.f886s);
        AbstractC0814b.w(parcel, 4, this.f887t, false);
        AbstractC0814b.b(parcel, a8);
    }
}
