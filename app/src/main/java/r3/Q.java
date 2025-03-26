package r3;

import android.content.Context;
import h2.C5829c;
import h2.InterfaceC5834h;
import h2.InterfaceC5836j;

/* loaded from: classes.dex */
public final class Q implements F {

    /* renamed from: a, reason: collision with root package name */
    private H4.b f42565a;

    /* renamed from: b, reason: collision with root package name */
    private final H4.b f42566b;

    /* renamed from: c, reason: collision with root package name */
    private final H f42567c;

    public Q(Context context, H h8) {
        this.f42567c = h8;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f13041g;
        j2.u.f(context);
        final InterfaceC5836j g8 = j2.u.c().g(aVar);
        if (aVar.a().contains(C5829c.b("json"))) {
            this.f42565a = new g4.u(new H4.b() { // from class: r3.N
                @Override // H4.b
                public final Object get() {
                    return g8.a("FIREBASE_ML_SDK", byte[].class, C5829c.b("json"), new InterfaceC5834h() { // from class: r3.P
                        @Override // h2.InterfaceC5834h
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f42566b = new g4.u(new H4.b() { // from class: r3.O
            @Override // H4.b
            public final Object get() {
                return g8.a("FIREBASE_ML_SDK", byte[].class, C5829c.b("proto"), new InterfaceC5834h() { // from class: r3.M
                    @Override // h2.InterfaceC5834h
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }
}
