package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.b;
import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.C0928n;
import androidx.savedstate.a;
import c.InterfaceC0968b;
import f1.InterfaceC5764d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o0.InterfaceC6279b;
import o0.InterfaceC6280c;
import y0.InterfaceC6936a;
import z0.InterfaceC6998B;
import z0.InterfaceC7056w;

/* renamed from: androidx.fragment.app.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0911j extends ComponentActivity implements b.c {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final C0914m mFragments = C0914m.b(new a());
    final C0928n mFragmentLifecycleRegistry = new C0928n(this);
    boolean mStopped = true;

    /* renamed from: androidx.fragment.app.j$a */
    class a extends o implements InterfaceC6279b, InterfaceC6280c, androidx.core.app.o, androidx.core.app.p, androidx.lifecycle.L, androidx.activity.w, d.f, InterfaceC5764d, A, InterfaceC7056w {
        public a() {
            super(AbstractActivityC0911j.this);
        }

        @Override // androidx.fragment.app.A
        public void a(w wVar, Fragment fragment) {
            AbstractActivityC0911j.this.onAttachFragment(fragment);
        }

        @Override // z0.InterfaceC7056w
        public void addMenuProvider(InterfaceC6998B interfaceC6998B) {
            AbstractActivityC0911j.this.addMenuProvider(interfaceC6998B);
        }

        @Override // o0.InterfaceC6279b
        public void addOnConfigurationChangedListener(InterfaceC6936a interfaceC6936a) {
            AbstractActivityC0911j.this.addOnConfigurationChangedListener(interfaceC6936a);
        }

        @Override // androidx.core.app.o
        public void addOnMultiWindowModeChangedListener(InterfaceC6936a interfaceC6936a) {
            AbstractActivityC0911j.this.addOnMultiWindowModeChangedListener(interfaceC6936a);
        }

        @Override // androidx.core.app.p
        public void addOnPictureInPictureModeChangedListener(InterfaceC6936a interfaceC6936a) {
            AbstractActivityC0911j.this.addOnPictureInPictureModeChangedListener(interfaceC6936a);
        }

        @Override // o0.InterfaceC6280c
        public void addOnTrimMemoryListener(InterfaceC6936a interfaceC6936a) {
            AbstractActivityC0911j.this.addOnTrimMemoryListener(interfaceC6936a);
        }

        @Override // androidx.fragment.app.AbstractC0913l
        public View c(int i8) {
            return AbstractActivityC0911j.this.findViewById(i8);
        }

        @Override // androidx.fragment.app.AbstractC0913l
        public boolean d() {
            Window window = AbstractActivityC0911j.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // d.f
        public d.e getActivityResultRegistry() {
            return AbstractActivityC0911j.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.InterfaceC0927m
        public AbstractC0922h getLifecycle() {
            return AbstractActivityC0911j.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.w
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return AbstractActivityC0911j.this.getOnBackPressedDispatcher();
        }

        @Override // f1.InterfaceC5764d
        public androidx.savedstate.a getSavedStateRegistry() {
            return AbstractActivityC0911j.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.L
        public androidx.lifecycle.K getViewModelStore() {
            return AbstractActivityC0911j.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.o
        public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            AbstractActivityC0911j.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.o
        public LayoutInflater j() {
            return AbstractActivityC0911j.this.getLayoutInflater().cloneInContext(AbstractActivityC0911j.this);
        }

        @Override // androidx.fragment.app.o
        public void m() {
            n();
        }

        public void n() {
            AbstractActivityC0911j.this.invalidateOptionsMenu();
        }

        @Override // androidx.fragment.app.o
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public AbstractActivityC0911j i() {
            return AbstractActivityC0911j.this;
        }

        @Override // z0.InterfaceC7056w
        public void removeMenuProvider(InterfaceC6998B interfaceC6998B) {
            AbstractActivityC0911j.this.removeMenuProvider(interfaceC6998B);
        }

        @Override // o0.InterfaceC6279b
        public void removeOnConfigurationChangedListener(InterfaceC6936a interfaceC6936a) {
            AbstractActivityC0911j.this.removeOnConfigurationChangedListener(interfaceC6936a);
        }

        @Override // androidx.core.app.o
        public void removeOnMultiWindowModeChangedListener(InterfaceC6936a interfaceC6936a) {
            AbstractActivityC0911j.this.removeOnMultiWindowModeChangedListener(interfaceC6936a);
        }

        @Override // androidx.core.app.p
        public void removeOnPictureInPictureModeChangedListener(InterfaceC6936a interfaceC6936a) {
            AbstractActivityC0911j.this.removeOnPictureInPictureModeChangedListener(interfaceC6936a);
        }

        @Override // o0.InterfaceC6280c
        public void removeOnTrimMemoryListener(InterfaceC6936a interfaceC6936a) {
            AbstractActivityC0911j.this.removeOnTrimMemoryListener(interfaceC6936a);
        }
    }

    public AbstractActivityC0911j() {
        m0();
    }

    private void m0() {
        getSavedStateRegistry().h(LIFECYCLE_TAG, new a.c() { // from class: androidx.fragment.app.f
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                return this.f10092a.n0();
            }
        });
        addOnConfigurationChangedListener(new InterfaceC6936a() { // from class: androidx.fragment.app.g
            @Override // y0.InterfaceC6936a
            public final void accept(Object obj) {
                this.f10093a.o0((Configuration) obj);
            }
        });
        addOnNewIntentListener(new InterfaceC6936a() { // from class: androidx.fragment.app.h
            @Override // y0.InterfaceC6936a
            public final void accept(Object obj) {
                this.f10094a.p0((Intent) obj);
            }
        });
        addOnContextAvailableListener(new InterfaceC0968b() { // from class: androidx.fragment.app.i
            @Override // c.InterfaceC0968b
            public final void a(Context context) {
                this.f10095a.q0(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle n0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.h(AbstractC0922h.a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0(Configuration configuration) {
        this.mFragments.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p0(Intent intent) {
        this.mFragments.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q0(Context context) {
        this.mFragments.a(null);
    }

    private static boolean r0(w wVar, AbstractC0922h.b bVar) {
        boolean z7 = false;
        for (Fragment fragment : wVar.s0()) {
            if (fragment != null) {
                if (fragment.U() != null) {
                    z7 |= r0(fragment.y(), bVar);
                }
                I i8 = fragment.f9895k0;
                if (i8 != null && i8.getLifecycle().b().c(AbstractC0922h.b.STARTED)) {
                    fragment.f9895k0.f(bVar);
                    z7 = true;
                }
                if (fragment.f9894j0.b().c(AbstractC0922h.b.STARTED)) {
                    fragment.f9894j0.m(bVar);
                    z7 = true;
                }
            }
        }
        return z7;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.n(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.l().W(str, fileDescriptor, printWriter, strArr);
        }
    }

    public w getSupportFragmentManager() {
        return this.mFragments.l();
    }

    @Deprecated
    public androidx.loader.app.a getSupportLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    void markFragmentsCreated() {
        while (r0(getSupportFragmentManager(), AbstractC0922h.b.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        this.mFragments.m();
        super.onActivityResult(i8, i9, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.h(AbstractC0922h.a.ON_CREATE);
        this.mFragments.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.f();
        this.mFragmentLifecycleRegistry.h(AbstractC0922h.a.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i8, MenuItem menuItem) {
        if (super.onMenuItemSelected(i8, menuItem)) {
            return true;
        }
        if (i8 == 6) {
            return this.mFragments.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.g();
        this.mFragmentLifecycleRegistry.h(AbstractC0922h.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
        this.mFragments.m();
        super.onRequestPermissionsResult(i8, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mFragments.m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.k();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.h(AbstractC0922h.a.ON_RESUME);
        this.mFragments.h();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.mFragments.m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.k();
        this.mFragmentLifecycleRegistry.h(AbstractC0922h.a.ON_START);
        this.mFragments.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.j();
        this.mFragmentLifecycleRegistry.h(AbstractC0922h.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(androidx.core.app.s sVar) {
        androidx.core.app.b.w(this, sVar);
    }

    public void setExitSharedElementCallback(androidx.core.app.s sVar) {
        androidx.core.app.b.x(this, sVar);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i8) {
        startActivityFromFragment(fragment, intent, i8, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i8, Intent intent, int i9, int i10, int i11, Bundle bundle) {
        if (i8 == -1) {
            androidx.core.app.b.z(this, intentSender, i8, intent, i9, i10, i11, bundle);
        } else {
            fragment.b2(intentSender, i8, intent, i9, i10, i11, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.b.r(this);
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.b.t(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.b.A(this);
    }

    @Override // androidx.core.app.b.c
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i8) {
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i8, Bundle bundle) {
        if (i8 == -1) {
            androidx.core.app.b.y(this, intent, -1, bundle);
        } else {
            fragment.a2(intent, i8, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }
}
