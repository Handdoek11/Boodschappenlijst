package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* loaded from: classes.dex */
abstract class A {

    /* renamed from: a, reason: collision with root package name */
    private static final D f11427a;

    /* renamed from: b, reason: collision with root package name */
    static final Property f11428b;

    /* renamed from: c, reason: collision with root package name */
    static final Property f11429c;

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(A.b(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f8) {
            A.e(view, f8.floatValue());
        }
    }

    class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f11427a = new M();
        } else {
            f11427a = new L();
        }
        f11428b = new a(Float.class, "translationAlpha");
        f11429c = new b(Rect.class, "clipBounds");
    }

    static void a(View view) {
        f11427a.a(view);
    }

    static float b(View view) {
        return f11427a.b(view);
    }

    static void c(View view) {
        f11427a.c(view);
    }

    static void d(View view, int i8, int i9, int i10, int i11) {
        f11427a.d(view, i8, i9, i10, i11);
    }

    static void e(View view, float f8) {
        f11427a.e(view, f8);
    }

    static void f(View view, int i8) {
        f11427a.f(view, i8);
    }

    static void g(View view, Matrix matrix) {
        f11427a.g(view, matrix);
    }

    static void h(View view, Matrix matrix) {
        f11427a.h(view, matrix);
    }
}
