package X5;

import java.io.Closeable;
import java.nio.ByteBuffer;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public abstract class q implements Appendable, Closeable {

    /* renamed from: o, reason: collision with root package name */
    private final Z5.g f5966o;

    /* renamed from: s, reason: collision with root package name */
    private Y5.a f5967s;

    /* renamed from: t, reason: collision with root package name */
    private Y5.a f5968t;

    /* renamed from: u, reason: collision with root package name */
    private ByteBuffer f5969u;

    /* renamed from: v, reason: collision with root package name */
    private int f5970v;

    /* renamed from: w, reason: collision with root package name */
    private int f5971w;

    /* renamed from: x, reason: collision with root package name */
    private int f5972x;

    /* renamed from: y, reason: collision with root package name */
    private int f5973y;

    public q(Z5.g gVar) {
        J6.r.e(gVar, "pool");
        this.f5966o = gVar;
        this.f5969u = V5.c.f5732a.a();
    }

    private final void h(Y5.a aVar, Y5.a aVar2, int i8) {
        Y5.a aVar3 = this.f5968t;
        if (aVar3 == null) {
            this.f5967s = aVar;
            this.f5973y = 0;
        } else {
            aVar3.G(aVar);
            int i9 = this.f5970v;
            aVar3.b(i9);
            this.f5973y += i9 - this.f5972x;
        }
        this.f5968t = aVar2;
        this.f5973y += i8;
        this.f5969u = aVar2.h();
        this.f5970v = aVar2.k();
        this.f5972x = aVar2.i();
        this.f5971w = aVar2.g();
    }

    private final void i(char c8) {
        int i8 = 3;
        Y5.a G7 = G(3);
        try {
            ByteBuffer h8 = G7.h();
            int k8 = G7.k();
            if (c8 >= 0 && c8 < 128) {
                h8.put(k8, (byte) c8);
                i8 = 1;
            } else if (128 <= c8 && c8 < 2048) {
                h8.put(k8, (byte) (((c8 >> 6) & 31) | 192));
                h8.put(k8 + 1, (byte) ((c8 & '?') | 128));
                i8 = 2;
            } else if (2048 <= c8 && c8 < 0) {
                h8.put(k8, (byte) (((c8 >> '\f') & 15) | 224));
                h8.put(k8 + 1, (byte) (((c8 >> 6) & 63) | 128));
                h8.put(k8 + 2, (byte) ((c8 & '?') | 128));
            } else {
                if (0 > c8 || c8 >= 0) {
                    Y5.c.j(c8);
                    throw new KotlinNothingValueException();
                }
                h8.put(k8, (byte) (((c8 >> 18) & 7) | 240));
                h8.put(k8 + 1, (byte) (((c8 >> '\f') & 63) | 128));
                h8.put(k8 + 2, (byte) (((c8 >> 6) & 63) | 128));
                h8.put(k8 + 3, (byte) ((c8 & '?') | 128));
                i8 = 4;
            }
            G7.a(i8);
            if (i8 < 0) {
                throw new IllegalStateException("The returned value shouldn't be negative");
            }
            d();
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    private final Y5.a j() {
        Y5.a aVar = (Y5.a) this.f5966o.C();
        aVar.p(8);
        k(aVar);
        return aVar;
    }

    private final void z() {
        Y5.a K7 = K();
        if (K7 == null) {
            return;
        }
        Y5.a aVar = K7;
        do {
            try {
                u(aVar.h(), aVar.i(), aVar.k() - aVar.i());
                aVar = aVar.B();
            } finally {
                h.d(K7, this.f5966o);
            }
        } while (aVar != null);
    }

    protected final Z5.g A() {
        return this.f5966o;
    }

    public final int B() {
        return this.f5971w;
    }

    public final int D() {
        return this.f5970v;
    }

    protected final int E() {
        return this.f5973y + (this.f5970v - this.f5972x);
    }

    public final Y5.a G(int i8) {
        Y5.a aVar;
        if (B() - D() < i8 || (aVar = this.f5968t) == null) {
            return j();
        }
        aVar.b(this.f5970v);
        return aVar;
    }

    public final void I() {
        close();
    }

    public final Y5.a K() {
        Y5.a aVar = this.f5967s;
        if (aVar == null) {
            return null;
        }
        Y5.a aVar2 = this.f5968t;
        if (aVar2 != null) {
            aVar2.b(this.f5970v);
        }
        this.f5967s = null;
        this.f5968t = null;
        this.f5970v = 0;
        this.f5971w = 0;
        this.f5972x = 0;
        this.f5973y = 0;
        this.f5969u = V5.c.f5732a.a();
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            m();
        } finally {
            l();
        }
    }

    public final void d() {
        Y5.a aVar = this.f5968t;
        if (aVar != null) {
            this.f5970v = aVar.k();
        }
    }

    public q e(char c8) {
        int i8 = this.f5970v;
        int i9 = 3;
        if (this.f5971w - i8 < 3) {
            i(c8);
            return this;
        }
        ByteBuffer byteBuffer = this.f5969u;
        if (c8 >= 0 && c8 < 128) {
            byteBuffer.put(i8, (byte) c8);
            i9 = 1;
        } else if (128 <= c8 && c8 < 2048) {
            byteBuffer.put(i8, (byte) (((c8 >> 6) & 31) | 192));
            byteBuffer.put(i8 + 1, (byte) ((c8 & '?') | 128));
            i9 = 2;
        } else if (2048 <= c8 && c8 < 0) {
            byteBuffer.put(i8, (byte) (((c8 >> '\f') & 15) | 224));
            byteBuffer.put(i8 + 1, (byte) (((c8 >> 6) & 63) | 128));
            byteBuffer.put(i8 + 2, (byte) ((c8 & '?') | 128));
        } else {
            if (0 > c8 || c8 >= 0) {
                Y5.c.j(c8);
                throw new KotlinNothingValueException();
            }
            byteBuffer.put(i8, (byte) (((c8 >> 18) & 7) | 240));
            byteBuffer.put(i8 + 1, (byte) (((c8 >> '\f') & 63) | 128));
            byteBuffer.put(i8 + 2, (byte) (((c8 >> 6) & 63) | 128));
            byteBuffer.put(i8 + 3, (byte) ((c8 & '?') | 128));
            i9 = 4;
        }
        this.f5970v = i8 + i9;
        return this;
    }

    public q f(CharSequence charSequence) {
        if (charSequence == null) {
            g("null", 0, 4);
        } else {
            g(charSequence, 0, charSequence.length());
        }
        return this;
    }

    public q g(CharSequence charSequence, int i8, int i9) {
        if (charSequence == null) {
            return g("null", i8, i9);
        }
        r.h(this, charSequence, i8, i9, S6.d.f5130b);
        return this;
    }

    public final void k(Y5.a aVar) {
        J6.r.e(aVar, "buffer");
        if (aVar.B() != null) {
            throw new IllegalStateException("It should be a single buffer chunk.");
        }
        h(aVar, aVar, 0);
    }

    protected abstract void l();

    public final void m() {
        z();
    }

    protected abstract void u(ByteBuffer byteBuffer, int i8, int i9);
}
