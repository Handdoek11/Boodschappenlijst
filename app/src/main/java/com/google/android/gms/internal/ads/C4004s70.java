package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.s70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4004s70 implements InterfaceC3360mC {

    /* renamed from: o, reason: collision with root package name */
    private final HashSet f26574o = new HashSet();

    /* renamed from: s, reason: collision with root package name */
    private final Context f26575s;

    /* renamed from: t, reason: collision with root package name */
    private final C1283Eq f26576t;

    public C4004s70(Context context, C1283Eq c1283Eq) {
        this.f26575s = context;
        this.f26576t = c1283Eq;
    }

    public final Bundle a() {
        return this.f26576t.m(this.f26575s, this);
    }

    public final synchronized void b(HashSet hashSet) {
        this.f26574o.clear();
        this.f26574o.addAll(hashSet);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3360mC
    public final synchronized void r0(D2.W0 w02) {
        if (w02.f1162o != 3) {
            this.f26576t.k(this.f26574o);
        }
    }
}
