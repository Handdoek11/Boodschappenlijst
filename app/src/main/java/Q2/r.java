package q2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import h2.C5829c;
import j$.util.Objects;
import j2.AbstractC6060i;
import j2.AbstractC6067p;
import j2.C6059h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import k2.g;
import m2.C6187a;
import m2.C6189c;
import n2.AbstractC6247a;
import r2.AbstractC6669k;
import r2.InterfaceC6661c;
import r2.InterfaceC6662d;
import s2.InterfaceC6723a;
import t2.InterfaceC6791a;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final Context f40977a;

    /* renamed from: b, reason: collision with root package name */
    private final k2.e f40978b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6662d f40979c;

    /* renamed from: d, reason: collision with root package name */
    private final x f40980d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f40981e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC6723a f40982f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC6791a f40983g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC6791a f40984h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC6661c f40985i;

    public r(Context context, k2.e eVar, InterfaceC6662d interfaceC6662d, x xVar, Executor executor, InterfaceC6723a interfaceC6723a, InterfaceC6791a interfaceC6791a, InterfaceC6791a interfaceC6791a2, InterfaceC6661c interfaceC6661c) {
        this.f40977a = context;
        this.f40978b = eVar;
        this.f40979c = interfaceC6662d;
        this.f40980d = xVar;
        this.f40981e = executor;
        this.f40982f = interfaceC6723a;
        this.f40983g = interfaceC6791a;
        this.f40984h = interfaceC6791a2;
        this.f40985i = interfaceC6661c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean l(AbstractC6067p abstractC6067p) {
        return Boolean.valueOf(this.f40979c.a0(abstractC6067p));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Iterable m(AbstractC6067p abstractC6067p) {
        return this.f40979c.r(abstractC6067p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(Iterable iterable, AbstractC6067p abstractC6067p, long j8) {
        this.f40979c.t0(iterable);
        this.f40979c.Z(abstractC6067p, this.f40983g.a() + j8);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object o(Iterable iterable) {
        this.f40979c.q(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p() {
        this.f40985i.e();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f40985i.g(((Integer) r0.getValue()).intValue(), C6189c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object r(AbstractC6067p abstractC6067p, long j8) {
        this.f40979c.Z(abstractC6067p, this.f40983g.a() + j8);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object s(AbstractC6067p abstractC6067p, int i8) {
        this.f40980d.b(abstractC6067p, i8 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(final AbstractC6067p abstractC6067p, final int i8, Runnable runnable) {
        try {
            try {
                InterfaceC6723a interfaceC6723a = this.f40982f;
                final InterfaceC6662d interfaceC6662d = this.f40979c;
                Objects.requireNonNull(interfaceC6662d);
                interfaceC6723a.d(new InterfaceC6723a.InterfaceC0328a() { // from class: q2.i
                    @Override // s2.InterfaceC6723a.InterfaceC0328a
                    public final Object a() {
                        return Integer.valueOf(interfaceC6662d.o());
                    }
                });
                if (k()) {
                    u(abstractC6067p, i8);
                } else {
                    this.f40982f.d(new InterfaceC6723a.InterfaceC0328a() { // from class: q2.j
                        @Override // s2.InterfaceC6723a.InterfaceC0328a
                        public final Object a() {
                            return this.f40958a.s(abstractC6067p, i8);
                        }
                    });
                }
            } catch (SynchronizationException unused) {
                this.f40980d.b(abstractC6067p, i8 + 1);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    public AbstractC6060i j(k2.m mVar) {
        InterfaceC6723a interfaceC6723a = this.f40982f;
        final InterfaceC6661c interfaceC6661c = this.f40985i;
        Objects.requireNonNull(interfaceC6661c);
        return mVar.b(AbstractC6060i.a().i(this.f40983g.a()).o(this.f40984h.a()).n("GDT_CLIENT_METRICS").h(new C6059h(C5829c.b("proto"), ((C6187a) interfaceC6723a.d(new InterfaceC6723a.InterfaceC0328a() { // from class: q2.h
            @Override // s2.InterfaceC6723a.InterfaceC0328a
            public final Object a() {
                return interfaceC6661c.f();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f40977a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public k2.g u(final AbstractC6067p abstractC6067p, int i8) {
        k2.g a8;
        k2.m e8 = this.f40978b.e(abstractC6067p.b());
        long j8 = 0;
        k2.g e9 = k2.g.e(0L);
        while (true) {
            final long j9 = j8;
            while (((Boolean) this.f40982f.d(new InterfaceC6723a.InterfaceC0328a() { // from class: q2.k
                @Override // s2.InterfaceC6723a.InterfaceC0328a
                public final Object a() {
                    return this.f40961a.l(abstractC6067p);
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f40982f.d(new InterfaceC6723a.InterfaceC0328a() { // from class: q2.l
                    @Override // s2.InterfaceC6723a.InterfaceC0328a
                    public final Object a() {
                        return this.f40963a.m(abstractC6067p);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return e9;
                }
                if (e8 == null) {
                    AbstractC6247a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", abstractC6067p);
                    a8 = k2.g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AbstractC6669k) it.next()).b());
                    }
                    if (abstractC6067p.e()) {
                        arrayList.add(j(e8));
                    }
                    a8 = e8.a(k2.f.a().b(arrayList).c(abstractC6067p.c()).a());
                }
                e9 = a8;
                if (e9.c() == g.a.TRANSIENT_ERROR) {
                    this.f40982f.d(new InterfaceC6723a.InterfaceC0328a() { // from class: q2.m
                        @Override // s2.InterfaceC6723a.InterfaceC0328a
                        public final Object a() {
                            return this.f40965a.n(iterable, abstractC6067p, j9);
                        }
                    });
                    this.f40980d.a(abstractC6067p, i8 + 1, true);
                    return e9;
                }
                this.f40982f.d(new InterfaceC6723a.InterfaceC0328a() { // from class: q2.n
                    @Override // s2.InterfaceC6723a.InterfaceC0328a
                    public final Object a() {
                        return this.f40969a.o(iterable);
                    }
                });
                if (e9.c() == g.a.OK) {
                    j8 = Math.max(j9, e9.b());
                    if (abstractC6067p.e()) {
                        this.f40982f.d(new InterfaceC6723a.InterfaceC0328a() { // from class: q2.o
                            @Override // s2.InterfaceC6723a.InterfaceC0328a
                            public final Object a() {
                                return this.f40971a.p();
                            }
                        });
                    }
                } else if (e9.c() == g.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String n8 = ((AbstractC6669k) it2.next()).b().n();
                        if (hashMap.containsKey(n8)) {
                            hashMap.put(n8, Integer.valueOf(((Integer) hashMap.get(n8)).intValue() + 1));
                        } else {
                            hashMap.put(n8, 1);
                        }
                    }
                    this.f40982f.d(new InterfaceC6723a.InterfaceC0328a() { // from class: q2.p
                        @Override // s2.InterfaceC6723a.InterfaceC0328a
                        public final Object a() {
                            return this.f40972a.q(hashMap);
                        }
                    });
                }
            }
            this.f40982f.d(new InterfaceC6723a.InterfaceC0328a() { // from class: q2.q
                @Override // s2.InterfaceC6723a.InterfaceC0328a
                public final Object a() {
                    return this.f40974a.r(abstractC6067p, j9);
                }
            });
            return e9;
        }
    }

    public void v(final AbstractC6067p abstractC6067p, final int i8, final Runnable runnable) {
        this.f40981e.execute(new Runnable() { // from class: q2.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f40952o.t(abstractC6067p, i8, runnable);
            }
        });
    }
}
