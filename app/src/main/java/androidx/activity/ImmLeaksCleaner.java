package androidx.activity;

import J6.AbstractC0650j;
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.InterfaceC0925k;
import androidx.lifecycle.InterfaceC0927m;
import java.lang.reflect.Field;
import x6.AbstractC6929k;
import x6.InterfaceC6928j;

/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements InterfaceC0925k {

    /* renamed from: s, reason: collision with root package name */
    public static final c f6597s = new c(null);

    /* renamed from: t, reason: collision with root package name */
    private static final InterfaceC6928j f6598t = AbstractC6929k.a(b.f6600o);

    /* renamed from: o, reason: collision with root package name */
    private final Activity f6599o;

    public static abstract class a {
        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        public abstract boolean a(InputMethodManager inputMethodManager);

        public abstract Object b(InputMethodManager inputMethodManager);

        public abstract View c(InputMethodManager inputMethodManager);

        private a() {
        }
    }

    static final class b extends J6.s implements I6.a {

        /* renamed from: o, reason: collision with root package name */
        public static final b f6600o = new b();

        b() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a invoke() {
            try {
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                declaredField3.setAccessible(true);
                J6.r.d(declaredField3, "hField");
                J6.r.d(declaredField, "servedViewField");
                J6.r.d(declaredField2, "nextServedViewField");
                return new e(declaredField3, declaredField, declaredField2);
            } catch (NoSuchFieldException unused) {
                return d.f6601a;
            }
        }
    }

    public static final class c {
        public /* synthetic */ c(AbstractC0650j abstractC0650j) {
            this();
        }

        public final a a() {
            return (a) ImmLeaksCleaner.f6598t.getValue();
        }

        private c() {
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f6601a = new d();

        private d() {
            super(null);
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public boolean a(InputMethodManager inputMethodManager) {
            J6.r.e(inputMethodManager, "<this>");
            return false;
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public Object b(InputMethodManager inputMethodManager) {
            J6.r.e(inputMethodManager, "<this>");
            return null;
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public View c(InputMethodManager inputMethodManager) {
            J6.r.e(inputMethodManager, "<this>");
            return null;
        }
    }

    public static final class e extends a {

        /* renamed from: a, reason: collision with root package name */
        private final Field f6602a;

        /* renamed from: b, reason: collision with root package name */
        private final Field f6603b;

        /* renamed from: c, reason: collision with root package name */
        private final Field f6604c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Field field, Field field2, Field field3) {
            super(null);
            J6.r.e(field, "hField");
            J6.r.e(field2, "servedViewField");
            J6.r.e(field3, "nextServedViewField");
            this.f6602a = field;
            this.f6603b = field2;
            this.f6604c = field3;
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public boolean a(InputMethodManager inputMethodManager) {
            J6.r.e(inputMethodManager, "<this>");
            try {
                this.f6604c.set(inputMethodManager, null);
                return true;
            } catch (IllegalAccessException unused) {
                return false;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public Object b(InputMethodManager inputMethodManager) {
            J6.r.e(inputMethodManager, "<this>");
            try {
                return this.f6602a.get(inputMethodManager);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // androidx.activity.ImmLeaksCleaner.a
        public View c(InputMethodManager inputMethodManager) {
            J6.r.e(inputMethodManager, "<this>");
            try {
                return (View) this.f6603b.get(inputMethodManager);
            } catch (ClassCastException | IllegalAccessException unused) {
                return null;
            }
        }
    }

    public ImmLeaksCleaner(Activity activity) {
        J6.r.e(activity, "activity");
        this.f6599o = activity;
    }

    @Override // androidx.lifecycle.InterfaceC0925k
    public void f(InterfaceC0927m interfaceC0927m, AbstractC0922h.a aVar) {
        J6.r.e(interfaceC0927m, "source");
        J6.r.e(aVar, "event");
        if (aVar != AbstractC0922h.a.ON_DESTROY) {
            return;
        }
        Object systemService = this.f6599o.getSystemService("input_method");
        J6.r.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        a a8 = f6597s.a();
        Object b8 = a8.b(inputMethodManager);
        if (b8 == null) {
            return;
        }
        synchronized (b8) {
            View c8 = a8.c(inputMethodManager);
            if (c8 == null) {
                return;
            }
            if (c8.isAttachedToWindow()) {
                return;
            }
            boolean a9 = a8.a(inputMethodManager);
            if (a9) {
                inputMethodManager.isActive();
            }
        }
    }
}
