package io.ktor.utils.io.jvm.javaio;

import I6.p;
import J6.r;
import U6.C0706b0;
import U6.C0732o0;
import io.ktor.utils.io.m;
import io.ktor.utils.io.q;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.coroutines.jvm.internal.l;
import x6.C6916E;

/* loaded from: classes2.dex */
public abstract class h {

    static final class a extends l implements p {

        /* renamed from: o, reason: collision with root package name */
        Object f36947o;

        /* renamed from: s, reason: collision with root package name */
        int f36948s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f36949t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Z5.g f36950u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ InputStream f36951v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Z5.g gVar, InputStream inputStream, A6.d dVar) {
            super(2, dVar);
            this.f36950u = gVar;
            this.f36951v = inputStream;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            a aVar = new a(this.f36950u, this.f36951v, dVar);
            aVar.f36949t = obj;
            return aVar;
        }

        @Override // I6.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(q qVar, A6.d dVar) {
            return ((a) create(qVar, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ByteBuffer byteBuffer;
            q qVar;
            Object e8 = B6.b.e();
            int i8 = this.f36948s;
            if (i8 == 0) {
                x6.q.b(obj);
                q qVar2 = (q) this.f36949t;
                byteBuffer = (ByteBuffer) this.f36950u.C();
                qVar = qVar2;
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                byteBuffer = (ByteBuffer) this.f36947o;
                qVar = (q) this.f36949t;
                try {
                    x6.q.b(obj);
                } finally {
                    try {
                        return C6916E.f44463a;
                    } finally {
                    }
                }
            }
            while (true) {
                byteBuffer.clear();
                int read = this.f36951v.read(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
                if (read < 0) {
                    break;
                }
                if (read != 0) {
                    byteBuffer.position(byteBuffer.position() + read);
                    byteBuffer.flip();
                    io.ktor.utils.io.i g8 = qVar.g();
                    this.f36949t = qVar;
                    this.f36947o = byteBuffer;
                    this.f36948s = 1;
                    if (g8.h(byteBuffer, this) == e8) {
                        return e8;
                    }
                }
            }
            return C6916E.f44463a;
        }
    }

    static final class b extends l implements p {

        /* renamed from: o, reason: collision with root package name */
        Object f36952o;

        /* renamed from: s, reason: collision with root package name */
        int f36953s;

        /* renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f36954t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ Z5.g f36955u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ InputStream f36956v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Z5.g gVar, InputStream inputStream, A6.d dVar) {
            super(2, dVar);
            this.f36955u = gVar;
            this.f36956v = inputStream;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final A6.d create(Object obj, A6.d dVar) {
            b bVar = new b(this.f36955u, this.f36956v, dVar);
            bVar.f36954t = obj;
            return bVar;
        }

        @Override // I6.p
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(q qVar, A6.d dVar) {
            return ((b) create(qVar, dVar)).invokeSuspend(C6916E.f44463a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            byte[] bArr;
            q qVar;
            Object e8 = B6.b.e();
            int i8 = this.f36953s;
            if (i8 == 0) {
                x6.q.b(obj);
                q qVar2 = (q) this.f36954t;
                bArr = (byte[]) this.f36955u.C();
                qVar = qVar2;
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bArr = (byte[]) this.f36952o;
                qVar = (q) this.f36954t;
                try {
                    x6.q.b(obj);
                } catch (Throwable th) {
                    try {
                        qVar.g().a(th);
                        this.f36955u.o0(bArr);
                    } catch (Throwable th2) {
                        this.f36955u.o0(bArr);
                        this.f36956v.close();
                        throw th2;
                    }
                }
            }
            while (true) {
                int read = this.f36956v.read(bArr, 0, bArr.length);
                if (read < 0) {
                    this.f36955u.o0(bArr);
                    break;
                }
                if (read != 0) {
                    io.ktor.utils.io.i g8 = qVar.g();
                    this.f36954t = qVar;
                    this.f36952o = bArr;
                    this.f36953s = 1;
                    if (g8.n(bArr, 0, read, this) == e8) {
                        return e8;
                    }
                }
            }
            this.f36956v.close();
            return C6916E.f44463a;
        }
    }

    public static final io.ktor.utils.io.f a(InputStream inputStream, A6.g gVar, Z5.g gVar2) {
        r.e(inputStream, "<this>");
        r.e(gVar, "context");
        r.e(gVar2, "pool");
        return m.c(C0732o0.f5469o, gVar, true, new a(gVar2, inputStream, null)).g();
    }

    public static final io.ktor.utils.io.f b(InputStream inputStream, A6.g gVar, Z5.g gVar2) {
        r.e(inputStream, "<this>");
        r.e(gVar, "context");
        r.e(gVar2, "pool");
        return m.c(C0732o0.f5469o, gVar, true, new b(gVar2, inputStream, null)).g();
    }

    public static /* synthetic */ io.ktor.utils.io.f c(InputStream inputStream, A6.g gVar, Z5.g gVar2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = C0706b0.b();
        }
        if ((i8 & 2) != 0) {
            gVar2 = Z5.a.a();
        }
        return b(inputStream, gVar, gVar2);
    }
}
