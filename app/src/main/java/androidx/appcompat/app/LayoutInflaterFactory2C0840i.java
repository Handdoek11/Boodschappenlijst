package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0851k;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.p0;
import androidx.appcompat.widget.q0;
import androidx.lifecycle.AbstractC0922h;
import androidx.lifecycle.InterfaceC0927m;
import f.AbstractC5752a;
import f.AbstractC5754c;
import f.AbstractC5757f;
import f.AbstractC5758g;
import g.AbstractC5794a;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;
import o0.AbstractC6278a;
import org.xmlpull.v1.XmlPullParser;
import p0.h;
import q.C6407k;
import z0.AbstractC7030i0;
import z0.AbstractC7050t;
import z0.AbstractC7052u;
import z0.C7026g0;
import z0.C7061y0;
import z0.InterfaceC7004H;
import z0.X;

/* renamed from: androidx.appcompat.app.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class LayoutInflaterFactory2C0840i extends AbstractC0838g implements e.a, LayoutInflater.Factory2 {

    /* renamed from: A0, reason: collision with root package name */
    private static final C6407k f6869A0 = new C6407k();

    /* renamed from: B0, reason: collision with root package name */
    private static final boolean f6870B0 = false;

    /* renamed from: C0, reason: collision with root package name */
    private static final int[] f6871C0 = {R.attr.windowBackground};

    /* renamed from: D0, reason: collision with root package name */
    private static final boolean f6872D0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    final Object f6873A;

    /* renamed from: B, reason: collision with root package name */
    final Context f6874B;

    /* renamed from: C, reason: collision with root package name */
    Window f6875C;

    /* renamed from: D, reason: collision with root package name */
    private n f6876D;

    /* renamed from: E, reason: collision with root package name */
    final InterfaceC0836e f6877E;

    /* renamed from: F, reason: collision with root package name */
    AbstractC0832a f6878F;

    /* renamed from: G, reason: collision with root package name */
    MenuInflater f6879G;

    /* renamed from: H, reason: collision with root package name */
    private CharSequence f6880H;

    /* renamed from: I, reason: collision with root package name */
    private androidx.appcompat.widget.I f6881I;

    /* renamed from: J, reason: collision with root package name */
    private h f6882J;

    /* renamed from: K, reason: collision with root package name */
    private t f6883K;

    /* renamed from: L, reason: collision with root package name */
    androidx.appcompat.view.b f6884L;

    /* renamed from: M, reason: collision with root package name */
    ActionBarContextView f6885M;

    /* renamed from: N, reason: collision with root package name */
    PopupWindow f6886N;

    /* renamed from: O, reason: collision with root package name */
    Runnable f6887O;

    /* renamed from: P, reason: collision with root package name */
    C7026g0 f6888P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f6889Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f6890R;

    /* renamed from: S, reason: collision with root package name */
    ViewGroup f6891S;

    /* renamed from: T, reason: collision with root package name */
    private TextView f6892T;

    /* renamed from: U, reason: collision with root package name */
    private View f6893U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f6894V;

    /* renamed from: W, reason: collision with root package name */
    private boolean f6895W;

    /* renamed from: X, reason: collision with root package name */
    boolean f6896X;

    /* renamed from: Y, reason: collision with root package name */
    boolean f6897Y;

    /* renamed from: Z, reason: collision with root package name */
    boolean f6898Z;

    /* renamed from: a0, reason: collision with root package name */
    boolean f6899a0;

    /* renamed from: b0, reason: collision with root package name */
    boolean f6900b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f6901c0;

    /* renamed from: d0, reason: collision with root package name */
    private s[] f6902d0;

    /* renamed from: e0, reason: collision with root package name */
    private s f6903e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f6904f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f6905g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f6906h0;

    /* renamed from: i0, reason: collision with root package name */
    boolean f6907i0;

    /* renamed from: j0, reason: collision with root package name */
    private Configuration f6908j0;

    /* renamed from: k0, reason: collision with root package name */
    private int f6909k0;

    /* renamed from: l0, reason: collision with root package name */
    private int f6910l0;

    /* renamed from: m0, reason: collision with root package name */
    private int f6911m0;

    /* renamed from: n0, reason: collision with root package name */
    private boolean f6912n0;

    /* renamed from: o0, reason: collision with root package name */
    private p f6913o0;

    /* renamed from: p0, reason: collision with root package name */
    private p f6914p0;

    /* renamed from: q0, reason: collision with root package name */
    boolean f6915q0;

    /* renamed from: r0, reason: collision with root package name */
    int f6916r0;

    /* renamed from: s0, reason: collision with root package name */
    private final Runnable f6917s0;

    /* renamed from: t0, reason: collision with root package name */
    private boolean f6918t0;

    /* renamed from: u0, reason: collision with root package name */
    private Rect f6919u0;

    /* renamed from: v0, reason: collision with root package name */
    private Rect f6920v0;

    /* renamed from: w0, reason: collision with root package name */
    private z f6921w0;

    /* renamed from: x0, reason: collision with root package name */
    private B f6922x0;

    /* renamed from: y0, reason: collision with root package name */
    private OnBackInvokedDispatcher f6923y0;

    /* renamed from: z0, reason: collision with root package name */
    private OnBackInvokedCallback f6924z0;

    /* renamed from: androidx.appcompat.app.i$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C0840i layoutInflaterFactory2C0840i = LayoutInflaterFactory2C0840i.this;
            if ((layoutInflaterFactory2C0840i.f6916r0 & 1) != 0) {
                layoutInflaterFactory2C0840i.j0(0);
            }
            LayoutInflaterFactory2C0840i layoutInflaterFactory2C0840i2 = LayoutInflaterFactory2C0840i.this;
            if ((layoutInflaterFactory2C0840i2.f6916r0 & 4096) != 0) {
                layoutInflaterFactory2C0840i2.j0(108);
            }
            LayoutInflaterFactory2C0840i layoutInflaterFactory2C0840i3 = LayoutInflaterFactory2C0840i.this;
            layoutInflaterFactory2C0840i3.f6915q0 = false;
            layoutInflaterFactory2C0840i3.f6916r0 = 0;
        }
    }

    /* renamed from: androidx.appcompat.app.i$b */
    class b implements InterfaceC7004H {
        b() {
        }

        @Override // z0.InterfaceC7004H
        public C7061y0 a(View view, C7061y0 c7061y0) {
            int k8 = c7061y0.k();
            int f12 = LayoutInflaterFactory2C0840i.this.f1(c7061y0, null);
            if (k8 != f12) {
                c7061y0 = c7061y0.o(c7061y0.i(), f12, c7061y0.j(), c7061y0.h());
            }
            return X.Z(view, c7061y0);
        }
    }

    /* renamed from: androidx.appcompat.app.i$c */
    class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            LayoutInflaterFactory2C0840i.this.h0();
        }
    }

    /* renamed from: androidx.appcompat.app.i$d */
    class d implements Runnable {

        /* renamed from: androidx.appcompat.app.i$d$a */
        class a extends AbstractC7030i0 {
            a() {
            }

            @Override // z0.InterfaceC7028h0
            public void b(View view) {
                LayoutInflaterFactory2C0840i.this.f6885M.setAlpha(1.0f);
                LayoutInflaterFactory2C0840i.this.f6888P.k(null);
                LayoutInflaterFactory2C0840i.this.f6888P = null;
            }

            @Override // z0.AbstractC7030i0, z0.InterfaceC7028h0
            public void c(View view) {
                LayoutInflaterFactory2C0840i.this.f6885M.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C0840i layoutInflaterFactory2C0840i = LayoutInflaterFactory2C0840i.this;
            layoutInflaterFactory2C0840i.f6886N.showAtLocation(layoutInflaterFactory2C0840i.f6885M, 55, 0, 0);
            LayoutInflaterFactory2C0840i.this.k0();
            if (!LayoutInflaterFactory2C0840i.this.V0()) {
                LayoutInflaterFactory2C0840i.this.f6885M.setAlpha(1.0f);
                LayoutInflaterFactory2C0840i.this.f6885M.setVisibility(0);
            } else {
                LayoutInflaterFactory2C0840i.this.f6885M.setAlpha(0.0f);
                LayoutInflaterFactory2C0840i layoutInflaterFactory2C0840i2 = LayoutInflaterFactory2C0840i.this;
                layoutInflaterFactory2C0840i2.f6888P = X.e(layoutInflaterFactory2C0840i2.f6885M).b(1.0f);
                LayoutInflaterFactory2C0840i.this.f6888P.k(new a());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.i$e */
    class e extends AbstractC7030i0 {
        e() {
        }

        @Override // z0.InterfaceC7028h0
        public void b(View view) {
            LayoutInflaterFactory2C0840i.this.f6885M.setAlpha(1.0f);
            LayoutInflaterFactory2C0840i.this.f6888P.k(null);
            LayoutInflaterFactory2C0840i.this.f6888P = null;
        }

        @Override // z0.AbstractC7030i0, z0.InterfaceC7028h0
        public void c(View view) {
            LayoutInflaterFactory2C0840i.this.f6885M.setVisibility(0);
            if (LayoutInflaterFactory2C0840i.this.f6885M.getParent() instanceof View) {
                X.k0((View) LayoutInflaterFactory2C0840i.this.f6885M.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.i$f */
    private class f implements InterfaceC0833b {
        f() {
        }
    }

    /* renamed from: androidx.appcompat.app.i$g */
    interface g {
        boolean a(int i8);

        View onCreatePanelView(int i8);
    }

    /* renamed from: androidx.appcompat.app.i$h */
    private final class h implements j.a {
        h() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z7) {
            LayoutInflaterFactory2C0840i.this.a0(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            Window.Callback w02 = LayoutInflaterFactory2C0840i.this.w0();
            if (w02 == null) {
                return true;
            }
            w02.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.i$i, reason: collision with other inner class name */
    class C0134i implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private b.a f6933a;

        /* renamed from: androidx.appcompat.app.i$i$a */
        class a extends AbstractC7030i0 {
            a() {
            }

            @Override // z0.InterfaceC7028h0
            public void b(View view) {
                LayoutInflaterFactory2C0840i.this.f6885M.setVisibility(8);
                LayoutInflaterFactory2C0840i layoutInflaterFactory2C0840i = LayoutInflaterFactory2C0840i.this;
                PopupWindow popupWindow = layoutInflaterFactory2C0840i.f6886N;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0840i.f6885M.getParent() instanceof View) {
                    X.k0((View) LayoutInflaterFactory2C0840i.this.f6885M.getParent());
                }
                LayoutInflaterFactory2C0840i.this.f6885M.k();
                LayoutInflaterFactory2C0840i.this.f6888P.k(null);
                LayoutInflaterFactory2C0840i layoutInflaterFactory2C0840i2 = LayoutInflaterFactory2C0840i.this;
                layoutInflaterFactory2C0840i2.f6888P = null;
                X.k0(layoutInflaterFactory2C0840i2.f6891S);
            }
        }

        public C0134i(b.a aVar) {
            this.f6933a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
            this.f6933a.a(bVar);
            LayoutInflaterFactory2C0840i layoutInflaterFactory2C0840i = LayoutInflaterFactory2C0840i.this;
            if (layoutInflaterFactory2C0840i.f6886N != null) {
                layoutInflaterFactory2C0840i.f6875C.getDecorView().removeCallbacks(LayoutInflaterFactory2C0840i.this.f6887O);
            }
            LayoutInflaterFactory2C0840i layoutInflaterFactory2C0840i2 = LayoutInflaterFactory2C0840i.this;
            if (layoutInflaterFactory2C0840i2.f6885M != null) {
                layoutInflaterFactory2C0840i2.k0();
                LayoutInflaterFactory2C0840i layoutInflaterFactory2C0840i3 = LayoutInflaterFactory2C0840i.this;
                layoutInflaterFactory2C0840i3.f6888P = X.e(layoutInflaterFactory2C0840i3.f6885M).b(0.0f);
                LayoutInflaterFactory2C0840i.this.f6888P.k(new a());
            }
            LayoutInflaterFactory2C0840i layoutInflaterFactory2C0840i4 = LayoutInflaterFactory2C0840i.this;
            InterfaceC0836e interfaceC0836e = layoutInflaterFactory2C0840i4.f6877E;
            if (interfaceC0836e != null) {
                interfaceC0836e.onSupportActionModeFinished(layoutInflaterFactory2C0840i4.f6884L);
            }
            LayoutInflaterFactory2C0840i layoutInflaterFactory2C0840i5 = LayoutInflaterFactory2C0840i.this;
            layoutInflaterFactory2C0840i5.f6884L = null;
            X.k0(layoutInflaterFactory2C0840i5.f6891S);
            LayoutInflaterFactory2C0840i.this.d1();
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f6933a.b(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, Menu menu) {
            X.k0(LayoutInflaterFactory2C0840i.this.f6891S);
            return this.f6933a.c(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f6933a.d(bVar, menuItem);
        }
    }

    /* renamed from: androidx.appcompat.app.i$j */
    static class j {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* renamed from: androidx.appcompat.app.i$k */
    static class k {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static v0.i b(Configuration configuration) {
            return v0.i.c(configuration.getLocales().toLanguageTags());
        }

        public static void c(v0.i iVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(iVar.h()));
        }

        static void d(Configuration configuration, v0.i iVar) {
            configuration.setLocales(LocaleList.forLanguageTags(iVar.h()));
        }
    }

    /* renamed from: androidx.appcompat.app.i$l */
    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                configuration3.colorMode |= configuration2.colorMode & 3;
            }
            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                configuration3.colorMode |= configuration2.colorMode & 12;
            }
        }
    }

    /* renamed from: androidx.appcompat.app.i$m */
    static class m {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Object obj, final LayoutInflaterFactory2C0840i layoutInflaterFactory2C0840i) {
            Objects.requireNonNull(layoutInflaterFactory2C0840i);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.w
                public final void onBackInvoked() {
                    layoutInflaterFactory2C0840i.E0();
                }
            };
            androidx.appcompat.app.s.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void c(Object obj, Object obj2) {
            androidx.appcompat.app.s.a(obj).unregisterOnBackInvokedCallback(androidx.appcompat.app.r.a(obj2));
        }
    }

    /* renamed from: androidx.appcompat.app.i$n */
    class n extends androidx.appcompat.view.i {

        /* renamed from: s, reason: collision with root package name */
        private g f6936s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f6937t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f6938u;

        /* renamed from: v, reason: collision with root package name */
        private boolean f6939v;

        n(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f6938u = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f6938u = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f6937t = true;
                callback.onContentChanged();
            } finally {
                this.f6937t = false;
            }
        }

        public void d(Window.Callback callback, int i8, Menu menu) {
            try {
                this.f6939v = true;
                callback.onPanelClosed(i8, menu);
            } finally {
                this.f6939v = false;
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f6938u ? a().dispatchKeyEvent(keyEvent) : LayoutInflaterFactory2C0840i.this.i0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || LayoutInflaterFactory2C0840i.this.H0(keyEvent.getKeyCode(), keyEvent);
        }

        void e(g gVar) {
            this.f6936s = gVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            f.a aVar = new f.a(LayoutInflaterFactory2C0840i.this.f6874B, callback);
            androidx.appcompat.view.b P7 = LayoutInflaterFactory2C0840i.this.P(aVar);
            if (P7 != null) {
                return aVar.e(P7);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f6937t) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i8, Menu menu) {
            if (i8 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i8, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public View onCreatePanelView(int i8) {
            View onCreatePanelView;
            g gVar = this.f6936s;
            return (gVar == null || (onCreatePanelView = gVar.onCreatePanelView(i8)) == null) ? super.onCreatePanelView(i8) : onCreatePanelView;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i8, Menu menu) {
            super.onMenuOpened(i8, menu);
            LayoutInflaterFactory2C0840i.this.K0(i8);
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onPanelClosed(int i8, Menu menu) {
            if (this.f6939v) {
                a().onPanelClosed(i8, menu);
            } else {
                super.onPanelClosed(i8, menu);
                LayoutInflaterFactory2C0840i.this.L0(i8);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i8, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i8 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.b0(true);
            }
            g gVar = this.f6936s;
            boolean z7 = gVar != null && gVar.a(i8);
            if (!z7) {
                z7 = super.onPreparePanel(i8, view, menu);
            }
            if (eVar != null) {
                eVar.b0(false);
            }
            return z7;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i8) {
            androidx.appcompat.view.menu.e eVar;
            s u02 = LayoutInflaterFactory2C0840i.this.u0(0, true);
            if (u02 == null || (eVar = u02.f6958j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i8);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i8);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i8) {
            return (LayoutInflaterFactory2C0840i.this.C0() && i8 == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i8);
        }
    }

    /* renamed from: androidx.appcompat.app.i$o */
    private class o extends p {

        /* renamed from: c, reason: collision with root package name */
        private final PowerManager f6941c;

        o(Context context) {
            super();
            this.f6941c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0840i.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0840i.p
        public int c() {
            return j.a(this.f6941c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0840i.p
        public void d() {
            LayoutInflaterFactory2C0840i.this.U();
        }
    }

    /* renamed from: androidx.appcompat.app.i$p */
    abstract class p {

        /* renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f6943a;

        /* renamed from: androidx.appcompat.app.i$p$a */
        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                p.this.d();
            }
        }

        p() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f6943a;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflaterFactory2C0840i.this.f6874B.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f6943a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter b8 = b();
            if (b8 == null || b8.countActions() == 0) {
                return;
            }
            if (this.f6943a == null) {
                this.f6943a = new a();
            }
            LayoutInflaterFactory2C0840i.this.f6874B.registerReceiver(this.f6943a, b8);
        }
    }

    /* renamed from: androidx.appcompat.app.i$q */
    private class q extends p {

        /* renamed from: c, reason: collision with root package name */
        private final H f6946c;

        q(H h8) {
            super();
            this.f6946c = h8;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0840i.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0840i.p
        public int c() {
            return this.f6946c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C0840i.p
        public void d() {
            LayoutInflaterFactory2C0840i.this.U();
        }
    }

    /* renamed from: androidx.appcompat.app.i$r */
    private class r extends ContentFrameLayout {
        public r(Context context) {
            super(context);
        }

        private boolean b(int i8, int i9) {
            return i8 < -5 || i9 < -5 || i8 > getWidth() + 5 || i9 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C0840i.this.i0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            LayoutInflaterFactory2C0840i.this.c0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i8) {
            setBackgroundDrawable(AbstractC5794a.b(getContext(), i8));
        }
    }

    /* renamed from: androidx.appcompat.app.i$s */
    protected static final class s {

        /* renamed from: a, reason: collision with root package name */
        int f6949a;

        /* renamed from: b, reason: collision with root package name */
        int f6950b;

        /* renamed from: c, reason: collision with root package name */
        int f6951c;

        /* renamed from: d, reason: collision with root package name */
        int f6952d;

        /* renamed from: e, reason: collision with root package name */
        int f6953e;

        /* renamed from: f, reason: collision with root package name */
        int f6954f;

        /* renamed from: g, reason: collision with root package name */
        ViewGroup f6955g;

        /* renamed from: h, reason: collision with root package name */
        View f6956h;

        /* renamed from: i, reason: collision with root package name */
        View f6957i;

        /* renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.e f6958j;

        /* renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.c f6959k;

        /* renamed from: l, reason: collision with root package name */
        Context f6960l;

        /* renamed from: m, reason: collision with root package name */
        boolean f6961m;

        /* renamed from: n, reason: collision with root package name */
        boolean f6962n;

        /* renamed from: o, reason: collision with root package name */
        boolean f6963o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f6964p;

        /* renamed from: q, reason: collision with root package name */
        boolean f6965q = false;

        /* renamed from: r, reason: collision with root package name */
        boolean f6966r;

        /* renamed from: s, reason: collision with root package name */
        Bundle f6967s;

        s(int i8) {
            this.f6949a = i8;
        }

        androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.f6958j == null) {
                return null;
            }
            if (this.f6959k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f6960l, AbstractC5758g.f35518j);
                this.f6959k = cVar;
                cVar.h(aVar);
                this.f6958j.b(this.f6959k);
            }
            return this.f6959k.b(this.f6955g);
        }

        public boolean b() {
            if (this.f6956h == null) {
                return false;
            }
            return this.f6957i != null || this.f6959k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f6958j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.P(this.f6959k);
            }
            this.f6958j = eVar;
            if (eVar == null || (cVar = this.f6959k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(AbstractC5752a.f35374a, typedValue, true);
            int i8 = typedValue.resourceId;
            if (i8 != 0) {
                newTheme.applyStyle(i8, true);
            }
            newTheme.resolveAttribute(AbstractC5752a.f35364C, typedValue, true);
            int i9 = typedValue.resourceId;
            if (i9 != 0) {
                newTheme.applyStyle(i9, true);
            } else {
                newTheme.applyStyle(f.i.f35544b, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f6960l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(f.j.f35790y0);
            this.f6950b = obtainStyledAttributes.getResourceId(f.j.f35553B0, 0);
            this.f6954f = obtainStyledAttributes.getResourceId(f.j.f35548A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.appcompat.app.i$t */
    private final class t implements j.a {
        t() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z7) {
            androidx.appcompat.view.menu.e D7 = eVar.D();
            boolean z8 = D7 != eVar;
            LayoutInflaterFactory2C0840i layoutInflaterFactory2C0840i = LayoutInflaterFactory2C0840i.this;
            if (z8) {
                eVar = D7;
            }
            s n02 = layoutInflaterFactory2C0840i.n0(eVar);
            if (n02 != null) {
                if (!z8) {
                    LayoutInflaterFactory2C0840i.this.d0(n02, z7);
                } else {
                    LayoutInflaterFactory2C0840i.this.Z(n02.f6949a, n02, D7);
                    LayoutInflaterFactory2C0840i.this.d0(n02, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            Window.Callback w02;
            if (eVar != eVar.D()) {
                return true;
            }
            LayoutInflaterFactory2C0840i layoutInflaterFactory2C0840i = LayoutInflaterFactory2C0840i.this;
            if (!layoutInflaterFactory2C0840i.f6896X || (w02 = layoutInflaterFactory2C0840i.w0()) == null || LayoutInflaterFactory2C0840i.this.f6907i0) {
                return true;
            }
            w02.onMenuOpened(108, eVar);
            return true;
        }
    }

    LayoutInflaterFactory2C0840i(Activity activity, InterfaceC0836e interfaceC0836e) {
        this(activity, null, interfaceC0836e, activity);
    }

    private boolean A0(s sVar) {
        Resources.Theme theme;
        Context context = this.f6874B;
        int i8 = sVar.f6949a;
        if ((i8 == 0 || i8 == 108) && this.f6881I != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(AbstractC5752a.f35377d, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(AbstractC5752a.f35378e, typedValue, true);
            } else {
                theme2.resolveAttribute(AbstractC5752a.f35378e, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(theme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.S(this);
        sVar.c(eVar);
        return true;
    }

    private void B0(int i8) {
        this.f6916r0 = (1 << i8) | this.f6916r0;
        if (this.f6915q0) {
            return;
        }
        X.f0(this.f6875C.getDecorView(), this.f6917s0);
        this.f6915q0 = true;
    }

    private boolean G0(int i8, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        s u02 = u0(i8, true);
        if (u02.f6963o) {
            return false;
        }
        return Q0(u02, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean J0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.view.b r0 = r4.f6884L
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.i$s r2 = r4.u0(r5, r0)
            if (r5 != 0) goto L43
            androidx.appcompat.widget.I r5 = r4.f6881I
            if (r5 == 0) goto L43
            boolean r5 = r5.d()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f6874B
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            androidx.appcompat.widget.I r5 = r4.f6881I
            boolean r5 = r5.b()
            if (r5 != 0) goto L3c
            boolean r5 = r4.f6907i0
            if (r5 != 0) goto L62
            boolean r5 = r4.Q0(r2, r6)
            if (r5 == 0) goto L62
            androidx.appcompat.widget.I r5 = r4.f6881I
            boolean r0 = r5.g()
            goto L68
        L3c:
            androidx.appcompat.widget.I r5 = r4.f6881I
            boolean r0 = r5.f()
            goto L68
        L43:
            boolean r5 = r2.f6963o
            if (r5 != 0) goto L64
            boolean r3 = r2.f6962n
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.f6961m
            if (r5 == 0) goto L62
            boolean r5 = r2.f6966r
            if (r5 == 0) goto L5b
            r2.f6961m = r1
            boolean r5 = r4.Q0(r2, r6)
            goto L5c
        L5b:
            r5 = r0
        L5c:
            if (r5 == 0) goto L62
            r4.N0(r2, r6)
            goto L68
        L62:
            r0 = r1
            goto L68
        L64:
            r4.d0(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L85
            android.content.Context r5 = r4.f6874B
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7e
            r5.playSoundEffect(r1)
            goto L85
        L7e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0840i.J0(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void N0(androidx.appcompat.app.LayoutInflaterFactory2C0840i.s r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0840i.N0(androidx.appcompat.app.i$s, android.view.KeyEvent):void");
    }

    private boolean P0(s sVar, int i8, KeyEvent keyEvent, int i9) {
        androidx.appcompat.view.menu.e eVar;
        boolean z7 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((sVar.f6961m || Q0(sVar, keyEvent)) && (eVar = sVar.f6958j) != null) {
            z7 = eVar.performShortcut(i8, keyEvent, i9);
        }
        if (z7 && (i9 & 1) == 0 && this.f6881I == null) {
            d0(sVar, true);
        }
        return z7;
    }

    private boolean Q0(s sVar, KeyEvent keyEvent) {
        androidx.appcompat.widget.I i8;
        androidx.appcompat.widget.I i9;
        androidx.appcompat.widget.I i10;
        if (this.f6907i0) {
            return false;
        }
        if (sVar.f6961m) {
            return true;
        }
        s sVar2 = this.f6903e0;
        if (sVar2 != null && sVar2 != sVar) {
            d0(sVar2, false);
        }
        Window.Callback w02 = w0();
        if (w02 != null) {
            sVar.f6957i = w02.onCreatePanelView(sVar.f6949a);
        }
        int i11 = sVar.f6949a;
        boolean z7 = i11 == 0 || i11 == 108;
        if (z7 && (i10 = this.f6881I) != null) {
            i10.c();
        }
        if (sVar.f6957i == null && (!z7 || !(O0() instanceof F))) {
            androidx.appcompat.view.menu.e eVar = sVar.f6958j;
            if (eVar == null || sVar.f6966r) {
                if (eVar == null && (!A0(sVar) || sVar.f6958j == null)) {
                    return false;
                }
                if (z7 && this.f6881I != null) {
                    if (this.f6882J == null) {
                        this.f6882J = new h();
                    }
                    this.f6881I.a(sVar.f6958j, this.f6882J);
                }
                sVar.f6958j.e0();
                if (!w02.onCreatePanelMenu(sVar.f6949a, sVar.f6958j)) {
                    sVar.c(null);
                    if (z7 && (i8 = this.f6881I) != null) {
                        i8.a(null, this.f6882J);
                    }
                    return false;
                }
                sVar.f6966r = false;
            }
            sVar.f6958j.e0();
            Bundle bundle = sVar.f6967s;
            if (bundle != null) {
                sVar.f6958j.Q(bundle);
                sVar.f6967s = null;
            }
            if (!w02.onPreparePanel(0, sVar.f6957i, sVar.f6958j)) {
                if (z7 && (i9 = this.f6881I) != null) {
                    i9.a(null, this.f6882J);
                }
                sVar.f6958j.d0();
                return false;
            }
            boolean z8 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            sVar.f6964p = z8;
            sVar.f6958j.setQwertyMode(z8);
            sVar.f6958j.d0();
        }
        sVar.f6961m = true;
        sVar.f6962n = false;
        this.f6903e0 = sVar;
        return true;
    }

    private void R0(boolean z7) {
        androidx.appcompat.widget.I i8 = this.f6881I;
        if (i8 == null || !i8.d() || (ViewConfiguration.get(this.f6874B).hasPermanentMenuKey() && !this.f6881I.e())) {
            s u02 = u0(0, true);
            u02.f6965q = true;
            d0(u02, false);
            N0(u02, null);
            return;
        }
        Window.Callback w02 = w0();
        if (this.f6881I.b() && z7) {
            this.f6881I.f();
            if (this.f6907i0) {
                return;
            }
            w02.onPanelClosed(108, u0(0, true).f6958j);
            return;
        }
        if (w02 == null || this.f6907i0) {
            return;
        }
        if (this.f6915q0 && (this.f6916r0 & 1) != 0) {
            this.f6875C.getDecorView().removeCallbacks(this.f6917s0);
            this.f6917s0.run();
        }
        s u03 = u0(0, true);
        androidx.appcompat.view.menu.e eVar = u03.f6958j;
        if (eVar == null || u03.f6966r || !w02.onPreparePanel(0, u03.f6957i, eVar)) {
            return;
        }
        w02.onMenuOpened(108, u03.f6958j);
        this.f6881I.g();
    }

    private boolean S(boolean z7) {
        return T(z7, true);
    }

    private int S0(int i8) {
        if (i8 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i8 != 9) {
            return i8;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean T(boolean z7, boolean z8) {
        if (this.f6907i0) {
            return false;
        }
        int Y7 = Y();
        int D02 = D0(this.f6874B, Y7);
        v0.i X7 = Build.VERSION.SDK_INT < 33 ? X(this.f6874B) : null;
        if (!z8 && X7 != null) {
            X7 = t0(this.f6874B.getResources().getConfiguration());
        }
        boolean c12 = c1(D02, X7, z7);
        if (Y7 == 0) {
            s0(this.f6874B).e();
        } else {
            p pVar = this.f6913o0;
            if (pVar != null) {
                pVar.a();
            }
        }
        if (Y7 == 3) {
            r0(this.f6874B).e();
        } else {
            p pVar2 = this.f6914p0;
            if (pVar2 != null) {
                pVar2.a();
            }
        }
        return c12;
    }

    private void V() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f6891S.findViewById(R.id.content);
        View decorView = this.f6875C.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f6874B.obtainStyledAttributes(f.j.f35790y0);
        obtainStyledAttributes.getValue(f.j.f35598K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(f.j.f35603L0, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(f.j.f35588I0)) {
            obtainStyledAttributes.getValue(f.j.f35588I0, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(f.j.f35593J0)) {
            obtainStyledAttributes.getValue(f.j.f35593J0, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(f.j.f35578G0)) {
            obtainStyledAttributes.getValue(f.j.f35578G0, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(f.j.f35583H0)) {
            obtainStyledAttributes.getValue(f.j.f35583H0, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void W(Window window) {
        if (this.f6875C != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof n) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        n nVar = new n(callback);
        this.f6876D = nVar;
        window.setCallback(nVar);
        f0 u7 = f0.u(this.f6874B, null, f6871C0);
        Drawable h8 = u7.h(0);
        if (h8 != null) {
            window.setBackgroundDrawable(h8);
        }
        u7.x();
        this.f6875C = window;
        if (Build.VERSION.SDK_INT < 33 || this.f6923y0 != null) {
            return;
        }
        L(null);
    }

    private boolean W0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f6875C.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int Y() {
        int i8 = this.f6909k0;
        return i8 != -100 ? i8 : AbstractC0838g.m();
    }

    private void Z0() {
        if (this.f6890R) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private AbstractActivityC0835d a1() {
        for (Context context = this.f6874B; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof AbstractActivityC0835d) {
                return (AbstractActivityC0835d) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private void b0() {
        p pVar = this.f6913o0;
        if (pVar != null) {
            pVar.a();
        }
        p pVar2 = this.f6914p0;
        if (pVar2 != null) {
            pVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b1(Configuration configuration) {
        Activity activity = (Activity) this.f6873A;
        if (activity instanceof InterfaceC0927m) {
            if (((InterfaceC0927m) activity).getLifecycle().b().c(AbstractC0922h.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.f6906h0 || this.f6907i0) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean c1(int r10, v0.i r11, boolean r12) {
        /*
            r9 = this;
            android.content.Context r1 = r9.f6874B
            r4 = 0
            r5 = 0
            r0 = r9
            r2 = r10
            r3 = r11
            android.content.res.Configuration r0 = r0.e0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r9.f6874B
            int r1 = r9.q0(r1)
            android.content.res.Configuration r2 = r9.f6908j0
            if (r2 != 0) goto L1f
            android.content.Context r2 = r9.f6874B
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L1f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            v0.i r2 = r9.t0(r2)
            r5 = 0
            if (r11 != 0) goto L30
            r6 = r5
            goto L34
        L30:
            v0.i r6 = r9.t0(r0)
        L34:
            r7 = 0
            if (r3 == r4) goto L3a
            r3 = 512(0x200, float:7.175E-43)
            goto L3b
        L3a:
            r3 = r7
        L3b:
            if (r6 == 0) goto L45
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L45
            r3 = r3 | 8196(0x2004, float:1.1485E-41)
        L45:
            int r2 = ~r1
            r2 = r2 & r3
            r8 = 1
            if (r2 == 0) goto L8c
            if (r12 == 0) goto L8c
            boolean r12 = r9.f6905g0
            if (r12 == 0) goto L8c
            boolean r12 = androidx.appcompat.app.LayoutInflaterFactory2C0840i.f6872D0
            if (r12 != 0) goto L58
            boolean r12 = r9.f6906h0
            if (r12 == 0) goto L8c
        L58:
            java.lang.Object r12 = r9.f6873A
            boolean r2 = r12 instanceof android.app.Activity
            if (r2 == 0) goto L8c
            android.app.Activity r12 = (android.app.Activity) r12
            boolean r12 = r12.isChild()
            if (r12 != 0) goto L8c
            int r12 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r12 < r2) goto L83
            r12 = r3 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L83
            java.lang.Object r12 = r9.f6873A
            android.app.Activity r12 = (android.app.Activity) r12
            android.view.Window r12 = r12.getWindow()
            android.view.View r12 = r12.getDecorView()
            int r0 = r0.getLayoutDirection()
            r12.setLayoutDirection(r0)
        L83:
            java.lang.Object r12 = r9.f6873A
            android.app.Activity r12 = (android.app.Activity) r12
            androidx.core.app.b.u(r12)
            r12 = r8
            goto L8d
        L8c:
            r12 = r7
        L8d:
            if (r12 != 0) goto L9a
            if (r3 == 0) goto L9a
            r12 = r3 & r1
            if (r12 != r3) goto L96
            r7 = r8
        L96:
            r9.e1(r4, r6, r7, r5)
            goto L9b
        L9a:
            r8 = r12
        L9b:
            if (r8 == 0) goto Lb7
            java.lang.Object r12 = r9.f6873A
            boolean r0 = r12 instanceof androidx.appcompat.app.AbstractActivityC0835d
            if (r0 == 0) goto Lb7
            r0 = r3 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto Lac
            androidx.appcompat.app.d r12 = (androidx.appcompat.app.AbstractActivityC0835d) r12
            r12.onNightModeChanged(r10)
        Lac:
            r10 = r3 & 4
            if (r10 == 0) goto Lb7
            java.lang.Object r10 = r9.f6873A
            androidx.appcompat.app.d r10 = (androidx.appcompat.app.AbstractActivityC0835d) r10
            r10.onLocalesChanged(r11)
        Lb7:
            if (r6 == 0) goto Lca
            android.content.Context r10 = r9.f6874B
            android.content.res.Resources r10 = r10.getResources()
            android.content.res.Configuration r10 = r10.getConfiguration()
            v0.i r10 = r9.t0(r10)
            r9.U0(r10)
        Lca:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0840i.c1(int, v0.i, boolean):boolean");
    }

    private Configuration e0(Context context, int i8, v0.i iVar, Configuration configuration, boolean z7) {
        int i9 = i8 != 1 ? i8 != 2 ? z7 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i9 | (configuration2.uiMode & (-49));
        if (iVar != null) {
            T0(configuration2, iVar);
        }
        return configuration2;
    }

    private void e1(int i8, v0.i iVar, boolean z7, Configuration configuration) {
        Resources resources = this.f6874B.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i8 | (resources.getConfiguration().uiMode & (-49));
        if (iVar != null) {
            T0(configuration2, iVar);
        }
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            D.a(resources);
        }
        int i9 = this.f6910l0;
        if (i9 != 0) {
            this.f6874B.setTheme(i9);
            this.f6874B.getTheme().applyStyle(this.f6910l0, true);
        }
        if (z7 && (this.f6873A instanceof Activity)) {
            b1(configuration2);
        }
    }

    private ViewGroup f0() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f6874B.obtainStyledAttributes(f.j.f35790y0);
        if (!obtainStyledAttributes.hasValue(f.j.f35563D0)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(f.j.f35608M0, false)) {
            H(1);
        } else if (obtainStyledAttributes.getBoolean(f.j.f35563D0, false)) {
            H(108);
        }
        if (obtainStyledAttributes.getBoolean(f.j.f35568E0, false)) {
            H(109);
        }
        if (obtainStyledAttributes.getBoolean(f.j.f35573F0, false)) {
            H(10);
        }
        this.f6899a0 = obtainStyledAttributes.getBoolean(f.j.f35795z0, false);
        obtainStyledAttributes.recycle();
        m0();
        this.f6875C.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f6874B);
        if (this.f6900b0) {
            viewGroup = this.f6898Z ? (ViewGroup) from.inflate(AbstractC5758g.f35523o, (ViewGroup) null) : (ViewGroup) from.inflate(AbstractC5758g.f35522n, (ViewGroup) null);
        } else if (this.f6899a0) {
            viewGroup = (ViewGroup) from.inflate(AbstractC5758g.f35514f, (ViewGroup) null);
            this.f6897Y = false;
            this.f6896X = false;
        } else if (this.f6896X) {
            TypedValue typedValue = new TypedValue();
            this.f6874B.getTheme().resolveAttribute(AbstractC5752a.f35377d, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f6874B, typedValue.resourceId) : this.f6874B).inflate(AbstractC5758g.f35524p, (ViewGroup) null);
            androidx.appcompat.widget.I i8 = (androidx.appcompat.widget.I) viewGroup.findViewById(AbstractC5757f.f35498p);
            this.f6881I = i8;
            i8.setWindowCallback(w0());
            if (this.f6897Y) {
                this.f6881I.h(109);
            }
            if (this.f6894V) {
                this.f6881I.h(2);
            }
            if (this.f6895W) {
                this.f6881I.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f6896X + ", windowActionBarOverlay: " + this.f6897Y + ", android:windowIsFloating: " + this.f6899a0 + ", windowActionModeOverlay: " + this.f6898Z + ", windowNoTitle: " + this.f6900b0 + " }");
        }
        X.A0(viewGroup, new b());
        if (this.f6881I == null) {
            this.f6892T = (TextView) viewGroup.findViewById(AbstractC5757f.f35479M);
        }
        q0.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(AbstractC5757f.f35484b);
        ViewGroup viewGroup2 = (ViewGroup) this.f6875C.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f6875C.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void g1(View view) {
        view.setBackgroundColor((X.K(view) & 8192) != 0 ? AbstractC6278a.c(this.f6874B, AbstractC5754c.f35402b) : AbstractC6278a.c(this.f6874B, AbstractC5754c.f35401a));
    }

    private void l0() {
        if (this.f6890R) {
            return;
        }
        this.f6891S = f0();
        CharSequence v02 = v0();
        if (!TextUtils.isEmpty(v02)) {
            androidx.appcompat.widget.I i8 = this.f6881I;
            if (i8 != null) {
                i8.setWindowTitle(v02);
            } else if (O0() != null) {
                O0().A(v02);
            } else {
                TextView textView = this.f6892T;
                if (textView != null) {
                    textView.setText(v02);
                }
            }
        }
        V();
        M0(this.f6891S);
        this.f6890R = true;
        s u02 = u0(0, false);
        if (this.f6907i0) {
            return;
        }
        if (u02 == null || u02.f6958j == null) {
            B0(108);
        }
    }

    private void m0() {
        if (this.f6875C == null) {
            Object obj = this.f6873A;
            if (obj instanceof Activity) {
                W(((Activity) obj).getWindow());
            }
        }
        if (this.f6875C == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration o0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f8 = configuration.fontScale;
            float f9 = configuration2.fontScale;
            if (f8 != f9) {
                configuration3.fontScale = f9;
            }
            int i8 = configuration.mcc;
            int i9 = configuration2.mcc;
            if (i8 != i9) {
                configuration3.mcc = i9;
            }
            int i10 = configuration.mnc;
            int i11 = configuration2.mnc;
            if (i10 != i11) {
                configuration3.mnc = i11;
            }
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 24) {
                k.a(configuration, configuration2, configuration3);
            } else if (!y0.d.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i13 = configuration.touchscreen;
            int i14 = configuration2.touchscreen;
            if (i13 != i14) {
                configuration3.touchscreen = i14;
            }
            int i15 = configuration.keyboard;
            int i16 = configuration2.keyboard;
            if (i15 != i16) {
                configuration3.keyboard = i16;
            }
            int i17 = configuration.keyboardHidden;
            int i18 = configuration2.keyboardHidden;
            if (i17 != i18) {
                configuration3.keyboardHidden = i18;
            }
            int i19 = configuration.navigation;
            int i20 = configuration2.navigation;
            if (i19 != i20) {
                configuration3.navigation = i20;
            }
            int i21 = configuration.navigationHidden;
            int i22 = configuration2.navigationHidden;
            if (i21 != i22) {
                configuration3.navigationHidden = i22;
            }
            int i23 = configuration.orientation;
            int i24 = configuration2.orientation;
            if (i23 != i24) {
                configuration3.orientation = i24;
            }
            int i25 = configuration.screenLayout & 15;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 15)) {
                configuration3.screenLayout |= i26 & 15;
            }
            int i27 = configuration.screenLayout & 192;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 192)) {
                configuration3.screenLayout |= i28 & 192;
            }
            int i29 = configuration.screenLayout & 48;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 48)) {
                configuration3.screenLayout |= i30 & 48;
            }
            int i31 = configuration.screenLayout & 768;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 768)) {
                configuration3.screenLayout |= i32 & 768;
            }
            if (i12 >= 26) {
                l.a(configuration, configuration2, configuration3);
            }
            int i33 = configuration.uiMode & 15;
            int i34 = configuration2.uiMode;
            if (i33 != (i34 & 15)) {
                configuration3.uiMode |= i34 & 15;
            }
            int i35 = configuration.uiMode & 48;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 48)) {
                configuration3.uiMode |= i36 & 48;
            }
            int i37 = configuration.screenWidthDp;
            int i38 = configuration2.screenWidthDp;
            if (i37 != i38) {
                configuration3.screenWidthDp = i38;
            }
            int i39 = configuration.screenHeightDp;
            int i40 = configuration2.screenHeightDp;
            if (i39 != i40) {
                configuration3.screenHeightDp = i40;
            }
            int i41 = configuration.smallestScreenWidthDp;
            int i42 = configuration2.smallestScreenWidthDp;
            if (i41 != i42) {
                configuration3.smallestScreenWidthDp = i42;
            }
            int i43 = configuration.densityDpi;
            int i44 = configuration2.densityDpi;
            if (i43 != i44) {
                configuration3.densityDpi = i44;
            }
        }
        return configuration3;
    }

    private int q0(Context context) {
        if (!this.f6912n0 && (this.f6873A instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                int i8 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f6873A.getClass()), i8 >= 29 ? 269221888 : i8 >= 24 ? 786432 : 0);
                if (activityInfo != null) {
                    this.f6911m0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e8) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e8);
                this.f6911m0 = 0;
            }
        }
        this.f6912n0 = true;
        return this.f6911m0;
    }

    private p r0(Context context) {
        if (this.f6914p0 == null) {
            this.f6914p0 = new o(context);
        }
        return this.f6914p0;
    }

    private p s0(Context context) {
        if (this.f6913o0 == null) {
            this.f6913o0 = new q(H.a(context));
        }
        return this.f6913o0;
    }

    private void x0() {
        l0();
        if (this.f6896X && this.f6878F == null) {
            Object obj = this.f6873A;
            if (obj instanceof Activity) {
                this.f6878F = new I((Activity) this.f6873A, this.f6897Y);
            } else if (obj instanceof Dialog) {
                this.f6878F = new I((Dialog) this.f6873A);
            }
            AbstractC0832a abstractC0832a = this.f6878F;
            if (abstractC0832a != null) {
                abstractC0832a.r(this.f6918t0);
            }
        }
    }

    private boolean y0(s sVar) {
        View view = sVar.f6957i;
        if (view != null) {
            sVar.f6956h = view;
            return true;
        }
        if (sVar.f6958j == null) {
            return false;
        }
        if (this.f6883K == null) {
            this.f6883K = new t();
        }
        View view2 = (View) sVar.a(this.f6883K);
        sVar.f6956h = view2;
        return view2 != null;
    }

    private boolean z0(s sVar) {
        sVar.d(p0());
        sVar.f6955g = new r(sVar.f6960l);
        sVar.f6951c = 81;
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public void A(Bundle bundle) {
        l0();
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public void B() {
        AbstractC0832a s8 = s();
        if (s8 != null) {
            s8.v(true);
        }
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public void C(Bundle bundle) {
    }

    public boolean C0() {
        return this.f6889Q;
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public void D() {
        T(true, false);
    }

    int D0(Context context, int i8) {
        if (i8 == -100) {
            return -1;
        }
        if (i8 != -1) {
            if (i8 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return s0(context).c();
            }
            if (i8 != 1 && i8 != 2) {
                if (i8 == 3) {
                    return r0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i8;
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public void E() {
        AbstractC0832a s8 = s();
        if (s8 != null) {
            s8.v(false);
        }
    }

    boolean E0() {
        boolean z7 = this.f6904f0;
        this.f6904f0 = false;
        s u02 = u0(0, false);
        if (u02 != null && u02.f6963o) {
            if (!z7) {
                d0(u02, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.f6884L;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        AbstractC0832a s8 = s();
        return s8 != null && s8.g();
    }

    boolean F0(int i8, KeyEvent keyEvent) {
        if (i8 == 4) {
            this.f6904f0 = (keyEvent.getFlags() & 128) != 0;
        } else if (i8 == 82) {
            G0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public boolean H(int i8) {
        int S02 = S0(i8);
        if (this.f6900b0 && S02 == 108) {
            return false;
        }
        if (this.f6896X && S02 == 1) {
            this.f6896X = false;
        }
        if (S02 == 1) {
            Z0();
            this.f6900b0 = true;
            return true;
        }
        if (S02 == 2) {
            Z0();
            this.f6894V = true;
            return true;
        }
        if (S02 == 5) {
            Z0();
            this.f6895W = true;
            return true;
        }
        if (S02 == 10) {
            Z0();
            this.f6898Z = true;
            return true;
        }
        if (S02 == 108) {
            Z0();
            this.f6896X = true;
            return true;
        }
        if (S02 != 109) {
            return this.f6875C.requestFeature(S02);
        }
        Z0();
        this.f6897Y = true;
        return true;
    }

    boolean H0(int i8, KeyEvent keyEvent) {
        AbstractC0832a s8 = s();
        if (s8 != null && s8.n(i8, keyEvent)) {
            return true;
        }
        s sVar = this.f6903e0;
        if (sVar != null && P0(sVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            s sVar2 = this.f6903e0;
            if (sVar2 != null) {
                sVar2.f6962n = true;
            }
            return true;
        }
        if (this.f6903e0 == null) {
            s u02 = u0(0, true);
            Q0(u02, keyEvent);
            boolean P02 = P0(u02, keyEvent.getKeyCode(), keyEvent, 1);
            u02.f6961m = false;
            if (P02) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public void I(int i8) {
        l0();
        ViewGroup viewGroup = (ViewGroup) this.f6891S.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f6874B).inflate(i8, viewGroup);
        this.f6876D.c(this.f6875C.getCallback());
    }

    boolean I0(int i8, KeyEvent keyEvent) {
        if (i8 != 4) {
            if (i8 == 82) {
                J0(0, keyEvent);
                return true;
            }
        } else if (E0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public void J(View view) {
        l0();
        ViewGroup viewGroup = (ViewGroup) this.f6891S.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f6876D.c(this.f6875C.getCallback());
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public void K(View view, ViewGroup.LayoutParams layoutParams) {
        l0();
        ViewGroup viewGroup = (ViewGroup) this.f6891S.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f6876D.c(this.f6875C.getCallback());
    }

    void K0(int i8) {
        AbstractC0832a s8;
        if (i8 != 108 || (s8 = s()) == null) {
            return;
        }
        s8.h(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // androidx.appcompat.app.AbstractC0838g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void L(android.window.OnBackInvokedDispatcher r3) {
        /*
            r2 = this;
            super.L(r3)
            android.window.OnBackInvokedDispatcher r0 = r2.f6923y0
            if (r0 == 0) goto L11
            android.window.OnBackInvokedCallback r1 = r2.f6924z0
            if (r1 == 0) goto L11
            androidx.appcompat.app.LayoutInflaterFactory2C0840i.m.c(r0, r1)
            r0 = 0
            r2.f6924z0 = r0
        L11:
            if (r3 != 0) goto L2c
            java.lang.Object r0 = r2.f6873A
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L2c
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L2c
            java.lang.Object r3 = r2.f6873A
            android.app.Activity r3 = (android.app.Activity) r3
            android.window.OnBackInvokedDispatcher r3 = androidx.appcompat.app.LayoutInflaterFactory2C0840i.m.a(r3)
            r2.f6923y0 = r3
            goto L2e
        L2c:
            r2.f6923y0 = r3
        L2e:
            r2.d1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0840i.L(android.window.OnBackInvokedDispatcher):void");
    }

    void L0(int i8) {
        if (i8 == 108) {
            AbstractC0832a s8 = s();
            if (s8 != null) {
                s8.h(false);
                return;
            }
            return;
        }
        if (i8 == 0) {
            s u02 = u0(i8, true);
            if (u02.f6963o) {
                d0(u02, false);
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public void M(Toolbar toolbar) {
        if (this.f6873A instanceof Activity) {
            AbstractC0832a s8 = s();
            if (s8 instanceof I) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f6879G = null;
            if (s8 != null) {
                s8.m();
            }
            this.f6878F = null;
            if (toolbar != null) {
                F f8 = new F(toolbar, v0(), this.f6876D);
                this.f6878F = f8;
                this.f6876D.e(f8.f6785c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f6876D.e(null);
            }
            u();
        }
    }

    void M0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public void N(int i8) {
        this.f6910l0 = i8;
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public final void O(CharSequence charSequence) {
        this.f6880H = charSequence;
        androidx.appcompat.widget.I i8 = this.f6881I;
        if (i8 != null) {
            i8.setWindowTitle(charSequence);
            return;
        }
        if (O0() != null) {
            O0().A(charSequence);
            return;
        }
        TextView textView = this.f6892T;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    final AbstractC0832a O0() {
        return this.f6878F;
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public androidx.appcompat.view.b P(b.a aVar) {
        InterfaceC0836e interfaceC0836e;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.f6884L;
        if (bVar != null) {
            bVar.c();
        }
        C0134i c0134i = new C0134i(aVar);
        AbstractC0832a s8 = s();
        if (s8 != null) {
            androidx.appcompat.view.b B7 = s8.B(c0134i);
            this.f6884L = B7;
            if (B7 != null && (interfaceC0836e = this.f6877E) != null) {
                interfaceC0836e.onSupportActionModeStarted(B7);
            }
        }
        if (this.f6884L == null) {
            this.f6884L = Y0(c0134i);
        }
        d1();
        return this.f6884L;
    }

    void T0(Configuration configuration, v0.i iVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            k.d(configuration, iVar);
        } else {
            configuration.setLocale(iVar.d(0));
            configuration.setLayoutDirection(iVar.d(0));
        }
    }

    public boolean U() {
        return S(true);
    }

    void U0(v0.i iVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            k.c(iVar);
        } else {
            Locale.setDefault(iVar.d(0));
        }
    }

    final boolean V0() {
        ViewGroup viewGroup;
        return this.f6890R && (viewGroup = this.f6891S) != null && viewGroup.isLaidOut();
    }

    v0.i X(Context context) {
        v0.i r8;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 33 || (r8 = AbstractC0838g.r()) == null) {
            return null;
        }
        v0.i t02 = t0(context.getApplicationContext().getResources().getConfiguration());
        v0.i b8 = i8 >= 24 ? C.b(r8, t02) : r8.f() ? v0.i.e() : v0.i.c(j.b(r8.d(0)));
        return b8.f() ? t02 : b8;
    }

    boolean X0() {
        if (this.f6923y0 == null) {
            return false;
        }
        s u02 = u0(0, false);
        return (u02 != null && u02.f6963o) || this.f6884L != null;
    }

    androidx.appcompat.view.b Y0(b.a aVar) {
        androidx.appcompat.view.b bVar;
        Context context;
        InterfaceC0836e interfaceC0836e;
        k0();
        androidx.appcompat.view.b bVar2 = this.f6884L;
        if (bVar2 != null) {
            bVar2.c();
        }
        if (!(aVar instanceof C0134i)) {
            aVar = new C0134i(aVar);
        }
        InterfaceC0836e interfaceC0836e2 = this.f6877E;
        if (interfaceC0836e2 == null || this.f6907i0) {
            bVar = null;
        } else {
            try {
                bVar = interfaceC0836e2.onWindowStartingSupportActionMode(aVar);
            } catch (AbstractMethodError unused) {
            }
        }
        if (bVar != null) {
            this.f6884L = bVar;
        } else {
            if (this.f6885M == null) {
                if (this.f6899a0) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f6874B.getTheme();
                    theme.resolveAttribute(AbstractC5752a.f35377d, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = this.f6874B.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        context = new androidx.appcompat.view.d(this.f6874B, 0);
                        context.getTheme().setTo(newTheme);
                    } else {
                        context = this.f6874B;
                    }
                    this.f6885M = new ActionBarContextView(context);
                    PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, AbstractC5752a.f35379f);
                    this.f6886N = popupWindow;
                    androidx.core.widget.g.b(popupWindow, 2);
                    this.f6886N.setContentView(this.f6885M);
                    this.f6886N.setWidth(-1);
                    context.getTheme().resolveAttribute(AbstractC5752a.f35375b, typedValue, true);
                    this.f6885M.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                    this.f6886N.setHeight(-2);
                    this.f6887O = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f6891S.findViewById(AbstractC5757f.f35490h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(p0()));
                        this.f6885M = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.f6885M != null) {
                k0();
                this.f6885M.k();
                androidx.appcompat.view.e eVar = new androidx.appcompat.view.e(this.f6885M.getContext(), this.f6885M, aVar, this.f6886N == null);
                if (aVar.b(eVar, eVar.e())) {
                    eVar.k();
                    this.f6885M.h(eVar);
                    this.f6884L = eVar;
                    if (V0()) {
                        this.f6885M.setAlpha(0.0f);
                        C7026g0 b8 = X.e(this.f6885M).b(1.0f);
                        this.f6888P = b8;
                        b8.k(new e());
                    } else {
                        this.f6885M.setAlpha(1.0f);
                        this.f6885M.setVisibility(0);
                        if (this.f6885M.getParent() instanceof View) {
                            X.k0((View) this.f6885M.getParent());
                        }
                    }
                    if (this.f6886N != null) {
                        this.f6875C.getDecorView().post(this.f6887O);
                    }
                } else {
                    this.f6884L = null;
                }
            }
        }
        androidx.appcompat.view.b bVar3 = this.f6884L;
        if (bVar3 != null && (interfaceC0836e = this.f6877E) != null) {
            interfaceC0836e.onSupportActionModeStarted(bVar3);
        }
        d1();
        return this.f6884L;
    }

    void Z(int i8, s sVar, Menu menu) {
        if (menu == null) {
            if (sVar == null && i8 >= 0) {
                s[] sVarArr = this.f6902d0;
                if (i8 < sVarArr.length) {
                    sVar = sVarArr[i8];
                }
            }
            if (sVar != null) {
                menu = sVar.f6958j;
            }
        }
        if ((sVar == null || sVar.f6963o) && !this.f6907i0) {
            this.f6876D.d(this.f6875C.getCallback(), i8, menu);
        }
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        s n02;
        Window.Callback w02 = w0();
        if (w02 == null || this.f6907i0 || (n02 = n0(eVar.D())) == null) {
            return false;
        }
        return w02.onMenuItemSelected(n02.f6949a, menuItem);
    }

    void a0(androidx.appcompat.view.menu.e eVar) {
        if (this.f6901c0) {
            return;
        }
        this.f6901c0 = true;
        this.f6881I.i();
        Window.Callback w02 = w0();
        if (w02 != null && !this.f6907i0) {
            w02.onPanelClosed(108, eVar);
        }
        this.f6901c0 = false;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        R0(true);
    }

    void c0(int i8) {
        d0(u0(i8, true), true);
    }

    void d0(s sVar, boolean z7) {
        ViewGroup viewGroup;
        androidx.appcompat.widget.I i8;
        if (z7 && sVar.f6949a == 0 && (i8 = this.f6881I) != null && i8.b()) {
            a0(sVar.f6958j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f6874B.getSystemService("window");
        if (windowManager != null && sVar.f6963o && (viewGroup = sVar.f6955g) != null) {
            windowManager.removeView(viewGroup);
            if (z7) {
                Z(sVar.f6949a, sVar, null);
            }
        }
        sVar.f6961m = false;
        sVar.f6962n = false;
        sVar.f6963o = false;
        sVar.f6956h = null;
        sVar.f6965q = true;
        if (this.f6903e0 == sVar) {
            this.f6903e0 = null;
        }
        if (sVar.f6949a == 0) {
            d1();
        }
    }

    void d1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean X02 = X0();
            if (X02 && this.f6924z0 == null) {
                this.f6924z0 = m.b(this.f6923y0, this);
            } else {
                if (X02 || (onBackInvokedCallback = this.f6924z0) == null) {
                    return;
                }
                m.c(this.f6923y0, onBackInvokedCallback);
                this.f6924z0 = null;
            }
        }
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        l0();
        ((ViewGroup) this.f6891S.findViewById(R.id.content)).addView(view, layoutParams);
        this.f6876D.c(this.f6875C.getCallback());
    }

    final int f1(C7061y0 c7061y0, Rect rect) {
        boolean z7;
        boolean z8;
        int k8 = c7061y0 != null ? c7061y0.k() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f6885M;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z7 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f6885M.getLayoutParams();
            if (this.f6885M.isShown()) {
                if (this.f6919u0 == null) {
                    this.f6919u0 = new Rect();
                    this.f6920v0 = new Rect();
                }
                Rect rect2 = this.f6919u0;
                Rect rect3 = this.f6920v0;
                if (c7061y0 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c7061y0.i(), c7061y0.k(), c7061y0.j(), c7061y0.h());
                }
                q0.a(this.f6891S, rect2, rect3);
                int i8 = rect2.top;
                int i9 = rect2.left;
                int i10 = rect2.right;
                C7061y0 F7 = X.F(this.f6891S);
                int i11 = F7 == null ? 0 : F7.i();
                int j8 = F7 == null ? 0 : F7.j();
                if (marginLayoutParams.topMargin == i8 && marginLayoutParams.leftMargin == i9 && marginLayoutParams.rightMargin == i10) {
                    z8 = false;
                } else {
                    marginLayoutParams.topMargin = i8;
                    marginLayoutParams.leftMargin = i9;
                    marginLayoutParams.rightMargin = i10;
                    z8 = true;
                }
                if (i8 <= 0 || this.f6893U != null) {
                    View view = this.f6893U;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i12 = marginLayoutParams2.height;
                        int i13 = marginLayoutParams.topMargin;
                        if (i12 != i13 || marginLayoutParams2.leftMargin != i11 || marginLayoutParams2.rightMargin != j8) {
                            marginLayoutParams2.height = i13;
                            marginLayoutParams2.leftMargin = i11;
                            marginLayoutParams2.rightMargin = j8;
                            this.f6893U.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f6874B);
                    this.f6893U = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i11;
                    layoutParams.rightMargin = j8;
                    this.f6891S.addView(this.f6893U, -1, layoutParams);
                }
                View view3 = this.f6893U;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    g1(this.f6893U);
                }
                if (!this.f6898Z && r5) {
                    k8 = 0;
                }
                z7 = r5;
                r5 = z8;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z7 = false;
            } else {
                z7 = false;
                r5 = false;
            }
            if (r5) {
                this.f6885M.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f6893U;
        if (view4 != null) {
            view4.setVisibility(z7 ? 0 : 8);
        }
        return k8;
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public Context g(Context context) {
        this.f6905g0 = true;
        int D02 = D0(context, Y());
        if (AbstractC0838g.v(context)) {
            AbstractC0838g.R(context);
        }
        v0.i X7 = X(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(e0(context, D02, X7, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context).a(e0(context, D02, X7, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f6872D0) {
            return super.g(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration e02 = e0(context, D02, X7, !configuration2.equals(configuration3) ? o0(configuration2, configuration3) : null, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, f.i.f35545c);
        dVar.a(e02);
        try {
            if (context.getTheme() != null) {
                h.f.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.g(dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View g0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z7;
        if (this.f6921w0 == null) {
            TypedArray obtainStyledAttributes = this.f6874B.obtainStyledAttributes(f.j.f35790y0);
            String string = obtainStyledAttributes.getString(f.j.f35558C0);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f6921w0 = new z();
            } else {
                try {
                    this.f6921w0 = (z) this.f6874B.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f6921w0 = new z();
                }
            }
        }
        boolean z8 = f6870B0;
        boolean z9 = false;
        if (z8) {
            if (this.f6922x0 == null) {
                this.f6922x0 = new B();
            }
            if (this.f6922x0.a(attributeSet)) {
                z7 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    z9 = W0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    z9 = true;
                }
                z7 = z9;
            }
        } else {
            z7 = z9;
        }
        return this.f6921w0.r(view, str, context, attributeSet, z7, z8, true, p0.c());
    }

    void h0() {
        androidx.appcompat.view.menu.e eVar;
        androidx.appcompat.widget.I i8 = this.f6881I;
        if (i8 != null) {
            i8.i();
        }
        if (this.f6886N != null) {
            this.f6875C.getDecorView().removeCallbacks(this.f6887O);
            if (this.f6886N.isShowing()) {
                try {
                    this.f6886N.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f6886N = null;
        }
        k0();
        s u02 = u0(0, false);
        if (u02 == null || (eVar = u02.f6958j) == null) {
            return;
        }
        eVar.close();
    }

    boolean i0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f6873A;
        if (((obj instanceof AbstractC7050t.a) || (obj instanceof y)) && (decorView = this.f6875C.getDecorView()) != null && AbstractC7050t.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f6876D.b(this.f6875C.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? F0(keyCode, keyEvent) : I0(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public View j(int i8) {
        l0();
        return this.f6875C.findViewById(i8);
    }

    void j0(int i8) {
        s u02;
        s u03 = u0(i8, true);
        if (u03.f6958j != null) {
            Bundle bundle = new Bundle();
            u03.f6958j.R(bundle);
            if (bundle.size() > 0) {
                u03.f6967s = bundle;
            }
            u03.f6958j.e0();
            u03.f6958j.clear();
        }
        u03.f6966r = true;
        u03.f6965q = true;
        if ((i8 != 108 && i8 != 0) || this.f6881I == null || (u02 = u0(0, false)) == null) {
            return;
        }
        u02.f6961m = false;
        Q0(u02, null);
    }

    void k0() {
        C7026g0 c7026g0 = this.f6888P;
        if (c7026g0 != null) {
            c7026g0.c();
        }
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public Context l() {
        return this.f6874B;
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public final InterfaceC0833b n() {
        return new f();
    }

    s n0(Menu menu) {
        s[] sVarArr = this.f6902d0;
        int length = sVarArr != null ? sVarArr.length : 0;
        for (int i8 = 0; i8 < length; i8++) {
            s sVar = sVarArr[i8];
            if (sVar != null && sVar.f6958j == menu) {
                return sVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public int o() {
        return this.f6909k0;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return g0(view, str, context, attributeSet);
    }

    final Context p0() {
        AbstractC0832a s8 = s();
        Context j8 = s8 != null ? s8.j() : null;
        return j8 == null ? this.f6874B : j8;
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public MenuInflater q() {
        if (this.f6879G == null) {
            x0();
            AbstractC0832a abstractC0832a = this.f6878F;
            this.f6879G = new androidx.appcompat.view.g(abstractC0832a != null ? abstractC0832a.j() : this.f6874B);
        }
        return this.f6879G;
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public AbstractC0832a s() {
        x0();
        return this.f6878F;
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public void t() {
        LayoutInflater from = LayoutInflater.from(this.f6874B);
        if (from.getFactory() == null) {
            AbstractC7052u.a(from, this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C0840i) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    v0.i t0(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? k.b(configuration) : v0.i.c(j.b(configuration.locale));
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public void u() {
        if (O0() == null || s().k()) {
            return;
        }
        B0(0);
    }

    protected s u0(int i8, boolean z7) {
        s[] sVarArr = this.f6902d0;
        if (sVarArr == null || sVarArr.length <= i8) {
            s[] sVarArr2 = new s[i8 + 1];
            if (sVarArr != null) {
                System.arraycopy(sVarArr, 0, sVarArr2, 0, sVarArr.length);
            }
            this.f6902d0 = sVarArr2;
            sVarArr = sVarArr2;
        }
        s sVar = sVarArr[i8];
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(i8);
        sVarArr[i8] = sVar2;
        return sVar2;
    }

    final CharSequence v0() {
        Object obj = this.f6873A;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f6880H;
    }

    final Window.Callback w0() {
        return this.f6875C.getCallback();
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public void x(Configuration configuration) {
        AbstractC0832a s8;
        if (this.f6896X && this.f6890R && (s8 = s()) != null) {
            s8.l(configuration);
        }
        C0851k.b().g(this.f6874B);
        this.f6908j0 = new Configuration(this.f6874B.getResources().getConfiguration());
        T(false, false);
    }

    @Override // androidx.appcompat.app.AbstractC0838g
    public void y(Bundle bundle) {
        String str;
        this.f6905g0 = true;
        S(false);
        m0();
        Object obj = this.f6873A;
        if (obj instanceof Activity) {
            try {
                str = androidx.core.app.i.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                AbstractC0832a O02 = O0();
                if (O02 == null) {
                    this.f6918t0 = true;
                } else {
                    O02.r(true);
                }
            }
            AbstractC0838g.d(this);
        }
        this.f6908j0 = new Configuration(this.f6874B.getResources().getConfiguration());
        this.f6906h0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // androidx.appcompat.app.AbstractC0838g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f6873A
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.AbstractC0838g.F(r3)
        L9:
            boolean r0 = r3.f6915q0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f6875C
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f6917s0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.f6907i0 = r0
            int r0 = r3.f6909k0
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f6873A
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            q.k r0 = androidx.appcompat.app.LayoutInflaterFactory2C0840i.f6869A0
            java.lang.Object r1 = r3.f6873A
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f6909k0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            q.k r0 = androidx.appcompat.app.LayoutInflaterFactory2C0840i.f6869A0
            java.lang.Object r1 = r3.f6873A
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.a r0 = r3.f6878F
            if (r0 == 0) goto L5b
            r0.m()
        L5b:
            r3.b0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflaterFactory2C0840i.z():void");
    }

    LayoutInflaterFactory2C0840i(Dialog dialog, InterfaceC0836e interfaceC0836e) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC0836e, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private LayoutInflaterFactory2C0840i(Context context, Window window, InterfaceC0836e interfaceC0836e, Object obj) {
        AbstractActivityC0835d a12;
        this.f6888P = null;
        this.f6889Q = true;
        this.f6909k0 = -100;
        this.f6917s0 = new a();
        this.f6874B = context;
        this.f6877E = interfaceC0836e;
        this.f6873A = obj;
        if (this.f6909k0 == -100 && (obj instanceof Dialog) && (a12 = a1()) != null) {
            this.f6909k0 = a12.getDelegate().o();
        }
        if (this.f6909k0 == -100) {
            C6407k c6407k = f6869A0;
            Integer num = (Integer) c6407k.get(obj.getClass().getName());
            if (num != null) {
                this.f6909k0 = num.intValue();
                c6407k.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            W(window);
        }
        C0851k.h();
    }
}
