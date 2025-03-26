package com.google.firebase;

import J6.r;
import U6.AbstractC0730n0;
import U6.I;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import f4.InterfaceC5782a;
import f4.InterfaceC5783b;
import f4.InterfaceC5784c;
import f4.InterfaceC5785d;
import g4.B;
import g4.C5807c;
import java.util.List;
import java.util.concurrent.Executor;
import y6.AbstractC6987o;

@Keep
/* loaded from: classes2.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a implements g4.h {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32696a = new a();

        @Override // g4.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final I a(g4.e eVar) {
            Object f8 = eVar.f(B.a(InterfaceC5782a.class, Executor.class));
            r.d(f8, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC0730n0.a((Executor) f8);
        }
    }

    public static final class b implements g4.h {

        /* renamed from: a, reason: collision with root package name */
        public static final b f32697a = new b();

        @Override // g4.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final I a(g4.e eVar) {
            Object f8 = eVar.f(B.a(InterfaceC5784c.class, Executor.class));
            r.d(f8, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC0730n0.a((Executor) f8);
        }
    }

    public static final class c implements g4.h {

        /* renamed from: a, reason: collision with root package name */
        public static final c f32698a = new c();

        @Override // g4.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final I a(g4.e eVar) {
            Object f8 = eVar.f(B.a(InterfaceC5783b.class, Executor.class));
            r.d(f8, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC0730n0.a((Executor) f8);
        }
    }

    public static final class d implements g4.h {

        /* renamed from: a, reason: collision with root package name */
        public static final d f32699a = new d();

        @Override // g4.h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final I a(g4.e eVar) {
            Object f8 = eVar.f(B.a(InterfaceC5785d.class, Executor.class));
            r.d(f8, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC0730n0.a((Executor) f8);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C5807c> getComponents() {
        C5807c d8 = C5807c.c(B.a(InterfaceC5782a.class, I.class)).b(g4.r.k(B.a(InterfaceC5782a.class, Executor.class))).f(a.f32696a).d();
        r.d(d8, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C5807c d9 = C5807c.c(B.a(InterfaceC5784c.class, I.class)).b(g4.r.k(B.a(InterfaceC5784c.class, Executor.class))).f(b.f32697a).d();
        r.d(d9, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C5807c d10 = C5807c.c(B.a(InterfaceC5783b.class, I.class)).b(g4.r.k(B.a(InterfaceC5783b.class, Executor.class))).f(c.f32698a).d();
        r.d(d10, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C5807c d11 = C5807c.c(B.a(InterfaceC5785d.class, I.class)).b(g4.r.k(B.a(InterfaceC5785d.class, Executor.class))).f(d.f32699a).d();
        r.d(d11, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return AbstractC6987o.g(d8, d9, d10, d11);
    }
}
