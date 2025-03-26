package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class Up0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f19472a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f19473b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f19474c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f19475d;

    /* synthetic */ Up0(Qp0 qp0, Tp0 tp0) {
        this.f19472a = new HashMap(qp0.f18541a);
        this.f19473b = new HashMap(qp0.f18542b);
        this.f19474c = new HashMap(qp0.f18543c);
        this.f19475d = new HashMap(qp0.f18544d);
    }

    public final Sk0 a(Pp0 pp0, C3197kl0 c3197kl0) {
        Rp0 rp0 = new Rp0(pp0.getClass(), pp0.d(), null);
        if (this.f19473b.containsKey(rp0)) {
            return ((Fo0) this.f19473b.get(rp0)).a(pp0, c3197kl0);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + rp0.toString() + " available");
    }

    public final AbstractC2763gl0 b(Pp0 pp0) {
        Rp0 rp0 = new Rp0(pp0.getClass(), pp0.d(), null);
        if (this.f19475d.containsKey(rp0)) {
            return ((AbstractC3967rp0) this.f19475d.get(rp0)).a(pp0);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + rp0.toString() + " available");
    }

    public final Pp0 c(Sk0 sk0, Class cls, C3197kl0 c3197kl0) {
        Sp0 sp0 = new Sp0(sk0.getClass(), cls, null);
        if (this.f19472a.containsKey(sp0)) {
            return ((Jo0) this.f19472a.get(sp0)).a(sk0, c3197kl0);
        }
        throw new GeneralSecurityException("No Key serializer for " + sp0.toString() + " available");
    }

    public final Pp0 d(AbstractC2763gl0 abstractC2763gl0, Class cls) {
        Sp0 sp0 = new Sp0(abstractC2763gl0.getClass(), cls, null);
        if (this.f19474c.containsKey(sp0)) {
            return ((AbstractC4403vp0) this.f19474c.get(sp0)).a(abstractC2763gl0);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + sp0.toString() + " available");
    }

    public final boolean i(Pp0 pp0) {
        return this.f19473b.containsKey(new Rp0(pp0.getClass(), pp0.d(), null));
    }

    public final boolean j(Pp0 pp0) {
        return this.f19475d.containsKey(new Rp0(pp0.getClass(), pp0.d(), null));
    }
}
