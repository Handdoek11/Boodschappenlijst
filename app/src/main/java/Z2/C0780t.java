package Z2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Z2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0780t extends AbstractC0813a {
    public static final Parcelable.Creator<C0780t> CREATOR = new c0();

    /* renamed from: o, reason: collision with root package name */
    private final int f6413o;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f6414s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f6415t;

    /* renamed from: u, reason: collision with root package name */
    private final int f6416u;

    /* renamed from: v, reason: collision with root package name */
    private final int f6417v;

    public C0780t(int i8, boolean z7, boolean z8, int i9, int i10) {
        this.f6413o = i8;
        this.f6414s = z7;
        this.f6415t = z8;
        this.f6416u = i9;
        this.f6417v = i10;
    }

    public int A0() {
        return this.f6416u;
    }

    public int B0() {
        return this.f6417v;
    }

    public boolean C0() {
        return this.f6414s;
    }

    public boolean D0() {
        return this.f6415t;
    }

    public int E0() {
        return this.f6413o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, E0());
        AbstractC0814b.c(parcel, 2, C0());
        AbstractC0814b.c(parcel, 3, D0());
        AbstractC0814b.m(parcel, 4, A0());
        AbstractC0814b.m(parcel, 5, B0());
        AbstractC0814b.b(parcel, a8);
    }
}
