package com.google.android.gms.internal.ads;

import G2.AbstractC0608p0;
import android.os.RemoteException;
import j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class JW {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f16265a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final C4358vM f16266b;

    public JW(C4358vM c4358vM) {
        this.f16266b = c4358vM;
    }

    public final InterfaceC1171Bm a(String str) {
        if (this.f16265a.containsKey(str)) {
            return (InterfaceC1171Bm) this.f16265a.get(str);
        }
        return null;
    }

    public final void b(String str) {
        try {
            this.f16265a.put(str, this.f16266b.b(str));
        } catch (RemoteException e8) {
            AbstractC0608p0.l("Couldn't create RTB adapter : ", e8);
        }
    }
}
