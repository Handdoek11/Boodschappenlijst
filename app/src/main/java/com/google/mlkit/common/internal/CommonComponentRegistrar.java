package com.google.mlkit.common.internal;

import X4.c;
import Y4.b;
import Y4.d;
import Y4.g;
import Y4.j;
import Z4.a;
import com.google.firebase.components.ComponentRegistrar;
import g4.C5807c;
import g4.h;
import g4.r;
import java.util.List;
import r3.AbstractC6695m;

/* loaded from: classes2.dex */
public class CommonComponentRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return AbstractC6695m.p(j.f6108b, C5807c.e(a.class).b(r.l(g.class)).f(new h() { // from class: V4.a
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return new Z4.a((Y4.g) eVar.a(Y4.g.class));
            }
        }).d(), C5807c.e(Y4.h.class).f(new h() { // from class: V4.b
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return new Y4.h();
            }
        }).d(), C5807c.e(c.class).b(r.o(c.a.class)).f(new h() { // from class: V4.c
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return new X4.c(eVar.g(c.a.class));
            }
        }).d(), C5807c.e(d.class).b(r.n(Y4.h.class)).f(new h() { // from class: V4.d
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return new Y4.d(eVar.d(Y4.h.class));
            }
        }).d(), C5807c.e(Y4.a.class).f(new h() { // from class: V4.e
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return Y4.a.a();
            }
        }).d(), C5807c.e(b.class).b(r.l(Y4.a.class)).f(new h() { // from class: V4.f
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return new Y4.b((Y4.a) eVar.a(Y4.a.class));
            }
        }).d(), C5807c.e(W4.a.class).b(r.l(g.class)).f(new h() { // from class: V4.g
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return new W4.a((Y4.g) eVar.a(Y4.g.class));
            }
        }).d(), C5807c.m(c.a.class).b(r.n(W4.a.class)).f(new h() { // from class: V4.h
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return new c.a(X4.a.class, eVar.d(W4.a.class));
            }
        }).d());
    }
}
