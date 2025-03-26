package com.google.firebase.dynamiclinks.internal;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinkRegistrar;
import com.google.firebase.f;
import e4.InterfaceC5746a;
import g4.C5807c;
import g4.e;
import g4.h;
import g4.r;
import java.util.Arrays;
import java.util.List;
import x4.AbstractC6909a;
import y4.C6952g;

@Keep
/* loaded from: classes2.dex */
public final class FirebaseDynamicLinkRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-dl";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ AbstractC6909a lambda$getComponents$0(e eVar) {
        return new C6952g((f) eVar.a(f.class), eVar.d(InterfaceC5746a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C5807c> getComponents() {
        return Arrays.asList(C5807c.e(AbstractC6909a.class).h(LIBRARY_NAME).b(r.l(f.class)).b(r.j(InterfaceC5746a.class)).f(new h() { // from class: y4.f
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return FirebaseDynamicLinkRegistrar.lambda$getComponents$0(eVar);
            }
        }).d(), P4.h.b(LIBRARY_NAME, "22.1.0"));
    }
}
