package k6;

import a6.AbstractC0825b;
import a6.InterfaceC0826c;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import q6.EnumC6639b;
import r6.AbstractC6711c;

/* loaded from: classes2.dex */
public final class h extends AbstractC6110a {

    static final class a extends AtomicInteger implements InterfaceC0826c, p7.b {

        /* renamed from: o, reason: collision with root package name */
        final p7.a f38576o;

        /* renamed from: s, reason: collision with root package name */
        p7.b f38577s;

        /* renamed from: t, reason: collision with root package name */
        volatile boolean f38578t;

        /* renamed from: u, reason: collision with root package name */
        Throwable f38579u;

        /* renamed from: v, reason: collision with root package name */
        volatile boolean f38580v;

        /* renamed from: w, reason: collision with root package name */
        final AtomicLong f38581w = new AtomicLong();

        /* renamed from: x, reason: collision with root package name */
        final AtomicReference f38582x = new AtomicReference();

        a(p7.a aVar) {
            this.f38576o = aVar;
        }

        @Override // p7.a
        public void a() {
            this.f38578t = true;
            e();
        }

        @Override // p7.a
        public void b(Object obj) {
            this.f38582x.lazySet(obj);
            e();
        }

        boolean c(boolean z7, boolean z8, p7.a aVar, AtomicReference atomicReference) {
            if (this.f38580v) {
                atomicReference.lazySet(null);
                return true;
            }
            if (!z7) {
                return false;
            }
            Throwable th = this.f38579u;
            if (th != null) {
                atomicReference.lazySet(null);
                aVar.onError(th);
                return true;
            }
            if (!z8) {
                return false;
            }
            aVar.a();
            return true;
        }

        @Override // p7.b
        public void cancel() {
            if (this.f38580v) {
                return;
            }
            this.f38580v = true;
            this.f38577s.cancel();
            if (getAndIncrement() == 0) {
                this.f38582x.lazySet(null);
            }
        }

        @Override // p7.a
        public void d(p7.b bVar) {
            if (EnumC6639b.i(this.f38577s, bVar)) {
                this.f38577s = bVar;
                this.f38576o.d(this);
                bVar.h(Long.MAX_VALUE);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        
            if (r7 != r1.get()) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        
            r9 = r13.f38578t;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
        
            if (r2.get() != null) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
        
            r10 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        
            if (c(r9, r10, r0, r2) == false) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
        
            if (r7 == 0) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        
            r6.AbstractC6711c.c(r1, r7);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
        
            r4 = addAndGet(-r4);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void e() {
            /*
                r13 = this;
                int r0 = r13.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                p7.a r0 = r13.f38576o
                java.util.concurrent.atomic.AtomicLong r1 = r13.f38581w
                java.util.concurrent.atomic.AtomicReference r2 = r13.f38582x
                r3 = 1
                r4 = r3
            Lf:
                r5 = 0
                r7 = r5
            L12:
                long r9 = r1.get()
                int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                r10 = 0
                if (r9 == 0) goto L38
                boolean r9 = r13.f38578t
                r11 = 0
                java.lang.Object r11 = r2.getAndSet(r11)
                if (r11 != 0) goto L26
                r12 = r3
                goto L27
            L26:
                r12 = r10
            L27:
                boolean r9 = r13.c(r9, r12, r0, r2)
                if (r9 == 0) goto L2e
                return
            L2e:
                if (r12 == 0) goto L31
                goto L38
            L31:
                r0.b(r11)
                r9 = 1
                long r7 = r7 + r9
                goto L12
            L38:
                long r11 = r1.get()
                int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r9 != 0) goto L50
                boolean r9 = r13.f38578t
                java.lang.Object r11 = r2.get()
                if (r11 != 0) goto L49
                r10 = r3
            L49:
                boolean r9 = r13.c(r9, r10, r0, r2)
                if (r9 == 0) goto L50
                return
            L50:
                int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r5 == 0) goto L57
                r6.AbstractC6711c.c(r1, r7)
            L57:
                int r4 = -r4
                int r4 = r13.addAndGet(r4)
                if (r4 != 0) goto Lf
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k6.h.a.e():void");
        }

        @Override // p7.b
        public void h(long j8) {
            if (EnumC6639b.g(j8)) {
                AbstractC6711c.a(this.f38581w, j8);
                e();
            }
        }

        @Override // p7.a
        public void onError(Throwable th) {
            this.f38579u = th;
            this.f38578t = true;
            e();
        }
    }

    public h(AbstractC0825b abstractC0825b) {
        super(abstractC0825b);
    }

    @Override // a6.AbstractC0825b
    protected void j(p7.a aVar) {
        this.f38531s.i(new a(aVar));
    }
}
