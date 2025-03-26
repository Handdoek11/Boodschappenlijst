package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import g4.C5807c;
import h2.InterfaceC5836j;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(g4.B b8, g4.e eVar) {
        com.google.firebase.f fVar = (com.google.firebase.f) eVar.a(com.google.firebase.f.class);
        androidx.appcompat.app.E.a(eVar.a(G4.a.class));
        return new FirebaseMessaging(fVar, null, eVar.d(P4.i.class), eVar.d(F4.j.class), (I4.e) eVar.a(I4.e.class), eVar.c(b8), (E4.d) eVar.a(E4.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C5807c> getComponents() {
        final g4.B a8 = g4.B.a(w4.b.class, InterfaceC5836j.class);
        return Arrays.asList(C5807c.e(FirebaseMessaging.class).h(LIBRARY_NAME).b(g4.r.l(com.google.firebase.f.class)).b(g4.r.h(G4.a.class)).b(g4.r.j(P4.i.class)).b(g4.r.j(F4.j.class)).b(g4.r.l(I4.e.class)).b(g4.r.i(a8)).b(g4.r.l(E4.d.class)).f(new g4.h() { // from class: com.google.firebase.messaging.B
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return FirebaseMessagingRegistrar.lambda$getComponents$0(a8, eVar);
            }
        }).c().d(), P4.h.b(LIBRARY_NAME, "24.1.0"));
    }
}
