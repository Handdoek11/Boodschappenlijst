package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.z70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4767z70 implements InterfaceC4658y70 {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f28303a;

    /* renamed from: b, reason: collision with root package name */
    private final G70 f28304b;

    /* renamed from: c, reason: collision with root package name */
    private final B70 f28305c = new B70();

    public C4767z70(G70 g70) {
        this.f28303a = new ConcurrentHashMap(g70.f15284w);
        this.f28304b = g70;
    }

    private final void e() {
        Parcelable.Creator<G70> creator = G70.CREATOR;
        if (((Boolean) D2.A.c().a(AbstractC3184kf.f23908h6)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f28304b.f15282u);
            sb.append(" PoolCollection");
            sb.append(this.f28305c.b());
            int i8 = 0;
            for (Map.Entry entry : this.f28303a.entrySet()) {
                i8++;
                sb.append(i8);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((J70) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i9 = 0; i9 < ((C4549x70) entry.getValue()).b(); i9++) {
                    sb.append("[O]");
                }
                for (int b8 = ((C4549x70) entry.getValue()).b(); b8 < this.f28304b.f15284w; b8++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((C4549x70) entry.getValue()).g());
                sb.append("\n");
            }
            while (i8 < this.f28304b.f15283v) {
                i8++;
                sb.append(i8);
                sb.append(".\n");
            }
            H2.p.b(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4658y70
    public final synchronized boolean a(J70 j70) {
        C4549x70 c4549x70 = (C4549x70) this.f28303a.get(j70);
        if (c4549x70 == null) {
            return true;
        }
        return c4549x70.b() < this.f28304b.f15284w;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4658y70
    public final synchronized I70 b(J70 j70) {
        I70 i70;
        try {
            C4549x70 c4549x70 = (C4549x70) this.f28303a.get(j70);
            if (c4549x70 != null) {
                i70 = c4549x70.e();
                if (i70 == null) {
                    this.f28305c.e();
                }
                W70 f8 = c4549x70.f();
                if (i70 != null) {
                    C1897Wd d02 = C2422de.d0();
                    C1827Ud h02 = C1862Vd.h0();
                    h02.C(EnumC1932Xd.IN_MEMORY);
                    C2002Zd d03 = C2096ae.d0();
                    d03.C(f8.f19722o);
                    d03.D(f8.f19723s);
                    h02.D(d03);
                    d02.C(h02);
                    i70.f15870a.zzb().c().H0((C2422de) d02.x());
                }
                e();
            } else {
                this.f28305c.f();
                e();
                i70 = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return i70;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4658y70
    public final J70 c(D2.X1 x12, String str, D2.i2 i2Var) {
        return new K70(x12, str, new C1137Ao(this.f28304b.f15280s).a().f13871j, this.f28304b.f15286y, i2Var);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4658y70
    public final synchronized boolean d(J70 j70, I70 i70) {
        boolean h8;
        try {
            C4549x70 c4549x70 = (C4549x70) this.f28303a.get(j70);
            i70.f15873d = C2.v.c().a();
            if (c4549x70 == null) {
                G70 g70 = this.f28304b;
                C4549x70 c4549x702 = new C4549x70(g70.f15284w, g70.f15285x * 1000);
                if (this.f28303a.size() == this.f28304b.f15283v) {
                    int i8 = this.f28304b.f15278D;
                    int i9 = i8 - 1;
                    J70 j702 = null;
                    if (i8 == 0) {
                        throw null;
                    }
                    long j8 = Long.MAX_VALUE;
                    if (i9 == 0) {
                        for (Map.Entry entry : this.f28303a.entrySet()) {
                            if (((C4549x70) entry.getValue()).c() < j8) {
                                j8 = ((C4549x70) entry.getValue()).c();
                                j702 = (J70) entry.getKey();
                            }
                        }
                        if (j702 != null) {
                            this.f28303a.remove(j702);
                        }
                    } else if (i9 == 1) {
                        for (Map.Entry entry2 : this.f28303a.entrySet()) {
                            if (((C4549x70) entry2.getValue()).d() < j8) {
                                j8 = ((C4549x70) entry2.getValue()).d();
                                j702 = (J70) entry2.getKey();
                            }
                        }
                        if (j702 != null) {
                            this.f28303a.remove(j702);
                        }
                    } else if (i9 == 2) {
                        int i10 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : this.f28303a.entrySet()) {
                            if (((C4549x70) entry3.getValue()).a() < i10) {
                                i10 = ((C4549x70) entry3.getValue()).a();
                                j702 = (J70) entry3.getKey();
                            }
                        }
                        if (j702 != null) {
                            this.f28303a.remove(j702);
                        }
                    }
                    this.f28305c.g();
                }
                this.f28303a.put(j70, c4549x702);
                this.f28305c.d();
                c4549x70 = c4549x702;
            }
            h8 = c4549x70.h(i70);
            this.f28305c.c();
            A70 a8 = this.f28305c.a();
            W70 f8 = c4549x70.f();
            C1897Wd d02 = C2422de.d0();
            C1827Ud h02 = C1862Vd.h0();
            h02.C(EnumC1932Xd.IN_MEMORY);
            C2205be h03 = C2313ce.h0();
            h03.C(a8.f13523o);
            h03.D(a8.f13524s);
            h03.E(f8.f19723s);
            h02.F(h03);
            d02.C(h02);
            i70.f15870a.zzb().c().s0((C2422de) d02.x());
            e();
        } catch (Throwable th) {
            throw th;
        }
        return h8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4658y70
    public final G70 zza() {
        return this.f28304b;
    }
}
