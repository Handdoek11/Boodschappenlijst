package o4;

import java.io.File;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    private static final b f39831c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final s4.g f39832a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC6290c f39833b;

    public e(s4.g gVar) {
        this.f39832a = gVar;
        this.f39833b = f39831c;
    }

    private File d(String str) {
        return this.f39832a.q(str, "userlog");
    }

    public void a() {
        this.f39833b.d();
    }

    public byte[] b() {
        return this.f39833b.c();
    }

    public String c() {
        return this.f39833b.b();
    }

    public final void e(String str) {
        this.f39833b.a();
        this.f39833b = f39831c;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    void f(File file, int i8) {
        this.f39833b = new h(file, i8);
    }

    public void g(long j8, String str) {
        this.f39833b.e(j8, str);
    }

    public e(s4.g gVar, String str) {
        this(gVar);
        e(str);
    }

    private static final class b implements InterfaceC6290c {
        private b() {
        }

        @Override // o4.InterfaceC6290c
        public String b() {
            return null;
        }

        @Override // o4.InterfaceC6290c
        public byte[] c() {
            return null;
        }

        @Override // o4.InterfaceC6290c
        public void a() {
        }

        @Override // o4.InterfaceC6290c
        public void d() {
        }

        @Override // o4.InterfaceC6290c
        public void e(long j8, String str) {
        }
    }
}
