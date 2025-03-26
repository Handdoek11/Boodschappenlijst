package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.ads.mg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3405mg0 implements Serializable, InterfaceC3296lg0 {

    /* renamed from: o, reason: collision with root package name */
    private final transient C3841qg0 f24549o = new C3841qg0();

    /* renamed from: s, reason: collision with root package name */
    final InterfaceC3296lg0 f24550s;

    /* renamed from: t, reason: collision with root package name */
    volatile transient boolean f24551t;

    /* renamed from: u, reason: collision with root package name */
    transient Object f24552u;

    C3405mg0(InterfaceC3296lg0 interfaceC3296lg0) {
        this.f24550s = interfaceC3296lg0;
    }

    public final String toString() {
        Object obj;
        if (this.f24551t) {
            obj = "<supplier that returned " + String.valueOf(this.f24552u) + ">";
        } else {
            obj = this.f24550s;
        }
        return "Suppliers.memoize(" + obj.toString() + ")";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3296lg0
    public final Object zza() {
        if (!this.f24551t) {
            synchronized (this.f24549o) {
                try {
                    if (!this.f24551t) {
                        Object zza = this.f24550s.zza();
                        this.f24552u = zza;
                        this.f24551t = true;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.f24552u;
    }
}
