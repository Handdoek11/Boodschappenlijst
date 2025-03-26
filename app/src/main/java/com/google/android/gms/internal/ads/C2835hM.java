package com.google.android.gms.internal.ads;

import G2.C0618v;
import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.hM, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2835hM extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    private final C0618v f22536o;

    public C2835hM(Context context, View view, C0618v c0618v) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f22536o = c0618v;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f22536o.m(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            KeyEvent.Callback childAt = getChildAt(i8);
            if (childAt != null && (childAt instanceof InterfaceC4410vt)) {
                arrayList.add((InterfaceC4410vt) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((InterfaceC4410vt) arrayList.get(i9)).destroy();
        }
    }
}
