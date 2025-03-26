package K5;

import I5.AbstractC0640n;
import I5.C0633g;
import I5.InterfaceC0637k;
import I5.o;
import I6.p;
import J6.r;
import io.ktor.utils.io.f;
import java.nio.charset.Charset;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import x6.C6916E;
import x6.q;

/* loaded from: classes2.dex */
public abstract class c {

    public static final class a implements X6.b {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ X6.b f3657o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Charset f3658s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ U5.a f3659t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ f f3660u;

        /* renamed from: K5.c$a$a, reason: collision with other inner class name */
        public static final class C0064a implements X6.c {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ X6.c f3661o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ Charset f3662s;

            /* renamed from: t, reason: collision with root package name */
            final /* synthetic */ U5.a f3663t;

            /* renamed from: u, reason: collision with root package name */
            final /* synthetic */ f f3664u;

            /* renamed from: K5.c$a$a$a, reason: collision with other inner class name */
            public static final class C0065a extends d {

                /* renamed from: o, reason: collision with root package name */
                /* synthetic */ Object f3665o;

                /* renamed from: s, reason: collision with root package name */
                int f3666s;

                /* renamed from: t, reason: collision with root package name */
                Object f3667t;

                public C0065a(A6.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f3665o = obj;
                    this.f3666s |= Integer.MIN_VALUE;
                    return C0064a.this.c(null, this);
                }
            }

            public C0064a(X6.c cVar, Charset charset, U5.a aVar, f fVar) {
                this.f3661o = cVar;
                this.f3662s = charset;
                this.f3663t = aVar;
                this.f3664u = fVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // X6.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object c(java.lang.Object r9, A6.d r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof K5.c.a.C0064a.C0065a
                    if (r0 == 0) goto L13
                    r0 = r10
                    K5.c$a$a$a r0 = (K5.c.a.C0064a.C0065a) r0
                    int r1 = r0.f3666s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f3666s = r1
                    goto L18
                L13:
                    K5.c$a$a$a r0 = new K5.c$a$a$a
                    r0.<init>(r10)
                L18:
                    java.lang.Object r10 = r0.f3665o
                    java.lang.Object r1 = B6.b.e()
                    int r2 = r0.f3666s
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    x6.q.b(r10)
                    goto L63
                L2c:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L34:
                    java.lang.Object r9 = r0.f3667t
                    X6.c r9 = (X6.c) r9
                    x6.q.b(r10)
                    goto L57
                L3c:
                    x6.q.b(r10)
                    X6.c r10 = r8.f3661o
                    K5.b r9 = (K5.b) r9
                    java.nio.charset.Charset r2 = r8.f3662s
                    U5.a r5 = r8.f3663t
                    io.ktor.utils.io.f r6 = r8.f3664u
                    r0.f3667t = r10
                    r0.f3666s = r4
                    java.lang.Object r9 = r9.a(r2, r5, r6, r0)
                    if (r9 != r1) goto L54
                    return r1
                L54:
                    r7 = r10
                    r10 = r9
                    r9 = r7
                L57:
                    r2 = 0
                    r0.f3667t = r2
                    r0.f3666s = r3
                    java.lang.Object r9 = r9.c(r10, r0)
                    if (r9 != r1) goto L63
                    return r1
                L63:
                    x6.E r9 = x6.C6916E.f44463a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: K5.c.a.C0064a.c(java.lang.Object, A6.d):java.lang.Object");
            }
        }

        public a(X6.b bVar, Charset charset, U5.a aVar, f fVar) {
            this.f3657o = bVar;
            this.f3658s = charset;
            this.f3659t = aVar;
            this.f3660u = fVar;
        }

        @Override // X6.b
        public Object a(X6.c cVar, A6.d dVar) {
            Object a8 = this.f3657o.a(new C0064a(cVar, this.f3658s, this.f3659t, this.f3660u), dVar);
            return a8 == B6.b.e() ? a8 : C6916E.f44463a;
        }
    }

    static final class b extends d {

        /* renamed from: o, reason: collision with root package name */
        Object f3669o;

