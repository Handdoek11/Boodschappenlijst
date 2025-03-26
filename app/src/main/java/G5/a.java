package G5;

import I6.p;
import I6.q;
import J6.r;
import U6.C0732o0;
import io.ktor.utils.io.m;
import kotlin.coroutines.jvm.internal.l;
import x6.C6916E;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: G5.a$a, reason: collision with other inner class name */
    static final class C0044a extends l implements p {

        /* renamed from: A, reason: collision with root package name */
        private /* synthetic */ Object f2743A;

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Long f2744B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ io.ktor.utils.io.f f2745C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ q f2746D;

        /* renamed from: o, reason: collision with root package name */
        Object f2747o;

        /* renamed from: s, reason: collision with root package name */
        Object f2748s;

        /* renamed from: t, reason: collision with root package name */
        Object f2749t;

        /* renamed from: u, reason: collision with root package name */
        Object f2750u;

        /* renamed from: v, reason: collision with root package name */
        Object f2751v;

        /* renamed from: w, reason: collision with root package name */
        long f2752w;

        /* renamed from: x, reason: collision with root package name */
        long f2753x;

        /* renamed from: y, reason: collision with root package name */
        int f2754y;

        /* renamed from: z, reason: collision with root package name */
        int f2755z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0044a(Long l8, io.ktor.utils.io.f fVar, q qVar, A6.d dVar) {
            super(2, dVar);
            this.f2744B = l8;
            this.f2745C = fVar;
            this.f2746D = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            C0044a c0044a = new C0044a(this.f2744B, this.f2745C, this.f2746D, dVar);
            c0044a.f2743A = obj;
            return c0044a;
        }

        @Override // I6.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(io.ktor.utils.io.q qVar, A6.d dVar) {
            return ((C0044a) create(qVar, dVar)).invokeSuspend(C6916E.f44463a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00eb A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:9:0x001d, B:63:0x01a4, B:39:0x00e5, B:41:0x00eb, B:44:0x0104, B:56:0x0172, B:60:0x0185), top: B:70:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x012a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x015d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x015e  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0172 A[Catch: all -> 0x0022, TRY_ENTER, TryCatch #1 {all -> 0x0022, blocks: (B:9:0x001d, B:63:0x01a4, B:39:0x00e5, B:41:0x00eb, B:44:0x0104, B:56:0x0172, B:60:0x0185), top: B:70:0x000c }] */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v20 */
        /* JADX WARN: Type inference failed for: r2v23 */
        /* JADX WARN: Type inference failed for: r2v27 */
        /* JADX WARN: Type inference failed for: r2v28 */
        /* JADX WARN: Type inference failed for: r2v29 */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v9 */
        /* JADX WARN: Type inference failed for: r3v1, types: [Z5.g] */
        /* JADX WARN: Type inference failed for: r3v10, types: [Z5.g] */
        /* JADX WARN: Type inference failed for: r3v11 */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v17 */
        /* JADX WARN: Type inference failed for: r3v2, types: [Z5.g] */
        /* JADX WARN: Type inference failed for: r3v21 */
        /* JADX WARN: Type inference failed for: r3v22 */
        /* JADX WARN: Type inference failed for: r3v23 */
        /* JADX WARN: Type inference failed for: r3v24 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x015e -> B:53:0x016b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 432
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: G5.a.C0044a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final io.ktor.utils.io.f a(io.ktor.utils.io.f fVar, A6.g gVar, Long l8, q qVar) {
        r.e(fVar, "<this>");
        r.e(gVar, "context");
        r.e(qVar, "listener");
        return m.c(C0732o0.f5469o, gVar, true, new C0044a(l8, fVar, qVar, null)).g();
    }
}
