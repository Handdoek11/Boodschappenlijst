package X2;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import q.C6397a;

/* loaded from: classes.dex */
public final class G extends Fragment implements InterfaceC0759g {

    /* renamed from: u, reason: collision with root package name */
    private static final WeakHashMap f5909u = new WeakHashMap();

    /* renamed from: o, reason: collision with root package name */
    private final Map f5910o = DesugarCollections.synchronizedMap(new C6397a());

    /* renamed from: s, reason: collision with root package name */
    private int f5911s = 0;

    /* renamed from: t, reason: collision with root package name */
    private Bundle f5912t;

    public static G f(Activity activity) {
        G g8;
        WeakHashMap weakHashMap = f5909u;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (g8 = (G) weakReference.get()) != null) {
            return g8;
        }
        try {
            G g9 = (G) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (g9 == null || g9.isRemoving()) {
                g9 = new G();
                activity.getFragmentManager().beginTransaction().add(g9, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(g9));
            return g9;
        } catch (ClassCastException e8) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e8);
        }
    }

    @Override // X2.InterfaceC0759g
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f5910o.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f5910o.put(str, lifecycleCallback);
        if (this.f5911s > 0) {
            new o3.e(Looper.getMainLooper()).post(new F(this, lifecycleCallback, str));
        }
    }

    @Override // X2.InterfaceC0759g
    public final LifecycleCallback d(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f5910o.get(str));
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f5910o.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // X2.InterfaceC0759g
    public final Activity e() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        Iterator it = this.f5910o.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i8, i9, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f5911s = 1;
        this.f5912t = bundle;
        for (Map.Entry entry : this.f5910o.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f5911s = 5;
        Iterator it = this.f5910o.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f5911s = 3;
        Iterator it = this.f5910o.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f5910o.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f5911s = 2;
        Iterator it = this.f5910o.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f5911s = 4;
        Iterator it = this.f5910o.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }
}
