package q3;

import android.content.Context;
import h2.AbstractC5830d;
import h2.C5829c;
import h2.InterfaceC5834h;
import h2.InterfaceC5835i;
import h2.InterfaceC5836j;

/* renamed from: q3.w6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6609w6 implements InterfaceC6482g6 {

    /* renamed from: a, reason: collision with root package name */
    private H4.b f42325a;

    /* renamed from: b, reason: collision with root package name */
    private final H4.b f42326b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC6498i6 f42327c;

    public C6609w6(Context context, AbstractC6498i6 abstractC6498i6) {
        this.f42327c = abstractC6498i6;
        com.google.android.datatransport.cct.a aVar = com.google.android.datatransport.cct.a.f13041g;
        j2.u.f(context);
        final InterfaceC5836j g8 = j2.u.c().g(aVar);
        if (aVar.a().contains(C5829c.b("json"))) {
            this.f42325a = new g4.u(new H4.b() { // from class: q3.t6
                @Override // H4.b
                public final Object get() {
                    return g8.a("FIREBASE_ML_SDK", byte[].class, C5829c.b("json"), new InterfaceC5834h() { // from class: q3.v6
                        @Override // h2.InterfaceC5834h
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.f42326b = new g4.u(new H4.b() { // from class: q3.u6
            @Override // H4.b
            public final Object get() {
                return g8.a("FIREBASE_ML_SDK", byte[].class, C5829c.b("proto"), new InterfaceC5834h() { // from class: q3.s6
                    @Override // h2.InterfaceC5834h
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    static AbstractC5830d b(AbstractC6498i6 abstractC6498i6, InterfaceC6474f6 interfaceC6474f6) {
        return AbstractC5830d.h(interfaceC6474f6.d(abstractC6498i6.a(), false));
    }

    @Override // q3.InterfaceC6482g6
    public final void a(InterfaceC6474f6 interfaceC6474f6) {
        if (this.f42327c.a() != 0) {
            ((InterfaceC5835i) this.f42326b.get()).a(b(this.f42327c, interfaceC6474f6));
            return;
        }
        H4.b bVar = this.f42325a;
        if (bVar != null) {
            ((InterfaceC5835i) bVar.get()).a(b(this.f42327c, interfaceC6474f6));
        }
    }
}
