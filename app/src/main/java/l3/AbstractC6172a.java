package l3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: l3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6172a implements IInterface {

    /* renamed from: o, reason: collision with root package name */
    private final IBinder f38784o;

    /* renamed from: s, reason: collision with root package name */
    private final String f38785s = "com.google.android.gms.appset.internal.IAppSetService";

    protected AbstractC6172a(IBinder iBinder, String str) {
        this.f38784o = iBinder;
    }

    protected final void D0(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f38784o.transact(1, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f38784o;
    }

    protected final Parcel w0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f38785s);
        return obtain;
    }
}
