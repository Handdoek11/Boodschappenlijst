package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class e0 extends X {

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f7820b;

    public e0(Context context, Resources resources) {
        super(resources);
        this.f7820b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i8) {
        Drawable a8 = a(i8);
        Context context = (Context) this.f7820b.get();
        if (a8 != null && context != null) {
            W.h().x(context, i8, a8);
        }
        return a8;
    }
}
