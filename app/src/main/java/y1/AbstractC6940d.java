package y1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import s1.j;
import w1.InterfaceC6865a;

/* renamed from: y1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6940d {

    /* renamed from: f, reason: collision with root package name */
    private static final String f44535f = j.f("ConstraintTracker");

    /* renamed from: a, reason: collision with root package name */
    protected final C1.a f44536a;

    /* renamed from: b, reason: collision with root package name */
    protected final Context f44537b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f44538c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final Set f44539d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    Object f44540e;

    /* renamed from: y1.d$a */
    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ List f44541o;

        a(List list) {
            this.f44541o = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f44541o.iterator();
            while (it.hasNext()) {
                ((InterfaceC6865a) it.next()).a(AbstractC6940d.this.f44540e);
            }
        }
    }

    AbstractC6940d(Context context, C1.a aVar) {
        this.f44537b = context.getApplicationContext();
        this.f44536a = aVar;
    }

    public void a(InterfaceC6865a interfaceC6865a) {
        synchronized (this.f44538c) {
            try {
                if (this.f44539d.add(interfaceC6865a)) {
                    if (this.f44539d.size() == 1) {
                        this.f44540e = b();
                        j.c().a(f44535f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f44540e), new Throwable[0]);
                        e();
                    }
                    interfaceC6865a.a(this.f44540e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract Object b();

    public void c(InterfaceC6865a interfaceC6865a) {
        synchronized (this.f44538c) {
            try {
                if (this.f44539d.remove(interfaceC6865a) && this.f44539d.isEmpty()) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Object obj) {
        synchronized (this.f44538c) {
            try {
                Object obj2 = this.f44540e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f44540e = obj;
                    this.f44536a.a().execute(new a(new ArrayList(this.f44539d)));
                }
            } finally {
            }
        }
    }

    public abstract void e();

    public abstract void f();
}
