package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import e4.C5747b;
import e4.InterfaceC5746a;
import g4.C5807c;
import g4.h;
import g4.r;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C5807c> getComponents() {
        return Arrays.asList(C5807c.e(InterfaceC5746a.class).b(r.l(com.google.firebase.f.class)).b(r.l(Context.class)).b(r.l(E4.d.class)).f(new h() { // from class: com.google.firebase.analytics.connector.internal.b
            @Override // g4.h
            public final Object a(g4.e eVar) {
                return C5747b.d((com.google.firebase.f) eVar.a(com.google.firebase.f.class), (Context) eVar.a(Context.class), (E4.d) eVar.a(E4.d.class));
            }
        }).e().d(), P4.h.b("fire-analytics", "22.1.2"));
    }
}
