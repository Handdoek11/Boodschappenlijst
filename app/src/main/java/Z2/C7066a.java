package z2;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.AbstractBinderC1590Nh;
import com.google.android.gms.internal.ads.InterfaceC1625Oh;

/* renamed from: z2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7066a extends AbstractC0813a {
    public static final Parcelable.Creator<C7066a> CREATOR = new C7074i();

    /* renamed from: o, reason: collision with root package name */
    private final boolean f44850o;

    /* renamed from: s, reason: collision with root package name */
    private final IBinder f44851s;

    C7066a(boolean z7, IBinder iBinder) {
        this.f44850o = z7;
        this.f44851s = iBinder;
    }

    public boolean A0() {
        return this.f44850o;
    }

    public final InterfaceC1625Oh B0() {
        IBinder iBinder = this.f44851s;
        if (iBinder == null) {
            return null;
        }
        return AbstractBinderC1590Nh.t7(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.c(parcel, 1, A0());
        AbstractC0814b.l(parcel, 2, this.f44851s, false);
        AbstractC0814b.b(parcel, a8);
    }
}
