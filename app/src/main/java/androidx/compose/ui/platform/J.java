package androidx.compose.ui.platform;

import J6.AbstractC0650j;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import x6.C6916E;

/* loaded from: classes.dex */
public abstract class J extends View implements Q.F {

    /* renamed from: s, reason: collision with root package name */
    public static final c f8212s = new c(null);

    /* renamed from: t, reason: collision with root package name */
    public static final int f8213t = 8;

    /* renamed from: u, reason: collision with root package name */
    private static final I6.p f8214u = b.f8218o;

    /* renamed from: v, reason: collision with root package name */
    private static final ViewOutlineProvider f8215v = new a();

    /* renamed from: w, reason: collision with root package name */
    private static boolean f8216w;

    /* renamed from: o, reason: collision with root package name */
    private final E f8217o;

    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            J6.r.c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline a8 = ((J) view).f8217o.a();
            J6.r.b(a8);
            outline.set(a8);
        }
    }

    static final class b extends J6.s implements I6.p {

        /* renamed from: o, reason: collision with root package name */
        public static final b f8218o = new b();

        b() {
            super(2);
        }

        public final void b(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }

        @Override // I6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((View) obj, (Matrix) obj2);
            return C6916E.f44463a;
        }
    }

    public static final class c {
        public /* synthetic */ c(AbstractC0650j abstractC0650j) {
            this();
        }

        public final boolean a() {
            return J.f8216w;
        }

        private c() {
        }
    }
}
