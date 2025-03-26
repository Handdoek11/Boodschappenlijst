package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class TG {

    /* renamed from: a, reason: collision with root package name */
    private final CH f19104a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4410vt f19105b;

    public TG(CH ch, InterfaceC4410vt interfaceC4410vt) {
        this.f19104a = ch;
        this.f19105b = interfaceC4410vt;
    }

    public final View a() {
        InterfaceC4410vt interfaceC4410vt = this.f19105b;
        if (interfaceC4410vt == null) {
            return null;
        }
        return interfaceC4410vt.A();
    }

    public final View b() {
        InterfaceC4410vt interfaceC4410vt = this.f19105b;
        if (interfaceC4410vt != null) {
            return interfaceC4410vt.A();
        }
        return null;
    }

    public final InterfaceC4410vt c() {
        return this.f19105b;
    }

    public final C3041jG d(Executor executor) {
        final InterfaceC4410vt interfaceC4410vt = this.f19105b;
        return new C3041jG(new EE() { // from class: com.google.android.gms.internal.ads.SG
            @Override // com.google.android.gms.internal.ads.EE
            public final void zza() {
                F2.x O7;
                InterfaceC4410vt interfaceC4410vt2 = interfaceC4410vt;
                if (interfaceC4410vt2 == null || (O7 = interfaceC4410vt2.O()) == null) {
                    return;
                }
                O7.zzb();
            }
        }, executor);
    }

    public final CH e() {
        return this.f19104a;
    }

    public Set f(DB db) {
        return Collections.singleton(new C3041jG(db, AbstractC1497Kq.f16650g));
    }

    public Set g(DB db) {
        return Collections.singleton(new C3041jG(db, AbstractC1497Kq.f16650g));
    }
}
