package com.google.android.gms.internal.wearable;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.wearable.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5228a implements IInterface {

    /* renamed from: o, reason: collision with root package name */
    private final IBinder f30114o;

    /* renamed from: s, reason: collision with root package name */
    private final String f30115s;

    protected AbstractC5228a(IBinder iBinder, String str) {
        this.f30114o = iBinder;
        this.f30115s = str;
    }

    protected final void D0(int i8, Parcel parcel) {
        try {
            this.f30114o.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel J0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f30115s);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f30114o;
    }

    protected final void w0(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f30114o.transact(i8, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
