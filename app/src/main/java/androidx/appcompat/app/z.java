package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.C0844d;
import androidx.appcompat.widget.C0846f;
import androidx.appcompat.widget.C0847g;
import androidx.appcompat.widget.C0848h;
import androidx.appcompat.widget.C0852l;
import androidx.appcompat.widget.C0856p;
import androidx.appcompat.widget.C0858s;
import androidx.appcompat.widget.C0861v;
import androidx.appcompat.widget.C0862w;
import androidx.appcompat.widget.C0864y;
import androidx.appcompat.widget.c0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import q.C6407k;
import z0.X;

/* loaded from: classes.dex */
public class z {

    /* renamed from: b, reason: collision with root package name */
    private static final Class[] f6973b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f6974c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f6975d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f6976e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f6977f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f6978g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    private static final C6407k f6979h = new C6407k();

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f6980a = new Object[2];

    private static class a implements View.OnClickListener {

        /* renamed from: o, reason: collision with root package name */
        private final View f6981o;

        /* renamed from: s, reason: collision with root package name */
        private final String f6982s;

        /* renamed from: t, reason: collision with root package name */
        private Method f6983t;

        /* renamed from: u, reason: collision with root package name */
        private Context f6984u;

        public a(View view, String str) {
            this.f6981o = view;
            this.f6982s = str;
        }

        private void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f6982s, View.class)) != null) {
                        this.f6983t = method;
                        this.f6984u = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f6981o.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f6981o.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f6982s + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f6981o.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f6983t == null) {
                a(this.f6981o.getContext());
            }
            try {
                this.f6983t.invoke(this.f6984u, view);
            } catch (IllegalAccessException e8) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException("Could not execute method for android:onClick", e9);
            }
        }
    }

    private void a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6975d);
        if (obtainStyledAttributes.hasValue(0)) {
            X.o0(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f6976e);
        if (obtainStyledAttributes2.hasValue(0)) {
            X.q0(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f6977f);
        if (obtainStyledAttributes3.hasValue(0)) {
            X.D0(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    private void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && view.hasOnClickListeners()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6974c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View s(Context context, String str, String str2) {
        String str3;
        C6407k c6407k = f6979h;
        Constructor constructor = (Constructor) c6407k.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f6973b);
            c6407k.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f6980a);
    }

    private View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f6980a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i8 = 0;
            while (true) {
                String[] strArr = f6978g;
                if (i8 >= strArr.length) {
                    return null;
                }
                View s8 = s(context, str, strArr[i8]);
                if (s8 != null) {
                    return s8;
                }
                i8++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f6980a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context u(Context context, AttributeSet attributeSet, boolean z7, boolean z8) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f35586H3, 0, 0);
        int resourceId = z7 ? obtainStyledAttributes.getResourceId(f.j.f35591I3, 0) : 0;
        if (z8 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(f.j.f35596J3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof androidx.appcompat.view.d) && ((androidx.appcompat.view.d) context).c() == resourceId) ? context : new androidx.appcompat.view.d(context, resourceId) : context;
    }

    private void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected C0844d c(Context context, AttributeSet attributeSet) {
        return new C0844d(context, attributeSet);
    }

    protected C0846f d(Context context, AttributeSet attributeSet) {
        return new C0846f(context, attributeSet);
    }

    protected C0847g e(Context context, AttributeSet attributeSet) {
        return new C0847g(context, attributeSet);
    }

    protected C0848h f(Context context, AttributeSet attributeSet) {
        return new C0848h(context, attributeSet);
    }

    protected C0852l g(Context context, AttributeSet attributeSet) {
        return new C0852l(context, attributeSet);
    }

    protected C0856p h(Context context, AttributeSet attributeSet) {
        return new C0856p(context, attributeSet);
    }

    protected androidx.appcompat.widget.r i(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.r(context, attributeSet);
    }

    protected C0858s j(Context context, AttributeSet attributeSet) {
        return new C0858s(context, attributeSet);
    }

    protected C0861v k(Context context, AttributeSet attributeSet) {
        return new C0861v(context, attributeSet);
    }

    protected C0862w l(Context context, AttributeSet attributeSet) {
        return new C0862w(context, attributeSet);
    }

    protected C0864y m(Context context, AttributeSet attributeSet) {
        return new C0864y(context, attributeSet);
    }

    protected androidx.appcompat.widget.A n(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.A(context, attributeSet);
    }

    protected androidx.appcompat.widget.D o(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.D(context, attributeSet);
    }

    protected androidx.appcompat.widget.H p(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.H(context, attributeSet);
    }

    protected View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View r(View view, String str, Context context, AttributeSet attributeSet, boolean z7, boolean z8, boolean z9, boolean z10) {
        Context context2;
        View l8;
        context2 = (!z7 || view == null) ? context : view.getContext();
        if (z8 || z9) {
            context2 = u(context2, attributeSet, z8, z9);
        }
        if (z10) {
            context2 = c0.b(context2);
        }
        str.hashCode();
        switch (str) {
            case "RatingBar":
                l8 = l(context2, attributeSet);
                v(l8, str);
                break;
            case "CheckedTextView":
                l8 = f(context2, attributeSet);
                v(l8, str);
                break;
            case "MultiAutoCompleteTextView":
                l8 = j(context2, attributeSet);
                v(l8, str);
                break;
            case "TextView":
                l8 = o(context2, attributeSet);
                v(l8, str);
                break;
            case "ImageButton":
                l8 = h(context2, attributeSet);
                v(l8, str);
                break;
            case "SeekBar":
                l8 = m(context2, attributeSet);
                v(l8, str);
                break;
            case "Spinner":
                l8 = n(context2, attributeSet);
                v(l8, str);
                break;
            case "RadioButton":
                l8 = k(context2, attributeSet);
                v(l8, str);
                break;
            case "ToggleButton":
                l8 = p(context2, attributeSet);
                v(l8, str);
                break;
            case "ImageView":
                l8 = i(context2, attributeSet);
                v(l8, str);
                break;
            case "AutoCompleteTextView":
                l8 = c(context2, attributeSet);
                v(l8, str);
                break;
            case "CheckBox":
                l8 = e(context2, attributeSet);
                v(l8, str);
                break;
            case "EditText":
                l8 = g(context2, attributeSet);
                v(l8, str);
                break;
            case "Button":
                l8 = d(context2, attributeSet);
                v(l8, str);
                break;
            default:
                l8 = q(context2, str, attributeSet);
                break;
        }
        if (l8 == null && context != context2) {
            l8 = t(context2, str, attributeSet);
        }
        if (l8 != null) {
            b(l8, attributeSet);
            a(context2, l8, attributeSet);
        }
        return l8;
    }
}
