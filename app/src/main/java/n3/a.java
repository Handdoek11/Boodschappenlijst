package N3;

import S3.b;
import android.content.Context;
import android.graphics.Color;
import q0.AbstractC6410a;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    private static final int f4098f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f4099a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4100b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4101c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4102d;

    /* renamed from: e, reason: collision with root package name */
    private final float f4103e;

    public a(Context context) {
        this(b.b(context, D3.b.f1417p, false), L3.a.b(context, D3.b.f1416o, 0), L3.a.b(context, D3.b.f1415n, 0), L3.a.b(context, D3.b.f1413l, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean e(int i8) {
        return AbstractC6410a.k(i8, 255) == this.f4102d;
    }

    public float a(float f8) {
        if (this.f4103e <= 0.0f || f8 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f8 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i8, float f8) {
        int i9;
        float a8 = a(f8);
        int alpha = Color.alpha(i8);
        int j8 = L3.a.j(AbstractC6410a.k(i8, 255), this.f4100b, a8);
        if (a8 > 0.0f && (i9 = this.f4101c) != 0) {
            j8 = L3.a.i(j8, AbstractC6410a.k(i9, f4098f));
        }
        return AbstractC6410a.k(j8, alpha);
    }

    public int c(int i8, float f8) {
        return (this.f4099a && e(i8)) ? b(i8, f8) : i8;
    }

    public boolean d() {
        return this.f4099a;
    }

    public a(boolean z7, int i8, int i9, int i10, float f8) {
        this.f4099a = z7;
        this.f4100b = i8;
        this.f4101c = i9;
        this.f4102d = i10;
        this.f4103e = f8;
    }
}
