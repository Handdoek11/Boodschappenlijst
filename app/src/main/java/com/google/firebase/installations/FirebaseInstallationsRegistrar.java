package com.google.firebase.installations;

import F4.i;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import f4.InterfaceC5782a;
import f4.InterfaceC5783b;
import g4.B;
import g4.C5807c;
import g4.r;
import h4.j;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ I4.e lambda$getComponents$0(g4.e eVar) {
        return new c((com.google.firebase.f) eVar.a(com.google.firebase.f.class), eVar.d(i.class), (ExecutorService) eVar.f(B.a(InterfaceC5782a.class, ExecutorService.class)), j.a((Executor) eVar.f(B.a(InterfaceC5783b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5807c> getComponents() {
        return Arrays.asList(C5807c.e(I4.e.class).h(LIBRARY_NAME).b(r.l(com.google.firebase.f.class)).b(r.j(i.class)).b(r.k(B.a(InterfaceC5782a.class, ExecutorService.class))).b(r.k(B.a(InterfaceC5783b.class, Executor.class))).f(new g4.h() { // from class: I4.f
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(eVar);
            }
        }).d(), F4.h.a(), P4.h.b(LIBRARY_NAME, "18.0.0"));
    }
}
