package io.ktor.utils.io.internal;

import J6.AbstractC0650j;
import J6.r;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f36895a;

    /* renamed from: b, reason: collision with root package name */
    public final h f36896b;

    public static final class a extends f {

        /* renamed from: c, reason: collision with root package name */
        public static final a f36897c = new a();

        private a() {
            super(io.ktor.utils.io.internal.g.a(), io.ktor.utils.io.internal.g.b(), null);
        }

        public String toString() {
            return "IDLE(empty)";
        }
    }

    public static final class b extends f {

        /* renamed from: c, reason: collision with root package name */
        private final c f36898c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar) {
            super(cVar.f36895a, cVar.f36896b, null);
            r.e(cVar, "initial");
            this.f36898c = cVar;
        }

        public final c g() {
            return this.f36898c;
        }

        @Override // io.ktor.utils.io.internal.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public d c() {
            return this.f36898c.h();
        }

        @Override // io.ktor.utils.io.internal.f
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public g d() {
            return this.f36898c.j();
        }

        public String toString() {
            return "IDLE(with buffer)";
        }
    }

    public static final class c extends f {

        /* renamed from: c, reason: collision with root package name */
        private final ByteBuffer f36899c;

        /* renamed from: d, reason: collision with root package name */
        private final ByteBuffer f36900d;

        /* renamed from: e, reason: collision with root package name */
        private final b f36901e;

        /* renamed from: f, reason: collision with root package name */
        private final d f36902f;

        /* renamed from: g, reason: collision with root package name */
        private final g f36903g;

        /* renamed from: h, reason: collision with root package name */
        private final e f36904h;

        public /* synthetic */ c(ByteBuffer byteBuffer, int i8, int i9, AbstractC0650j abstractC0650j) {
            this(byteBuffer, (i9 & 2) != 0 ? 8 : i8);
        }

        @Override // io.ktor.utils.io.internal.f
        public ByteBuffer a() {
            return this.f36900d;
        }

        @Override // io.ktor.utils.io.internal.f
        public ByteBuffer b() {
            return this.f36899c;
        }

        public final b g() {
            return this.f36901e;
        }

        public final d h() {
            return this.f36902f;
        }

        public final e i() {
            return this.f36904h;
        }

        public final g j() {
            return this.f36903g;
        }

        @Override // io.ktor.utils.io.internal.f
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public d c() {
            return this.f36902f;
        }

        @Override // io.ktor.utils.io.internal.f
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public g d() {
            return this.f36903g;
        }

        public String toString() {
            return "Initial";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ByteBuffer byteBuffer, int i8) {
            super(byteBuffer, new h(byteBuffer.capacity() - i8), null);
            r.e(byteBuffer, "backingBuffer");
            if (byteBuffer.position() != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (byteBuffer.limit() != byteBuffer.capacity()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            ByteBuffer duplicate = byteBuffer.duplicate();
            r.d(duplicate, "backingBuffer.duplicate()");
            this.f36899c = duplicate;
            ByteBuffer duplicate2 = byteBuffer.duplicate();
            r.d(duplicate2, "backingBuffer.duplicate()");
            this.f36900d = duplicate2;
            this.f36901e = new b(this);
            this.f36902f = new d(this);
            this.f36903g = new g(this);
            this.f36904h = new e(this);
        }
    }

    public static final class d extends f {

        /* renamed from: c, reason: collision with root package name */
        private final c f36905c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(cVar.f36895a, cVar.f36896b, null);
            r.e(cVar, "initial");
            this.f36905c = cVar;
        }

        @Override // io.ktor.utils.io.internal.f
        public ByteBuffer a() {
            return this.f36905c.a();
        }

        @Override // io.ktor.utils.io.internal.f
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public e d() {
            return this.f36905c.i();
        }

        @Override // io.ktor.utils.io.internal.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public b e() {
            return this.f36905c.g();
        }

        public String toString() {
            return "Reading";
        }
    }

    public static final class e extends f {

        /* renamed from: c, reason: collision with root package name */
        private final c f36906c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(c cVar) {
            super(cVar.f36895a, cVar.f36896b, null);
            r.e(cVar, "initial");
            this.f36906c = cVar;
        }

        @Override // io.ktor.utils.io.internal.f
        public ByteBuffer a() {
            return this.f36906c.a();
        }

        @Override // io.ktor.utils.io.internal.f
        public ByteBuffer b() {
            return this.f36906c.b();
        }

        @Override // io.ktor.utils.io.internal.f
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public g e() {
            return this.f36906c.j();
        }

        @Override // io.ktor.utils.io.internal.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public d f() {
            return this.f36906c.h();
        }

        public String toString() {
            return "Reading+Writing";
        }
    }

    /* renamed from: io.ktor.utils.io.internal.f$f, reason: collision with other inner class name */
    public static final class C0275f extends f {

        /* renamed from: c, reason: collision with root package name */
        public static final C0275f f36907c = new C0275f();

        private C0275f() {
            super(io.ktor.utils.io.internal.g.a(), io.ktor.utils.io.internal.g.b(), null);
        }

        public String toString() {
            return "Terminated";
        }
    }

    public static final class g extends f {

        /* renamed from: c, reason: collision with root package name */
        private final c f36908c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(c cVar) {
            super(cVar.f36895a, cVar.f36896b, null);
            r.e(cVar, "initial");
            this.f36908c = cVar;
        }

        @Override // io.ktor.utils.io.internal.f
        public ByteBuffer b() {
            return this.f36908c.b();
        }

        @Override // io.ktor.utils.io.internal.f
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public e c() {
            return this.f36908c.i();
        }

        @Override // io.ktor.utils.io.internal.f
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public b f() {
            return this.f36908c.g();
        }

        public String toString() {
            return "Writing";
        }
    }

    public /* synthetic */ f(ByteBuffer byteBuffer, h hVar, AbstractC0650j abstractC0650j) {
        this(byteBuffer, hVar);
    }

    public ByteBuffer a() {
        throw new IllegalStateException(("read buffer is not available in state " + this).toString());
    }

    public ByteBuffer b() {
        throw new IllegalStateException(("write buffer is not available in state " + this).toString());
    }

    public f c() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent reading is not supported").toString());
    }

    public f d() {
        throw new IllegalStateException(("ByteChannel[state: " + this + "] Concurrent writing is not supported").toString());
    }

    public f e() {
        throw new IllegalStateException(("Unable to stop reading in state " + this).toString());
    }

    public f f() {
        throw new IllegalStateException(("Unable to stop writing in state " + this).toString());
    }

    private f(ByteBuffer byteBuffer, h hVar) {
        this.f36895a = byteBuffer;
        this.f36896b = hVar;
    }
}
