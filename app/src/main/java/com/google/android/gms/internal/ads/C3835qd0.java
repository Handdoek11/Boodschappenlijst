package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.qd0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3835qd0 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f25960a;

    /* renamed from: b, reason: collision with root package name */
    private int f25961b;

    /* renamed from: c, reason: collision with root package name */
    private int f25962c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C4052sd0 f25963d;

    /* synthetic */ C3835qd0(C4052sd0 c4052sd0, byte[] bArr, AbstractC3943rd0 abstractC3943rd0) {
        this.f25963d = c4052sd0;
        this.f25960a = bArr;
    }

    public final C3835qd0 a(int i8) {
        this.f25962c = i8;
        return this;
    }

    public final C3835qd0 b(int i8) {
        this.f25961b = i8;
        return this;
    }

    public final synchronized void c() {
        try {
            C4052sd0 c4052sd0 = this.f25963d;
            if (c4052sd0.f26710b) {
                c4052sd0.f26709a.n0(this.f25960a);
                this.f25963d.f26709a.K(this.f25961b);
                this.f25963d.f26709a.z(this.f25962c);
                this.f25963d.f26709a.z0(null);
                this.f25963d.f26709a.c();
            }
        } catch (RemoteException e8) {
            Log.d("GASS", "Clearcut log failed", e8);
        }
    }
}
