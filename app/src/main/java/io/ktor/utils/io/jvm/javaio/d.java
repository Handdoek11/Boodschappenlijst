package io.ktor.utils.io.jvm.javaio;

import J6.r;
import U6.A;
import U6.AbstractC0751y0;
import U6.InterfaceC0745v0;
import java.io.InputStream;

/* loaded from: classes2.dex */
final class d extends InputStream {

    /* renamed from: o, reason: collision with root package name */
    private final io.ktor.utils.io.f f36935o;

    /* renamed from: s, reason: collision with root package name */
    private final A f36936s;

    /* renamed from: t, reason: collision with root package name */
    private final a f36937t;

    /* renamed from: u, reason: collision with root package name */
    private byte[] f36938u;

    public static final class a extends io.ktor.utils.io.jvm.javaio.a {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ d f36939g;

        /* renamed from: io.ktor.utils.io.jvm.javaio.d$a$a, reason: collision with other inner class name */
        static final class C0277a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: o, reason: collision with root package name */
            Object f36940o;

            /* renamed from: s, reason: collision with root package name */
            Object f36941s;

            /* renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f36942t;

            /* renamed from: v, reason: collision with root package name */
            int f36944v;

            C0277a(A6.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f36942t = obj;
                this.f36944v |= Integer.MIN_VALUE;
                return a.this.h(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC0745v0 interfaceC0745v0, d dVar) {
            super(interfaceC0745v0);
            this.f36939g = dVar;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0083 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0081 -> B:25:0x0084). Please report as a decompilation issue!!! */
        @Override // io.ktor.utils.io.jvm.javaio.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        protected java.lang.Object h(A6.d r10) {
            /*
                r9 = this;
                boolean r0 = r10 instanceof io.ktor.utils.io.jvm.javaio.d.a.C0277a
                if (r0 == 0) goto L13
                r0 = r10
                io.ktor.utils.io.jvm.javaio.d$a$a r0 = (io.ktor.utils.io.jvm.javaio.d.a.C0277a) r0
                int r1 = r0.f36944v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f36944v = r1
                goto L18
            L13:
                io.ktor.utils.io.jvm.javaio.d$a$a r0 = new io.ktor.utils.io.jvm.javaio.d$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f36942t
                java.lang.Object r1 = B6.b.e()
                int r2 = r0.f36944v
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L44
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r2 = r0.f36940o
                io.ktor.utils.io.jvm.javaio.d$a r2 = (io.ktor.utils.io.jvm.javaio.d.a) r2
                x6.q.b(r10)
                goto L84
            L30:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L38:
                java.lang.Object r2 = r0.f36941s
                io.ktor.utils.io.jvm.javaio.a r2 = (io.ktor.utils.io.jvm.javaio.a) r2
                java.lang.Object r2 = r0.f36940o
                io.ktor.utils.io.jvm.javaio.d$a r2 = (io.ktor.utils.io.jvm.javaio.d.a) r2
                x6.q.b(r10)
                goto L61
            L44:
                x6.q.b(r10)
                r10 = 0
                r2 = r9
            L49:
                r2.result = r10
                r0.f36940o = r2
                r0.f36941s = r2
                r0.f36944v = r4
                java.lang.Object r10 = io.ktor.utils.io.jvm.javaio.a.c(r2, r0)
                java.lang.Object r5 = B6.b.e()
                if (r10 != r5) goto L5e
                kotlin.coroutines.jvm.internal.h.c(r0)
            L5e:
                if (r10 != r1) goto L61
                return r1
            L61:
                java.lang.String r5 = "null cannot be cast to non-null type kotlin.ByteArray"
                J6.r.c(r10, r5)
                byte[] r10 = (byte[]) r10
                io.ktor.utils.io.jvm.javaio.d r5 = r2.f36939g
                io.ktor.utils.io.f r5 = io.ktor.utils.io.jvm.javaio.d.d(r5)
                int r6 = r2.f()
                int r7 = r2.e()
                r0.f36940o = r2
                r8 = 0
                r0.f36941s = r8
                r0.f36944v = r3
                java.lang.Object r10 = r5.f(r10, r6, r7, r0)
                if (r10 != r1) goto L84
                return r1
            L84:
                java.lang.Number r10 = (java.lang.Number) r10
                int r10 = r10.intValue()
                r5 = -1
                if (r10 != r5) goto L49
                io.ktor.utils.io.jvm.javaio.d r0 = r2.f36939g
                U6.A r0 = io.ktor.utils.io.jvm.javaio.d.e(r0)
                r0.T()
                r2.d(r10)
                x6.E r10 = x6.C6916E.f44463a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.javaio.d.a.h(A6.d):java.lang.Object");
        }
    }

    public d(InterfaceC0745v0 interfaceC0745v0, io.ktor.utils.io.f fVar) {
        r.e(fVar, "channel");
        this.f36935o = fVar;
        this.f36936s = AbstractC0751y0.a(interfaceC0745v0);
        this.f36937t = new a(interfaceC0745v0, this);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f36935o.e();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            super.close();
            io.ktor.utils.io.h.a(this.f36935o);
            if (!this.f36936s.j()) {
                InterfaceC0745v0.a.a(this.f36936s, null, 1, null);
            }
            this.f36937t.k();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.InputStream
    public synchronized int read() {
        try {
            byte[] bArr = this.f36938u;
            if (bArr == null) {
                bArr = new byte[1];
                this.f36938u = bArr;
            }
            int m8 = this.f36937t.m(bArr, 0, 1);
            if (m8 == -1) {
                return -1;
            }
            if (m8 == 1) {
                return bArr[0] & 255;
            }
            throw new IllegalStateException(("Expected a single byte or EOF. Got " + m8 + " bytes.").toString());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.InputStream
    public synchronized int read(byte[] bArr, int i8, int i9) {
        a aVar;
        aVar = this.f36937t;
        r.b(bArr);
        return aVar.m(bArr, i8, i9);
    }
}
