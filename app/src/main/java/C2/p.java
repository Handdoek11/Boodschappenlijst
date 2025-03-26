package C2;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
final class p implements View.OnTouchListener {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ u f797o;

    p(u uVar) {
        this.f797o = uVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        u uVar = this.f797o;
        if (uVar.f813y == null) {
            return false;
        }
        uVar.f813y.d(motionEvent);
        return false;
    }
}
