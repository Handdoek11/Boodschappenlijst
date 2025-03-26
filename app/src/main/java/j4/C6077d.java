package j4;

import H4.a;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import p4.AbstractC6384F;
import p4.AbstractC6385G;

/* renamed from: j4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6077d implements InterfaceC6074a {

    /* renamed from: c, reason: collision with root package name */
    private static final h f38237c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final H4.a f38238a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f38239b = new AtomicReference(null);

    /* renamed from: j4.d$b */
    private static final class b implements h {
        private b() {
        }

        @Override // j4.h
        public File a() {
            return null;
        }

        @Override // j4.h
        public File b() {
            return null;
        }

        @Override // j4.h
        public File c() {
            return null;
        }

        @Override // j4.h
        public AbstractC6384F.a d() {
            return null;
        }

        @Override // j4.h
        public File e() {
            return null;
        }

        @Override // j4.h
        public File f() {
            return null;
        }

        @Override // j4.h
        public File g() {
            return null;
        }
    }

    public C6077d(H4.a aVar) {
        this.f38238a = aVar;
        aVar.a(new a.InterfaceC0048a() { // from class: j4.b
            @Override // H4.a.InterfaceC0048a
            public final void a(H4.b bVar) {
                this.f38232a.g(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(H4.b bVar) {
        g.f().b("Crashlytics native component now available.");
        this.f38239b.set((InterfaceC6074a) bVar.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(String str, String str2, long j8, AbstractC6385G abstractC6385G, H4.b bVar) {
        ((InterfaceC6074a) bVar.get()).b(str, str2, j8, abstractC6385G);
    }

    @Override // j4.InterfaceC6074a
    public h a(String str) {
        InterfaceC6074a interfaceC6074a = (InterfaceC6074a) this.f38239b.get();
        return interfaceC6074a == null ? f38237c : interfaceC6074a.a(str);
    }

    @Override // j4.InterfaceC6074a
    public void b(final String str, final String str2, final long j8, final AbstractC6385G abstractC6385G) {
        g.f().i("Deferring native open session: " + str);
        this.f38238a.a(new a.InterfaceC0048a() { // from class: j4.c
            @Override // H4.a.InterfaceC0048a
            public final void a(H4.b bVar) {
                C6077d.h(str, str2, j8, abstractC6385G, bVar);
            }
        });
    }

    @Override // j4.InterfaceC6074a
    public boolean c() {
        InterfaceC6074a interfaceC6074a = (InterfaceC6074a) this.f38239b.get();
        return interfaceC6074a != null && interfaceC6074a.c();
    }

    @Override // j4.InterfaceC6074a
    public boolean d(String str) {
        InterfaceC6074a interfaceC6074a = (InterfaceC6074a) this.f38239b.get();
        return interfaceC6074a != null && interfaceC6074a.d(str);
    }
}
