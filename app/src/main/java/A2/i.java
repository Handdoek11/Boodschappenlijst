package a2;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import d2.AbstractC5709k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i extends AbstractC0809a {

    /* renamed from: w, reason: collision with root package name */
    private static boolean f6527w;

    /* renamed from: x, reason: collision with root package name */
    private static int f6528x = com.bumptech.glide.h.f12560a;

    /* renamed from: o, reason: collision with root package name */
    protected final View f6529o;

    /* renamed from: s, reason: collision with root package name */
    private final a f6530s;

    /* renamed from: t, reason: collision with root package name */
    private View.OnAttachStateChangeListener f6531t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f6532u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f6533v;

    static final class a {

        /* renamed from: e, reason: collision with root package name */
        static Integer f6534e;

        /* renamed from: a, reason: collision with root package name */
        private final View f6535a;

        /* renamed from: b, reason: collision with root package name */
        private final List f6536b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        boolean f6537c;

        /* renamed from: d, reason: collision with root package name */
        private ViewTreeObserverOnPreDrawListenerC0129a f6538d;

        /* renamed from: a2.i$a$a, reason: collision with other inner class name */
        private static final class ViewTreeObserverOnPreDrawListenerC0129a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: o, reason: collision with root package name */
            private final WeakReference f6539o;

            ViewTreeObserverOnPreDrawListenerC0129a(a aVar) {
                this.f6539o = new WeakReference(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = (a) this.f6539o.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(View view) {
            this.f6535a = view;
        }

        private static int c(Context context) {
            if (f6534e == null) {
                Display defaultDisplay = ((WindowManager) AbstractC5709k.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f6534e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f6534e.intValue();
        }

        private int e(int i8, int i9, int i10) {
            int i11 = i9 - i10;
            if (i11 > 0) {
                return i11;
            }
            if (this.f6537c && this.f6535a.isLayoutRequested()) {
                return 0;
            }
            int i12 = i8 - i10;
            if (i12 > 0) {
                return i12;
            }
            if (this.f6535a.isLayoutRequested() || i9 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f6535a.getContext());
        }

        private int f() {
            int paddingTop = this.f6535a.getPaddingTop() + this.f6535a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f6535a.getLayoutParams();
            return e(this.f6535a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.f6535a.getPaddingLeft() + this.f6535a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f6535a.getLayoutParams();
            return e(this.f6535a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i8) {
            return i8 > 0 || i8 == Integer.MIN_VALUE;
        }

        private boolean i(int i8, int i9) {
            return h(i8) && h(i9);
        }

        private void j(int i8, int i9) {
            Iterator it = new ArrayList(this.f6536b).iterator();
            while (it.hasNext()) {
                ((g) it.next()).d(i8, i9);
            }
        }

        void a() {
            if (this.f6536b.isEmpty()) {
                return;
            }
            int g8 = g();
            int f8 = f();
            if (i(g8, f8)) {
                j(g8, f8);
                b();
            }
        }

        void b() {
            ViewTreeObserver viewTreeObserver = this.f6535a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f6538d);
            }
            this.f6538d = null;
            this.f6536b.clear();
        }

        void d(g gVar) {
            int g8 = g();
            int f8 = f();
            if (i(g8, f8)) {
                gVar.d(g8, f8);
                return;
            }
            if (!this.f6536b.contains(gVar)) {
                this.f6536b.add(gVar);
            }
            if (this.f6538d == null) {
                ViewTreeObserver viewTreeObserver = this.f6535a.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC0129a viewTreeObserverOnPreDrawListenerC0129a = new ViewTreeObserverOnPreDrawListenerC0129a(this);
                this.f6538d = viewTreeObserverOnPreDrawListenerC0129a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0129a);
            }
        }

        void k(g gVar) {
            this.f6536b.remove(gVar);
        }
    }

    public i(View view) {
        this.f6529o = (View) AbstractC5709k.d(view);
        this.f6530s = new a(view);
    }

    private Object k() {
        return this.f6529o.getTag(f6528x);
    }

    private void l() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f6531t;
        if (onAttachStateChangeListener == null || this.f6533v) {
            return;
        }
        this.f6529o.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f6533v = true;
    }

    private void m() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f6531t;
        if (onAttachStateChangeListener == null || !this.f6533v) {
            return;
        }
        this.f6529o.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f6533v = false;
    }

    private void n(Object obj) {
        f6527w = true;
        this.f6529o.setTag(f6528x, obj);
    }

    @Override // a2.h
    public void b(g gVar) {
        this.f6530s.k(gVar);
    }

    @Override // a2.h
    public void c(Z1.c cVar) {
        n(cVar);
    }

    @Override // a2.h
    public void d(g gVar) {
        this.f6530s.d(gVar);
    }

    @Override // a2.AbstractC0809a, a2.h
    public void h(Drawable drawable) {
        super.h(drawable);
        l();
    }

    @Override // a2.h
    public Z1.c i() {
        Object k8 = k();
        if (k8 == null) {
            return null;
        }
        if (k8 instanceof Z1.c) {
            return (Z1.c) k8;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // a2.AbstractC0809a, a2.h
    public void j(Drawable drawable) {
        super.j(drawable);
        this.f6530s.b();
        if (this.f6532u) {
            return;
        }
        m();
    }

    public String toString() {
        return "Target for: " + this.f6529o;
    }
}
