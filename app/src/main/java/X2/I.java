package X2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.AbstractActivityC0911j;
import androidx.fragment.app.Fragment;
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
public final class I extends Fragment implements InterfaceC0759g {

    /* renamed from: w0, reason: collision with root package name */
    private static final WeakHashMap f5916w0 = new WeakHashMap();

    /* renamed from: t0, reason: collision with root package name */
    private final Map f5917t0 = DesugarCollections.synchronizedMap(new C6397a());

    /* renamed from: u0, reason: collision with root package name */
    private int f5918u0 = 0;

    /* renamed from: v0, reason: collision with root package name */
    private Bundle f5919v0;

    public static I f2(AbstractActivityC0911j abstractActivityC0911j) {
        I i8;
        WeakHashMap weakHashMap = f5916w0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(abstractActivityC0911j);
        if (weakReference != null && (i8 = (I) weakReference.get()) != null) {
            return i8;
        }
        try {
            I i9 = (I) abstractActivityC0911j.getSupportFragmentManager().h0("SupportLifecycleFragmentImpl");
            if (i9 == null || i9.A0()) {
                i9 = new I();
                abstractActivityC0911j.getSupportFragmentManager().o().d(i9, "SupportLifecycleFragmentImpl").h();
            }
            weakHashMap.put(abstractActivityC0911j, new WeakReference(i9));
            return i9;
        } catch (ClassCastException e8) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void E0(int i8, int i9, Intent intent) {
        super.E0(i8, i9, intent);
        Iterator it = this.f5917t0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).e(i8, i9, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void J0(Bundle bundle) {
        super.J0(bundle);
        this.f5918u0 = 1;
        this.f5919v0 = bundle;
        for (Map.Entry entry : this.f5917t0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void O0() {
        super.O0();
        this.f5918u0 = 5;
        Iterator it = this.f5917t0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).g();
        }
    }

    @Override // X2.InterfaceC0759g
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (this.f5917t0.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f5917t0.put(str, lifecycleCallback);
        if (this.f5918u0 > 0) {
            new o3.e(Looper.getMainLooper()).post(new H(this, lifecycleCallback, str));
        }
    }

    @Override // X2.InterfaceC0759g
    public final LifecycleCallback d(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.f5917t0.get(str));
    }

    @Override // X2.InterfaceC0759g
    public final /* synthetic */ Activity e() {
        return p();
    }

    @Override // androidx.fragment.app.Fragment
    public final void e1() {
        super.e1();
        this.f5918u0 = 3;
        Iterator it = this.f5917t0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void f1(Bundle bundle) {
        super.f1(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f5917t0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void g1() {
        super.g1();
        this.f5918u0 = 2;
        Iterator it = this.f5917t0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void h1() {
        super.h1();
        this.f5918u0 = 4;
        Iterator it = this.f5917t0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).k();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void l(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.l(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f5917t0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }
}