        /* renamed from: s, reason: collision with root package name */
        Object f3670s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f3671t;

        /* renamed from: u, reason: collision with root package name */
        int f3672u;

        b(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3671t = obj;
            this.f3672u |= Integer.MIN_VALUE;
            return c.a(null, null, null, null, this);
        }
    }

    /* renamed from: K5.c$c, reason: collision with other inner class name */
    static final class C0066c extends l implements p {

        /* renamed from: o, reason: collision with root package name */
        int f3673o;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f3674s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ f f3675t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0066c(f fVar, A6.d dVar) {
            super(2, dVar);
            this.f3675t = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            C0066c c0066c = new C0066c(this.f3675t, dVar);
            c0066c.f3674s = obj;
            return c0066c;
        }

        @Override // I6.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, A6.d dVar) {
            return ((C0066c) create(obj, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            B6.b.e();
            if (this.f3673o != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(this.f3674s != null || this.f3675t.m());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(java.util.List r5, io.ktor.utils.io.f r6, U5.a r7, java.nio.charset.Charset r8, A6.d r9) {
        /*
            boolean r0 = r9 instanceof K5.c.b
            if (r0 == 0) goto L13
            r0 = r9
            K5.c$b r0 = (K5.c.b) r0
            int r1 = r0.f3672u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3672u = r1
            goto L18
        L13:
            K5.c$b r0 = new K5.c$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f3671t
            java.lang.Object r1 = B6.b.e()
            int r2 = r0.f3672u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r5 = r0.f3670s
            r7 = r5
            U5.a r7 = (U5.a) r7
            java.lang.Object r5 = r0.f3669o
            r6 = r5
            io.ktor.utils.io.f r6 = (io.ktor.utils.io.f) r6
            x6.q.b(r9)
            goto L5c
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3c:
            x6.q.b(r9)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            X6.b r5 = X6.d.a(r5)
            K5.c$a r9 = new K5.c$a
            r9.<init>(r5, r8, r7, r6)
            K5.c$c r5 = new K5.c$c
            r5.<init>(r6, r3)
            r0.f3669o = r6
            r0.f3670s = r7
            r0.f3672u = r4
            java.lang.Object r9 = X6.d.h(r9, r5, r0)
            if (r9 != r1) goto L5c
            return r1
        L5c:
            if (r9 != 0) goto L8c
            boolean r5 = r6.m()
            if (r5 != 0) goto L65
            goto L8d
        L65:
            Q6.k r5 = r7.a()
            if (r5 == 0) goto L74
            boolean r5 = r5.a()
            if (r5 != r4) goto L74
            J5.a r6 = J5.a.f3538a
            goto L8d
        L74:
            io.ktor.serialization.ContentConvertException r5 = new io.ktor.serialization.ContentConvertException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "No suitable converter found for "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r7 = 2
            r5.<init>(r6, r3, r7, r3)
            throw r5
        L8c:
            r6 = r9
        L8d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.c.a(java.util.List, io.ktor.utils.io.f, U5.a, java.nio.charset.Charset, A6.d):java.lang.Object");
    }

    public static final Charset b(InterfaceC0637k interfaceC0637k, Charset charset) {
        r.e(interfaceC0637k, "<this>");
        r.e(charset, "defaultCharset");
        Charset d8 = d(interfaceC0637k, charset);
        return d8 == null ? charset : d8;
    }

    public static /* synthetic */ Charset c(InterfaceC0637k interfaceC0637k, Charset charset, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = S6.d.f5130b;
        }
        return b(interfaceC0637k, charset);
    }

    public static final Charset d(InterfaceC0637k interfaceC0637k, Charset charset) {
        r.e(interfaceC0637k, "<this>");
        r.e(charset, "defaultCharset");
        Iterator it = AbstractC0640n.b(interfaceC0637k.e(o.f3324a.d())).iterator();
        while (it.hasNext()) {
            String a8 = ((C0633g) it.next()).a();
            if (r.a(a8, "*")) {
                return charset;
            }
            if (Charset.isSupported(a8)) {
                return Charset.forName(a8);
            }
        }
        return null;
    }
}
