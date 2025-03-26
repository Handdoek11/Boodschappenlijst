package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.tu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4195tu0 implements Cv0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4086su0 f26946a;

    /* renamed from: b, reason: collision with root package name */
    private int f26947b;

    /* renamed from: c, reason: collision with root package name */
    private int f26948c;

    /* renamed from: d, reason: collision with root package name */
    private int f26949d = 0;

    private C4195tu0(AbstractC4086su0 abstractC4086su0) {
        AbstractC2131av0.c(abstractC4086su0, "input");
        this.f26946a = abstractC4086su0;
        abstractC4086su0.f26756c = this;
    }

    private final void K(Object obj, Iv0 iv0, Eu0 eu0) {
        int i8 = this.f26948c;
        this.f26948c = ((this.f26947b >>> 3) << 3) | 4;
        try {
            iv0.j(obj, this, eu0);
            if (this.f26947b == this.f26948c) {
            } else {
                throw new zzgyg("Failed to parse the message.");
            }
        } finally {
            this.f26948c = i8;
        }
    }

    private final void M(Object obj, Iv0 iv0, Eu0 eu0) {
        AbstractC4086su0 abstractC4086su0 = this.f26946a;
        int q8 = abstractC4086su0.q();
        if (abstractC4086su0.f26754a >= abstractC4086su0.f26755b) {
            throw new zzgyg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int j8 = abstractC4086su0.j(q8);
        this.f26946a.f26754a++;
        iv0.j(obj, this, eu0);
        this.f26946a.z(0);
        r5.f26754a--;
        this.f26946a.A(j8);
    }

    private final void N(int i8) {
        if (this.f26946a.i() != i8) {
            throw new zzgyg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void O(int i8) {
        if ((this.f26947b & 7) != i8) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
    }

    private static final void P(int i8) {
        if ((i8 & 3) != 0) {
            throw new zzgyg("Failed to parse the message.");
        }
    }

    private static final void Q(int i8) {
        if ((i8 & 7) != 0) {
            throw new zzgyg("Failed to parse the message.");
        }
    }

    public static C4195tu0 R(AbstractC4086su0 abstractC4086su0) {
        C4195tu0 c4195tu0 = abstractC4086su0.f26756c;
        return c4195tu0 != null ? c4195tu0 : new C4195tu0(abstractC4086su0);
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final void A(List list) {
        int p8;
        int i8;
        if (list instanceof Ru0) {
            Ru0 ru0 = (Ru0) list;
            int i9 = this.f26947b & 7;
            if (i9 == 2) {
                int q8 = this.f26946a.q();
                P(q8);
                int i10 = this.f26946a.i() + q8;
                do {
                    ru0.K(this.f26946a.l());
                } while (this.f26946a.i() < i10);
                return;
            }
            if (i9 != 5) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                ru0.K(this.f26946a.l());
                if (this.f26946a.a()) {
                    return;
                } else {
                    i8 = this.f26946a.p();
                }
            } while (i8 == this.f26947b);
        } else {
            int i11 = this.f26947b & 7;
            if (i11 == 2) {
                int q9 = this.f26946a.q();
                P(q9);
                int i12 = this.f26946a.i() + q9;
                do {
                    list.add(Integer.valueOf(this.f26946a.l()));
                } while (this.f26946a.i() < i12);
                return;
            }
            if (i11 != 5) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.f26946a.l()));
                if (this.f26946a.a()) {
                    return;
                } else {
                    p8 = this.f26946a.p();
                }
            } while (p8 == this.f26947b);
            i8 = p8;
        }
        this.f26949d = i8;
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final void B(List list) {
        int p8;
        int i8;
        if (list instanceof C2783gv0) {
            C2783gv0 c2783gv0 = (C2783gv0) list;
            int i9 = this.f26947b & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC4086su0 abstractC4086su0 = this.f26946a;
                int i10 = abstractC4086su0.i() + abstractC4086su0.q();
                do {
                    c2783gv0.e(this.f26946a.u());
                } while (this.f26946a.i() < i10);
                N(i10);
                return;
            }
            do {
                c2783gv0.e(this.f26946a.u());
                if (this.f26946a.a()) {
                    return;
                } else {
                    i8 = this.f26946a.p();
                }
            } while (i8 == this.f26947b);
        } else {
            int i11 = this.f26947b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC4086su0 abstractC4086su02 = this.f26946a;
                int i12 = abstractC4086su02.i() + abstractC4086su02.q();
                do {
                    list.add(Long.valueOf(this.f26946a.u()));
                } while (this.f26946a.i() < i12);
                N(i12);
                return;
            }
            do {
                list.add(Long.valueOf(this.f26946a.u()));
                if (this.f26946a.a()) {
                    return;
                } else {
                    p8 = this.f26946a.p();
                }
            } while (p8 == this.f26947b);
            i8 = p8;
        }
        this.f26949d = i8;
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final void C(List list) {
        int p8;
        int i8;
        if (list instanceof C2783gv0) {
            C2783gv0 c2783gv0 = (C2783gv0) list;
            int i9 = this.f26947b & 7;
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                int q8 = this.f26946a.q();
                Q(q8);
                int i10 = q8 + this.f26946a.i();
                do {
                    c2783gv0.e(this.f26946a.r());
                } while (this.f26946a.i() < i10);
                return;
            }
            do {
                c2783gv0.e(this.f26946a.r());
                if (this.f26946a.a()) {
                    return;
                } else {
                    i8 = this.f26946a.p();
                }
            } while (i8 == this.f26947b);
        } else {
            int i11 = this.f26947b & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                int q9 = this.f26946a.q();
                Q(q9);
                int i12 = q9 + this.f26946a.i();
                do {
                    list.add(Long.valueOf(this.f26946a.r()));
                } while (this.f26946a.i() < i12);
                return;
            }
            do {
                list.add(Long.valueOf(this.f26946a.r()));
                if (this.f26946a.a()) {
                    return;
                } else {
                    p8 = this.f26946a.p();
                }
            } while (p8 == this.f26947b);
            i8 = p8;
        }
        this.f26949d = i8;
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final void D(List list, Iv0 iv0, Eu0 eu0) {
        int p8;
        int i8 = this.f26947b;
        if ((i8 & 7) != 3) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
        do {
            Object b8 = iv0.b();
            K(b8, iv0, eu0);
            iv0.d(b8);
            list.add(b8);
            if (this.f26946a.a() || this.f26949d != 0) {
                return;
            } else {
                p8 = this.f26946a.p();
            }
        } while (p8 == i8);
        this.f26949d = p8;
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final void E(List list) {
        int p8;
        int i8;
        if (list instanceof Ru0) {
            Ru0 ru0 = (Ru0) list;
            int i9 = this.f26947b & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC4086su0 abstractC4086su0 = this.f26946a;
                int i10 = abstractC4086su0.i() + abstractC4086su0.q();
                do {
                    ru0.K(this.f26946a.o());
                } while (this.f26946a.i() < i10);
                N(i10);
                return;
            }
            do {
                ru0.K(this.f26946a.o());
                if (this.f26946a.a()) {
                    return;
                } else {
                    i8 = this.f26946a.p();
                }
            } while (i8 == this.f26947b);
        } else {
            int i11 = this.f26947b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC4086su0 abstractC4086su02 = this.f26946a;
                int i12 = abstractC4086su02.i() + abstractC4086su02.q();
                do {
                    list.add(Integer.valueOf(this.f26946a.o()));
                } while (this.f26946a.i() < i12);
                N(i12);
                return;
            }
            do {
                list.add(Integer.valueOf(this.f26946a.o()));
                if (this.f26946a.a()) {
                    return;
                } else {
                    p8 = this.f26946a.p();
                }
            } while (p8 == this.f26947b);
            i8 = p8;
        }
        this.f26949d = i8;
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final void F(List list) {
        int p8;
        int i8;
        if (list instanceof Ru0) {
            Ru0 ru0 = (Ru0) list;
            int i9 = this.f26947b & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC4086su0 abstractC4086su0 = this.f26946a;
                int i10 = abstractC4086su0.i() + abstractC4086su0.q();
                do {
                    ru0.K(this.f26946a.q());
                } while (this.f26946a.i() < i10);
                N(i10);
                return;
            }
            do {
                ru0.K(this.f26946a.q());
                if (this.f26946a.a()) {
                    return;
                } else {
                    i8 = this.f26946a.p();
                }
            } while (i8 == this.f26947b);
        } else {
            int i11 = this.f26947b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC4086su0 abstractC4086su02 = this.f26946a;
                int i12 = abstractC4086su02.i() + abstractC4086su02.q();
                do {
                    list.add(Integer.valueOf(this.f26946a.q()));
                } while (this.f26946a.i() < i12);
                N(i12);
                return;
            }
            do {
                list.add(Integer.valueOf(this.f26946a.q()));
                if (this.f26946a.a()) {
                    return;
                } else {
                    p8 = this.f26946a.p();
                }
            } while (p8 == this.f26947b);
            i8 = p8;
        }
        this.f26949d = i8;
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final void G(List list) {
        int p8;
        if (list instanceof AbstractC2346cu0) {
            androidx.appcompat.app.E.a(list);
            int i8 = this.f26947b & 7;
            if (i8 == 0) {
                this.f26946a.b();
                throw null;
            }
            if (i8 != 2) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            AbstractC4086su0 abstractC4086su0 = this.f26946a;
            abstractC4086su0.q();
            abstractC4086su0.i();
            this.f26946a.b();
            throw null;
        }
        int i9 = this.f26947b & 7;
        if (i9 == 0) {
            do {
                list.add(Boolean.valueOf(this.f26946a.b()));
                if (this.f26946a.a()) {
                    return;
                } else {
                    p8 = this.f26946a.p();
                }
            } while (p8 == this.f26947b);
            this.f26949d = p8;
            return;
        }
        if (i9 != 2) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
        AbstractC4086su0 abstractC4086su02 = this.f26946a;
        int i10 = abstractC4086su02.i() + abstractC4086su02.q();
        do {
            list.add(Boolean.valueOf(this.f26946a.b()));
        } while (this.f26946a.i() < i10);
        N(i10);
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final void H(List list, Iv0 iv0, Eu0 eu0) {
        int p8;
        int i8 = this.f26947b;
        if ((i8 & 7) != 2) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
        do {
            Object b8 = iv0.b();
            M(b8, iv0, eu0);
            iv0.d(b8);
            list.add(b8);
            if (this.f26946a.a() || this.f26949d != 0) {
                return;
            } else {
                p8 = this.f26946a.p();
            }
        } while (p8 == i8);
        this.f26949d = p8;
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final void I(List list) {
        int p8;
        if (list instanceof Ju0) {
            androidx.appcompat.app.E.a(list);
            int i8 = this.f26947b & 7;
            if (i8 != 2) {
                if (i8 != 5) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                this.f26946a.h();
                throw null;
            }
            P(this.f26946a.q());
            this.f26946a.i();
            this.f26946a.h();
            throw null;
        }
        int i9 = this.f26947b & 7;
        if (i9 == 2) {
            int q8 = this.f26946a.q();
            P(q8);
            int i10 = this.f26946a.i() + q8;
            do {
                list.add(Float.valueOf(this.f26946a.h()));
            } while (this.f26946a.i() < i10);
            return;
        }
        if (i9 != 5) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(Float.valueOf(this.f26946a.h()));
            if (this.f26946a.a()) {
                return;
            } else {
                p8 = this.f26946a.p();
            }
        } while (p8 == this.f26947b);
        this.f26949d = p8;
    }

    public final void J(List list, boolean z7) {
        int p8;
        int i8;
        if ((this.f26947b & 7) != 2) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
        if ((list instanceof InterfaceC2456dv0) && !z7) {
            InterfaceC2456dv0 interfaceC2456dv0 = (InterfaceC2456dv0) list;
            do {
                p();
                interfaceC2456dv0.zzb();
                if (this.f26946a.a()) {
                    return;
                } else {
                    i8 = this.f26946a.p();
                }
            } while (i8 == this.f26947b);
        } else {
            do {
                list.add(z7 ? s() : r());
                if (this.f26946a.a()) {
                    return;
                } else {
                    p8 = this.f26946a.p();
                }
            } while (p8 == this.f26947b);
            i8 = p8;
        }
        this.f26949d = i8;
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final boolean L() {
        O(0);
        return this.f26946a.b();
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final int a() {
        int i8 = this.f26949d;
        if (i8 != 0) {
            this.f26947b = i8;
            this.f26949d = 0;
        } else {
            i8 = this.f26946a.p();
            this.f26947b = i8;
        }
        if (i8 == 0 || i8 == this.f26948c) {
            return Integer.MAX_VALUE;
        }
        return i8 >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final int b() {
        O(0);
        return this.f26946a.k();
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final int c() {
        O(5);
        return this.f26946a.l();
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final int d() {
        return this.f26947b;
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final int e() {
        O(5);
        return this.f26946a.n();
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final int f() {
        O(0);
        return this.f26946a.o();
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final int g() {
        O(0);
        return this.f26946a.m();
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final int h() {
        O(0);
        return this.f26946a.q();
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final long i() {
        O(1);
        return this.f26946a.r();
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final long j() {
        O(0);
        return this.f26946a.s();
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final long k() {
        O(1);
        return this.f26946a.t();
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final long l() {
        O(0);
        return this.f26946a.u();
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final void m(List list) {
        int p8;
        int i8;
        if (list instanceof Ru0) {
            Ru0 ru0 = (Ru0) list;
            int i9 = this.f26947b & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC4086su0 abstractC4086su0 = this.f26946a;
                int i10 = abstractC4086su0.i() + abstractC4086su0.q();
                do {
                    ru0.K(this.f26946a.k());
                } while (this.f26946a.i() < i10);
                N(i10);
                return;
            }
            do {
                ru0.K(this.f26946a.k());
                if (this.f26946a.a()) {
                    return;
                } else {
                    i8 = this.f26946a.p();
                }
            } while (i8 == this.f26947b);
        } else {
            int i11 = this.f26947b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC4086su0 abstractC4086su02 = this.f26946a;
                int i12 = abstractC4086su02.i() + abstractC4086su02.q();
                do {
                    list.add(Integer.valueOf(this.f26946a.k()));
                } while (this.f26946a.i() < i12);
                N(i12);
                return;
            }
            do {
                list.add(Integer.valueOf(this.f26946a.k()));
                if (this.f26946a.a()) {
                    return;
                } else {
                    p8 = this.f26946a.p();
                }
            } while (p8 == this.f26947b);
            i8 = p8;
        }
        this.f26949d = i8;
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final void n(List list) {
        int p8;
        int i8;
        if (list instanceof C2783gv0) {
            C2783gv0 c2783gv0 = (C2783gv0) list;
            int i9 = this.f26947b & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC4086su0 abstractC4086su0 = this.f26946a;
                int i10 = abstractC4086su0.i() + abstractC4086su0.q();
                do {
                    c2783gv0.e(this.f26946a.s());
                } while (this.f26946a.i() < i10);
                N(i10);
                return;
            }
            do {
                c2783gv0.e(this.f26946a.s());
                if (this.f26946a.a()) {
                    return;
                } else {
                    i8 = this.f26946a.p();
                }
            } while (i8 == this.f26947b);
        } else {
            int i11 = this.f26947b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC4086su0 abstractC4086su02 = this.f26946a;
                int i12 = abstractC4086su02.i() + abstractC4086su02.q();
                do {
                    list.add(Long.valueOf(this.f26946a.s()));
                } while (this.f26946a.i() < i12);
                N(i12);
                return;
            }
            do {
                list.add(Long.valueOf(this.f26946a.s()));
                if (this.f26946a.a()) {
                    return;
                } else {
                    p8 = this.f26946a.p();
                }
            } while (p8 == this.f26947b);
            i8 = p8;
        }
        this.f26949d = i8;
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final long o() {
        O(0);
        return this.f26946a.v();
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final AbstractC3542nu0 p() {
        O(2);
        return this.f26946a.w();
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final void q(List list) {
        int p8;
        int i8;
        if (list instanceof C2783gv0) {
            C2783gv0 c2783gv0 = (C2783gv0) list;
            int i9 = this.f26947b & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC4086su0 abstractC4086su0 = this.f26946a;
                int i10 = abstractC4086su0.i() + abstractC4086su0.q();
                do {
                    c2783gv0.e(this.f26946a.v());
                } while (this.f26946a.i() < i10);
                N(i10);
                return;
            }
            do {
                c2783gv0.e(this.f26946a.v());
                if (this.f26946a.a()) {
                    return;
                } else {
                    i8 = this.f26946a.p();
                }
            } while (i8 == this.f26947b);
        } else {
            int i11 = this.f26947b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC4086su0 abstractC4086su02 = this.f26946a;
                int i12 = abstractC4086su02.i() + abstractC4086su02.q();
                do {
                    list.add(Long.valueOf(this.f26946a.v()));
                } while (this.f26946a.i() < i12);
                N(i12);
                return;
            }
            do {
                list.add(Long.valueOf(this.f26946a.v()));
                if (this.f26946a.a()) {
                    return;
                } else {
                    p8 = this.f26946a.p();
                }
            } while (p8 == this.f26947b);
            i8 = p8;
        }
        this.f26949d = i8;
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final String r() {
        O(2);
        return this.f26946a.x();
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final String s() {
        O(2);
        return this.f26946a.y();
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final void t(Object obj, Iv0 iv0, Eu0 eu0) {
        O(2);
        M(obj, iv0, eu0);
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final void u(List list) {
        int p8;
        if (list instanceof Au0) {
            androidx.appcompat.app.E.a(list);
            int i8 = this.f26947b & 7;
            if (i8 == 1) {
                this.f26946a.g();
                throw null;
            }
            if (i8 != 2) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            Q(this.f26946a.q());
            this.f26946a.i();
            this.f26946a.g();
            throw null;
        }
        int i9 = this.f26947b & 7;
        if (i9 == 1) {
            do {
                list.add(Double.valueOf(this.f26946a.g()));
                if (this.f26946a.a()) {
                    return;
                } else {
                    p8 = this.f26946a.p();
                }
            } while (p8 == this.f26947b);
            this.f26949d = p8;
            return;
        }
        if (i9 != 2) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
        int q8 = this.f26946a.q();
        Q(q8);
        int i10 = q8 + this.f26946a.i();
        do {
            list.add(Double.valueOf(this.f26946a.g()));
        } while (this.f26946a.i() < i10);
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final void v(List list) {
        int p8;
        if ((this.f26947b & 7) != 2) {
            throw new zzgyf("Protocol message tag had invalid wire type.");
        }
        do {
            list.add(p());
            if (this.f26946a.a()) {
                return;
            } else {
                p8 = this.f26946a.p();
            }
        } while (p8 == this.f26947b);
        this.f26949d = p8;
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final void w(List list) {
        int p8;
        int i8;
        if (list instanceof Ru0) {
            Ru0 ru0 = (Ru0) list;
            int i9 = this.f26947b & 7;
            if (i9 != 0) {
                if (i9 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC4086su0 abstractC4086su0 = this.f26946a;
                int i10 = abstractC4086su0.i() + abstractC4086su0.q();
                do {
                    ru0.K(this.f26946a.m());
                } while (this.f26946a.i() < i10);
                N(i10);
                return;
            }
            do {
                ru0.K(this.f26946a.m());
                if (this.f26946a.a()) {
                    return;
                } else {
                    i8 = this.f26946a.p();
                }
            } while (i8 == this.f26947b);
        } else {
            int i11 = this.f26947b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                AbstractC4086su0 abstractC4086su02 = this.f26946a;
                int i12 = abstractC4086su02.i() + abstractC4086su02.q();
                do {
                    list.add(Integer.valueOf(this.f26946a.m()));
                } while (this.f26946a.i() < i12);
                N(i12);
                return;
            }
            do {
                list.add(Integer.valueOf(this.f26946a.m()));
                if (this.f26946a.a()) {
                    return;
                } else {
                    p8 = this.f26946a.p();
                }
            } while (p8 == this.f26947b);
            i8 = p8;
        }
        this.f26949d = i8;
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final void x(Object obj, Iv0 iv0, Eu0 eu0) {
        O(3);
        K(obj, iv0, eu0);
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final void y(List list) {
        int p8;
        int i8;
        if (list instanceof C2783gv0) {
            C2783gv0 c2783gv0 = (C2783gv0) list;
            int i9 = this.f26947b & 7;
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                int q8 = this.f26946a.q();
                Q(q8);
                int i10 = q8 + this.f26946a.i();
                do {
                    c2783gv0.e(this.f26946a.t());
                } while (this.f26946a.i() < i10);
                return;
            }
            do {
                c2783gv0.e(this.f26946a.t());
                if (this.f26946a.a()) {
                    return;
                } else {
                    i8 = this.f26946a.p();
                }
            } while (i8 == this.f26947b);
        } else {
            int i11 = this.f26947b & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new zzgyf("Protocol message tag had invalid wire type.");
                }
                int q9 = this.f26946a.q();
                Q(q9);
                int i12 = q9 + this.f26946a.i();
                do {
                    list.add(Long.valueOf(this.f26946a.t()));
                } while (this.f26946a.i() < i12);
                return;
            }
            do {
                list.add(Long.valueOf(this.f26946a.t()));
                if (this.f26946a.a()) {
                    return;
                } else {
                    p8 = this.f26946a.p();
                }
            } while (p8 == this.f26947b);
            i8 = p8;
        }
        this.f26949d = i8;
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final void z(List list) {
        int p8;
        int i8;
        if (list instanceof Ru0) {
            Ru0 ru0 = (Ru0) list;
            int i9 = this.f26947b & 7;
            if (i9 == 2) {
                int q8 = this.f26946a.q();
                P(q8);
                int i10 = this.f26946a.i() + q8;
                do {
                    ru0.K(this.f26946a.n());
                } while (this.f26946a.i() < i10);
                return;
            }
            if (i9 != 5) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                ru0.K(this.f26946a.n());
                if (this.f26946a.a()) {
                    return;
                } else {
                    i8 = this.f26946a.p();
                }
            } while (i8 == this.f26947b);
        } else {
            int i11 = this.f26947b & 7;
            if (i11 == 2) {
                int q9 = this.f26946a.q();
                P(q9);
                int i12 = this.f26946a.i() + q9;
                do {
                    list.add(Integer.valueOf(this.f26946a.n()));
                } while (this.f26946a.i() < i12);
                return;
            }
            if (i11 != 5) {
                throw new zzgyf("Protocol message tag had invalid wire type.");
            }
            do {
                list.add(Integer.valueOf(this.f26946a.n()));
                if (this.f26946a.a()) {
                    return;
                } else {
                    p8 = this.f26946a.p();
                }
            } while (p8 == this.f26947b);
            i8 = p8;
        }
        this.f26949d = i8;
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final double zza() {
        O(1);
        return this.f26946a.g();
    }

    @Override // com.google.android.gms.internal.ads.Cv0
    public final float zzb() {
        O(5);
        return this.f26946a.h();
    }
}
