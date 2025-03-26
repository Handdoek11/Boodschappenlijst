package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.engine.i;
import d2.AbstractC5705g;
import e2.AbstractC5742a;
import e2.AbstractC5743b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class h implements f.a, Runnable, Comparable, AbstractC5742a.f {

    /* renamed from: A, reason: collision with root package name */
    private com.bumptech.glide.g f12697A;

    /* renamed from: B, reason: collision with root package name */
    private m f12698B;

    /* renamed from: C, reason: collision with root package name */
    private int f12699C;

    /* renamed from: D, reason: collision with root package name */
    private int f12700D;

    /* renamed from: E, reason: collision with root package name */
    private L1.a f12701E;

    /* renamed from: F, reason: collision with root package name */
    private J1.h f12702F;

    /* renamed from: G, reason: collision with root package name */
    private b f12703G;

    /* renamed from: H, reason: collision with root package name */
    private int f12704H;

    /* renamed from: I, reason: collision with root package name */
    private EnumC0220h f12705I;

    /* renamed from: J, reason: collision with root package name */
    private g f12706J;

    /* renamed from: K, reason: collision with root package name */
    private long f12707K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f12708L;

    /* renamed from: M, reason: collision with root package name */
    private Object f12709M;

    /* renamed from: N, reason: collision with root package name */
    private Thread f12710N;

    /* renamed from: O, reason: collision with root package name */
    private J1.e f12711O;

    /* renamed from: P, reason: collision with root package name */
    private J1.e f12712P;

    /* renamed from: Q, reason: collision with root package name */
    private Object f12713Q;

    /* renamed from: R, reason: collision with root package name */
    private J1.a f12714R;

    /* renamed from: S, reason: collision with root package name */
    private com.bumptech.glide.load.data.d f12715S;

    /* renamed from: T, reason: collision with root package name */
    private volatile com.bumptech.glide.load.engine.f f12716T;

    /* renamed from: U, reason: collision with root package name */
    private volatile boolean f12717U;

    /* renamed from: V, reason: collision with root package name */
    private volatile boolean f12718V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f12719W;

    /* renamed from: u, reason: collision with root package name */
    private final e f12723u;

    /* renamed from: v, reason: collision with root package name */
    private final y0.f f12724v;

    /* renamed from: y, reason: collision with root package name */
    private com.bumptech.glide.d f12727y;

    /* renamed from: z, reason: collision with root package name */
    private J1.e f12728z;

    /* renamed from: o, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.g f12720o = new com.bumptech.glide.load.engine.g();

    /* renamed from: s, reason: collision with root package name */
    private final List f12721s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    private final e2.c f12722t = e2.c.a();

    /* renamed from: w, reason: collision with root package name */
    private final d f12725w = new d();

    /* renamed from: x, reason: collision with root package name */
    private final f f12726x = new f();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12729a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f12730b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f12731c;

        static {
            int[] iArr = new int[J1.c.values().length];
            f12731c = iArr;
            try {
                iArr[J1.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12731c[J1.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0220h.values().length];
            f12730b = iArr2;
            try {
                iArr2[EnumC0220h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12730b[EnumC0220h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12730b[EnumC0220h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12730b[EnumC0220h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12730b[EnumC0220h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f12729a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12729a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12729a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    interface b {
        void a(GlideException glideException);

        void b(h hVar);

        void c(L1.c cVar, J1.a aVar, boolean z7);
    }

    private final class c implements i.a {

        /* renamed from: a, reason: collision with root package name */
        private final J1.a f12732a;

        c(J1.a aVar) {
            this.f12732a = aVar;
        }

        @Override // com.bumptech.glide.load.engine.i.a
        public L1.c a(L1.c cVar) {
            return h.this.B(this.f12732a, cVar);
        }
    }

    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private J1.e f12734a;

        /* renamed from: b, reason: collision with root package name */
        private J1.k f12735b;

        /* renamed from: c, reason: collision with root package name */
        private r f12736c;

        d() {
        }

        void a() {
            this.f12734a = null;
            this.f12735b = null;
            this.f12736c = null;
        }

        void b(e eVar, J1.h hVar) {
            AbstractC5743b.a("DecodeJob.encode");
            try {
                eVar.a().b(this.f12734a, new com.bumptech.glide.load.engine.e(this.f12735b, this.f12736c, hVar));
            } finally {
                this.f12736c.g();
                AbstractC5743b.e();
            }
        }

        boolean c() {
            return this.f12736c != null;
        }

        void d(J1.e eVar, J1.k kVar, r rVar) {
            this.f12734a = eVar;
            this.f12735b = kVar;
            this.f12736c = rVar;
        }
    }

    interface e {
        N1.a a();
    }

    private static class f {

        /* renamed from: a, reason: collision with root package name */
        private boolean f12737a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f12738b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f12739c;

        f() {
        }

        private boolean a(boolean z7) {
            return (this.f12739c || z7 || this.f12738b) && this.f12737a;
        }

        synchronized boolean b() {
            this.f12738b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.f12739c = true;
            return a(false);
        }

        synchronized boolean d(boolean z7) {
            this.f12737a = true;
            return a(z7);
        }

        synchronized void e() {
            this.f12738b = false;
            this.f12737a = false;
            this.f12739c = false;
        }
    }

    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: com.bumptech.glide.load.engine.h$h, reason: collision with other inner class name */
    private enum EnumC0220h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    h(e eVar, y0.f fVar) {
        this.f12723u = eVar;
        this.f12724v = fVar;
    }

    private void A() {
        if (this.f12726x.c()) {
            D();
        }
    }

    private void D() {
        this.f12726x.e();
        this.f12725w.a();
        this.f12720o.a();
        this.f12717U = false;
        this.f12727y = null;
        this.f12728z = null;
        this.f12702F = null;
        this.f12697A = null;
        this.f12698B = null;
        this.f12703G = null;
        this.f12705I = null;
        this.f12716T = null;
        this.f12710N = null;
        this.f12711O = null;
        this.f12713Q = null;
        this.f12714R = null;
        this.f12715S = null;
        this.f12707K = 0L;
        this.f12718V = false;
        this.f12709M = null;
        this.f12721s.clear();
        this.f12724v.a(this);
    }

    private void E(g gVar) {
        this.f12706J = gVar;
        this.f12703G.b(this);
    }

    private void F() {
        this.f12710N = Thread.currentThread();
        this.f12707K = AbstractC5705g.b();
        boolean z7 = false;
        while (!this.f12718V && this.f12716T != null && !(z7 = this.f12716T.a())) {
            this.f12705I = q(this.f12705I);
            this.f12716T = p();
            if (this.f12705I == EnumC0220h.SOURCE) {
                E(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f12705I == EnumC0220h.FINISHED || this.f12718V) && !z7) {
            y();
        }
    }

    private L1.c G(Object obj, J1.a aVar, q qVar) {
        J1.h r8 = r(aVar);
        com.bumptech.glide.load.data.e l8 = this.f12727y.i().l(obj);
        try {
            return qVar.a(l8, r8, this.f12699C, this.f12700D, new c(aVar));
        } finally {
            l8.b();
        }
    }

    private void H() {
        int i8 = a.f12729a[this.f12706J.ordinal()];
        if (i8 == 1) {
            this.f12705I = q(EnumC0220h.INITIALIZE);
            this.f12716T = p();
            F();
        } else if (i8 == 2) {
            F();
        } else {
            if (i8 == 3) {
                m();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f12706J);
        }
    }

    private void I() {
        Throwable th;
        this.f12722t.c();
        if (!this.f12717U) {
            this.f12717U = true;
            return;
        }
        if (this.f12721s.isEmpty()) {
            th = null;
        } else {
            List list = this.f12721s;
            th = (Throwable) list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    private L1.c k(com.bumptech.glide.load.data.d dVar, Object obj, J1.a aVar) {
        if (obj == null) {
            dVar.b();
            return null;
        }
        try {
            long b8 = AbstractC5705g.b();
            L1.c l8 = l(obj, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                u("Decoded result " + l8, b8);
            }
            return l8;
        } finally {
            dVar.b();
        }
    }

    private L1.c l(Object obj, J1.a aVar) {
        return G(obj, aVar, this.f12720o.h(obj.getClass()));
    }

    private void m() {
        L1.c cVar;
        if (Log.isLoggable("DecodeJob", 2)) {
            v("Retrieved data", this.f12707K, "data: " + this.f12713Q + ", cache key: " + this.f12711O + ", fetcher: " + this.f12715S);
        }
        try {
            cVar = k(this.f12715S, this.f12713Q, this.f12714R);
        } catch (GlideException e8) {
            e8.i(this.f12712P, this.f12714R);
            this.f12721s.add(e8);
            cVar = null;
        }
        if (cVar != null) {
            x(cVar, this.f12714R, this.f12719W);
        } else {
            F();
        }
    }

    private com.bumptech.glide.load.engine.f p() {
        int i8 = a.f12730b[this.f12705I.ordinal()];
        if (i8 == 1) {
            return new s(this.f12720o, this);
        }
        if (i8 == 2) {
            return new com.bumptech.glide.load.engine.c(this.f12720o, this);
        }
        if (i8 == 3) {
            return new v(this.f12720o, this);
        }
        if (i8 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f12705I);
    }

    private EnumC0220h q(EnumC0220h enumC0220h) {
        int i8 = a.f12730b[enumC0220h.ordinal()];
        if (i8 == 1) {
            return this.f12701E.a() ? EnumC0220h.DATA_CACHE : q(EnumC0220h.DATA_CACHE);
        }
        if (i8 == 2) {
            return this.f12708L ? EnumC0220h.FINISHED : EnumC0220h.SOURCE;
        }
        if (i8 == 3 || i8 == 4) {
            return EnumC0220h.FINISHED;
        }
        if (i8 == 5) {
            return this.f12701E.b() ? EnumC0220h.RESOURCE_CACHE : q(EnumC0220h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC0220h);
    }

    private J1.h r(J1.a aVar) {
        J1.h hVar = this.f12702F;
        if (Build.VERSION.SDK_INT < 26) {
            return hVar;
        }
        boolean z7 = aVar == J1.a.RESOURCE_DISK_CACHE || this.f12720o.x();
        J1.g gVar = com.bumptech.glide.load.resource.bitmap.t.f12943j;
        Boolean bool = (Boolean) hVar.c(gVar);
        if (bool != null && (!bool.booleanValue() || z7)) {
            return hVar;
        }
        J1.h hVar2 = new J1.h();
        hVar2.d(this.f12702F);
        hVar2.e(gVar, Boolean.valueOf(z7));
        return hVar2;
    }

    private int s() {
        return this.f12697A.ordinal();
    }

    private void u(String str, long j8) {
        v(str, j8, null);
    }

    private void v(String str, long j8, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(AbstractC5705g.a(j8));
        sb.append(", load key: ");
        sb.append(this.f12698B);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    private void w(L1.c cVar, J1.a aVar, boolean z7) {
        I();
        this.f12703G.c(cVar, aVar, z7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void x(L1.c cVar, J1.a aVar, boolean z7) {
        r rVar;
        AbstractC5743b.a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (cVar instanceof L1.b) {
                ((L1.b) cVar).a();
            }
            if (this.f12725w.c()) {
                cVar = r.e(cVar);
                rVar = cVar;
            } else {
                rVar = 0;
            }
            w(cVar, aVar, z7);
            this.f12705I = EnumC0220h.ENCODE;
            try {
                if (this.f12725w.c()) {
                    this.f12725w.b(this.f12723u, this.f12702F);
                }
                z();
                AbstractC5743b.e();
            } finally {
                if (rVar != 0) {
                    rVar.g();
                }
            }
        } catch (Throwable th) {
            AbstractC5743b.e();
            throw th;
        }
    }

    private void y() {
        I();
        this.f12703G.a(new GlideException("Failed to load resource", new ArrayList(this.f12721s)));
        A();
    }

    private void z() {
        if (this.f12726x.b()) {
            D();
        }
    }

    L1.c B(J1.a aVar, L1.c cVar) {
        L1.c cVar2;
        J1.l lVar;
        J1.c cVar3;
        J1.e dVar;
        Class<?> cls = cVar.get().getClass();
        J1.k kVar = null;
        if (aVar != J1.a.RESOURCE_DISK_CACHE) {
            J1.l s8 = this.f12720o.s(cls);
            lVar = s8;
            cVar2 = s8.a(this.f12727y, cVar, this.f12699C, this.f12700D);
        } else {
            cVar2 = cVar;
            lVar = null;
        }
        if (!cVar.equals(cVar2)) {
            cVar.b();
        }
        if (this.f12720o.w(cVar2)) {
            kVar = this.f12720o.n(cVar2);
            cVar3 = kVar.b(this.f12702F);
        } else {
            cVar3 = J1.c.NONE;
        }
        J1.k kVar2 = kVar;
        if (!this.f12701E.d(!this.f12720o.y(this.f12711O), aVar, cVar3)) {
            return cVar2;
        }
        if (kVar2 == null) {
            throw new Registry.NoResultEncoderAvailableException(cVar2.get().getClass());
        }
        int i8 = a.f12731c[cVar3.ordinal()];
        if (i8 == 1) {
            dVar = new com.bumptech.glide.load.engine.d(this.f12711O, this.f12728z);
        } else {
            if (i8 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + cVar3);
            }
            dVar = new t(this.f12720o.b(), this.f12711O, this.f12728z, this.f12699C, this.f12700D, lVar, cls, this.f12702F);
        }
        r e8 = r.e(cVar2);
        this.f12725w.d(dVar, kVar2, e8);
        return e8;
    }

    void C(boolean z7) {
        if (this.f12726x.d(z7)) {
            D();
        }
    }

    boolean J() {
        EnumC0220h q8 = q(EnumC0220h.INITIALIZE);
        return q8 == EnumC0220h.RESOURCE_CACHE || q8 == EnumC0220h.DATA_CACHE;
    }

    public void a() {
        this.f12718V = true;
        com.bumptech.glide.load.engine.f fVar = this.f12716T;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void c(J1.e eVar, Object obj, com.bumptech.glide.load.data.d dVar, J1.a aVar, J1.e eVar2) {
        this.f12711O = eVar;
        this.f12713Q = obj;
        this.f12715S = dVar;
        this.f12714R = aVar;
        this.f12712P = eVar2;
        this.f12719W = eVar != this.f12720o.c().get(0);
        if (Thread.currentThread() != this.f12710N) {
            E(g.DECODE_DATA);
            return;
        }
        AbstractC5743b.a("DecodeJob.decodeFromRetrievedData");
        try {
            m();
        } finally {
            AbstractC5743b.e();
        }
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void f(J1.e eVar, Exception exc, com.bumptech.glide.load.data.d dVar, J1.a aVar) {
        dVar.b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.j(eVar, aVar, dVar.a());
        this.f12721s.add(glideException);
        if (Thread.currentThread() != this.f12710N) {
            E(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            F();
        }
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void g() {
        E(g.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // e2.AbstractC5742a.f
    public e2.c h() {
        return this.f12722t;
    }

    @Override // java.lang.Comparable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compareTo(h hVar) {
        int s8 = s() - hVar.s();
        return s8 == 0 ? this.f12704H - hVar.f12704H : s8;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC5743b.c("DecodeJob#run(reason=%s, model=%s)", this.f12706J, this.f12709M);
        com.bumptech.glide.load.data.d dVar = this.f12715S;
        try {
            try {
                if (this.f12718V) {
                    y();
                    if (dVar != null) {
                        dVar.b();
                    }
                    AbstractC5743b.e();
                    return;
                }
                H();
                if (dVar != null) {
                    dVar.b();
                }
                AbstractC5743b.e();
            } catch (com.bumptech.glide.load.engine.b e8) {
                throw e8;
            } catch (Throwable th) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f12718V + ", stage: " + this.f12705I, th);
                }
                if (this.f12705I != EnumC0220h.ENCODE) {
                    this.f12721s.add(th);
                    y();
                }
                if (!this.f12718V) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (dVar != null) {
                dVar.b();
            }
            AbstractC5743b.e();
            throw th2;
        }
    }

    h t(com.bumptech.glide.d dVar, Object obj, m mVar, J1.e eVar, int i8, int i9, Class cls, Class cls2, com.bumptech.glide.g gVar, L1.a aVar, Map map, boolean z7, boolean z8, boolean z9, J1.h hVar, b bVar, int i10) {
        this.f12720o.v(dVar, obj, eVar, i8, i9, aVar, cls, cls2, gVar, hVar, map, z7, z8, this.f12723u);
        this.f12727y = dVar;
        this.f12728z = eVar;
        this.f12697A = gVar;
        this.f12698B = mVar;
        this.f12699C = i8;
        this.f12700D = i9;
        this.f12701E = aVar;
        this.f12708L = z9;
        this.f12702F = hVar;
        this.f12703G = bVar;
        this.f12704H = i10;
        this.f12706J = g.INITIALIZE;
        this.f12709M = obj;
        return this;
    }
}
