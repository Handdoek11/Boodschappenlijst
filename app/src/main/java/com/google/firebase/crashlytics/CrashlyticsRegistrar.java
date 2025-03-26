package com.google.firebase.crashlytics;

import S4.b;
import com.google.firebase.components.ComponentRegistrar;
import e4.InterfaceC5746a;
import f4.InterfaceC5782a;
import f4.InterfaceC5783b;
import f4.InterfaceC5784c;
import g4.B;
import g4.C5807c;
import g4.e;
import g4.h;
import g4.r;
import j4.InterfaceC6074a;
import j4.g;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import n4.f;

/* loaded from: classes2.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    private final B f32776a = B.a(InterfaceC5782a.class, ExecutorService.class);

    /* renamed from: b, reason: collision with root package name */
    private final B f32777b = B.a(InterfaceC5783b.class, ExecutorService.class);

    /* renamed from: c, reason: collision with root package name */
    private final B f32778c = B.a(InterfaceC5784c.class, ExecutorService.class);

    static {
        S4.a.a(b.a.CRASHLYTICS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a b(e eVar) {
        f.f(false);
        long currentTimeMillis = System.currentTimeMillis();
        a c8 = a.c((com.google.firebase.f) eVar.a(com.google.firebase.f.class), (I4.e) eVar.a(I4.e.class), eVar.i(InterfaceC6074a.class), eVar.i(InterfaceC5746a.class), eVar.i(Q4.a.class), (ExecutorService) eVar.f(this.f32776a), (ExecutorService) eVar.f(this.f32777b), (ExecutorService) eVar.f(this.f32778c));
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (currentTimeMillis2 > 16) {
            g.f().b("Initializing Crashlytics blocked main for " + currentTimeMillis2 + " ms");
        }
        return c8;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C5807c.e(a.class).h("fire-cls").b(r.l(com.google.firebase.f.class)).b(r.l(I4.e.class)).b(r.k(this.f32776a)).b(r.k(this.f32777b)).b(r.k(this.f32778c)).b(r.a(InterfaceC6074a.class)).b(r.a(InterfaceC5746a.class)).b(r.a(Q4.a.class)).f(new h() { // from class: i4.f
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return this.f36519a.b(eVar);
            }
        }).e().d(), P4.h.b("fire-cls", "19.3.0"));
    }
}
