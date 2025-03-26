package k6;

import a6.AbstractC0825b;
import a6.AbstractC0829f;
import a6.i;
import d6.InterfaceC5732b;

/* renamed from: k6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6111b extends AbstractC0825b {

    /* renamed from: s, reason: collision with root package name */
    private final AbstractC0829f f38532s;

    public C6111b(AbstractC0829f abstractC0829f) {
        this.f38532s = abstractC0829f;
    }

    @Override // a6.AbstractC0825b
    protected void j(p7.a aVar) {
        this.f38532s.c(new a(aVar));
    }

    /* renamed from: k6.b$a */
    static final class a implements i, p7.b {

        /* renamed from: o, reason: collision with root package name */
        final p7.a f38533o;

        /* renamed from: s, reason: collision with root package name */
        InterfaceC5732b f38534s;

        a(p7.a aVar) {
            this.f38533o = aVar;
        }

        @Override // a6.i
        public void a() {
            this.f38533o.a();
        }

        @Override // a6.i
        public void b(Object obj) {
            this.f38533o.b(obj);
        }

        @Override // p7.b
        public void cancel() {
            this.f38534s.c();
        }

        @Override // a6.i
        public void d(InterfaceC5732b interfaceC5732b) {
            this.f38534s = interfaceC5732b;
            this.f38533o.d(this);
        }

        @Override // a6.i
        public void onError(Throwable th) {
            this.f38533o.onError(th);
        }

        @Override // p7.b
        public void h(long j8) {
        }
    }
}
