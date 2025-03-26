package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public class p {

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f9704d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    private final int f9705a;

    /* renamed from: b, reason: collision with root package name */
    private final n f9706b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f9707c = 0;

    p(n nVar, int i8) {
        this.f9706b = nVar;
        this.f9705a = i8;
    }

    private M0.a g() {
        ThreadLocal threadLocal = f9704d;
        M0.a aVar = (M0.a) threadLocal.get();
        if (aVar == null) {
            aVar = new M0.a();
            threadLocal.set(aVar);
        }
        this.f9706b.d().j(aVar, this.f9705a);
        return aVar;
    }

    public void a(Canvas canvas, float f8, float f9, Paint paint) {
        Typeface g8 = this.f9706b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g8);
        canvas.drawText(this.f9706b.c(), this.f9705a * 2, 2, f8, f9, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i8) {
        return g().h(i8);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f9707c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        return (this.f9707c & 4) > 0;
    }

    public void l(boolean z7) {
        int d8 = d();
        if (z7) {
            this.f9707c = d8 | 4;
        } else {
            this.f9707c = d8;
        }
    }

    public void m(boolean z7) {
        int i8 = this.f9707c & 4;
        this.f9707c = z7 ? i8 | 2 : i8 | 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int c8 = c();
        for (int i8 = 0; i8 < c8; i8++) {
            sb.append(Integer.toHexString(b(i8)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
