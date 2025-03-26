package z2;

import D2.AbstractBinderC0506h0;
import D2.InterfaceC0509i0;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.AbstractBinderC1590Nh;
import com.google.android.gms.internal.ads.InterfaceC1625Oh;

/* renamed from: z2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7071f extends AbstractC0813a {
    public static final Parcelable.Creator<C7071f> CREATOR = new C7079n();

    /* renamed from: o, reason: collision with root package name */
    private final boolean f44866o;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC0509i0 f44867s;

    /* renamed from: t, reason: collision with root package name */
    private final IBinder f44868t;

    C7071f(boolean z7, IBinder iBinder, IBinder iBinder2) {
        this.f44866o = z7;
        this.f44867s = iBinder != null ? AbstractBinderC0506h0.t7(iBinder) : null;
        this.f44868t = iBinder2;
    }

    public final InterfaceC0509i0 A0() {
        return this.f44867s;
    }

    public final InterfaceC1625Oh B0() {
        IBinder iBinder = this.f44868t;
        if (iBinder == null) {
            return null;
        }
        return AbstractBinderC1590Nh.t7(iBinder);
    }

    public final boolean a() {
        return this.f44866o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.c(parcel, 1, this.f44866o);
        InterfaceC0509i0 interfaceC0509i0 = this.f44867s;
        AbstractC0814b.l(parcel, 2, interfaceC0509i0 == null ? null : interfaceC0509i0.asBinder(), false);
        AbstractC0814b.l(parcel, 3, this.f44868t, false);
        AbstractC0814b.b(parcel, a8);
    }
}
