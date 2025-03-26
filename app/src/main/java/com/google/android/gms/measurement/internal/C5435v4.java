package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.AbstractC5010r4;
import com.google.android.gms.internal.measurement.C4931h7;
import com.google.android.gms.internal.measurement.C4961l2;
import com.google.android.gms.internal.measurement.C4969m2;
import com.google.android.gms.internal.measurement.C4977n2;
import com.google.android.gms.internal.measurement.C4993p2;
import com.google.android.gms.internal.measurement.C5001q2;
import com.google.android.gms.internal.measurement.C5008r2;
import com.google.android.gms.internal.measurement.C5032u2;
import com.google.android.gms.internal.measurement.N6;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.v4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5435v4 extends E5 {
    public C5435v4(H5 h52) {
        super(h52);
    }

    private static String b(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean v() {
        return false;
    }

    public final byte[] w(E e8, String str) {
        a6 a6Var;
        Bundle bundle;
        C5001q2.a aVar;
        C4993p2.a aVar2;
        C5301c2 c5301c2;
        byte[] bArr;
        long j8;
        A a8;
        l();
        this.f31239a.O();
        Z2.r.l(e8);
        Z2.r.f(str);
        if (!a().D(str, G.f30459m0)) {
            h().D().b("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(e8.f30332o) && !"_iapx".equals(e8.f30332o)) {
            h().D().c("Generating a payload for this event is not available. package_name, event_name", str, e8.f30332o);
            return null;
        }
        C4993p2.a L7 = C4993p2.L();
        o().a1();
        try {
            C5301c2 K02 = o().K0(str);
            if (K02 == null) {
                h().D().b("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!K02.A()) {
                h().D().b("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            C5001q2.a X02 = C5001q2.u2().y0(1).X0("android");
            if (!TextUtils.isEmpty(K02.l())) {
                X02.W(K02.l());
            }
            if (!TextUtils.isEmpty(K02.n())) {
                X02.i0((String) Z2.r.l(K02.n()));
            }
            if (!TextUtils.isEmpty(K02.o())) {
                X02.o0((String) Z2.r.l(K02.o()));
            }
            if (K02.U() != -2147483648L) {
                X02.l0((int) K02.U());
            }
            X02.r0(K02.z0()).g0(K02.v0());
            String q8 = K02.q();
            String j9 = K02.j();
            if (!TextUtils.isEmpty(q8)) {
                X02.R0(q8);
            } else if (!TextUtils.isEmpty(j9)) {
                X02.L(j9);
            }
            X02.H0(K02.J0());
            A3 S7 = this.f30369b.S(str);
            X02.a0(K02.t0());
            if (this.f31239a.n() && a().L(X02.e1()) && S7.y() && !TextUtils.isEmpty(null)) {
                X02.I0(null);
            }
            X02.w0(S7.w());
            if (S7.y() && K02.z()) {
                Pair x7 = q().x(K02.l(), S7);
                if (K02.z() && x7 != null && !TextUtils.isEmpty((CharSequence) x7.first)) {
                    X02.Z0(b((String) x7.first, Long.toString(e8.f30335u)));
                    Object obj = x7.second;
                    if (obj != null) {
                        X02.d0(((Boolean) obj).booleanValue());
                    }
                }
            }
            c().n();
            C5001q2.a E02 = X02.E0(Build.MODEL);
            c().n();
            E02.V0(Build.VERSION.RELEASE).G0((int) c().s()).d1(c().t());
            if (S7.z() && K02.m() != null) {
                X02.c0(b((String) Z2.r.l(K02.m()), Long.toString(e8.f30335u)));
            }
            if (!TextUtils.isEmpty(K02.p())) {
                X02.P0((String) Z2.r.l(K02.p()));
            }
            String l8 = K02.l();
            List W02 = o().W0(l8);
            Iterator it = W02.iterator();
            while (true) {
                if (!it.hasNext()) {
                    a6Var = null;
                    break;
                }
                a6Var = (a6) it.next();
                if ("_lte".equals(a6Var.f30822c)) {
                    break;
                }
            }
            if (a6Var == null || a6Var.f30824e == null) {
                a6 a6Var2 = new a6(l8, "auto", "_lte", zzb().a(), 0L);
                W02.add(a6Var2);
                o().g0(a6Var2);
            }
            C5032u2[] c5032u2Arr = new C5032u2[W02.size()];
            for (int i8 = 0; i8 < W02.size(); i8++) {
                C5032u2.a D7 = C5032u2.S().B(((a6) W02.get(i8)).f30822c).D(((a6) W02.get(i8)).f30823d);
                m().T(D7, ((a6) W02.get(i8)).f30824e);
                c5032u2Arr[i8] = (C5032u2) ((AbstractC5010r4) D7.u());
            }
            X02.n0(Arrays.asList(c5032u2Arr));
            this.f30369b.v(K02, X02);
            if (N6.a() && a().r(G.f30413V0)) {
                this.f30369b.Y(K02, X02);
            }
            C5405r2 b8 = C5405r2.b(e8);
            g().L(b8.f31170d, o().I0(str));
            g().U(b8, a().t(str));
            Bundle bundle2 = b8.f31170d;
            bundle2.putLong("_c", 1L);
            h().D().a("Marking in-app purchase as real-time");
            bundle2.putLong("_r", 1L);
            bundle2.putString("_o", e8.f30334t);
            if (g().C0(X02.e1(), K02.v())) {
                g().M(bundle2, "_dbg", 1L);
                g().M(bundle2, "_r", 1L);
            }
            A J02 = o().J0(str, e8.f30332o);
            if (J02 == null) {
                bundle = bundle2;
                aVar = X02;
                aVar2 = L7;
                c5301c2 = K02;
                bArr = null;
                a8 = new A(str, e8.f30332o, 0L, 0L, e8.f30335u, 0L, null, null, null, null);
                j8 = 0;
            } else {
                bundle = bundle2;
                aVar = X02;
                aVar2 = L7;
                c5301c2 = K02;
                bArr = null;
                j8 = J02.f30254f;
                a8 = J02.a(e8.f30335u);
            }
            o().S(a8);
            B b9 = new B(this.f31239a, e8.f30334t, str, e8.f30332o, e8.f30335u, j8, bundle);
            C4961l2.a C7 = C4961l2.S().I(b9.f30285d).G(b9.f30283b).C(b9.f30286e);
            Iterator it2 = b9.f30287f.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                C4977n2.a D8 = C4977n2.U().D(str2);
                Object F02 = b9.f30287f.F0(str2);
                if (F02 != null) {
                    m().S(D8, F02);
                    C7.D(D8);
                }
            }
            C5001q2.a aVar3 = aVar;
            aVar3.G(C7).H(C5008r2.G().y(C4969m2.G().y(a8.f30251c).z(e8.f30332o)));
            aVar3.K(n().x(c5301c2.l(), Collections.emptyList(), aVar3.O(), Long.valueOf(C7.K()), Long.valueOf(C7.K())));
            if (C7.O()) {
                aVar3.D0(C7.K()).m0(C7.K());
            }
            long D02 = c5301c2.D0();
            if (D02 != 0) {
                aVar3.v0(D02);
            }
            long H02 = c5301c2.H0();
            if (H02 != 0) {
                aVar3.z0(H02);
            } else if (D02 != 0) {
                aVar3.z0(D02);
            }
            String u7 = c5301c2.u();
            if (C4931h7.a() && a().D(str, G.f30482x0) && u7 != null) {
                aVar3.b1(u7);
            }
            c5301c2.y();
            aVar3.q0((int) c5301c2.F0()).O0(106000L).K0(zzb().a()).j0(true);
            this.f30369b.C(aVar3.e1(), aVar3);
            C4993p2.a aVar4 = aVar2;
            aVar4.z(aVar3);
            C5301c2 c5301c22 = c5301c2;
            c5301c22.C0(aVar3.p0());
            c5301c22.y0(aVar3.k0());
            o().T(c5301c22, false, false);
            o().i1();
            try {
                return m().f0(((C4993p2) ((AbstractC5010r4) aVar4.u())).j());
            } catch (IOException e9) {
                h().E().c("Data loss. Failed to bundle and serialize. appId", C5378n2.t(str), e9);
                return bArr;
            }
        } catch (SecurityException e10) {
            h().D().b("Resettable device id encryption failed", e10.getMessage());
            return new byte[0];
        } catch (SecurityException e11) {
            h().D().b("app instance id encryption failed", e11.getMessage());
            return new byte[0];
        } finally {
            o().g1();
        }
    }
}
