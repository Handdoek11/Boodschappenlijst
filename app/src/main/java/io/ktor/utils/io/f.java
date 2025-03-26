package io.ktor.utils.io;

import J6.s;
import x6.AbstractC6929k;
import x6.InterfaceC6928j;

/* loaded from: classes2.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f36863a = a.f36864a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f36864a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final InterfaceC6928j f36865b = AbstractC6929k.a(C0273a.f36866o);

        /* renamed from: io.ktor.utils.io.f$a$a, reason: collision with other inner class name */
        static final class C0273a extends s implements I6.a {

            /* renamed from: o, reason: collision with root package name */
            public static final C0273a f36866o = new C0273a();

            C0273a() {
                super(0);
            }

            @Override // I6.a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c invoke() {
                c c8 = e.c(false, 1, null);
                j.a(c8);
                return c8;
            }
        }

        private a() {
        }

        public final f a() {
            return (f) f36865b.getValue();
        }
    }

    public static final class b {
        public static /* synthetic */ Object a(f fVar, long j8, A6.d dVar, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readRemaining");
            }
            if ((i8 & 1) != 0) {
                j8 = Long.MAX_VALUE;
            }
            return fVar.l(j8, dVar);
        }
    }

    boolean b(Throwable th);

    Object c(Y5.a aVar, A6.d dVar);

    Throwable d();

    int e();

    Object f(byte[] bArr, int i8, int i9, A6.d dVar);

    Object g(long j8, A6.d dVar);

    Object l(long j8, A6.d dVar);

    boolean m();
}
