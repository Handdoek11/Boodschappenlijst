package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class Ep0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f14779a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f14780b;

    /* synthetic */ Ep0(Ap0 ap0, Dp0 dp0) {
        this.f14779a = new HashMap(ap0.f13660a);
        this.f14780b = new HashMap(ap0.f13661b);
    }

    public final Class a(Class cls) {
        if (this.f14780b.containsKey(cls)) {
            return ((Jp0) this.f14780b.get(cls)).zza();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls.toString() + " available");
    }

    public final Object b(Sk0 sk0, Class cls) {
        Bp0 bp0 = new Bp0(sk0.getClass(), cls, null);
        if (this.f14779a.containsKey(bp0)) {
            return ((AbstractC4839zp0) this.f14779a.get(bp0)).a(sk0);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + bp0.toString() + " available");
    }

    public final Object c(Ip0 ip0, Class cls) {
        if (!this.f14780b.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        Jp0 jp0 = (Jp0) this.f14780b.get(cls);
        if (ip0.d().equals(jp0.zza()) && jp0.zza().equals(ip0.d())) {
            return jp0.a(ip0);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
