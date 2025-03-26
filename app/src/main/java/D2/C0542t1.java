package D2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: D2.t1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0542t1 extends AbstractC0813a {
    public static final Parcelable.Creator<C0542t1> CREATOR = new C0545u1();

    /* renamed from: o, reason: collision with root package name */
    private final int f1344o;

    /* renamed from: s, reason: collision with root package name */
    private final int f1345s;

    /* renamed from: t, reason: collision with root package name */
    private final String f1346t;

    public C0542t1(int i8, int i9, String str) {
        this.f1344o = i8;
        this.f1345s = i9;
        this.f1346t = str;
    }

    public final int A0() {
        return this.f1345s;
    }

    public final String B0() {
        return this.f1346t;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, this.f1344o);
        AbstractC0814b.m(parcel, 2, this.f1345s);
        AbstractC0814b.s(parcel, 3, this.f1346t, false);
        AbstractC0814b.b(parcel, a8);
    }
}
