package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import i3.BinderC5853b;
import z2.C7067b;

/* renamed from: com.google.android.gms.internal.ads.rh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3950rh {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3842qh f26212a;

    public C3950rh(InterfaceC3842qh interfaceC3842qh) {
        Context context;
        this.f26212a = interfaceC3842qh;
        try {
            context = (Context) BinderC5853b.J0(interfaceC3842qh.e());
        } catch (RemoteException | NullPointerException e8) {
            H2.p.e("", e8);
            context = null;
        }
        if (context != null) {
            try {
                this.f26212a.g0(BinderC5853b.p2(new C7067b(context)));
            } catch (RemoteException e9) {
                H2.p.e("", e9);
            }
        }
    }

    public final InterfaceC3842qh a() {
        return this.f26212a;
    }

    public final String b() {
        try {
            return this.f26212a.f();
        } catch (RemoteException e8) {
            H2.p.e("", e8);
            return null;
        }
    }
}
