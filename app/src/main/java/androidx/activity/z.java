package androidx.activity;

import android.view.View;

/* loaded from: classes.dex */
public abstract class z {
    public static final void a(View view, w wVar) {
        J6.r.e(view, "<this>");
        J6.r.e(wVar, "onBackPressedDispatcherOwner");
        view.setTag(x.f6671b, wVar);
    }
}
