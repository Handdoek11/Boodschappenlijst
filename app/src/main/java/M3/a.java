package M3;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes2.dex */
public class a implements View.OnTouchListener {

    /* renamed from: o, reason: collision with root package name */
    private final Dialog f4014o;

    /* renamed from: s, reason: collision with root package name */
    private final int f4015s;

    /* renamed from: t, reason: collision with root package name */
    private final int f4016t;

    /* renamed from: u, reason: collision with root package name */
    private final int f4017u;

    public a(Dialog dialog, Rect rect) {
        this.f4014o = dialog;
        this.f4015s = rect.left;
        this.f4016t = rect.top;
        this.f4017u = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = this.f4015s + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        if (new RectF(left, this.f4016t + findViewById.getTop(), width, findViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i8 = this.f4017u;
            obtain.setLocation((-i8) - 1, (-i8) - 1);
        }
        view.performClick();
        return this.f4014o.onTouchEvent(obtain);
    }
}
