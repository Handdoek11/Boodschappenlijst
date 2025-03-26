package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class Ap0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f13660a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f13661b;

    /* synthetic */ Ap0(Dp0 dp0) {
        this.f13660a = new HashMap();
        this.f13661b = new HashMap();
    }

    public final Ap0 a(AbstractC4839zp0 abstractC4839zp0) {
        if (abstractC4839zp0 == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        Bp0 bp0 = new Bp0(abstractC4839zp0.c(), abstractC4839zp0.d(), null);
        if (this.f13660a.containsKey(bp0)) {
            AbstractC4839zp0 abstractC4839zp02 = (AbstractC4839zp0) this.f13660a.get(bp0);
            if (!abstractC4839zp02.equals(abstractC4839zp0) || !abstractC4839zp0.equals(abstractC4839zp02)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(bp0.toString()));
            }
        } else {
            this.f13660a.put(bp0, abstractC4839zp0);
        }
        return this;
    }

    public final Ap0 b(Jp0 jp0) {
        Map map = this.f13661b;
        Class zzb = jp0.zzb();
        if (map.containsKey(zzb)) {
            Jp0 jp02 = (Jp0) this.f13661b.get(zzb);
            if (!jp02.equals(jp0) || !jp0.equals(jp02)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zzb.toString()));
            }
        } else {
            this.f13661b.put(zzb, jp0);
        }
        return this;
    }

    /* synthetic */ Ap0(Ep0 ep0, Dp0 dp0) {
        this.f13660a = new HashMap(ep0.f14779a);
        this.f13661b = new HashMap(ep0.f14780b);
    }
}
