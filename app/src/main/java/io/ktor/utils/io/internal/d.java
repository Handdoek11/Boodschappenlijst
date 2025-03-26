package io.ktor.utils.io.internal;

import J6.r;
import io.ktor.utils.io.internal.f;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final int f36887a;

    /* renamed from: b, reason: collision with root package name */
    private static final int f36888b;

    /* renamed from: c, reason: collision with root package name */
    private static final int f36889c;

    /* renamed from: d, reason: collision with root package name */
    private static final Z5.g f36890d;

    /* renamed from: e, reason: collision with root package name */
    private static final Z5.g f36891e;

    /* renamed from: f, reason: collision with root package name */
    private static final Z5.g f36892f;

    public static final class a extends Z5.f {
        a() {
        }

        @Override // Z5.g
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public f.c C() {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(d.a());
            r.d(allocateDirect, "allocateDirect(BUFFER_SIZE)");
            return new f.c(allocateDirect, 0, 2, null);
        }
    }

    public static final class b extends Z5.d {
        b(int i8) {
            super(i8);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Z5.d
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void f(f.c cVar) {
            r.e(cVar, "instance");
            d.d().o0(cVar.f36895a);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Z5.d
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public f.c h() {
            return new f.c((ByteBuffer) d.d().C(), 0, 2, null);
        }
    }

    static {
        int a8 = i.a("BufferSize", 4096);
        f36887a = a8;
        int a9 = i.a("BufferPoolSize", 2048);
        f36888b = a9;
        int a10 = i.a("BufferObjectPoolSize", 1024);
        f36889c = a10;
        f36890d = new Z5.e(a9, a8);
        f36891e = new b(a10);
        f36892f = new a();
    }

    public static final int a() {
        return f36887a;
    }

    public static final Z5.g b() {
        return f36892f;
    }

    public static final Z5.g c() {
        return f36891e;
    }

    public static final Z5.g d() {
        return f36890d;
    }
}
