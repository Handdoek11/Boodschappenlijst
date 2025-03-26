package com.google.android.gms.internal.ads;

import a3.AbstractC0813a;
import a3.AbstractC0814b;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.Hc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1369Hc extends AbstractC0813a {
    public static final Parcelable.Creator<C1369Hc> CREATOR = new C1405Ic();

    /* renamed from: o, reason: collision with root package name */
    private ParcelFileDescriptor f15756o;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f15757s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f15758t;

    /* renamed from: u, reason: collision with root package name */
    private final long f15759u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f15760v;

    public C1369Hc() {
        this(null, false, false, 0L, false);
    }

    public final synchronized long A0() {
        return this.f15759u;
    }

    final synchronized ParcelFileDescriptor B0() {
        return this.f15756o;
    }

    public final synchronized InputStream C0() {
        if (this.f15756o == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.f15756o);
        this.f15756o = null;
        return autoCloseInputStream;
    }

    public final synchronized boolean D0() {
        return this.f15757s;
    }

    public final synchronized boolean E0() {
        return this.f15756o != null;
    }

    public final synchronized boolean F0() {
        return this.f15758t;
    }

    public final synchronized boolean G0() {
        return this.f15760v;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        int a8 = AbstractC0814b.a(parcel);
        AbstractC0814b.r(parcel, 2, B0(), i8, false);
        AbstractC0814b.c(parcel, 3, D0());
        AbstractC0814b.c(parcel, 4, F0());
        AbstractC0814b.p(parcel, 5, A0());
        AbstractC0814b.c(parcel, 6, G0());
        AbstractC0814b.b(parcel, a8);
    }

    public C1369Hc(ParcelFileDescriptor parcelFileDescriptor, boolean z7, boolean z8, long j8, boolean z9) {
        this.f15756o = parcelFileDescriptor;
        this.f15757s = z7;
        this.f15758t = z8;
        this.f15759u = j8;
        this.f15760v = z9;
    }
}
