package g4;

import androidx.appcompat.app.E;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
class t implements E4.d, E4.c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f36074a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Queue f36075b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f36076c;

    t(Executor executor) {
        this.f36076c = executor;
    }

    private synchronized Set e(E4.a aVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(Map.Entry entry, E4.a aVar) {
        ((E4.b) entry.getKey()).a(aVar);
    }

    @Override // E4.d
    public void a(Class cls, E4.b bVar) {
        b(cls, this.f36076c, bVar);
    }

    @Override // E4.d
    public synchronized void b(Class cls, Executor executor, E4.b bVar) {
        try {
            AbstractC5804A.b(cls);
            AbstractC5804A.b(bVar);
            AbstractC5804A.b(executor);
            if (!this.f36074a.containsKey(cls)) {
                this.f36074a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f36074a.get(cls)).put(bVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    void d() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f36075b;
                if (queue != null) {
                    this.f36075b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                E.a(it.next());
                g(null);
            }
        }
    }

    public void g(final E4.a aVar) {
        AbstractC5804A.b(aVar);
        synchronized (this) {
            try {
                Queue queue = this.f36075b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (final Map.Entry entry : e(aVar)) {
                    ((Executor) entry.getValue()).execute(new Runnable(entry, aVar) { // from class: g4.s

                        /* renamed from: o, reason: collision with root package name */
                        public final /* synthetic */ Map.Entry f36073o;

                        @Override // java.lang.Runnable
                        public final void run() {
                            t.f(this.f36073o, null);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
