package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.play_billing.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5113g implements IInterface {

    /* renamed from: o, reason: collision with root package name */
    private final IBinder f29904o;

    /* renamed from: s, reason: collision with root package name */
    private final String f29905s;

    protected AbstractC5113g(IBinder iBinder, String str) {
        this.f29904o = iBinder;
        this.f29905s = str;
    }

    protected final Parcel D0(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f29904o.transact(i8, parcel, obtain, 0);
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
            this.f29904o.transact(i8, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f29904o;
    }

    protected final void p2(int i8, Parcel parcel) {
        try {
            this.f29904o.transact(i8, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel w0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f29905s);
        return obtain;
    }
}
