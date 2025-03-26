package j5;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import l5.AbstractC6177c;
import z0.X;

/* loaded from: classes2.dex */
class d extends RecyclerView.o {

    /* renamed from: a, reason: collision with root package name */
    private RecyclerView f38308a;

    /* renamed from: b, reason: collision with root package name */
    private RecyclerView.F f38309b;

    /* renamed from: c, reason: collision with root package name */
    private final long f38310c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f38311d;

    /* renamed from: e, reason: collision with root package name */
    private int f38312e;

    /* renamed from: f, reason: collision with root package name */
    private int f38313f;

    /* renamed from: g, reason: collision with root package name */
    private long f38314g;

    /* renamed from: h, reason: collision with root package name */
    private final long f38315h;

    /* renamed from: i, reason: collision with root package name */
    private final long f38316i;

    /* renamed from: j, reason: collision with root package name */
    private Interpolator f38317j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f38318k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f38319l;

    /* renamed from: m, reason: collision with root package name */
    private int f38320m;

    private static class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private WeakReference f38321o;

        /* renamed from: s, reason: collision with root package name */
        private final int f38322s;

        public a(d dVar, int i8) {
            this.f38321o = new WeakReference(dVar);
            this.f38322s = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = (d) this.f38321o.get();
            this.f38321o.clear();
            this.f38321o = null;
            if (dVar != null) {
                dVar.o(this.f38322s);
            }
        }
    }

    public d(RecyclerView recyclerView, RecyclerView.F f8, int i8, long j8, long j9) {
        Rect rect = new Rect();
        this.f38311d = rect;
        this.f38320m = 0;
        this.f38308a = recyclerView;
        this.f38309b = f8;
        this.f38310c = f8.E();
        this.f38319l = i8 == 2 || i8 == 4;
        this.f38315h = j8 + 50;
        this.f38316i = j9;
        this.f38312e = (int) (f8.f10944a.getTranslationX() + 0.5f);
        this.f38313f = (int) (f8.f10944a.getTranslationY() + 0.5f);
        AbstractC6177c.w(this.f38309b.f10944a, rect);
    }

    private float j(long j8) {
        long j9 = this.f38315h;
        if (j8 < j9) {
            return 1.0f;
        }
        long j10 = this.f38316i;
        if (j8 >= j9 + j10 || j10 == 0) {
            return 0.0f;
        }
        float f8 = 1.0f - ((j8 - j9) / j10);
        Interpolator interpolator = this.f38317j;
        return interpolator != null ? interpolator.getInterpolation(f8) : f8;
    }

    private void k(Canvas canvas, Drawable drawable, float f8) {
        Rect rect = this.f38311d;
        int i8 = this.f38312e;
        int i9 = this.f38313f;
        boolean z7 = this.f38319l;
        float f9 = z7 ? 1.0f : f8;
        if (!z7) {
            f8 = 1.0f;
        }
        int width = (int) ((f9 * rect.width()) + 0.5f);
        int height = (int) ((f8 * rect.height()) + 0.5f);
        if (height == 0 || width == 0 || drawable == null) {
            return;
        }
        int save = canvas.save();
        int i10 = rect.left;
        int i11 = rect.top;
        canvas.clipRect(i10 + i8, i11 + i9, i10 + i8 + width, i11 + i9 + height);
        canvas.translate((rect.left + i8) - ((rect.width() - width) / 2), (rect.top + i9) - ((rect.height() - height) / 2));
        drawable.setBounds(0, 0, rect.width(), rect.height());
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    private void l() {
        this.f38308a.j1(this);
        p();
        this.f38308a = null;
        this.f38309b = null;
        this.f38313f = 0;
        this.f38317j = null;
    }

    protected static long m(long j8) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= j8) {
            return currentTimeMillis - j8;
        }
        return Long.MAX_VALUE;
    }

    private void n(int i8, long j8) {
        int i9 = 1 << i8;
        int i10 = this.f38320m;
        if ((i10 & i9) != 0) {
            return;
        }
        this.f38320m = i9 | i10;
        X.g0(this.f38308a, new a(this, i8), j8);
    }

    private void p() {
        X.e0(this.f38308a);
    }

    private boolean q(long j8) {
        long j9 = this.f38315h;
        return j8 >= j9 && j8 < j9 + this.f38316i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b8) {
        long m8 = m(this.f38314g);
        k(canvas, this.f38318k, j(m8));
        if (this.f38310c == this.f38309b.E()) {
            this.f38312e = (int) (this.f38309b.f10944a.getTranslationX() + 0.5f);
            this.f38313f = (int) (this.f38309b.f10944a.getTranslationY() + 0.5f);
        }
        if (q(m8)) {
            p();
        }
    }

    void o(int i8) {
        long m8 = m(this.f38314g);
        this.f38320m = (~(1 << i8)) & this.f38320m;
        if (i8 != 0) {
            if (i8 != 1) {
                return;
            }
            l();
        } else {
            long j8 = this.f38315h;
            if (m8 < j8) {
                n(0, j8 - m8);
            } else {
                p();
                n(1, this.f38316i);
            }
        }
    }

    public void r(Interpolator interpolator) {
        this.f38317j = interpolator;
    }

    public void s() {
        X.e(k.a(this.f38309b)).c();
        this.f38308a.j(this);
        this.f38314g = System.currentTimeMillis();
        this.f38313f = (int) (this.f38309b.f10944a.getTranslationY() + 0.5f);
        this.f38318k = this.f38309b.f10944a.getBackground();
        p();
        n(0, this.f38315h);
    }
}
