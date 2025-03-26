package o3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: o3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6286a implements IInterface {

    /* renamed from: o, reason: collision with root package name */
    private final IBinder f39811o;

    /* renamed from: s, reason: collision with root package name */
    private final String f39812s;

    protected AbstractC6286a(IBinder iBinder, String str) {
        this.f39811o = iBinder;
        this.f39812s = str;
    }

    protected final Parcel D0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f39812s);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f39811o;
    }

    protected final Parcel w0(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f39811o.transact(i8, parcel, obtain, 0);
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
}
