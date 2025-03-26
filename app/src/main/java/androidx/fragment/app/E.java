package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0922h;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    private final n f9828a;

    /* renamed from: b, reason: collision with root package name */
    private final ClassLoader f9829b;

    /* renamed from: d, reason: collision with root package name */
    int f9831d;

    /* renamed from: e, reason: collision with root package name */
    int f9832e;

    /* renamed from: f, reason: collision with root package name */
    int f9833f;

    /* renamed from: g, reason: collision with root package name */
    int f9834g;

    /* renamed from: h, reason: collision with root package name */
    int f9835h;

    /* renamed from: i, reason: collision with root package name */
    boolean f9836i;

    /* renamed from: k, reason: collision with root package name */
    String f9838k;

    /* renamed from: l, reason: collision with root package name */
    int f9839l;

    /* renamed from: m, reason: collision with root package name */
    CharSequence f9840m;

    /* renamed from: n, reason: collision with root package name */
    int f9841n;

    /* renamed from: o, reason: collision with root package name */
    CharSequence f9842o;

    /* renamed from: p, reason: collision with root package name */
    ArrayList f9843p;

    /* renamed from: q, reason: collision with root package name */
    ArrayList f9844q;

    /* renamed from: s, reason: collision with root package name */
    ArrayList f9846s;

    /* renamed from: c, reason: collision with root package name */
    ArrayList f9830c = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    boolean f9837j = true;

    /* renamed from: r, reason: collision with root package name */
    boolean f9845r = false;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f9847a;

        /* renamed from: b, reason: collision with root package name */
        Fragment f9848b;

        /* renamed from: c, reason: collision with root package name */
        boolean f9849c;

        /* renamed from: d, reason: collision with root package name */
        int f9850d;

        /* renamed from: e, reason: collision with root package name */
        int f9851e;

        /* renamed from: f, reason: collision with root package name */
        int f9852f;

        /* renamed from: g, reason: collision with root package name */
        int f9853g;

        /* renamed from: h, reason: collision with root package name */
        AbstractC0922h.b f9854h;

        /* renamed from: i, reason: collision with root package name */
        AbstractC0922h.b f9855i;

        a() {
        }

        a(int i8, Fragment fragment) {
            this.f9847a = i8;
            this.f9848b = fragment;
            this.f9849c = false;
            AbstractC0922h.b bVar = AbstractC0922h.b.RESUMED;
            this.f9854h = bVar;
            this.f9855i = bVar;
        }

        a(int i8, Fragment fragment, boolean z7) {
            this.f9847a = i8;
            this.f9848b = fragment;
            this.f9849c = z7;
            AbstractC0922h.b bVar = AbstractC0922h.b.RESUMED;
            this.f9854h = bVar;
            this.f9855i = bVar;
        }
    }

    E(n nVar, ClassLoader classLoader) {
        this.f9828a = nVar;
        this.f9829b = classLoader;
    }

    public E b(int i8, Fragment fragment, String str) {
        l(i8, fragment, str, 1);
        return this;
    }

    E c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.f9883Y = viewGroup;
        return b(viewGroup.getId(), fragment, str);
    }

    public E d(Fragment fragment, String str) {
        l(0, fragment, str, 1);
        return this;
    }

    void e(a aVar) {
        this.f9830c.add(aVar);
        aVar.f9850d = this.f9831d;
        aVar.f9851e = this.f9832e;
        aVar.f9852f = this.f9833f;
        aVar.f9853g = this.f9834g;
    }

    public E f(String str) {
        if (!this.f9837j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f9836i = true;
        this.f9838k = str;
        return this;
    }

    public abstract int g();

    public abstract int h();

    public abstract void i();

    public abstract void j();

    public E k() {
        if (this.f9836i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f9837j = false;
        return this;
    }

    void l(int i8, Fragment fragment, String str, int i9) {
        String str2 = fragment.f9892h0;
        if (str2 != null) {
            P0.b.f(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.f9875Q;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f9875Q + " now " + str);
            }
            fragment.f9875Q = str;
        }
        if (i8 != 0) {
            if (i8 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i10 = fragment.f9873O;
            if (i10 != 0 && i10 != i8) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f9873O + " now " + i8);
            }
            fragment.f9873O = i8;
            fragment.f9874P = i8;
        }
        e(new a(i9, fragment));
    }

    public E m(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public E n(int i8, Fragment fragment) {
        return o(i8, fragment, null);
    }

    public E o(int i8, Fragment fragment, String str) {
        if (i8 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        l(i8, fragment, str, 2);
        return this;
    }

    public E p(boolean z7) {
        this.f9845r = z7;
        return this;
    }
}
