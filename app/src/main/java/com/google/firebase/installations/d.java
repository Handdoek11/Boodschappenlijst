package com.google.firebase.installations;

import A3.C0377k;

/* loaded from: classes2.dex */
class d implements g {

    /* renamed from: a, reason: collision with root package name */
    private final h f32828a;

    /* renamed from: b, reason: collision with root package name */
    private final C0377k f32829b;

    public d(h hVar, C0377k c0377k) {
        this.f32828a = hVar;
        this.f32829b = c0377k;
    }

    @Override // com.google.firebase.installations.g
    public boolean a(Exception exc) {
        this.f32829b.d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.g
    public boolean b(J4.d dVar) {
        if (!dVar.k() || this.f32828a.f(dVar)) {
            return false;
        }
        this.f32829b.c(f.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}
