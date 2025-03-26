package w0;

import android.graphics.Typeface;
import java.util.concurrent.Executor;
import w0.j;
import w0.l;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C6863a {

    /* renamed from: a, reason: collision with root package name */
    private final l.c f44183a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f44184b;

    /* renamed from: w0.a$a, reason: collision with other inner class name */
    class RunnableC0343a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ l.c f44185o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Typeface f44186s;

        RunnableC0343a(l.c cVar, Typeface typeface) {
            this.f44185o = cVar;
            this.f44186s = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f44185o.b(this.f44186s);
        }
    }

    /* renamed from: w0.a$b */
    class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ l.c f44188o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f44189s;

        b(l.c cVar, int i8) {
            this.f44188o = cVar;
            this.f44189s = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f44188o.a(this.f44189s);
        }
    }

    C6863a(l.c cVar, Executor executor) {
        this.f44183a = cVar;
        this.f44184b = executor;
    }

    private void a(int i8) {
        this.f44184b.execute(new b(this.f44183a, i8));
    }

    private void c(Typeface typeface) {
        this.f44184b.execute(new RunnableC0343a(this.f44183a, typeface));
    }

    void b(j.e eVar) {
        if (eVar.a()) {
            c(eVar.f44218a);
        } else {
            a(eVar.f44219b);
        }
    }
}
