package com.google.android.gms.common.api.internal;

import X2.C0754b;
import Z2.AbstractC0765d;
import Z2.InterfaceC0772k;
import android.util.Log;
import com.google.android.gms.common.C1103b;
import com.google.android.gms.common.api.a;
import java.util.Set;

/* loaded from: classes.dex */
final class v implements AbstractC0765d.c, X2.A {

    /* renamed from: a, reason: collision with root package name */
    private final a.f f13367a;

    /* renamed from: b, reason: collision with root package name */
    private final C0754b f13368b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC0772k f13369c = null;

    /* renamed from: d, reason: collision with root package name */
    private Set f13370d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13371e = false;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C1091c f13372f;

    public v(C1091c c1091c, a.f fVar, C0754b c0754b) {
        this.f13372f = c1091c;
        this.f13367a = fVar;
        this.f13368b = c0754b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        InterfaceC0772k interfaceC0772k;
        if (!this.f13371e || (interfaceC0772k = this.f13369c) == null) {
            return;
        }
        this.f13367a.n(interfaceC0772k, this.f13370d);
    }

    @Override // Z2.AbstractC0765d.c
    public final void a(C1103b c1103b) {
        this.f13372f.f13298E.post(new u(this, c1103b));
    }

    @Override // X2.A
    public final void b(InterfaceC0772k interfaceC0772k, Set set) {
        if (interfaceC0772k == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            c(new C1103b(4));
        } else {
            this.f13369c = interfaceC0772k;
            this.f13370d = set;
            i();
        }
    }

    @Override // X2.A
    public final void c(C1103b c1103b) {
        s sVar = (s) this.f13372f.f13294A.get(this.f13368b);
        if (sVar != null) {
            sVar.F(c1103b);
        }
    }

    @Override // X2.A
    public final void d(int i8) {
        s sVar = (s) this.f13372f.f13294A.get(this.f13368b);
        if (sVar != null) {
            if (sVar.f13362z) {
                sVar.F(new C1103b(17));
            } else {
                sVar.w0(i8);
            }
        }
    }
}
