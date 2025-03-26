package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class J40 implements InterfaceC2477e50 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2477e50 f16099a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2477e50 f16100b;

    /* renamed from: c, reason: collision with root package name */
    private final V70 f16101c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16102d;

    /* renamed from: e, reason: collision with root package name */
    private OB f16103e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f16104f;

    public J40(InterfaceC2477e50 interfaceC2477e50, InterfaceC2477e50 interfaceC2477e502, V70 v70, String str, Executor executor) {
        this.f16099a = interfaceC2477e50;
        this.f16100b = interfaceC2477e502;
        this.f16101c = v70;
        this.f16102d = str;
        this.f16104f = executor;
    }

    private final com.google.common.util.concurrent.d g(I70 i70, C2586f50 c2586f50) {
        OB ob = i70.f15870a;
        this.f16103e = ob;
        if (i70.f15872c != null) {
            if (ob.c() != null) {
                i70.f15872c.f().e(i70.f15870a.c());
            }
            return AbstractC2326ck0.h(i70.f15872c);
        }
        ob.zzb().k(i70.f15871b);
        return ((T40) this.f16099a).c(c2586f50, null, i70.f15870a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2477e50
    public final /* bridge */ /* synthetic */ com.google.common.util.concurrent.d a(C2586f50 c2586f50, InterfaceC2369d50 interfaceC2369d50, Object obj) {
        return f(c2586f50, interfaceC2369d50, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2477e50
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized OB d() {
        return this.f16103e;
    }

    final /* synthetic */ com.google.common.util.concurrent.d c(C2586f50 c2586f50, I40 i40, InterfaceC2369d50 interfaceC2369d50, OB ob, O40 o40) {
        if (o40 != null) {
            I40 i402 = new I40(i40.f15857a, i40.f15858b, i40.f15859c, i40.f15860d, i40.f15861e, i40.f15862f, o40.f17831a);
            if (o40.f17833c != null) {
                this.f16103e = null;
                this.f16101c.e(i402);
                return g(o40.f17833c, c2586f50);
            }
            com.google.common.util.concurrent.d a8 = this.f16101c.a(i402);
            if (a8 != null) {
                this.f16103e = null;
                return AbstractC2326ck0.n(a8, new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.F40
                    @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
                    public final com.google.common.util.concurrent.d a(Object obj) {
                        return this.f15068a.e((S70) obj);
                    }
                }, this.f16104f);
            }
            this.f16101c.e(i402);
            c2586f50 = new C2586f50(c2586f50.f21931b, o40.f17832b);
        }
        com.google.common.util.concurrent.d c8 = ((T40) this.f16099a).c(c2586f50, interfaceC2369d50, ob);
        this.f16103e = ob;
        return c8;
    }

    final /* synthetic */ com.google.common.util.concurrent.d e(S70 s70) {
        U70 u70;
        if (s70 == null || s70.f18838a == null || (u70 = s70.f18839b) == null) {
            throw new zzdvy(1, "Empty prefetch");
        }
        C1897Wd d02 = C2422de.d0();
        C1827Ud h02 = C1862Vd.h0();
        h02.C(EnumC1932Xd.IN_MEMORY);
        h02.E(C2096ae.f0());
        d02.C(h02);
        s70.f18838a.f15870a.zzb().c().w((C2422de) d02.x());
        return g(s70.f18838a, ((I40) u70).f15858b);
    }

    public final synchronized com.google.common.util.concurrent.d f(final C2586f50 c2586f50, final InterfaceC2369d50 interfaceC2369d50, OB ob) {
        NB a8 = interfaceC2369d50.a(c2586f50.f21931b);
        a8.u(new K40(this.f16102d));
        final OB ob2 = (OB) a8.e();
        ob2.g();
        ob2.g();
        D2.X1 x12 = ob2.g().f16766d;
        if (x12.f1178J == null && x12.f1183O == null) {
            L60 g8 = ob2.g();
            final I40 i40 = new I40(interfaceC2369d50, c2586f50, g8.f16766d, g8.f16768f, this.f16104f, g8.f16772j, null);
            return (Sj0) AbstractC2326ck0.n(Sj0.D(((P40) this.f16100b).c(c2586f50, interfaceC2369d50, ob2)), new InterfaceC1420Ij0() { // from class: com.google.android.gms.internal.ads.G40
                @Override // com.google.android.gms.internal.ads.InterfaceC1420Ij0
                public final com.google.common.util.concurrent.d a(Object obj) {
                    return this.f15249a.c(c2586f50, i40, interfaceC2369d50, ob2, (O40) obj);
                }
            }, this.f16104f);
        }
        this.f16103e = ob2;
        return ((T40) this.f16099a).c(c2586f50, interfaceC2369d50, ob2);
    }
}
