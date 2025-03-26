package M2;

import android.util.Pair;
import com.google.android.gms.internal.ads.AbstractC3840qg;
import com.google.android.gms.internal.ads.NN;
import w2.EnumC6877c;

/* loaded from: classes.dex */
public final class m0 extends O2.b {

    /* renamed from: a, reason: collision with root package name */
    private final l0 f3904a;

    /* renamed from: b, reason: collision with root package name */
    private final NN f3905b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f3906c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3907d;

    /* renamed from: e, reason: collision with root package name */
    private final long f3908e = C2.v.c().a();

    /* renamed from: f, reason: collision with root package name */
    private final Boolean f3909f;

    public m0(l0 l0Var, boolean z7, int i8, Boolean bool, NN nn) {
        this.f3904a = l0Var;
        this.f3906c = z7;
        this.f3907d = i8;
        this.f3909f = bool;
        this.f3905b = nn;
    }

    private static long c() {
        return C2.v.c().a() + ((Long) AbstractC3840qg.f25984f.e()).longValue();
    }

    private final long d() {
        return C2.v.c().a() - this.f3908e;
    }

    @Override // O2.b
    public final void a(String str) {
        AbstractC0656c.d(this.f3905b, null, "sgpcf", new Pair("sgf_reason", str), new Pair("se", "query_g"), new Pair("ad_format", EnumC6877c.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("lat_ms", Long.toString(d())), new Pair("sgpc_rn", Integer.toString(this.f3907d)), new Pair("sgpc_lsu", String.valueOf(this.f3909f)), new Pair("tpc", true != this.f3906c ? "0" : "1"));
        this.f3904a.f(this.f3906c, new n0(null, str, c(), this.f3907d));
    }

    @Override // O2.b
    public final void b(O2.a aVar) {
        AbstractC0656c.d(this.f3905b, null, "sgpcs", new Pair("se", "query_g"), new Pair("ad_format", EnumC6877c.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("lat_ms", Long.toString(d())), new Pair("sgpc_rn", Integer.toString(this.f3907d)), new Pair("sgpc_lsu", String.valueOf(this.f3909f)), new Pair("tpc", true != this.f3906c ? "0" : "1"));
        this.f3904a.f(this.f3906c, new n0(aVar, "", c(), this.f3907d));
    }
}
