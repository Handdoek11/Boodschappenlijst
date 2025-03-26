package z5;

import I5.t;
import java.util.List;
import y6.AbstractC6987o;

/* renamed from: z5.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC7085c {

    /* renamed from: a, reason: collision with root package name */
    private static final List f44909a;

    /* renamed from: z5.c$a */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f44910o;

        /* renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f44911s;

        /* renamed from: t, reason: collision with root package name */
        int f44912t;

        a(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f44911s = obj;
            this.f44912t |= Integer.MIN_VALUE;
            return AbstractC7085c.b(null, null, null, this);
        }
    }

    static {
        t.a aVar = t.f3376b;
        f44909a = AbstractC6987o.g(aVar.a(), aVar.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(J5.b r7, java.io.OutputStream r8, A6.g r9, A6.d r10) {
        /*
            boolean r9 = r10 instanceof z5.AbstractC7085c.a
            if (r9 == 0) goto L14
            r9 = r10
            z5.c$a r9 = (z5.AbstractC7085c.a) r9
            int r0 = r9.f44912t
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L14
            int r0 = r0 - r1
            r9.f44912t = r0
        L12:
            r4 = r9
            goto L1a
        L14:
            z5.c$a r9 = new z5.c$a
            r9.<init>(r10)
            goto L12
        L1a:
            java.lang.Object r9 = r4.f44911s
            java.lang.Object r10 = B6.b.e()
            int r0 = r4.f44912t
            r1 = 1
            if (r0 == 0) goto L46
            if (r0 == r1) goto L3d
            r7 = 2
            if (r0 != r7) goto L35
            java.lang.Object r7 = r4.f44910o
            r8 = r7
            java.io.Closeable r8 = (java.io.Closeable) r8
            x6.q.b(r9)     // Catch: java.lang.Throwable -> L33
            goto L7b
        L33:
            r7 = move-exception
            goto L8a
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            java.lang.Object r7 = r4.f44910o
            r8 = r7
            java.io.Closeable r8 = (java.io.Closeable) r8
            x6.q.b(r9)     // Catch: java.lang.Throwable -> L33
            goto L71
        L46:
            x6.q.b(r9)
            boolean r9 = r7 instanceof J5.b.a     // Catch: java.lang.Throwable -> L33
            if (r9 == 0) goto L57
            J5.b$a r7 = (J5.b.a) r7     // Catch: java.lang.Throwable -> L33
            byte[] r7 = r7.d()     // Catch: java.lang.Throwable -> L33
            r8.write(r7)     // Catch: java.lang.Throwable -> L33
            goto L7b
        L57:
            boolean r9 = r7 instanceof J5.b.c     // Catch: java.lang.Throwable -> L33
            if (r9 == 0) goto L77
            J5.b$c r7 = (J5.b.c) r7     // Catch: java.lang.Throwable -> L33
            io.ktor.utils.io.f r0 = r7.d()     // Catch: java.lang.Throwable -> L33
            r4.f44910o = r8     // Catch: java.lang.Throwable -> L33
            r4.f44912t = r1     // Catch: java.lang.Throwable -> L33
            r2 = 0
            r5 = 2
            r6 = 0
            r1 = r8
            java.lang.Object r9 = io.ktor.utils.io.jvm.javaio.j.b(r0, r1, r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L33
            if (r9 != r10) goto L71
            return r10
        L71:
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Throwable -> L33
            r9.longValue()     // Catch: java.lang.Throwable -> L33
            goto L7b
        L77:
            boolean r9 = r7 instanceof J5.b.AbstractC0058b     // Catch: java.lang.Throwable -> L33
            if (r9 == 0) goto L84
        L7b:
            x6.E r7 = x6.C6916E.f44463a     // Catch: java.lang.Throwable -> L33
            r7 = 0
            G6.a.a(r8, r7)
            x6.E r7 = x6.C6916E.f44463a
            return r7
        L84:
            io.ktor.client.call.UnsupportedContentTypeException r9 = new io.ktor.client.call.UnsupportedContentTypeException     // Catch: java.lang.Throwable -> L33
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L33
            throw r9     // Catch: java.lang.Throwable -> L33
        L8a:
            throw r7     // Catch: java.lang.Throwable -> L8b
        L8b:
            r9 = move-exception
            G6.a.a(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.AbstractC7085c.b(J5.b, java.io.OutputStream, A6.g, A6.d):java.lang.Object");
    }
}
