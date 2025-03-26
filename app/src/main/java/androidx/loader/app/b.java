package androidx.loader.app;

import androidx.appcompat.app.E;
import androidx.lifecycle.G;
import androidx.lifecycle.H;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC0927m;
import androidx.lifecycle.K;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import q.C6408l;

/* loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0927m f10353a;

    /* renamed from: b, reason: collision with root package name */
    private final a f10354b;

    static class a extends G {

        /* renamed from: f, reason: collision with root package name */
        private static final H.b f10355f = new C0173a();

        /* renamed from: d, reason: collision with root package name */
        private C6408l f10356d = new C6408l();

        /* renamed from: e, reason: collision with root package name */
        private boolean f10357e = false;

        /* renamed from: androidx.loader.app.b$a$a, reason: collision with other inner class name */
        static class C0173a implements H.b {
            C0173a() {
            }

            @Override // androidx.lifecycle.H.b
            public G a(Class cls) {
                return new a();
            }

            @Override // androidx.lifecycle.H.b
            public /* synthetic */ G b(Class cls, T0.a aVar) {
                return I.b(this, cls, aVar);
            }
        }

        a() {
        }

        static a g(K k8) {
            return (a) new H(k8, f10355f).a(a.class);
        }

        @Override // androidx.lifecycle.G
        protected void d() {
            super.d();
            if (this.f10356d.q() <= 0) {
                this.f10356d.c();
            } else {
                E.a(this.f10356d.r(0));
                throw null;
            }
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f10356d.q() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                if (this.f10356d.q() <= 0) {
                    return;
                }
                E.a(this.f10356d.r(0));
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f10356d.m(0));
                printWriter.print(": ");
                throw null;
            }
        }

        void h() {
            if (this.f10356d.q() <= 0) {
                return;
            }
            E.a(this.f10356d.r(0));
            throw null;
        }
    }

    b(InterfaceC0927m interfaceC0927m, K k8) {
        this.f10353a = interfaceC0927m;
        this.f10354b = a.g(k8);
    }

    @Override // androidx.loader.app.a
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f10354b.f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public void c() {
        this.f10354b.h();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        y0.b.a(this.f10353a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
