package F2;

import G2.C0618v;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
final class q extends RelativeLayout {

    /* renamed from: o, reason: collision with root package name */
    final C0618v f2272o;

    /* renamed from: s, reason: collision with root package name */
    boolean f2273s;

    public q(Context context, String str, String str2, String str3) {
        super(context);
        C0618v c0618v = new C0618v(context, str);
        this.f2272o = c0618v;
        c0618v.o(str2);
        c0618v.n(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f2273s) {
            return false;
        }
        this.f2272o.m(motionEvent);
        return false;
    }
}
