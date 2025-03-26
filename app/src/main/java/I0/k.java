package I0;

import I6.p;
import J6.r;
import J6.s;
import U6.AbstractC0723k;
import U6.InterfaceC0745v0;
import U6.M;
import W6.g;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import x6.C6916E;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final M f2986a;

    /* renamed from: b, reason: collision with root package name */
    private final p f2987b;

    /* renamed from: c, reason: collision with root package name */
    private final W6.d f2988c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f2989d;

    static final class a extends s implements I6.l {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ I6.l f2990o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ k f2991s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ p f2992t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(I6.l lVar, k kVar, p pVar) {
            super(1);
            this.f2990o = lVar;
            this.f2991s = kVar;
            this.f2992t = pVar;
        }

        public final void b(Throwable th) {
            C6916E c6916e;
            this.f2990o.invoke(th);
            this.f2991s.f2988c.a(th);
            do {
                Object d8 = W6.g.d(this.f2991s.f2988c.b());
                if (d8 == null) {
                    c6916e = null;
                } else {
                    this.f2992t.invoke(d8, th);
                    c6916e = C6916E.f44463a;
                }
            } while (c6916e != null);
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return C6916E.f44463a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements p {

        /* renamed from: o, reason: collision with root package name */
        Object f2993o;

        /* renamed from: s, reason: collision with root package name */
        int f2994s;

        b(A6.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            return k.this.new b(dVar);
        }

        @Override // I6.p
        public final Object invoke(M m8, A6.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(C6916E.f44463a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005f -> B:21:0x0062). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = B6.b.e()
                int r1 = r5.f2994s
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                x6.q.b(r6)
                goto L62
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f2993o
                I6.p r1 = (I6.p) r1
                x6.q.b(r6)
                goto L56
            L22:
                x6.q.b(r6)
                I0.k r6 = I0.k.this
                java.util.concurrent.atomic.AtomicInteger r6 = I0.k.c(r6)
                int r6 = r6.get()
                if (r6 <= 0) goto L33
                r6 = r3
                goto L34
            L33:
                r6 = 0
            L34:
                if (r6 == 0) goto L71
            L36:
                I0.k r6 = I0.k.this
                U6.M r6 = I0.k.d(r6)
                U6.N.f(r6)
                I0.k r6 = I0.k.this
                I6.p r1 = I0.k.a(r6)
                I0.k r6 = I0.k.this
                W6.d r6 = I0.k.b(r6)
                r5.f2993o = r1
                r5.f2994s = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L56
                return r0
            L56:
                r4 = 0
                r5.f2993o = r4
                r5.f2994s = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L62
                return r0
            L62:
                I0.k r6 = I0.k.this
                java.util.concurrent.atomic.AtomicInteger r6 = I0.k.c(r6)
                int r6 = r6.decrementAndGet()
                if (r6 != 0) goto L36
                x6.E r6 = x6.C6916E.f44463a
                return r6
            L71:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: I0.k.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public k(M m8, I6.l lVar, p pVar, p pVar2) {
        r.e(m8, "scope");
        r.e(lVar, "onComplete");
        r.e(pVar, "onUndeliveredElement");
        r.e(pVar2, "consumeMessage");
        this.f2986a = m8;
        this.f2987b = pVar2;
        this.f2988c = W6.f.b(Integer.MAX_VALUE, null, null, 6, null);
        this.f2989d = new AtomicInteger(0);
        InterfaceC0745v0 interfaceC0745v0 = (InterfaceC0745v0) m8.getCoroutineContext().d(InterfaceC0745v0.f5485d);
        if (interfaceC0745v0 == null) {
            return;
        }
        interfaceC0745v0.D(new a(lVar, this, pVar));
    }

    public final void e(Object obj) {
        Object d8 = this.f2988c.d(obj);
        if (d8 instanceof g.a) {
            Throwable c8 = W6.g.c(d8);
            if (c8 != null) {
                throw c8;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!W6.g.f(d8)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f2989d.getAndIncrement() == 0) {
            AbstractC0723k.d(this.f2986a, null, null, new b(null), 3, null);
        }
    }
}
