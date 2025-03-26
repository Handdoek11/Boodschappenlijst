package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import androidx.fragment.app.AbstractActivityC0911j;
import com.bumptech.glide.load.resource.bitmap.y;
import d2.AbstractC5710l;
import q.C6397a;

/* loaded from: classes.dex */
public class n implements Handler.Callback {

    /* renamed from: w, reason: collision with root package name */
    private static final b f12990w = new a();

    /* renamed from: o, reason: collision with root package name */
    private volatile com.bumptech.glide.k f12991o;

    /* renamed from: s, reason: collision with root package name */
    private final b f12992s;

    /* renamed from: t, reason: collision with root package name */
    private final C6397a f12993t = new C6397a();

    /* renamed from: u, reason: collision with root package name */
    private final i f12994u;

    /* renamed from: v, reason: collision with root package name */
    private final l f12995v;

    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.manager.n.b
        public com.bumptech.glide.k a(com.bumptech.glide.b bVar, j jVar, o oVar, Context context) {
            return new com.bumptech.glide.k(bVar, jVar, oVar, context);
        }
    }

    public interface b {
        com.bumptech.glide.k a(com.bumptech.glide.b bVar, j jVar, o oVar, Context context);
    }

    public n(b bVar) {
        bVar = bVar == null ? f12990w : bVar;
        this.f12992s = bVar;
        this.f12995v = new l(bVar);
        this.f12994u = b();
    }

    private static void a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static i b() {
        return (y.f12958f && y.f12957e) ? new h() : new f();
    }

    private static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private com.bumptech.glide.k f(Context context) {
        if (this.f12991o == null) {
            synchronized (this) {
                try {
                    if (this.f12991o == null) {
                        this.f12991o = this.f12992s.a(com.bumptech.glide.b.c(context.getApplicationContext()), new com.bumptech.glide.manager.a(), new g(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f12991o;
    }

    private static boolean g(Context context) {
        Activity c8 = c(context);
        return c8 == null || !c8.isFinishing();
    }

    public com.bumptech.glide.k d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (AbstractC5710l.s() && !(context instanceof Application)) {
            if (context instanceof AbstractActivityC0911j) {
                return e((AbstractActivityC0911j) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return d(contextWrapper.getBaseContext());
                }
            }
        }
        return f(context);
    }

    public com.bumptech.glide.k e(AbstractActivityC0911j abstractActivityC0911j) {
        if (AbstractC5710l.r()) {
            return d(abstractActivityC0911j.getApplicationContext());
        }
        a(abstractActivityC0911j);
        this.f12994u.a(abstractActivityC0911j);
        boolean g8 = g(abstractActivityC0911j);
        return this.f12995v.b(abstractActivityC0911j, com.bumptech.glide.b.c(abstractActivityC0911j.getApplicationContext()), abstractActivityC0911j.getLifecycle(), abstractActivityC0911j.getSupportFragmentManager(), g8);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }
}
