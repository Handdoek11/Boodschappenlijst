package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
class i {

    /* renamed from: b, reason: collision with root package name */
    int f11241b;

    /* renamed from: c, reason: collision with root package name */
    int f11242c;

    /* renamed from: d, reason: collision with root package name */
    int f11243d;

    /* renamed from: e, reason: collision with root package name */
    int f11244e;

    /* renamed from: h, reason: collision with root package name */
    boolean f11247h;

    /* renamed from: i, reason: collision with root package name */
    boolean f11248i;

    /* renamed from: a, reason: collision with root package name */
    boolean f11240a = true;

    /* renamed from: f, reason: collision with root package name */
    int f11245f = 0;

    /* renamed from: g, reason: collision with root package name */
    int f11246g = 0;

    i() {
    }

    boolean a(RecyclerView.B b8) {
        int i8 = this.f11242c;
        return i8 >= 0 && i8 < b8.b();
    }

    View b(RecyclerView.w wVar) {
        View o8 = wVar.o(this.f11242c);
        this.f11242c += this.f11243d;
        return o8;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f11241b + ", mCurrentPosition=" + this.f11242c + ", mItemDirection=" + this.f11243d + ", mLayoutDirection=" + this.f11244e + ", mStartLine=" + this.f11245f + ", mEndLine=" + this.f11246g + '}';
    }
}
