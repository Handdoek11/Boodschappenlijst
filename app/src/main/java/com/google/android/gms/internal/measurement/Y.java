package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class Y implements IInterface {

    /* renamed from: o, reason: collision with root package name */
    private final IBinder f29054o;

    /* renamed from: s, reason: collision with root package name */
    private final String f29055s;

    protected Y(IBinder iBinder, String str) {
        this.f29054o = iBinder;
        this.f29055s = str;
    }

    protected final Parcel D0(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f29054o.transact(i8, parcel, obtain, 0);
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

    protected final void J0(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f29054o.transact(i8, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f29054o;
    }

    protected final Parcel w0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f29055s);
        return obtain;
    }
}
