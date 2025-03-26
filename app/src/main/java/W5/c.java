package w5;

import J6.r;
import v5.C6841a;

/* loaded from: classes2.dex */
public final class c extends C6892a {

    /* renamed from: y, reason: collision with root package name */
    private final byte[] f44371y;

    /* renamed from: z, reason: collision with root package name */
    private final boolean f44372z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C6841a c6841a, E5.b bVar, F5.c cVar, byte[] bArr) {
        super(c6841a);
        r.e(c6841a, "client");
        r.e(bVar, "request");
        r.e(cVar, "response");
        r.e(bArr, "responseBody");
        this.f44371y = bArr;
        i(new d(this, bVar));
        j(new e(this, bArr, cVar));
        this.f44372z = true;
    }

    @Override // w5.C6892a
    protected boolean b() {
        return this.f44372z;
    }

    @Override // w5.C6892a
    protected Object f(A6.d dVar) {
        return io.ktor.utils.io.d.a(this.f44371y);
    }
}
