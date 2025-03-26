package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.n7;
import f3.InterfaceC5781e;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class G5 extends F5 {
    G5(H5 h52) {
        super(h52);
    }

    private final String u(String str) {
        String P7 = p().P(str);
        if (TextUtils.isEmpty(P7)) {
            return (String) G.f30469r.a(null);
        }
        Uri parse = Uri.parse((String) G.f30469r.a(null));
        Uri.Builder buildUpon = parse.buildUpon();
        buildUpon.authority(P7 + "." + parse.getAuthority());
        return buildUpon.build().toString();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5326g a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5444x c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5298c d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5336h2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ C5461z2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ d6 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ C5378n2 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ P2 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3
    public final /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ Z5 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ h6 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ C5354k o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ I2 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ C5353j5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ G5 r() {
        return super.r();
    }

    public final I5 s(String str) {
        C5301c2 K02;
        if (n7.a() && a().r(G.f30484y0)) {
            g();
            if (d6.F0(str)) {
                h().I().a("sgtm feature flag enabled.");
                C5301c2 K03 = o().K0(str);
                if (K03 == null) {
                    return new I5(u(str), w3.C.GOOGLE_ANALYTICS);
                }
                String m8 = K03.m();
                com.google.android.gms.internal.measurement.U1 J7 = p().J(str);
                if (J7 == null || (K02 = o().K0(str)) == null || ((!J7.Y() || J7.P().k() != 100) && !g().C0(str, K02.v()) && (!a().r(G.f30371A0) ? !(TextUtils.isEmpty(m8) || m8.hashCode() % 100 >= J7.P().k()) : !(TextUtils.isEmpty(m8) || Math.abs(m8.hashCode() % 100) >= J7.P().k())))) {
                    return new I5(u(str), w3.C.GOOGLE_ANALYTICS);
                }
                I5 i52 = null;
                if (K03.C()) {
                    h().I().a("sgtm upload enabled in manifest.");
                    com.google.android.gms.internal.measurement.U1 J8 = p().J(K03.l());
                    if (J8 != null && J8.Y()) {
                        String J9 = J8.P().J();
                        if (!TextUtils.isEmpty(J9)) {
                            String I7 = J8.P().I();
                            h().I().c("sgtm configured with upload_url, server_info", J9, TextUtils.isEmpty(I7) ? "Y" : "N");
                            if (TextUtils.isEmpty(I7)) {
                                i52 = new I5(J9, w3.C.SGTM);
                            } else {
                                HashMap hashMap = new HashMap();
                                hashMap.put("x-sgtm-server-info", I7);
                                if (!TextUtils.isEmpty(K03.v())) {
                                    hashMap.put("x-gtm-server-preview", K03.v());
                                }
                                i52 = new I5(J9, hashMap, w3.C.SGTM);
                            }
                        }
                    }
                }
                if (i52 != null) {
                    return i52;
                }
            }
        }
        return new I5(u(str), w3.C.GOOGLE_ANALYTICS);
    }

    public final String t(C5301c2 c5301c2) {
        Uri.Builder builder = new Uri.Builder();
        String q8 = c5301c2.q();
        if (TextUtils.isEmpty(q8)) {
            q8 = c5301c2.j();
        }
        builder.scheme((String) G.f30437f.a(null)).encodedAuthority((String) G.f30440g.a(null)).path("config/app/" + q8).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "106000").appendQueryParameter("runtime_version", "0");
        return builder.build().toString();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC5441w3, com.google.android.gms.measurement.internal.InterfaceC5455y3
    public final /* bridge */ /* synthetic */ InterfaceC5781e zzb() {
        return super.zzb();
    }
}
