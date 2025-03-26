package io.ktor.utils.io.jvm.javaio;

import java.io.OutputStream;

/* loaded from: classes2.dex */
public abstract class j {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f36958o;

        /* renamed from: s, reason: collision with root package name */
        Object f36959s;

        /* renamed from: t, reason: collision with root package name */
        Object f36960t;

        /* renamed from: u, reason: collision with root package name */
        long f36961u;

        /* renamed from: v, reason: collision with root package name */
        long f36962v;

        /* renamed from: w, reason: collision with root package name */
        long f36963w;

        /* renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f36964x;

        /* renamed from: y, reason: collision with root package name */
        int f36965y;

        a(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36964x = obj;
            this.f36965y |= Integer.MIN_VALUE;
            return j.a(null, null, 0L, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v0, types: [Z5.g] */
    /* JADX WARN: Type inference failed for: r1v3, types: [Z5.g] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0092 -> B:49:0x0096). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(io.ktor.utils.io.f r18, java.io.OutputStream r19, long r20, A6.d r22) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.jvm.javaio.j.a(io.ktor.utils.io.f, java.io.OutputStream, long, A6.d):java.lang.Object");
    }

    public static /* synthetic */ Object b(io.ktor.utils.io.f fVar, OutputStream outputStream, long j8, A6.d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j8 = Long.MAX_VALUE;
        }
        return a(fVar, outputStream, j8, dVar);
    }
}
