package Z2;

import Z2.InterfaceC0772k;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C1103b;

/* loaded from: classes.dex */
public final class Q extends AbstractC0813a {
    public static final Parcelable.Creator<Q> CREATOR = new S();

    /* renamed from: o, reason: collision with root package name */
    final int f6266o;

    /* renamed from: s, reason: collision with root package name */
    final IBinder f6267s;

    /* renamed from: t, reason: collision with root package name */
    private final C1103b f6268t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f6269u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f6270v;

    Q(int i8, IBinder iBinder, C1103b c1103b, boolean z7, boolean z8) {
        this.f6266o = i8;
        this.f6267s = iBinder;
        this.f6268t = c1103b;
        this.f6269u = z7;
        this.f6270v = z8;
    }

    public final C1103b A0() {
        return this.f6268t;
    }

    public final InterfaceC0772k B0() {
        IBinder iBinder = this.f6267s;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC0772k.a.D0(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Q)) {
            return false;
        }
        Q q8 = (Q) obj;
        return this.f6268t.equals(q8.f6268t) && AbstractC0777p.a(B0(), q8.B0());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, this.f6266o);
        AbstractC0814b.l(parcel, 2, this.f6267s, false);
        AbstractC0814b.r(parcel, 3, this.f6268t, i8, false);
        AbstractC0814b.c(parcel, 4, this.f6269u);
        AbstractC0814b.c(parcel, 5, this.f6270v);
        AbstractC0814b.b(parcel, a8);
    }
}
