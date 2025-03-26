package com.google.android.gms.measurement;

import Z2.r;
import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.F3;
import com.google.android.gms.measurement.internal.S2;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class b extends AppMeasurement.a {

    /* renamed from: a, reason: collision with root package name */
    private final S2 f30247a;

    /* renamed from: b, reason: collision with root package name */
    private final F3 f30248b;

    public b(S2 s22) {
        super();
        r.l(s22);
        this.f30247a = s22;
        this.f30248b = s22.F();
    }

    @Override // w3.z
    public final void C(String str) {
        this.f30247a.w().B(str, this.f30247a.zzb().b());
    }

    @Override // w3.z
    public final void R(Bundle bundle) {
        this.f30248b.L0(bundle);
    }

    @Override // w3.z
    public final void a(String str, String str2, Bundle bundle) {
        this.f30247a.F().d0(str, str2, bundle);
    }

    @Override // w3.z
    public final List b(String str, String str2) {
        return this.f30248b.E(str, str2);
    }

    @Override // w3.z
    public final long c() {
        return this.f30247a.J().P0();
    }

    @Override // w3.z
    public final Map d(String str, String str2, boolean z7) {
        return this.f30248b.F(str, str2, z7);
    }

    @Override // w3.z
    public final String e() {
        return this.f30248b.u0();
    }

    @Override // w3.z
    public final String f() {
        return this.f30248b.v0();
    }

    @Override // w3.z
    public final String g() {
        return this.f30248b.t0();
    }

    @Override // w3.z
    public final String h() {
        return this.f30248b.t0();
    }

    @Override // w3.z
    public final void i(String str, String str2, Bundle bundle) {
        this.f30248b.R0(str, str2, bundle);
    }

    @Override // w3.z
    public final int n(String str) {
        return F3.C(str);
    }

    @Override // w3.z
    public final void v(String str) {
        this.f30247a.w().x(str, this.f30247a.zzb().b());
    }
}
