package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import h.C5818a;
import i.AbstractC5845a;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import o0.AbstractC6278a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import q.C6404h;
import q.C6406j;
import q.C6407k;
import q.C6408l;
import r0.AbstractC6641a;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: i, reason: collision with root package name */
    private static W f7714i;

    /* renamed from: a, reason: collision with root package name */
    private WeakHashMap f7716a;

    /* renamed from: b, reason: collision with root package name */
    private C6407k f7717b;

    /* renamed from: c, reason: collision with root package name */
    private C6408l f7718c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap f7719d = new WeakHashMap(0);

    /* renamed from: e, reason: collision with root package name */
    private TypedValue f7720e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7721f;

    /* renamed from: g, reason: collision with root package name */
    private f f7722g;

    /* renamed from: h, reason: collision with root package name */
    private static final PorterDuff.Mode f7713h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j, reason: collision with root package name */
    private static final c f7715j = new c(6);

    static class a implements e {
        a() {
        }

        @Override // androidx.appcompat.widget.W.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C5818a.l(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e8) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e8);
                return null;
            }
        }
    }

    private static class b implements e {
        b() {
        }

        @Override // androidx.appcompat.widget.W.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.c.b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e8) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e8);
                return null;
            }
        }
    }

    private static class c extends C6406j {
        public c(int i8) {
            super(i8);
        }

        private static int j(int i8, PorterDuff.Mode mode) {
            return ((i8 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter k(int i8, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) c(Integer.valueOf(j(i8, mode)));
        }

        PorterDuffColorFilter l(int i8, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) d(Integer.valueOf(j(i8, mode)), porterDuffColorFilter);
        }
    }

    static class d implements e {
        d() {
        }

        @Override // androidx.appcompat.widget.W.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    AbstractC5845a.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e8) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e8);
                }
            }
            return null;
        }
    }

    private interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface f {
        boolean a(Context context, int i8, Drawable drawable);

        PorterDuff.Mode b(int i8);

        Drawable c(W w7, Context context, int i8);

        ColorStateList d(Context context, int i8);

        boolean e(Context context, int i8, Drawable drawable);
    }

    private static class g implements e {
        g() {
        }

        @Override // androidx.appcompat.widget.W.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.h.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e8) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e8);
                return null;
            }
        }
    }

    private void a(String str, e eVar) {
        if (this.f7717b == null) {
            this.f7717b = new C6407k();
        }
        this.f7717b.put(str, eVar);
    }

    private synchronized boolean b(Context context, long j8, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            C6404h c6404h = (C6404h) this.f7719d.get(context);
            if (c6404h == null) {
                c6404h = new C6404h();
                this.f7719d.put(context, c6404h);
            }
            c6404h.m(j8, new WeakReference(constantState));
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    private void c(Context context, int i8, ColorStateList colorStateList) {
        if (this.f7716a == null) {
            this.f7716a = new WeakHashMap();
        }
        C6408l c6408l = (C6408l) this.f7716a.get(context);
        if (c6408l == null) {
            c6408l = new C6408l();
            this.f7716a.put(context, c6408l);
        }
        c6408l.b(i8, colorStateList);
    }

    private void d(Context context) {
        if (this.f7721f) {
            return;
        }
        this.f7721f = true;
        Drawable j8 = j(context, i.b.f36278a);
        if (j8 == null || !q(j8)) {
            this.f7721f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable f(Context context, int i8) {
        if (this.f7720e == null) {
            this.f7720e = new TypedValue();
        }
        TypedValue typedValue = this.f7720e;
        context.getResources().getValue(i8, typedValue, true);
        long e8 = e(typedValue);
        Drawable i9 = i(context, e8);
        if (i9 != null) {
            return i9;
        }
        f fVar = this.f7722g;
        Drawable c8 = fVar == null ? null : fVar.c(this, context, i8);
        if (c8 != null) {
            c8.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e8, c8);
        }
        return c8;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized W h() {
        W w7;
        synchronized (W.class) {
            try {
                if (f7714i == null) {
                    W w8 = new W();
                    f7714i = w8;
                    p(w8);
                }
                w7 = f7714i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return w7;
    }

    private synchronized Drawable i(Context context, long j8) {
        C6404h c6404h = (C6404h) this.f7719d.get(context);
        if (c6404h == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c6404h.h(j8);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c6404h.p(j8);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i8, PorterDuff.Mode mode) {
        PorterDuffColorFilter k8;
        synchronized (W.class) {
            c cVar = f7715j;
            k8 = cVar.k(i8, mode);
            if (k8 == null) {
                k8 = new PorterDuffColorFilter(i8, mode);
                cVar.l(i8, mode, k8);
            }
        }
        return k8;
    }

    private ColorStateList n(Context context, int i8) {
        C6408l c6408l;
        WeakHashMap weakHashMap = this.f7716a;
        if (weakHashMap == null || (c6408l = (C6408l) weakHashMap.get(context)) == null) {
            return null;
        }
        return (ColorStateList) c6408l.h(i8);
    }

    private static void p(W w7) {
        if (Build.VERSION.SDK_INT < 24) {
            w7.a("vector", new g());
            w7.a("animated-vector", new b());
            w7.a("animated-selector", new a());
            w7.a("drawable", new d());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable r(Context context, int i8) {
        int next;
        C6407k c6407k = this.f7717b;
        if (c6407k == null || c6407k.isEmpty()) {
            return null;
        }
        C6408l c6408l = this.f7718c;
        if (c6408l != null) {
            String str = (String) c6408l.h(i8);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f7717b.get(str) == null)) {
                return null;
            }
        } else {
            this.f7718c = new C6408l();
        }
        if (this.f7720e == null) {
            this.f7720e = new TypedValue();
        }
        TypedValue typedValue = this.f7720e;
        Resources resources = context.getResources();
        resources.getValue(i8, typedValue, true);
        long e8 = e(typedValue);
        Drawable i9 = i(context, e8);
        if (i9 != null) {
            return i9;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i8);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f7718c.b(i8, name);
                e eVar = (e) this.f7717b.get(name);
                if (eVar != null) {
                    i9 = eVar.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (i9 != null) {
                    i9.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, e8, i9);
                }
            } catch (Exception e9) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e9);
            }
        }
        if (i9 == null) {
            this.f7718c.b(i8, "appcompat_skip_skip");
        }
        return i9;
    }

    private Drawable v(Context context, int i8, boolean z7, Drawable drawable) {
        ColorStateList m8 = m(context, i8);
        if (m8 != null) {
            Drawable r8 = AbstractC6641a.r(drawable.mutate());
            AbstractC6641a.o(r8, m8);
            PorterDuff.Mode o8 = o(i8);
            if (o8 == null) {
                return r8;
            }
            AbstractC6641a.p(r8, o8);
            return r8;
        }
        f fVar = this.f7722g;
        if ((fVar == null || !fVar.e(context, i8, drawable)) && !x(context, i8, drawable) && z7) {
            return null;
        }
        return drawable;
    }

    static void w(Drawable drawable, d0 d0Var, int[] iArr) {
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z7 = d0Var.f7813d;
        if (z7 || d0Var.f7812c) {
            drawable.setColorFilter(g(z7 ? d0Var.f7810a : null, d0Var.f7812c ? d0Var.f7811b : f7713h, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable j(Context context, int i8) {
        return k(context, i8, false);
    }

    synchronized Drawable k(Context context, int i8, boolean z7) {
        Drawable r8;
        try {
            d(context);
            r8 = r(context, i8);
            if (r8 == null) {
                r8 = f(context, i8);
            }
            if (r8 == null) {
                r8 = AbstractC6278a.e(context, i8);
            }
            if (r8 != null) {
                r8 = v(context, i8, z7, r8);
            }
            if (r8 != null) {
                O.b(r8);
            }
        } catch (Throwable th) {
            throw th;
        }
        return r8;
    }

    synchronized ColorStateList m(Context context, int i8) {
        ColorStateList n8;
        n8 = n(context, i8);
        if (n8 == null) {
            f fVar = this.f7722g;
            n8 = fVar == null ? null : fVar.d(context, i8);
            if (n8 != null) {
                c(context, i8, n8);
            }
        }
        return n8;
    }

    PorterDuff.Mode o(int i8) {
        f fVar = this.f7722g;
        if (fVar == null) {
            return null;
        }
        return fVar.b(i8);
    }

    public synchronized void s(Context context) {
        C6404h c6404h = (C6404h) this.f7719d.get(context);
        if (c6404h != null) {
            c6404h.c();
        }
    }

    synchronized Drawable t(Context context, p0 p0Var, int i8) {
        try {
            Drawable r8 = r(context, i8);
            if (r8 == null) {
                r8 = p0Var.a(i8);
            }
            if (r8 == null) {
                return null;
            }
            return v(context, i8, false, r8);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void u(f fVar) {
        this.f7722g = fVar;
    }

    boolean x(Context context, int i8, Drawable drawable) {
        f fVar = this.f7722g;
        return fVar != null && fVar.a(context, i8, drawable);
    }
}
