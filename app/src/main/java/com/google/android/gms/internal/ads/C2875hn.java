package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import i3.BinderC5853b;
import i3.InterfaceC5852a;

/* renamed from: com.google.android.gms.internal.ads.hn, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2875hn extends NativeAd.b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1938Xg f22616a;

    /* renamed from: b, reason: collision with root package name */
    private final Drawable f22617b;

    /* renamed from: c, reason: collision with root package name */
    private final Uri f22618c;

    /* renamed from: d, reason: collision with root package name */
    private final double f22619d;

    /* renamed from: e, reason: collision with root package name */
    private final int f22620e;

    /* renamed from: f, reason: collision with root package name */
    private final int f22621f;

    public C2875hn(InterfaceC1938Xg interfaceC1938Xg) {
        double d8;
        int i8;
        InterfaceC5852a c8;
        this.f22616a = interfaceC1938Xg;
        Uri uri = null;
        try {
            c8 = interfaceC1938Xg.c();
        } catch (RemoteException e8) {
            H2.p.e("", e8);
        }
        Drawable drawable = c8 != null ? (Drawable) BinderC5853b.J0(c8) : null;
        this.f22617b = drawable;
        try {
            uri = this.f22616a.b();
        } catch (RemoteException e9) {
            H2.p.e("", e9);
        }
        this.f22618c = uri;
        try {
            d8 = this.f22616a.zzb();
        } catch (RemoteException e10) {
            H2.p.e("", e10);
            d8 = 1.0d;
        }
        this.f22619d = d8;
        int i9 = -1;
        try {
            i8 = this.f22616a.d();
        } catch (RemoteException e11) {
            H2.p.e("", e11);
            i8 = -1;
        }
        this.f22620e = i8;
        try {
            i9 = this.f22616a.a();
        } catch (RemoteException e12) {
            H2.p.e("", e12);
        }
        this.f22621f = i9;
    }
}
