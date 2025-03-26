package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    private static Configuration f6988f;

    /* renamed from: a, reason: collision with root package name */
    private int f6989a;

    /* renamed from: b, reason: collision with root package name */
    private Resources.Theme f6990b;

    /* renamed from: c, reason: collision with root package name */
    private LayoutInflater f6991c;

    /* renamed from: d, reason: collision with root package name */
    private Configuration f6992d;

    /* renamed from: e, reason: collision with root package name */
    private Resources f6993e;

    public d(Context context, int i8) {
        super(context);
        this.f6989a = i8;
    }

    private Resources b() {
        if (this.f6993e == null) {
            Configuration configuration = this.f6992d;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) {
                this.f6993e = super.getResources();
            } else {
                this.f6993e = createConfigurationContext(this.f6992d).getResources();
            }
        }
        return this.f6993e;
    }

    private void d() {
        boolean z7 = this.f6990b == null;
        if (z7) {
            this.f6990b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f6990b.setTo(theme);
            }
        }
        f(this.f6990b, this.f6989a, z7);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f6988f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f6988f = configuration2;
        }
        return configuration.equals(f6988f);
    }

    public void a(Configuration configuration) {
        if (this.f6993e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f6992d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f6992d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f6989a;
    }

    protected void f(Resources.Theme theme, int i8, boolean z7) {
        theme.applyStyle(i8, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f6991c == null) {
            this.f6991c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f6991c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f6990b;
        if (theme != null) {
            return theme;
        }
        if (this.f6989a == 0) {
            this.f6989a = f.i.f35546d;
        }
        d();
        return this.f6990b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i8) {
        if (this.f6989a != i8) {
            this.f6989a = i8;
            d();
        }
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f6990b = theme;
    }
}
