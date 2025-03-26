package X5;

import J6.AbstractC0650j;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: g, reason: collision with root package name */
    public static final C0118a f5944g = new C0118a(null);

    /* renamed from: a, reason: collision with root package name */
    private final ByteBuffer f5945a;

    /* renamed from: b, reason: collision with root package name */
    private int f5946b;

    /* renamed from: c, reason: collision with root package name */
    private int f5947c;

    /* renamed from: d, reason: collision with root package name */
    private int f5948d;

    /* renamed from: e, reason: collision with root package name */
    private int f5949e;

    /* renamed from: f, reason: collision with root package name */
    private final int f5950f;

    /* renamed from: X5.a$a, reason: collision with other inner class name */
    public static final class C0118a {
        public /* synthetic */ C0118a(AbstractC0650j abstractC0650j) {
            this();
        }

        public final a a() {
            return Y5.a.f6125j.a();
        }

        private C0118a() {
        }
    }

    public /* synthetic */ a(ByteBuffer byteBuffer, AbstractC0650j abstractC0650j) {
        this(byteBuffer);
    }

    public final void a(int i8) {
        int i9 = this.f5947c + i8;
        if (i8 < 0 || i9 > this.f5949e) {
            d.a(i8, g() - k());
            throw new KotlinNothingValueException();
        }
        this.f5947c = i9;
    }

    public final boolean b(int i8) {
        int i9 = this.f5949e;
        int i10 = this.f5947c;
        if (i8 < i10) {
            d.a(i8 - i10, g() - k());
            throw new KotlinNothingValueException();
        }
        if (i8 < i9) {
            this.f5947c = i8;
            return true;
        }
        if (i8 == i9) {
            this.f5947c = i8;
            return false;
        }
        d.a(i8 - i10, g() - k());
        throw new KotlinNothingValueException();
    }

    public final void c(int i8) {
        if (i8 == 0) {
            return;
        }
        int i9 = this.f5946b + i8;
        if (i8 < 0 || i9 > this.f5947c) {
            d.b(i8, k() - i());
            throw new KotlinNothingValueException();
        }
        this.f5946b = i9;
    }

    public final void d(int i8) {
        if (i8 < 0 || i8 > this.f5947c) {
            d.b(i8 - this.f5946b, k() - i());
            throw new KotlinNothingValueException();
        }
        if (this.f5946b != i8) {
            this.f5946b = i8;
        }
    }

    protected void e(a aVar) {
        J6.r.e(aVar, "copy");
        aVar.f5949e = this.f5949e;
        aVar.f5948d = this.f5948d;
        aVar.f5946b = this.f5946b;
        aVar.f5947c = this.f5947c;
    }

    public final int f() {
        return this.f5950f;
    }

    public final int g() {
        return this.f5949e;
    }

    public final ByteBuffer h() {
        return this.f5945a;
    }

    public final int i() {
        return this.f5946b;
    }

    public final int j() {
        return this.f5948d;
    }

    public final int k() {
        return this.f5947c;
    }

    public final byte l() {
        int i8 = this.f5946b;
        if (i8 == this.f5947c) {
            throw new EOFException("No readable bytes available.");
        }
        this.f5946b = i8 + 1;
        return this.f5945a.get(i8);
    }

    public final void m() {
        this.f5949e = this.f5950f;
    }

    public final void n() {
        o(0);
        m();
    }

    public final void o(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException(("newReadPosition shouldn't be negative: " + i8).toString());
        }
        if (i8 <= this.f5946b) {
            this.f5946b = i8;
            if (this.f5948d > i8) {
                this.f5948d = i8;
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("newReadPosition shouldn't be ahead of the read position: " + i8 + " > " + this.f5946b).toString());
    }

    public final void p(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException(("endGap shouldn't be negative: " + i8).toString());
        }
        int i9 = this.f5950f - i8;
        if (i9 >= this.f5947c) {
            this.f5949e = i9;
            return;
        }
        if (i9 < 0) {
            d.c(this, i8);
        }
        if (i9 < this.f5948d) {
            d.e(this, i8);
        }
        if (this.f5946b != this.f5947c) {
            d.d(this, i8);
            return;
        }
        this.f5949e = i9;
        this.f5946b = i9;
        this.f5947c = i9;
    }

    public final void q(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException(("startGap shouldn't be negative: " + i8).toString());
        }
        int i9 = this.f5946b;
        if (i9 >= i8) {
            this.f5948d = i8;
            return;
        }
        if (i9 != this.f5947c) {
            d.g(this, i8);
            throw new KotlinNothingValueException();
        }
        if (i8 > this.f5949e) {
            d.h(this, i8);
            throw new KotlinNothingValueException();
        }
        this.f5947c = i8;
        this.f5946b = i8;
        this.f5948d = i8;
    }

    public void r() {
        n();
        s();
    }

    public final void s() {
        t(this.f5950f - this.f5948d);
    }

    public final void t(int i8) {
        int i9 = this.f5948d;
        this.f5946b = i9;
        this.f5947c = i9;
        this.f5949e = i8;
    }

    public String toString() {
        return "Buffer(" + (k() - i()) + " used, " + (g() - k()) + " free, " + (this.f5948d + (f() - g())) + " reserved of " + this.f5950f + ')';
    }

    private a(ByteBuffer byteBuffer) {
        this.f5945a = byteBuffer;
        this.f5949e = byteBuffer.limit();
        this.f5950f = byteBuffer.limit();
    }
}
