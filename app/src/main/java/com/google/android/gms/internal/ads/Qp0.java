package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class Qp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f18541a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f18542b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f18543c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f18544d;

    public Qp0() {
        this.f18541a = new HashMap();
        this.f18542b = new HashMap();
        this.f18543c = new HashMap();
        this.f18544d = new HashMap();
    }

    public final Qp0 a(Fo0 fo0) {
        Rp0 rp0 = new Rp0(fo0.d(), fo0.c(), null);
        if (this.f18542b.containsKey(rp0)) {
            Fo0 fo02 = (Fo0) this.f18542b.get(rp0);
            if (!fo02.equals(fo0) || !fo0.equals(fo02)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(rp0.toString()));
            }
        } else {
            this.f18542b.put(rp0, fo0);
        }
        return this;
    }

    public final Qp0 b(Jo0 jo0) {
        Sp0 sp0 = new Sp0(jo0.c(), jo0.d(), null);
        if (this.f18541a.containsKey(sp0)) {
            Jo0 jo02 = (Jo0) this.f18541a.get(sp0);
            if (!jo02.equals(jo0) || !jo0.equals(jo02)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(sp0.toString()));
            }
        } else {
            this.f18541a.put(sp0, jo0);
        }
        return this;
    }

    public final Qp0 c(AbstractC3967rp0 abstractC3967rp0) {
        Rp0 rp0 = new Rp0(abstractC3967rp0.d(), abstractC3967rp0.c(), null);
        if (this.f18544d.containsKey(rp0)) {
            AbstractC3967rp0 abstractC3967rp02 = (AbstractC3967rp0) this.f18544d.get(rp0);
            if (!abstractC3967rp02.equals(abstractC3967rp0) || !abstractC3967rp0.equals(abstractC3967rp02)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(rp0.toString()));
            }
        } else {
            this.f18544d.put(rp0, abstractC3967rp0);
        }
        return this;
    }

    public final Qp0 d(AbstractC4403vp0 abstractC4403vp0) {
        Sp0 sp0 = new Sp0(abstractC4403vp0.c(), abstractC4403vp0.d(), null);
        if (this.f18543c.containsKey(sp0)) {
            AbstractC4403vp0 abstractC4403vp02 = (AbstractC4403vp0) this.f18543c.get(sp0);
            if (!abstractC4403vp02.equals(abstractC4403vp0) || !abstractC4403vp0.equals(abstractC4403vp02)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(sp0.toString()));
            }
        } else {
            this.f18543c.put(sp0, abstractC4403vp0);
        }
        return this;
    }

    public Qp0(Up0 up0) {
        this.f18541a = new HashMap(up0.f19472a);
        this.f18542b = new HashMap(up0.f19473b);
        this.f18543c = new HashMap(up0.f19474c);
        this.f18544d = new HashMap(up0.f19475d);
    }
}
