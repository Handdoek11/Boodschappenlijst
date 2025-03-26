package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.p0;
import androidx.core.app.t;
import androidx.fragment.app.AbstractActivityC0911j;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import androidx.savedstate.a;
import c.InterfaceC0968b;

/* renamed from: androidx.appcompat.app.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0835d extends AbstractActivityC0911j implements InterfaceC0836e, t.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AbstractC0838g mDelegate;
    private Resources mResources;

    /* renamed from: androidx.appcompat.app.d$a */
    class a implements a.c {
        a() {
        }

        @Override // androidx.savedstate.a.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            AbstractActivityC0835d.this.getDelegate().C(bundle);
            return bundle;
        }
    }

    /* renamed from: androidx.appcompat.app.d$b */
    class b implements InterfaceC0968b {
        b() {
        }

        @Override // c.InterfaceC0968b
        public void a(Context context) {
            AbstractC0838g delegate = AbstractActivityC0835d.this.getDelegate();
            delegate.t();
            delegate.y(AbstractActivityC0835d.this.getSavedStateRegistry().b(AbstractActivityC0835d.DELEGATE_TAG));
        }
    }

    public AbstractActivityC0835d() {
        s0();
    }

    private void s0() {
        getSavedStateRegistry().h(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private void t0() {
        M.a(getWindow().getDecorView(), this);
        N.a(getWindow().getDecorView(), this);
        f1.e.a(getWindow().getDecorView(), this);
        androidx.activity.z.a(getWindow().getDecorView(), this);
    }

    private boolean u0(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t0();
        getDelegate().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().g(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC0832a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.f()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC0832a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.o(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i8) {
        return (T) getDelegate().j(i8);
    }

    public AbstractC0838g getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AbstractC0838g.h(this, this);
        }
        return this.mDelegate;
    }

    public InterfaceC0833b getDrawerToggleDelegate() {
        return getDelegate().n();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().q();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && p0.c()) {
            this.mResources = new p0(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC0832a getSupportActionBar() {
        return getDelegate().s();
    }

    @Override // androidx.core.app.t.a
    public Intent getSupportParentActivityIntent() {
        return androidx.core.app.i.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().u();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().x(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(androidx.core.app.t tVar) {
        tVar.c(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getDelegate().z();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent keyEvent) {
        if (u0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i8, keyEvent);
    }

    @Override // androidx.fragment.app.AbstractActivityC0911j, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i8, MenuItem menuItem) {
        if (super.onMenuItemSelected(i8, menuItem)) {
            return true;
        }
        AbstractC0832a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.i() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i8, Menu menu) {
        return super.onMenuOpened(i8, menu);
    }

    protected void onNightModeChanged(int i8) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i8, Menu menu) {
        super.onPanelClosed(i8, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().A(bundle);
    }

    @Override // androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        getDelegate().B();
    }

    public void onPrepareSupportNavigateUpTaskStack(androidx.core.app.t tVar) {
    }

    @Override // androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onStart() {
        super.onStart();
        getDelegate().D();
    }

    @Override // androidx.fragment.app.AbstractActivityC0911j, android.app.Activity
    protected void onStop() {
        super.onStop();
        getDelegate().E();
    }

    @Override // androidx.appcompat.app.InterfaceC0836e
    public void onSupportActionModeFinished(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.InterfaceC0836e
    public void onSupportActionModeStarted(androidx.appcompat.view.b bVar) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        androidx.core.app.t e8 = androidx.core.app.t.e(this);
        onCreateSupportNavigateUpTaskStack(e8);
        onPrepareSupportNavigateUpTaskStack(e8);
        e8.j();
        try {
            androidx.core.app.b.q(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i8) {
        super.onTitleChanged(charSequence, i8);
        getDelegate().O(charSequence);
    }

    @Override // androidx.appcompat.app.InterfaceC0836e
    public androidx.appcompat.view.b onWindowStartingSupportActionMode(b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC0832a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.p()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i8) {
        t0();
        getDelegate().I(i8);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().M(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i8) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z7) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z7) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z7) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i8) {
        super.setTheme(i8);
        getDelegate().N(i8);
    }

    public androidx.appcompat.view.b startSupportActionMode(b.a aVar) {
        return getDelegate().P(aVar);
    }

    public void supportInvalidateOptionsMenu() {
        getDelegate().u();
    }

    public void supportNavigateUpTo(Intent intent) {
        androidx.core.app.i.e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i8) {
        return getDelegate().H(i8);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return androidx.core.app.i.f(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        t0();
        getDelegate().J(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        t0();
        getDelegate().K(view, layoutParams);
    }

    protected void onLocalesChanged(v0.i iVar) {
    }
}
