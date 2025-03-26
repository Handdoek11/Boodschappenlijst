package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: C3.x1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0477x1 extends AbstractC0813a {
    public static final Parcelable.Creator<C0477x1> CREATOR = new C0480y1();

    /* renamed from: o, reason: collision with root package name */
    public final int f1060o;

    /* renamed from: s, reason: collision with root package name */
    public final U f1061s;

    public C0477x1(int i8, U u7) {
        this.f1060o = i8;
        this.f1061s = u7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f1060o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 2, i9);
        AbstractC0814b.r(parcel, 3, this.f1061s, i8, false);
        AbstractC0814b.b(parcel, a8);
    }
}
