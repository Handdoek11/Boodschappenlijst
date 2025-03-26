package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c0 extends ContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f7802c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static ArrayList f7803d;

    /* renamed from: a, reason: collision with root package name */
    private final Resources f7804a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources.Theme f7805b;

    private c0(Context context) {
        super(context);
        if (!p0.c()) {
            this.f7804a = new e0(this, context.getResources());
            this.f7805b = null;
            return;
        }
        p0 p0Var = new p0(this, context.getResources());
        this.f7804a = p0Var;
        Resources.Theme newTheme = p0Var.newTheme();
        this.f7805b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        if ((context instanceof c0) || (context.getResources() instanceof e0) || (context.getResources() instanceof p0)) {
            return false;
        }
        return p0.c();
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f7802c) {
            try {
                ArrayList arrayList = f7803d;
                if (arrayList == null) {
                    f7803d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f7803d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f7803d.remove(size);
                        }
                    }
                    for (int size2 = f7803d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f7803d.get(size2);
                        c0 c0Var = weakReference2 != null ? (c0) weakReference2.get() : null;
                        if (c0Var != null && c0Var.getBaseContext() == context) {
                            return c0Var;
                        }
                    }
                }
                c0 c0Var2 = new c0(context);
                f7803d.add(new WeakReference(c0Var2));
                return c0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f7804a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f7804a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f7805b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i8) {
        Resources.Theme theme = this.f7805b;
        if (theme == null) {
            super.setTheme(i8);
        } else {
            theme.applyStyle(i8, true);
        }
    }
}
