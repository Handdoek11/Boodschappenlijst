package n4;

import J6.AbstractC0650j;
import J6.o;
import J6.r;
import J6.s;
import S6.h;
import android.os.Looper;
import j4.g;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final a f39584e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static boolean f39585f;

    /* renamed from: a, reason: collision with root package name */
    public final e f39586a;

    /* renamed from: b, reason: collision with root package name */
    public final e f39587b;

    /* renamed from: c, reason: collision with root package name */
    public final e f39588c;

    /* renamed from: d, reason: collision with root package name */
    public final e f39589d;

    public static final class a {

        /* renamed from: n4.f$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0295a extends o implements I6.a {
            C0295a(Object obj) {
                super(0, obj, a.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
            }

            @Override // I6.a
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.f3564s).k());
            }
        }

        static final class b extends s implements I6.a {

            /* renamed from: o, reason: collision with root package name */
            public static final b f39590o = new b();

            b() {
                super(0);
            }

            @Override // I6.a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Must be called on a background thread, was called on " + f.f39584e.j() + '.';
            }
        }

        /* synthetic */ class c extends o implements I6.a {
            c(Object obj) {
                super(0, obj, a.class, "isBlockingThread", "isBlockingThread()Z", 0);
            }

            @Override // I6.a
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.f3564s).l());
            }
        }

        static final class d extends s implements I6.a {

            /* renamed from: o, reason: collision with root package name */
            public static final d f39591o = new d();

            d() {
                super(0);
            }

            @Override // I6.a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Must be called on a blocking thread, was called on " + f.f39584e.j() + '.';
            }
        }

        /* synthetic */ class e extends o implements I6.a {
            e(Object obj) {
                super(0, obj, a.class, "isNotMainThread", "isNotMainThread()Z", 0);
            }

            @Override // I6.a
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((a) this.f3564s).m());
            }
        }

        /* renamed from: n4.f$a$f, reason: collision with other inner class name */
        static final class C0296f extends s implements I6.a {

            /* renamed from: o, reason: collision with root package name */
            public static final C0296f f39592o = new C0296f();

            C0296f() {
                super(0);
            }

            @Override // I6.a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "Must not be called on a main thread, was called on " + f.f39584e.j() + '.';
            }
        }

        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private final void h(I6.a aVar, I6.a aVar2) {
            if (((Boolean) aVar.invoke()).booleanValue()) {
                return;
            }
            g.f().b((String) aVar2.invoke());
            i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String j() {
            return Thread.currentThread().getName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k() {
            String j8 = j();
            r.d(j8, "threadName");
            return h.G(j8, "Firebase Background Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean l() {
            String j8 = j();
            r.d(j8, "threadName");
            return h.G(j8, "Firebase Blocking Thread #", false, 2, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean m() {
            return !Looper.getMainLooper().isCurrentThread();
        }

        public final void e() {
            h(new C0295a(this), b.f39590o);
        }

        public final void f() {
            h(new c(this), d.f39591o);
        }

        public final void g() {
            h(new e(this), C0296f.f39592o);
        }

        public final boolean i() {
            return f.f39585f;
        }

        public final void n(boolean z7) {
            f.f39585f = z7;
        }

        private a() {
        }
    }

    public f(ExecutorService executorService, ExecutorService executorService2) {
        r.e(executorService, "backgroundExecutorService");
        r.e(executorService2, "blockingExecutorService");
        this.f39586a = new e(executorService);
        this.f39587b = new e(executorService);
        this.f39588c = new e(executorService);
        this.f39589d = new e(executorService2);
    }

    public static final void c() {
        f39584e.e();
    }

    public static final void d() {
        f39584e.f();
    }

    public static final void e() {
        f39584e.g();
    }

    public static final void f(boolean z7) {
        f39584e.n(z7);
    }
}
