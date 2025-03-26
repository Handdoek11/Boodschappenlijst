package D5;

import J6.r;
import v5.C6841a;
import w5.C6892a;

/* loaded from: classes2.dex */
public final class a extends C6892a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C6841a c6841a, io.ktor.utils.io.f fVar, C6892a c6892a) {
        super(c6841a);
        r.e(c6841a, "client");
        r.e(fVar, "content");
        r.e(c6892a, "originCall");
        i(new c(this, c6892a.d()));
        j(new d(this, fVar, c6892a.e()));
    }
}
