package com.google.firebase.sessions;

import A6.g;
import I4.e;
import J6.AbstractC0650j;
import J6.r;
import R4.C0699g;
import R4.F;
import R4.G;
import R4.J;
import R4.k;
import R4.x;
import U6.I;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.f;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import f4.InterfaceC5782a;
import f4.InterfaceC5783b;
import g4.B;
import g4.C5807c;
import g4.h;
import h2.InterfaceC5836j;
import java.util.List;
import y6.AbstractC6987o;

@Keep
/* loaded from: classes2.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final a Companion = new a(null);
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final B backgroundDispatcher;
    private static final B blockingDispatcher;
    private static final B firebaseApp;
    private static final B firebaseInstallationsApi;
    private static final B sessionLifecycleServiceBinder;
    private static final B sessionsSettings;
    private static final B transportFactory;

    private static final class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
        }
    }

    static {
        B b8 = B.b(f.class);
        r.d(b8, "unqualified(FirebaseApp::class.java)");
        firebaseApp = b8;
        B b9 = B.b(e.class);
        r.d(b9, "unqualified(FirebaseInstallationsApi::class.java)");
        firebaseInstallationsApi = b9;
        B a8 = B.a(InterfaceC5782a.class, I.class);
        r.d(a8, "qualified(Background::cl…neDispatcher::class.java)");
        backgroundDispatcher = a8;
        B a9 = B.a(InterfaceC5783b.class, I.class);
        r.d(a9, "qualified(Blocking::clas…neDispatcher::class.java)");
        blockingDispatcher = a9;
        B b10 = B.b(InterfaceC5836j.class);
        r.d(b10, "unqualified(TransportFactory::class.java)");
        transportFactory = b10;
        B b11 = B.b(T4.f.class);
        r.d(b11, "unqualified(SessionsSettings::class.java)");
        sessionsSettings = b11;
        B b12 = B.b(F.class);
        r.d(b12, "unqualified(SessionLifec…erviceBinder::class.java)");
        sessionLifecycleServiceBinder = b12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k getComponents$lambda$0(g4.e eVar) {
        Object f8 = eVar.f(firebaseApp);
        r.d(f8, "container[firebaseApp]");
        Object f9 = eVar.f(sessionsSettings);
        r.d(f9, "container[sessionsSettings]");
        Object f10 = eVar.f(backgroundDispatcher);
        r.d(f10, "container[backgroundDispatcher]");
        Object f11 = eVar.f(sessionLifecycleServiceBinder);
        r.d(f11, "container[sessionLifecycleServiceBinder]");
        return new k((f) f8, (T4.f) f9, (g) f10, (F) f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c getComponents$lambda$1(g4.e eVar) {
        return new c(J.f4810a, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b getComponents$lambda$2(g4.e eVar) {
        Object f8 = eVar.f(firebaseApp);
        r.d(f8, "container[firebaseApp]");
        f fVar = (f) f8;
        Object f9 = eVar.f(firebaseInstallationsApi);
        r.d(f9, "container[firebaseInstallationsApi]");
        e eVar2 = (e) f9;
        Object f10 = eVar.f(sessionsSettings);
        r.d(f10, "container[sessionsSettings]");
        T4.f fVar2 = (T4.f) f10;
        H4.b c8 = eVar.c(transportFactory);
        r.d(c8, "container.getProvider(transportFactory)");
        C0699g c0699g = new C0699g(c8);
        Object f11 = eVar.f(backgroundDispatcher);
        r.d(f11, "container[backgroundDispatcher]");
        return new R4.B(fVar, eVar2, fVar2, c0699g, (g) f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final T4.f getComponents$lambda$3(g4.e eVar) {
        Object f8 = eVar.f(firebaseApp);
        r.d(f8, "container[firebaseApp]");
        Object f9 = eVar.f(blockingDispatcher);
        r.d(f9, "container[blockingDispatcher]");
        Object f10 = eVar.f(backgroundDispatcher);
        r.d(f10, "container[backgroundDispatcher]");
        Object f11 = eVar.f(firebaseInstallationsApi);
        r.d(f11, "container[firebaseInstallationsApi]");
        return new T4.f((f) f8, (g) f9, (g) f10, (e) f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.firebase.sessions.a getComponents$lambda$4(g4.e eVar) {
        Context k8 = ((f) eVar.f(firebaseApp)).k();
        r.d(k8, "container[firebaseApp].applicationContext");
        Object f8 = eVar.f(backgroundDispatcher);
        r.d(f8, "container[backgroundDispatcher]");
        return new x(k8, (g) f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final F getComponents$lambda$5(g4.e eVar) {
        Object f8 = eVar.f(firebaseApp);
        r.d(f8, "container[firebaseApp]");
        return new G((f) f8);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5807c> getComponents() {
        C5807c.b h8 = C5807c.e(k.class).h(LIBRARY_NAME);
        B b8 = firebaseApp;
        C5807c.b b9 = h8.b(g4.r.k(b8));
        B b10 = sessionsSettings;
        C5807c.b b11 = b9.b(g4.r.k(b10));
        B b12 = backgroundDispatcher;
        C5807c d8 = b11.b(g4.r.k(b12)).b(g4.r.k(sessionLifecycleServiceBinder)).f(new h() { // from class: R4.m
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$0(eVar);
            }
        }).e().d();
        C5807c d9 = C5807c.e(c.class).h("session-generator").f(new h() { // from class: R4.n
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$1(eVar);
            }
        }).d();
        C5807c.b b13 = C5807c.e(b.class).h("session-publisher").b(g4.r.k(b8));
        B b14 = firebaseInstallationsApi;
        return AbstractC6987o.g(d8, d9, b13.b(g4.r.k(b14)).b(g4.r.k(b10)).b(g4.r.m(transportFactory)).b(g4.r.k(b12)).f(new h() { // from class: R4.o
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$2(eVar);
            }
        }).d(), C5807c.e(T4.f.class).h("sessions-settings").b(g4.r.k(b8)).b(g4.r.k(blockingDispatcher)).b(g4.r.k(b12)).b(g4.r.k(b14)).f(new h() { // from class: R4.p
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$3(eVar);
            }
        }).d(), C5807c.e(com.google.firebase.sessions.a.class).h("sessions-datastore").b(g4.r.k(b8)).b(g4.r.k(b12)).f(new h() { // from class: R4.q
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$4(eVar);
            }
        }).d(), C5807c.e(F.class).h("sessions-service-binder").b(g4.r.k(b8)).f(new h() { // from class: R4.r
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return FirebaseSessionsRegistrar.getComponents$lambda$5(eVar);
            }
        }).d(), P4.h.b(LIBRARY_NAME, "2.0.7"));
    }
}
