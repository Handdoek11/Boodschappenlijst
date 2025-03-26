package androidx.concurrent.futures;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class c {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        Object f8296a;

        /* renamed from: b, reason: collision with root package name */
        d f8297b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.concurrent.futures.d f8298c = androidx.concurrent.futures.d.z();

        /* renamed from: d, reason: collision with root package name */
        private boolean f8299d;

        a() {
        }

        private void d() {
            this.f8296a = null;
            this.f8297b = null;
            this.f8298c = null;
        }

        void a() {
            this.f8296a = null;
            this.f8297b = null;
            this.f8298c.v(null);
        }

        public boolean b(Object obj) {
            this.f8299d = true;
            d dVar = this.f8297b;
            boolean z7 = dVar != null && dVar.b(obj);
            if (z7) {
                d();
            }
            return z7;
        }

        public boolean c() {
            this.f8299d = true;
            d dVar = this.f8297b;
            boolean z7 = dVar != null && dVar.a(true);
            if (z7) {
                d();
            }
            return z7;
        }

        public boolean e(Throwable th) {
            this.f8299d = true;
            d dVar = this.f8297b;
            boolean z7 = dVar != null && dVar.c(th);
            if (z7) {
                d();
            }
            return z7;
        }

        protected void finalize() {
            androidx.concurrent.futures.d dVar;
            d dVar2 = this.f8297b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f8296a));
            }
            if (this.f8299d || (dVar = this.f8298c) == null) {
                return;
            }
            dVar.v(null);
        }
    }

    static final class b extends Throwable {
        b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: androidx.concurrent.futures.c$c, reason: collision with other inner class name */
    public interface InterfaceC0149c {
        Object a(a aVar);
    }

    private static final class d implements com.google.common.util.concurrent.d {

        /* renamed from: o, reason: collision with root package name */
        final WeakReference f8300o;

        /* renamed from: s, reason: collision with root package name */
        private final androidx.concurrent.futures.a f8301s = new a();

        class a extends androidx.concurrent.futures.a {
            a() {
            }

            @Override // androidx.concurrent.futures.a
            protected String s() {
                a aVar = (a) d.this.f8300o.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f8296a + "]";
            }
        }

        d(a aVar) {
            this.f8300o = new WeakReference(aVar);
        }

        boolean a(boolean z7) {
            return this.f8301s.cancel(z7);
        }

        boolean b(Object obj) {
            return this.f8301s.v(obj);
        }

        boolean c(Throwable th) {
            return this.f8301s.w(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z7) {
            a aVar = (a) this.f8300o.get();
            boolean cancel = this.f8301s.cancel(z7);
            if (cancel && aVar != null) {
                aVar.a();
            }
            return cancel;
        }

        @Override // com.google.common.util.concurrent.d
        public void f(Runnable runnable, Executor executor) {
            this.f8301s.f(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f8301s.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f8301s.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f8301s.isDone();
        }

        public String toString() {
            return this.f8301s.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j8, TimeUnit timeUnit) {
            return this.f8301s.get(j8, timeUnit);
        }
    }

    public static com.google.common.util.concurrent.d a(InterfaceC0149c interfaceC0149c) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.f8297b = dVar;
        aVar.f8296a = interfaceC0149c.getClass();
        try {
            Object a8 = interfaceC0149c.a(aVar);
            if (a8 != null) {
                aVar.f8296a = a8;
            }
        } catch (Exception e8) {
            dVar.c(e8);
        }
        return dVar;
    }
}
