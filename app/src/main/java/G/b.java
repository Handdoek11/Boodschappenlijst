package G;

import android.graphics.Paint;

/* loaded from: classes.dex */
public final class b implements n {

    /* renamed from: a, reason: collision with root package name */
    private Paint f2426a;

    /* renamed from: b, reason: collision with root package name */
    private int f2427b;

    public b(Paint paint) {
        this.f2426a = paint;
        this.f2427b = d.f2432a.a();
    }

    @Override // G.n
    public void a(int i8) {
        c.e(this.f2426a, i8);
    }

    @Override // G.n
    public void b(long j8) {
        c.c(this.f2426a, j8);
    }

    @Override // G.n
    public void c(float f8) {
        c.d(this.f2426a, f8);
    }

    public b() {
        this(c.b());
    }
}
