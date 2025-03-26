package io.ktor.utils.io;

import J6.r;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class e {

    public static final class a extends io.ktor.utils.io.a {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ I6.l f36862q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z7, I6.l lVar) {
            super(z7, null, 0, 6, null);
            this.f36862q = lVar;
        }

        @Override // io.ktor.utils.io.a, io.ktor.utils.io.i
        public boolean a(Throwable th) {
            return super.a((Throwable) this.f36862q.invoke(th));
        }
    }

    public static final c a(boolean z7) {
        return new io.ktor.utils.io.a(z7, null, 0, 6, null);
    }

    public static final c b(boolean z7, I6.l lVar) {
        r.e(lVar, "exceptionMapper");
        return new a(z7, lVar);
    }

    public static /* synthetic */ c c(boolean z7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z7 = false;
        }
        return a(z7);
    }

    public static /* synthetic */ c d(boolean z7, I6.l lVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z7 = false;
        }
        return b(z7, lVar);
    }

    public static final f e(byte[] bArr, int i8, int i9) {
        r.e(bArr, "content");
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i8, i9);
        r.d(wrap, "wrap(content, offset, length)");
        return new io.ktor.utils.io.a(wrap);
    }
}
