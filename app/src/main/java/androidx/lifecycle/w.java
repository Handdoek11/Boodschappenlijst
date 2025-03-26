package androidx.lifecycle;

import J6.AbstractC0650j;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0922h;

/* loaded from: classes.dex */
public class w extends Fragment {

    /* renamed from: s, reason: collision with root package name */
    public static final b f10343s = new b(null);

    /* renamed from: o, reason: collision with root package name */
    private a f10344o;

    public interface a {
        void a();

        void onCreate();

        void onResume();
    }

    public static final class b {
        public /* synthetic */ b(AbstractC0650j abstractC0650j) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Activity activity, AbstractC0922h.a aVar) {
            J6.r.e(activity, "activity");
            J6.r.e(aVar, "event");
            if (activity instanceof InterfaceC0927m) {
                AbstractC0922h lifecycle = ((InterfaceC0927m) activity).getLifecycle();
                if (lifecycle instanceof C0928n) {
                    ((C0928n) lifecycle).h(aVar);
                }
            }
        }

        public final w b(Activity activity) {
            J6.r.e(activity, "<this>");
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            J6.r.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (w) findFragmentByTag;
        }

        public final void c(Activity activity) {
            J6.r.e(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new w(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }

        private b() {
        }
    }

    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a(null);

        public static final class a {
            public /* synthetic */ a(AbstractC0650j abstractC0650j) {
                this();
            }

            public final void a(Activity activity) {
                J6.r.e(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new c());
            }

            private a() {
            }
        }

        public static final void registerIn(Activity activity) {
            Companion.a(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            J6.r.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            J6.r.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            J6.r.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            J6.r.e(activity, "activity");
            w.f10343s.a(activity, AbstractC0922h.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            J6.r.e(activity, "activity");
            w.f10343s.a(activity, AbstractC0922h.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            J6.r.e(activity, "activity");
            w.f10343s.a(activity, AbstractC0922h.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            J6.r.e(activity, "activity");
            w.f10343s.a(activity, AbstractC0922h.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            J6.r.e(activity, "activity");
            w.f10343s.a(activity, AbstractC0922h.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            J6.r.e(activity, "activity");
            w.f10343s.a(activity, AbstractC0922h.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            J6.r.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            J6.r.e(activity, "activity");
            J6.r.e(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            J6.r.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            J6.r.e(activity, "activity");
        }
    }

    private final void a(AbstractC0922h.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            b bVar = f10343s;
            Activity activity = getActivity();
            J6.r.d(activity, "activity");
            bVar.a(activity, aVar);
        }
    }

    private final void b(a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    private final void c(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    private final void d(a aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void e(a aVar) {
        this.f10344o = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(this.f10344o);
        a(AbstractC0922h.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        a(AbstractC0922h.a.ON_DESTROY);
        this.f10344o = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        a(AbstractC0922h.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        c(this.f10344o);
        a(AbstractC0922h.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        d(this.f10344o);
        a(AbstractC0922h.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        a(AbstractC0922h.a.ON_STOP);
    }
}
