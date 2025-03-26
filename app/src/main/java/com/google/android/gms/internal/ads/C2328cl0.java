package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.cl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2328cl0 {

    /* renamed from: a, reason: collision with root package name */
    private final As0 f21279a;

    /* renamed from: b, reason: collision with root package name */
    private final List f21280b;

    /* renamed from: c, reason: collision with root package name */
    private final Qo0 f21281c;

    /* synthetic */ C2328cl0(As0 as0, List list, Qo0 qo0, AbstractC2220bl0 abstractC2220bl0) {
        this.f21279a = as0;
        this.f21280b = list;
        this.f21281c = qo0;
    }

    static final C2328cl0 a(As0 as0) {
        h(as0);
        return new C2328cl0(as0, g(as0));
    }

    public static final C2328cl0 b(AbstractC2763gl0 abstractC2763gl0) {
        Zk0 zk0 = new Zk0();
        Xk0 xk0 = new Xk0(abstractC2763gl0, null);
        xk0.d();
        xk0.c();
        zk0.a(xk0);
        return zk0.b();
    }

    private final Object f(AbstractC4837zo0 abstractC4837zo0, Class cls, Class cls2) {
        int i8 = AbstractC3524nl0.f25036a;
        As0 as0 = this.f21279a;
        int c02 = as0.c0();
        int i9 = 0;
        boolean z7 = false;
        boolean z8 = true;
        for (C4736ys0 c4736ys0 : as0.h0()) {
            if (c4736ys0.k0() == 3) {
                if (!c4736ys0.j0()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(c4736ys0.b0())));
                }
                if (c4736ys0.f0() == Ts0.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(c4736ys0.b0())));
                }
                if (c4736ys0.k0() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(c4736ys0.b0())));
                }
                if (c4736ys0.b0() == c02) {
                    if (z7) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z7 = true;
                }
                z8 &= c4736ys0.c0().c0() == EnumC3429ms0.ASYMMETRIC_PUBLIC;
                i9++;
            }
        }
        if (i9 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z7 && !z8) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        Fp0 b8 = Ip0.b(cls2);
        b8.c(this.f21281c);
        for (int i10 = 0; i10 < this.f21280b.size(); i10++) {
            C4736ys0 e02 = this.f21279a.e0(i10);
            if (e02.k0() == 3) {
                C2111al0 c2111al0 = (C2111al0) this.f21280b.get(i10);
                if (c2111al0 == null) {
                    throw new GeneralSecurityException("Key parsing of key with index " + i10 + " and type_url " + e02.c0().g0() + " failed, unable to get primitive");
                }
                Sk0 a8 = c2111al0.a();
                try {
                    Object b9 = abstractC4837zo0.b(a8, cls2);
                    if (e02.b0() == this.f21279a.c0()) {
                        b8.b(b9, a8, e02);
                    } else {
                        b8.a(b9, a8, e02);
                    }
                } catch (GeneralSecurityException e8) {
                    throw new GeneralSecurityException("Unable to get primitive " + cls2.toString() + " for key of type " + e02.c0().g0() + ", see https://developers.google.com/tink/faq/registration_errors", e8);
                }
            }
        }
        return abstractC4837zo0.c(b8.d(), cls);
    }

    private static List g(As0 as0) {
        Uk0 uk0;
        ArrayList arrayList = new ArrayList(as0.b0());
        for (C4736ys0 c4736ys0 : as0.h0()) {
            int b02 = c4736ys0.b0();
            try {
                Kp0 a8 = Kp0.a(c4736ys0.c0().g0(), c4736ys0.c0().f0(), c4736ys0.c0().c0(), c4736ys0.f0(), c4736ys0.f0() == Ts0.RAW ? null : Integer.valueOf(c4736ys0.b0()));
                C3423mp0 c8 = C3423mp0.c();
                C3197kl0 a9 = C3197kl0.a();
                Sk0 mo0 = !c8.j(a8) ? new Mo0(a8, a9) : c8.a(a8, a9);
                int k02 = c4736ys0.k0() - 2;
                if (k02 == 1) {
                    uk0 = Uk0.f19440b;
                } else if (k02 == 2) {
                    uk0 = Uk0.f19441c;
                } else {
                    if (k02 != 3) {
                        throw new GeneralSecurityException("Unknown key status");
                    }
                    uk0 = Uk0.f19442d;
                }
                arrayList.add(new C2111al0(mo0, uk0, b02, b02 == as0.c0(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(As0 as0) {
        if (as0 == null || as0.b0() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    final As0 c() {
        return this.f21279a;
    }

    public final Object d(Mk0 mk0, Class cls) {
        AbstractC4837zo0 abstractC4837zo0 = (AbstractC4837zo0) mk0;
        Class a8 = abstractC4837zo0.a(cls);
        if (a8 != null) {
            return f(abstractC4837zo0, cls, a8);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }

    public final String toString() {
        int i8 = AbstractC3524nl0.f25036a;
        Bs0 b02 = Gs0.b0();
        As0 as0 = this.f21279a;
        b02.D(as0.c0());
        for (C4736ys0 c4736ys0 : as0.h0()) {
            Cs0 b03 = Es0.b0();
            b03.E(c4736ys0.c0().g0());
            b03.F(c4736ys0.k0());
            b03.D(c4736ys0.f0());
            b03.C(c4736ys0.b0());
            b02.C((Es0) b03.x());
        }
        return ((Gs0) b02.x()).toString();
    }

    private C2328cl0(As0 as0, List list) {
        this.f21279a = as0;
        this.f21280b = list;
        this.f21281c = Qo0.f18535b;
    }
}
