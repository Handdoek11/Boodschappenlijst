package com.google.firebase.installations;

import A3.C0377k;

/* loaded from: classes2.dex */
class e implements g {

    /* renamed from: a, reason: collision with root package name */
    final C0377k f32830a;

    public e(C0377k c0377k) {
        this.f32830a = c0377k;
    }

    @Override // com.google.firebase.installations.g
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.g
    public boolean b(J4.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f32830a.e(dVar.d());
        return true;
    }
}
