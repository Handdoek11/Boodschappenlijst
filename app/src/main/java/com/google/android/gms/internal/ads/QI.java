package com.google.android.gms.internal.ads;

import q.C6407k;

/* loaded from: classes.dex */
public final class QI {

    /* renamed from: a, reason: collision with root package name */
    InterfaceC4604xh f18443a;

    /* renamed from: b, reason: collision with root package name */
    InterfaceC4277uh f18444b;

    /* renamed from: c, reason: collision with root package name */
    InterfaceC1521Lh f18445c;

    /* renamed from: d, reason: collision with root package name */
    InterfaceC1415Ih f18446d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC2651fk f18447e;

    /* renamed from: f, reason: collision with root package name */
    final C6407k f18448f = new C6407k();

    /* renamed from: g, reason: collision with root package name */
    final C6407k f18449g = new C6407k();

    public final QI a(InterfaceC4277uh interfaceC4277uh) {
        this.f18444b = interfaceC4277uh;
        return this;
    }

    public final QI b(InterfaceC4604xh interfaceC4604xh) {
        this.f18443a = interfaceC4604xh;
        return this;
    }

    public final QI c(String str, InterfaceC1271Eh interfaceC1271Eh, InterfaceC1163Bh interfaceC1163Bh) {
        this.f18448f.put(str, interfaceC1271Eh);
        if (interfaceC1163Bh != null) {
            this.f18449g.put(str, interfaceC1163Bh);
        }
        return this;
    }

    public final QI d(InterfaceC2651fk interfaceC2651fk) {
        this.f18447e = interfaceC2651fk;
        return this;
    }

    public final QI e(InterfaceC1415Ih interfaceC1415Ih) {
        this.f18446d = interfaceC1415Ih;
        return this;
    }

    public final QI f(InterfaceC1521Lh interfaceC1521Lh) {
        this.f18445c = interfaceC1521Lh;
        return this;
    }

    public final SI g() {
        return new SI(this);
    }
}
