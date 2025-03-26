package m3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: m3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6193a implements IInterface {

    /* renamed from: o, reason: collision with root package name */
    private final IBinder f38959o;

    /* renamed from: s, reason: collision with root package name */
    private final String f38960s;

    protected AbstractC6193a(IBinder iBinder, String str) {
        this.f38959o = iBinder;
        this.f38960s = str;
    }

    protected final void D0(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f38959o.transact(i8, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    protected final void J0(int i8, Parcel parcel) {
        try {
            this.f38959o.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f38959o;
    }

    protected final Parcel w0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f38960s);
        return obtain;
    }
}
