package X5;

import J6.AbstractC0650j;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class j extends q {
    public /* synthetic */ j(Z5.g gVar, int i8, AbstractC0650j abstractC0650j) {
        this((i8 & 1) != 0 ? Y5.a.f6125j.c() : gVar);
    }

    @Override // java.lang.Appendable
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public j append(char c8) {
        q e8 = super.e(c8);
        J6.r.c(e8, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (j) e8;
    }

    @Override // java.lang.Appendable
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public j append(CharSequence charSequence) {
        q f8 = super.f(charSequence);
        J6.r.c(f8, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (j) f8;
    }

    @Override // X5.q
    /* renamed from: T, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public j g(CharSequence charSequence, int i8, int i9) {
        q g8 = super.g(charSequence, i8, i9);
        J6.r.c(g8, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (j) g8;
    }

    public final k X() {
        int b02 = b0();
        Y5.a K7 = K();
        return K7 == null ? k.f5953z.a() : new k(K7, b02, A());
    }

    public final int b0() {
        return E();
    }

    public String toString() {
        return "BytePacketBuilder(" + b0() + " bytes written)";
    }

    @Override // X5.q
    protected final void u(ByteBuffer byteBuffer, int i8, int i9) {
        J6.r.e(byteBuffer, "source");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Z5.g gVar) {
        super(gVar);
        J6.r.e(gVar, "pool");
    }

    @Override // X5.q
    protected final void l() {
    }
}
