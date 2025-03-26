package B5;

import I5.C0628b;
import J5.b;
import J6.H;
import U6.InterfaceC0745v0;
import java.io.InputStream;
import v5.C6841a;
import w5.C6892a;
import x6.C6916E;

/* loaded from: classes2.dex */
public abstract class e {

    public static final class a extends b.c {

        /* renamed from: a, reason: collision with root package name */
        private final Long f530a;

        /* renamed from: b, reason: collision with root package name */
        private final C0628b f531b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f532c;

        a(E5.c cVar, C0628b c0628b, Object obj) {
            this.f532c = obj;
            String i8 = cVar.a().i(I5.o.f3324a.g());
            this.f530a = i8 != null ? Long.valueOf(Long.parseLong(i8)) : null;
            this.f531b = c0628b == null ? C0628b.a.f3225a.b() : c0628b;
        }

        @Override // J5.b
        public Long a() {
            return this.f530a;
        }

        @Override // J5.b
        public C0628b b() {
            return this.f531b;
        }

        @Override // J5.b.c
        public io.ktor.utils.io.f d() {
            return io.ktor.utils.io.jvm.javaio.h.c((InputStream) this.f532c, null, null, 3, null);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements I6.q {

        /* renamed from: o, reason: collision with root package name */
        int f533o;

        /* renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f534s;

        /* renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f535t;

        public static final class a extends InputStream {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ InputStream f536o;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ T5.e f537s;

            a(InputStream inputStream, T5.e eVar) {
                this.f536o = inputStream;
                this.f537s = eVar;
            }

            @Override // java.io.InputStream
            public int available() {
                return this.f536o.available();
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                this.f536o.close();
                F5.e.c(((C6892a) this.f537s.b()).e());
            }

            @Override // java.io.InputStream
            public int read() {
                return this.f536o.read();
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i8, int i9) {
                J6.r.e(bArr, "b");
                return this.f536o.read(bArr, i8, i9);
            }
        }

        b(A6.d dVar) {
            super(3, dVar);
        }

        @Override // I6.q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object d(T5.e eVar, F5.d dVar, A6.d dVar2) {
            b bVar = new b(dVar2);
            bVar.f534s = eVar;
            bVar.f535t = dVar;
            return bVar.invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = B6.b.e();
            int i8 = this.f533o;
            if (i8 == 0) {
                x6.q.b(obj);
                T5.e eVar = (T5.e) this.f534s;
                F5.d dVar = (F5.d) this.f535t;
                U5.a a8 = dVar.a();
                Object b8 = dVar.b();
                if (!(b8 instanceof io.ktor.utils.io.f)) {
                    return C6916E.f44463a;
                }
                if (J6.r.a(a8.b(), H.b(InputStream.class))) {
                    F5.d dVar2 = new F5.d(a8, new a(io.ktor.utils.io.jvm.javaio.b.c((io.ktor.utils.io.f) b8, (InterfaceC0745v0) ((C6892a) eVar.b()).getCoroutineContext().d(InterfaceC0745v0.f5485d)), eVar));
                    this.f534s = null;
                    this.f533o = 1;
                    if (eVar.e(dVar2, this) == e8) {
                        return e8;
                    }
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x6.q.b(obj);
            }
            return C6916E.f44463a;
        }
    }

    public static final J5.b a(C0628b c0628b, E5.c cVar, Object obj) {
        J6.r.e(cVar, "context");
        J6.r.e(obj, "body");
        if (obj instanceof InputStream) {
            return new a(cVar, c0628b, obj);
        }
        return null;
    }

    public static final void b(C6841a c6841a) {
        J6.r.e(c6841a, "<this>");
        c6841a.l().l(F5.f.f2401g.a(), new b(null));
    }
}
