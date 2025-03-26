package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: C3.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0423f0 extends AbstractC0813a {
    public static final Parcelable.Creator<C0423f0> CREATOR = new C0426g0();

    /* renamed from: o, reason: collision with root package name */
    public final int f955o;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f956s;

    public C0423f0(int i8, boolean z7) {
        this.f955o = i8;
        this.f956s = z7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f955o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        AbstractC0814b.c(parcel, 2, this.f956s);
        AbstractC0814b.b(parcel, a8);
    }
}
