package t1;

import B1.n;
import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import o0.AbstractC6278a;
import t1.RunnableC6790k;
import z1.InterfaceC7064a;

/* renamed from: t1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6783d implements InterfaceC6781b, InterfaceC7064a {

    /* renamed from: C, reason: collision with root package name */
    private static final String f43792C = s1.j.f("Processor");

    /* renamed from: s, reason: collision with root package name */
    private Context f43796s;

    /* renamed from: t, reason: collision with root package name */
    private androidx.work.a f43797t;

    /* renamed from: u, reason: collision with root package name */
    private C1.a f43798u;

    /* renamed from: v, reason: collision with root package name */
    private WorkDatabase f43799v;

    /* renamed from: y, reason: collision with root package name */
    private List f43802y;

    /* renamed from: x, reason: collision with root package name */
    private Map f43801x = new HashMap();

    /* renamed from: w, reason: collision with root package name */
    private Map f43800w = new HashMap();

    /* renamed from: z, reason: collision with root package name */
    private Set f43803z = new HashSet();

    /* renamed from: A, reason: collision with root package name */
    private final List f43793A = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    private PowerManager.WakeLock f43795o = null;

    /* renamed from: B, reason: collision with root package name */
    private final Object f43794B = new Object();

    /* renamed from: t1.d$a */
    private static class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private InterfaceC6781b f43804o;

        /* renamed from: s, reason: collision with root package name */
        private String f43805s;

        /* renamed from: t, reason: collision with root package name */
        private com.google.common.util.concurrent.d f43806t;

        a(InterfaceC6781b interfaceC6781b, String str, com.google.common.util.concurrent.d dVar) {
            this.f43804o = interfaceC6781b;
            this.f43805s = str;
            this.f43806t = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z7;
            try {
                z7 = ((Boolean) this.f43806t.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z7 = true;
            }
            this.f43804o.c(this.f43805s, z7);
        }
    }

    public C6783d(Context context, androidx.work.a aVar, C1.a aVar2, WorkDatabase workDatabase, List list) {
        this.f43796s = context;
        this.f43797t = aVar;
        this.f43798u = aVar2;
        this.f43799v = workDatabase;
        this.f43802y = list;
    }

    private static boolean e(String str, RunnableC6790k runnableC6790k) {
        if (runnableC6790k == null) {
            s1.j.c().a(f43792C, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        runnableC6790k.d();
        s1.j.c().a(f43792C, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    private void m() {
        synchronized (this.f43794B) {
            try {
                if (this.f43800w.isEmpty()) {
                    try {
                        this.f43796s.startService(androidx.work.impl.foreground.a.e(this.f43796s));
                    } catch (Throwable th) {
                        s1.j.c().b(f43792C, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f43795o;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f43795o = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // z1.InterfaceC7064a
    public void a(String str) {
        synchronized (this.f43794B) {
            this.f43800w.remove(str);
            m();
        }
    }

    @Override // z1.InterfaceC7064a
    public void b(String str, s1.e eVar) {
        synchronized (this.f43794B) {
            try {
                s1.j.c().d(f43792C, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
                RunnableC6790k runnableC6790k = (RunnableC6790k) this.f43801x.remove(str);
                if (runnableC6790k != null) {
                    if (this.f43795o == null) {
                        PowerManager.WakeLock b8 = n.b(this.f43796s, "ProcessorForegroundLck");
                        this.f43795o = b8;
                        b8.acquire();
                    }
                    this.f43800w.put(str, runnableC6790k);
                    AbstractC6278a.o(this.f43796s, androidx.work.impl.foreground.a.d(this.f43796s, str, eVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t1.InterfaceC6781b
    public void c(String str, boolean z7) {
        synchronized (this.f43794B) {
            try {
                this.f43801x.remove(str);
                s1.j.c().a(f43792C, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z7)), new Throwable[0]);
                Iterator it = this.f43793A.iterator();
                while (it.hasNext()) {
                    ((InterfaceC6781b) it.next()).c(str, z7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(InterfaceC6781b interfaceC6781b) {
        synchronized (this.f43794B) {
            this.f43793A.add(interfaceC6781b);
        }
    }

    public boolean f(String str) {
        boolean contains;
        synchronized (this.f43794B) {
            contains = this.f43803z.contains(str);
        }
        return contains;
    }

    public boolean g(String str) {
        boolean z7;
        synchronized (this.f43794B) {
            try {
                z7 = this.f43801x.containsKey(str) || this.f43800w.containsKey(str);
            } finally {
            }
        }
        return z7;
    }

    public boolean h(String str) {
        boolean containsKey;
        synchronized (this.f43794B) {
            containsKey = this.f43800w.containsKey(str);
        }
        return containsKey;
    }

    public void i(InterfaceC6781b interfaceC6781b) {
        synchronized (this.f43794B) {
            this.f43793A.remove(interfaceC6781b);
        }
    }

    public boolean j(String str) {
        return k(str, null);
    }

    public boolean k(String str, WorkerParameters.a aVar) {
        synchronized (this.f43794B) {
            try {
                if (g(str)) {
                    s1.j.c().a(f43792C, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                    return false;
                }
                RunnableC6790k a8 = new RunnableC6790k.c(this.f43796s, this.f43797t, this.f43798u, this, this.f43799v, str).c(this.f43802y).b(aVar).a();
                com.google.common.util.concurrent.d b8 = a8.b();
                b8.f(new a(this, str, b8), this.f43798u.a());
                this.f43801x.put(str, a8);
                this.f43798u.c().execute(a8);
                s1.j.c().a(f43792C, String.format("%s: processing %s", getClass().getSimpleName(), str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean l(String str) {
        boolean e8;
        synchronized (this.f43794B) {
            try {
                s1.j.c().a(f43792C, String.format("Processor cancelling %s", str), new Throwable[0]);
                this.f43803z.add(str);
                RunnableC6790k runnableC6790k = (RunnableC6790k) this.f43800w.remove(str);
                boolean z7 = runnableC6790k != null;
                if (runnableC6790k == null) {
                    runnableC6790k = (RunnableC6790k) this.f43801x.remove(str);
                }
                e8 = e(str, runnableC6790k);
                if (z7) {
                    m();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return e8;
    }

    public boolean n(String str) {
        boolean e8;
        synchronized (this.f43794B) {
            s1.j.c().a(f43792C, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            e8 = e(str, (RunnableC6790k) this.f43800w.remove(str));
        }
        return e8;
    }

    public boolean o(String str) {
        boolean e8;
        synchronized (this.f43794B) {
            s1.j.c().a(f43792C, String.format("Processor stopping background work %s", str), new Throwable[0]);
            e8 = e(str, (RunnableC6790k) this.f43801x.remove(str));
        }
        return e8;
    }
}
