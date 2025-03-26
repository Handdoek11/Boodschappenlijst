package g2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5799a implements IInterface {

    /* renamed from: o, reason: collision with root package name */
    private final IBinder f36007o;

    /* renamed from: s, reason: collision with root package name */
    private final String f36008s = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    protected AbstractC5799a(IBinder iBinder) {
        this.f36007o = iBinder;
    }

    protected final Parcel D0(Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f36007o.transact(1, parcel, obtain, 0);
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
        return this.f36007o;
    }

    protected final Parcel w0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f36008s);
        return obtain;
    }
}
