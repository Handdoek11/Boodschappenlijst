package com.google.android.gms.common;

import Z2.x0;
import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import i3.BinderC5853b;
import i3.InterfaceC5852a;

/* loaded from: classes.dex */
public final class E extends AbstractC0813a {
    public static final Parcelable.Creator<E> CREATOR = new F();

    /* renamed from: o, reason: collision with root package name */
    private final String f13194o;

    /* renamed from: s, reason: collision with root package name */
    private final v f13195s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f13196t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f13197u;

    E(String str, v vVar, boolean z7, boolean z8) {
        this.f13194o = str;
        this.f13195s = vVar;
        this.f13196t = z7;
        this.f13197u = z8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f13194o;
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.s(parcel, 1, str, false);
        v vVar = this.f13195s;
        if (vVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            vVar = null;
        }
        AbstractC0814b.l(parcel, 2, vVar, false);
        AbstractC0814b.c(parcel, 3, this.f13196t);
        AbstractC0814b.c(parcel, 4, this.f13197u);
        AbstractC0814b.b(parcel, a8);
    }

    E(String str, IBinder iBinder, boolean z7, boolean z8) {
        this.f13194o = str;
        w wVar = null;
        if (iBinder != null) {
            try {
                InterfaceC5852a d8 = x0.D0(iBinder).d();
                byte[] bArr = d8 == null ? null : (byte[]) BinderC5853b.J0(d8);
                if (bArr != null) {
                    wVar = new w(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e8) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e8);
            }
        }
        this.f13195s = wVar;
        this.f13196t = z7;
        this.f13197u = z8;
    }
}
