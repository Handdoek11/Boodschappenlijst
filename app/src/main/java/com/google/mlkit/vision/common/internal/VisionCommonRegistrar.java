package com.google.mlkit.vision.common.internal;

import com.google.firebase.components.ComponentRegistrar;
import com.google.mlkit.vision.common.internal.a;
import g4.C5807c;
import g4.e;
import g4.h;
import g4.r;
import java.util.List;
import s3.k;

/* loaded from: classes2.dex */
public class VisionCommonRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return k.o(C5807c.e(a.class).b(r.o(a.C0242a.class)).f(new h() { // from class: com.google.mlkit.vision.common.internal.b
            @Override // g4.h
            public final Object a(e eVar) {
                return new a(eVar.g(a.C0242a.class));
            }
        }).d());
    }
}
