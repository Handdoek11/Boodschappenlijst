package androidx.activity;

import android.window.BackEvent;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6630a = new a();

    private a() {
    }

    public final BackEvent a(float f8, float f9, float f10, int i8) {
        return new BackEvent(f8, f9, f10, i8);
    }

    public final float b(BackEvent backEvent) {
        J6.r.e(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        J6.r.e(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        J6.r.e(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        J6.r.e(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
