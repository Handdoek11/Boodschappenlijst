package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ob, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3612ob implements IInterface {

    /* renamed from: o, reason: collision with root package name */
    private final IBinder f25230o;

    /* renamed from: s, reason: collision with root package name */
    private final String f25231s;

    protected AbstractC3612ob(IBinder iBinder, String str) {
        this.f25230o = iBinder;
        this.f25231s = str;
    }

    protected final Parcel D0(int i8, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f25230o.transact(i8, parcel, obtain, 0);
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
            this.f25230o.transact(i8, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f25230o;
    }

    protected final void p2(int i8, Parcel parcel) {
        try {
            this.f25230o.transact(i8, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel w0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f25231s);
        return obtain;
    }
}
