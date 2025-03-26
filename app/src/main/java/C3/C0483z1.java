package C3;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: C3.z1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0483z1 extends AbstractC0813a {
    public static final Parcelable.Creator<C0483z1> CREATOR = new A1();

    /* renamed from: o, reason: collision with root package name */
    final int f1065o;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC0412b1 f1066s;

    C0483z1(int i8, IBinder iBinder) {
        InterfaceC0412b1 interfaceC0412b1;
        this.f1065o = i8;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            interfaceC0412b1 = queryLocalInterface instanceof InterfaceC0412b1 ? (InterfaceC0412b1) queryLocalInterface : new Z0(iBinder);
        } else {
            interfaceC0412b1 = null;
        }
        this.f1066s = interfaceC0412b1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int i9 = this.f1065o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.m(parcel, 1, i9);
        InterfaceC0412b1 interfaceC0412b1 = this.f1066s;
        AbstractC0814b.l(parcel, 2, interfaceC0412b1 == null ? null : interfaceC0412b1.asBinder(), false);
        AbstractC0814b.b(parcel, a8);
    }

    public C0483z1(InterfaceC0412b1 interfaceC0412b1) {
        this.f1065o = 1;
        this.f1066s = interfaceC0412b1;
    }
}
