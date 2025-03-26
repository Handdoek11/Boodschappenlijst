package k3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: k3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6099a implements IInterface {

    /* renamed from: o, reason: collision with root package name */
    private final IBinder f38518o;

    /* renamed from: s, reason: collision with root package name */
    private final String f38519s = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    protected AbstractC6099a(IBinder iBinder, String str) {
        this.f38518o = iBinder;
    }

    protected final Parcel D0(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f38518o.transact(i8, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e8) {
                obtain.recycle();
                throw e8;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f38518o;
    }

    protected final Parcel w0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f38519s);
        return obtain;
    }
}
