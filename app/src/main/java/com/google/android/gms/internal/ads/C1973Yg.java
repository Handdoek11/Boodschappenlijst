package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import i3.BinderC5853b;
import i3.InterfaceC5852a;
import z2.AbstractC7069d;

/* renamed from: com.google.android.gms.internal.ads.Yg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1973Yg extends AbstractC7069d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1938Xg f20299a;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f20300b;

    /* renamed from: c, reason: collision with root package name */
    private final Uri f20301c;

    /* renamed from: d, reason: collision with root package name */
    private final double f20302d;

    /* renamed from: e, reason: collision with root package name */
    private final int f20303e;

    /* renamed from: f, reason: collision with root package name */
    private final int f20304f;

    public C1973Yg(InterfaceC1938Xg interfaceC1938Xg) {
        double d8;
        int i8;
        InterfaceC5852a c8;
        this.f20299a = interfaceC1938Xg;
        Uri uri = null;
        try {
            c8 = interfaceC1938Xg.c();
        } catch (RemoteException e8) {
            H2.p.e("", e8);
        }
        Drawable drawable = c8 != null ? (Drawable) BinderC5853b.J0(c8) : null;
        this.f20300b = drawable;
        try {
            uri = this.f20299a.b();
        } catch (RemoteException e9) {
            H2.p.e("", e9);
        }
        this.f20301c = uri;
        try {
            d8 = this.f20299a.zzb();
        } catch (RemoteException e10) {
            H2.p.e("", e10);
            d8 = 1.0d;
        }
        this.f20302d = d8;
        int i9 = -1;
        try {
            i8 = this.f20299a.d();
        } catch (RemoteException e11) {
            H2.p.e("", e11);
            i8 = -1;
        }
        this.f20303e = i8;
        try {
            i9 = this.f20299a.a();
        } catch (RemoteException e12) {
            H2.p.e("", e12);
        }
        this.f20304f = i9;
    }

    @Override // z2.AbstractC7069d
    public final Drawable a() {
        return this.f20300b;
    }

    @Override // z2.AbstractC7069d
    public final double b() {
        return this.f20302d;
    }

    @Override // z2.AbstractC7069d
    public final Uri c() {
        return this.f20301c;
    }

    @Override // z2.AbstractC7069d
    public final int d() {
        return this.f20304f;
    }

    @Override // z2.AbstractC7069d
    public final int e() {
        return this.f20303e;
    }
}
