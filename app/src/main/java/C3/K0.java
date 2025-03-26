package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class K0 extends AbstractC0813a {
    public static final Parcelable.Creator<K0> CREATOR = new C0430h1();

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0412b1 f881o;

    /* renamed from: s, reason: collision with root package name */
    public final IntentFilter[] f882s;

    /* renamed from: t, reason: collision with root package name */
    public final String f883t;

    /* renamed from: u, reason: collision with root package name */
    public final String f884u;

    K0(IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        InterfaceC0412b1 interfaceC0412b1;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            interfaceC0412b1 = queryLocalInterface instanceof InterfaceC0412b1 ? (InterfaceC0412b1) queryLocalInterface : new Z0(iBinder);
        } else {
            interfaceC0412b1 = null;
        }
        this.f881o = interfaceC0412b1;
        this.f882s = intentFilterArr;
        this.f883t = str;
        this.f884u = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        InterfaceC0412b1 interfaceC0412b1 = this.f881o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.l(parcel, 2, interfaceC0412b1 == null ? null : interfaceC0412b1.asBinder(), false);
        AbstractC0814b.v(parcel, 3, this.f882s, i8, false);
        AbstractC0814b.s(parcel, 4, this.f883t, false);
        AbstractC0814b.s(parcel, 5, this.f884u, false);
        AbstractC0814b.b(parcel, a8);
    }

    public K0(g2 g2Var) {
        this.f881o = g2Var;
        this.f882s = g2Var.J0();
        this.f883t = g2Var.s();
        this.f884u = null;
    }
}
