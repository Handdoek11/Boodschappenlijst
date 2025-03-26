package io.ktor.utils.io;

/* loaded from: classes2.dex */
public abstract class g {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: o, reason: collision with root package name */
        Object f36867o;

        /* renamed from: s, reason: collision with root package name */
        Object f36868s;

        /* renamed from: t, reason: collision with root package name */
        Object f36869t;

        /* renamed from: u, reason: collision with root package name */
        long f36870u;

        /* renamed from: v, reason: collision with root package name */
        long f36871v;

        /* renamed from: w, reason: collision with root package name */
        int f36872w;

        /* renamed from: x, reason: collision with root package name */
        int f36873x;

        /* renamed from: y, reason: collision with root package name */
        /* synthetic */ Object f36874y;

        /* renamed from: z, reason: collision with root package name */
        int f36875z;

        a(A6.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36874y = obj;
            this.f36875z |= Integer.MIN_VALUE;
            return g.c(null, null, 0L, this);
        }
    }

    public static final Object b(f fVar, i iVar, long j8, A6.d dVar) {
        if (fVar != iVar) {
            return j8 == 0 ? kotlin.coroutines.jvm.internal.b.c(0L) : ((fVar instanceof io.ktor.utils.io.a) && (iVar instanceof io.ktor.utils.io.a)) ? ((io.ktor.utils.io.a) iVar).N((io.ktor.utils.io.a) fVar, j8, null, dVar) : c(fVar, iVar, j8, dVar);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f A[Catch: all -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f2, blocks: (B:37:0x00e8, B:39:0x00ee, B:25:0x008f), top: B:54:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4 A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #2 {all -> 0x0048, blocks: (B:13:0x0040, B:29:0x00bb, B:31:0x00c4, B:46:0x0101, B:20:0x0067), top: B:58:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00db -> B:35:0x00e4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(io.ktor.utils.io.f r19, io.ktor.utils.io.i r20, long r21, A6.d r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.g.c(io.ktor.utils.io.f, io.ktor.utils.io.i, long, A6.d):java.lang.Object");
    }
}
