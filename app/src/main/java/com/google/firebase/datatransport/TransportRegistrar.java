package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import g4.B;
import g4.C5807c;
import g4.e;
import g4.h;
import g4.r;
import h2.InterfaceC5836j;
import j2.u;
import java.util.Arrays;
import java.util.List;
import w4.InterfaceC6891a;
import w4.b;

@Keep
/* loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC5836j lambda$getComponents$0(e eVar) {
        u.f((Context) eVar.a(Context.class));
        return u.c().g(a.f13042h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC5836j lambda$getComponents$1(e eVar) {
        u.f((Context) eVar.a(Context.class));
        return u.c().g(a.f13042h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC5836j lambda$getComponents$2(e eVar) {
        u.f((Context) eVar.a(Context.class));
        return u.c().g(a.f13041g);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5807c> getComponents() {
        return Arrays.asList(C5807c.e(InterfaceC5836j.class).h(LIBRARY_NAME).b(r.l(Context.class)).f(new h() { // from class: w4.c
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return TransportRegistrar.lambda$getComponents$0(eVar);
            }
        }).d(), C5807c.c(B.a(InterfaceC6891a.class, InterfaceC5836j.class)).b(r.l(Context.class)).f(new h() { // from class: w4.d
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return TransportRegistrar.lambda$getComponents$1(eVar);
            }
        }).d(), C5807c.c(B.a(b.class, InterfaceC5836j.class)).b(r.l(Context.class)).f(new h() { // from class: w4.e
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return TransportRegistrar.lambda$getComponents$2(eVar);
            }
        }).d(), P4.h.b(LIBRARY_NAME, "19.0.0"));
    }
}
