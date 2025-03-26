package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.internal.ads.Xb0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1929Xb0 {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f20085a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f20086b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f20087c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f20088d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final HashSet f20089e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private final HashSet f20090f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f20091g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final HashSet f20092h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    private final Map f20093i = new WeakHashMap();

    /* renamed from: j, reason: collision with root package name */
    private boolean f20094j;

    public final View a(String str) {
        return (View) this.f20087c.get(str);
    }

    public final C1859Vb0 b(View view) {
        C1859Vb0 c1859Vb0 = (C1859Vb0) this.f20086b.get(view);
        if (c1859Vb0 != null) {
            this.f20086b.remove(view);
        }
        return c1859Vb0;
    }

    public final String c(String str) {
        return (String) this.f20091g.get(str);
    }

    public final String d(View view) {
        if (this.f20085a.size() == 0) {
            return null;
        }
        String str = (String) this.f20085a.get(view);
        if (str != null) {
            this.f20085a.remove(view);
        }
        return str;
    }

    public final HashSet e() {
        return this.f20090f;
    }

    public final HashSet f() {
        return this.f20089e;
    }

    public final void g() {
        this.f20085a.clear();
        this.f20086b.clear();
        this.f20087c.clear();
        this.f20088d.clear();
        this.f20089e.clear();
        this.f20090f.clear();
        this.f20091g.clear();
        this.f20094j = false;
        this.f20092h.clear();
    }

    public final void h() {
        this.f20094j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        Boolean bool;
        Activity activity;
        C4048sb0 a8 = C4048sb0.a();
        if (a8 != null) {
            for (C2200bb0 c2200bb0 : a8.b()) {
                View f8 = c2200bb0.f();
                if (c2200bb0.j()) {
                    String h8 = c2200bb0.h();
                    if (f8 != null) {
                        boolean z7 = false;
                        String str = null;
                        if (Build.VERSION.SDK_INT >= 24) {
                            Context context = f8.getContext();
                            while (true) {
                                if (!(context instanceof ContextWrapper)) {
                                    activity = null;
                                    break;
                                } else {
                                    if (context instanceof Activity) {
                                        activity = (Activity) context;
                                        break;
                                    }
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            if (activity != null) {
                                z7 = activity.isInPictureInPictureMode();
                            }
                        }
                        if (z7) {
                            this.f20092h.add(h8);
                        }
                        if (f8.isAttachedToWindow()) {
                            if (f8.hasWindowFocus()) {
                                this.f20093i.remove(f8);
                                bool = Boolean.FALSE;
                            } else if (this.f20093i.containsKey(f8)) {
                                bool = (Boolean) this.f20093i.get(f8);
                            } else {
                                Map map = this.f20093i;
                                Boolean bool2 = Boolean.FALSE;
                                map.put(f8, bool2);
                                bool = bool2;
                            }
                            if (!bool.booleanValue() || z7) {
                                HashSet hashSet = new HashSet();
                                View view = f8;
                                while (true) {
                                    if (view == null) {
                                        this.f20088d.addAll(hashSet);
                                        break;
                                    }
                                    String a9 = AbstractC1824Ub0.a(view);
                                    if (a9 != null) {
                                        str = a9;
                                        break;
                                    } else {
                                        hashSet.add(view);
                                        Object parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            } else {
                                str = "noWindowFocus";
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.f20089e.add(h8);
                            this.f20085a.put(f8, h8);
                            for (C4375vb0 c4375vb0 : c2200bb0.i()) {
                                View view2 = (View) c4375vb0.b().get();
                                if (view2 != null) {
                                    C1859Vb0 c1859Vb0 = (C1859Vb0) this.f20086b.get(view2);
                                    if (c1859Vb0 != null) {
                                        c1859Vb0.c(c2200bb0.h());
                                    } else {
                                        this.f20086b.put(view2, new C1859Vb0(c4375vb0, c2200bb0.h()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f20090f.add(h8);
                            this.f20087c.put(h8, f8);
                            this.f20091g.put(h8, str);
                        }
                    } else {
                        this.f20090f.add(h8);
                        this.f20091g.put(h8, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean j(String str) {
        return this.f20092h.contains(str);
    }

    public final boolean k(View view) {
        if (!this.f20093i.containsKey(view)) {
            return true;
        }
        this.f20093i.put(view, Boolean.TRUE);
        return false;
    }

    public final int l(View view) {
        if (this.f20088d.contains(view)) {
            return 1;
        }
        return this.f20094j ? 2 : 3;
    }
}
