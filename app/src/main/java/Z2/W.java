package Z2;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
final class W implements InterfaceC0774m {

    /* renamed from: o, reason: collision with root package name */
    private final IBinder f6274o;

    W(IBinder iBinder) {
        this.f6274o = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6274o;
    }

    @Override // Z2.InterfaceC0774m
    public final void w5(InterfaceC0773l interfaceC0773l, C0768g c0768g) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(interfaceC0773l != null ? interfaceC0773l.asBinder() : null);
            if (c0768g != null) {
                obtain.writeInt(1);
                m0.a(c0768g, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.f6274o.transact(46, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }
}
