package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.C4889d1;
import java.util.List;
import java.util.Map;
import w3.z;

/* loaded from: classes2.dex */
final class a implements z {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C4889d1 f32705a;

    a(C4889d1 c4889d1) {
        this.f32705a = c4889d1;
    }

    @Override // w3.z
    public final void C(String str) {
        this.f32705a.E(str);
    }

    @Override // w3.z
    public final void R(Bundle bundle) {
        this.f32705a.l(bundle);
    }

    @Override // w3.z
    public final void a(String str, String str2, Bundle bundle) {
        this.f32705a.s(str, str2, bundle);
    }

    @Override // w3.z
    public final List b(String str, String str2) {
        return this.f32705a.h(str, str2);
    }

    @Override // w3.z
    public final long c() {
        return this.f32705a.b();
    }

    @Override // w3.z
    public final Map d(String str, String str2, boolean z7) {
        return this.f32705a.i(str, str2, z7);
    }

    @Override // w3.z
    public final String e() {
        return this.f32705a.K();
    }

    @Override // w3.z
    public final String f() {
        return this.f32705a.L();
    }

    @Override // w3.z
    public final String g() {
        return this.f32705a.J();
    }

    @Override // w3.z
    public final String h() {
        return this.f32705a.M();
    }

    @Override // w3.z
    public final void i(String str, String str2, Bundle bundle) {
        this.f32705a.C(str, str2, bundle);
    }

    @Override // w3.z
    public final int n(String str) {
        return this.f32705a.a(str);
    }

    @Override // w3.z
    public final void v(String str) {
        this.f32705a.A(str);
    }
}
