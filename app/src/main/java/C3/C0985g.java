package c3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0985g extends AbstractC0813a {
    public static final Parcelable.Creator<C0985g> CREATOR = new C0990l();

    /* renamed from: o, reason: collision with root package name */
    private final int f12120o;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f12121s;

    public C0985g(int i8) {
        this(i8, false);
    }

    public boolean A0() {
        return this.f12120o == 0;
    }

    public int B0() {
        return this.f12120o;
    }

    public final boolean C0() {
        return this.f12121s;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, B0());
        AbstractC0814b.c(parcel, 2, this.f12121s);
        AbstractC0814b.b(parcel, a8);
    }

    public C0985g(int i8, boolean z7) {
        this.f12120o = i8;
        this.f12121s = z7;
    }
}
