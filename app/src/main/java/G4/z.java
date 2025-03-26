package g4;

import H4.a;

/* loaded from: classes2.dex */
class z implements H4.b, H4.a {

    /* renamed from: c, reason: collision with root package name */
    private static final a.InterfaceC0048a f36084c = new a.InterfaceC0048a() { // from class: g4.w
        @Override // H4.a.InterfaceC0048a
        public final void a(H4.b bVar) {
            z.f(bVar);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final H4.b f36085d = new H4.b() { // from class: g4.x
        @Override // H4.b
        public final Object get() {
            return z.g();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private a.InterfaceC0048a f36086a;

    /* renamed from: b, reason: collision with root package name */
    private volatile H4.b f36087b;

    private z(a.InterfaceC0048a interfaceC0048a, H4.b bVar) {
        this.f36086a = interfaceC0048a;
        this.f36087b = bVar;
    }

    static z e() {
        return new z(f36084c, f36085d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(a.InterfaceC0048a interfaceC0048a, a.InterfaceC0048a interfaceC0048a2, H4.b bVar) {
        interfaceC0048a.a(bVar);
        interfaceC0048a2.a(bVar);
    }

    static z i(H4.b bVar) {
        return new z(null, bVar);
    }

    @Override // H4.a
    public void a(final a.InterfaceC0048a interfaceC0048a) {
        H4.b bVar;
        H4.b bVar2;
        H4.b bVar3 = this.f36087b;
        H4.b bVar4 = f36085d;
        if (bVar3 != bVar4) {
            interfaceC0048a.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f36087b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                final a.InterfaceC0048a interfaceC0048a2 = this.f36086a;
                this.f36086a = new a.InterfaceC0048a() { // from class: g4.y
                    @Override // H4.a.InterfaceC0048a
                    public final void a(H4.b bVar5) {
                        z.h(interfaceC0048a2, interfaceC0048a, bVar5);
                    }
                };
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC0048a.a(bVar);
        }
    }

    @Override // H4.b
    public Object get() {
        return this.f36087b.get();
    }

    void j(H4.b bVar) {
        a.InterfaceC0048a interfaceC0048a;
        if (this.f36087b != f36085d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC0048a = this.f36086a;
            this.f36086a = null;
            this.f36087b = bVar;
        }
        interfaceC0048a.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(H4.b bVar) {
    }
}
