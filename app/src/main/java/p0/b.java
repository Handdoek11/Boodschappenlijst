package P0;

import J6.AbstractC0650j;
import J6.r;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.w;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import y6.AbstractC6971J;
import y6.AbstractC6987o;
import y6.P;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f4276a = new b();

    /* renamed from: b, reason: collision with root package name */
    private static c f4277b = c.f4288d;

    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* renamed from: P0.b$b, reason: collision with other inner class name */
    public interface InterfaceC0083b {
    }

    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final a f4287c = new a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final c f4288d = new c(P.b(), null, AbstractC6971J.e());

        /* renamed from: a, reason: collision with root package name */
        private final Set f4289a;

        /* renamed from: b, reason: collision with root package name */
        private final Map f4290b;

        public static final class a {
            public /* synthetic */ a(AbstractC0650j abstractC0650j) {
                this();
            }

            private a() {
            }
        }

        public c(Set set, InterfaceC0083b interfaceC0083b, Map map) {
            r.e(set, "flags");
            r.e(map, "allowedViolations");
            this.f4289a = set;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f4290b = linkedHashMap;
        }

        public final Set a() {
            return this.f4289a;
        }

        public final InterfaceC0083b b() {
            return null;
        }

        public final Map c() {
            return this.f4290b;
        }
    }

    private b() {
    }

    private final c b(Fragment fragment) {
        while (fragment != null) {
            if (fragment.v0()) {
                w a02 = fragment.a0();
                r.d(a02, "declaringFragment.parentFragmentManager");
                if (a02.z0() != null) {
                    c z02 = a02.z0();
                    r.b(z02);
                    return z02;
                }
            }
            fragment = fragment.Z();
        }
        return f4277b;
    }

    private final void c(c cVar, final Violation violation) {
        Fragment a8 = violation.a();
        final String name = a8.getClass().getName();
        if (cVar.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, violation);
        }
        cVar.b();
        if (cVar.a().contains(a.PENALTY_DEATH)) {
            k(a8, new Runnable() { // from class: P0.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.d(name, violation);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, Violation violation) {
        r.e(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    private final void e(Violation violation) {
        if (w.G0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + violation.a().getClass().getName(), violation);
        }
    }

    public static final void f(Fragment fragment, String str) {
        r.e(fragment, "fragment");
        r.e(str, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, str);
        b bVar = f4276a;
        bVar.e(fragmentReuseViolation);
        c b8 = bVar.b(fragment);
        if (b8.a().contains(a.DETECT_FRAGMENT_REUSE) && bVar.l(b8, fragment.getClass(), fragmentReuseViolation.getClass())) {
            bVar.c(b8, fragmentReuseViolation);
        }
    }

    public static final void g(Fragment fragment, ViewGroup viewGroup) {
        r.e(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
        b bVar = f4276a;
        bVar.e(fragmentTagUsageViolation);
        c b8 = bVar.b(fragment);
        if (b8.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && bVar.l(b8, fragment.getClass(), fragmentTagUsageViolation.getClass())) {
            bVar.c(b8, fragmentTagUsageViolation);
        }
    }

    public static final void h(Fragment fragment) {
        r.e(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        b bVar = f4276a;
        bVar.e(getTargetFragmentUsageViolation);
        c b8 = bVar.b(fragment);
        if (b8.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && bVar.l(b8, fragment.getClass(), getTargetFragmentUsageViolation.getClass())) {
            bVar.c(b8, getTargetFragmentUsageViolation);
        }
    }

    public static final void i(Fragment fragment, Fragment fragment2, int i8) {
        r.e(fragment, "violatingFragment");
        r.e(fragment2, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(fragment, fragment2, i8);
        b bVar = f4276a;
        bVar.e(setTargetFragmentUsageViolation);
        c b8 = bVar.b(fragment);
        if (b8.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && bVar.l(b8, fragment.getClass(), setTargetFragmentUsageViolation.getClass())) {
            bVar.c(b8, setTargetFragmentUsageViolation);
        }
    }

    public static final void j(Fragment fragment, ViewGroup viewGroup) {
        r.e(fragment, "fragment");
        r.e(viewGroup, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, viewGroup);
        b bVar = f4276a;
        bVar.e(wrongFragmentContainerViolation);
        c b8 = bVar.b(fragment);
        if (b8.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && bVar.l(b8, fragment.getClass(), wrongFragmentContainerViolation.getClass())) {
            bVar.c(b8, wrongFragmentContainerViolation);
        }
    }

    private final void k(Fragment fragment, Runnable runnable) {
        if (!fragment.v0()) {
            runnable.run();
            return;
        }
        Handler g8 = fragment.a0().t0().g();
        r.d(g8, "fragment.parentFragmentManager.host.handler");
        if (r.a(g8.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            g8.post(runnable);
        }
    }

    private final boolean l(c cVar, Class cls, Class cls2) {
        Set set = (Set) cVar.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (r.a(cls2.getSuperclass(), Violation.class) || !AbstractC6987o.u(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
