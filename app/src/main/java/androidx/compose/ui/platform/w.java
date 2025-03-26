package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import f0.AbstractC5760a;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class w extends ViewGroup {

    /* renamed from: o, reason: collision with root package name */
    private final HashMap f8266o;

    /* renamed from: s, reason: collision with root package name */
    private final HashMap f8267s;

    public w(Context context) {
        super(context);
        setClipChildren(false);
        this.f8266o = new HashMap();
        this.f8267s = new HashMap();
    }

    public Void a(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<AbstractC5760a, Q.p> getHolderToLayoutNode() {
        return this.f8266o;
    }

    public final HashMap<Q.p, AbstractC5760a> getLayoutNodeToHolder() {
        return this.f8267s;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) a(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        for (AbstractC5760a abstractC5760a : this.f8266o.keySet()) {
            abstractC5760a.layout(abstractC5760a.getLeft(), abstractC5760a.getTop(), abstractC5760a.getRight(), abstractC5760a.getBottom());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        if (View.MeasureSpec.getMode(i8) != 1073741824) {
            throw new IllegalArgumentException("widthMeasureSpec should be EXACTLY");
        }
        if (View.MeasureSpec.getMode(i9) != 1073741824) {
            throw new IllegalArgumentException("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i8), View.MeasureSpec.getSize(i9));
        Iterator it = this.f8266o.keySet().iterator();
        while (it.hasNext()) {
            ((AbstractC5760a) it.next()).a();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            Q.p pVar = (Q.p) this.f8266o.get(childAt);
            if (childAt.isLayoutRequested() && pVar != null) {
                Q.p.e0(pVar, false, false, 3, null);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
